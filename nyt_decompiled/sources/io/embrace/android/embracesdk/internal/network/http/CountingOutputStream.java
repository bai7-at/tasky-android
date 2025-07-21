package io.embrace.android.embracesdk.internal.network.http;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
class CountingOutputStream extends FilterOutputStream {
    private long count;
    ByteArrayOutputStream os;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.os = new ByteArrayOutputStream();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    public long getCount() {
        return this.count;
    }

    byte[] getRequestBody() {
        return this.os.toByteArray();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.count += i2;
        if (bArr != null) {
            this.os.write(bArr, i, i2);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.count++;
        this.os.write(i);
    }
}
