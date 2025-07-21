package io.embrace.android.embracesdk.internal.network.http;

import defpackage.ss2;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
final class CountingInputStreamWithCallback extends FilterInputStream {
    private final ss2 callback;
    private volatile boolean callbackCompleted;
    private final AtomicLong count;
    ByteArrayOutputStream os;
    private final boolean shouldCaptureBody;
    private volatile long streamMark;

    CountingInputStreamWithCallback(InputStream inputStream, boolean z, ss2 ss2Var) {
        super(inputStream);
        this.streamMark = -1L;
        this.count = new AtomicLong(0L);
        this.os = new ByteArrayOutputStream();
        this.callback = ss2Var;
        this.shouldCaptureBody = z;
    }

    private void conditionallyCaptureBody(byte[] bArr, int i, int i2) {
        if (this.shouldCaptureBody && bArr != null) {
            this.os.write(bArr, i, i2);
        }
    }

    private void notifyCallback() {
        this.callbackCompleted = true;
        this.callback.invoke(this.os.toByteArray());
    }

    public long getCount() {
        return this.count.longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.streamMark = this.count.longValue();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.count.incrementAndGet();
            conditionallyCaptureBody(new byte[]{Integer.valueOf(read).byteValue()}, 0, 1);
        } else if (!this.callbackCompleted) {
            notifyCallback();
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.streamMark == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.count.set(this.streamMark);
        this.callbackCompleted = false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.count.addAndGet(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.count.addAndGet(read);
            conditionallyCaptureBody(bArr, i, read);
        } else if (!this.callbackCompleted) {
            notifyCallback();
        }
        return read;
    }
}
