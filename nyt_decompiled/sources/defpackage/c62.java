package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes2.dex */
public class c62 extends InputStream {
    private static final Queue c = x19.e(0);
    private InputStream a;
    private IOException b;

    c62() {
    }

    public static c62 b(InputStream inputStream) {
        c62 c62Var;
        Queue queue = c;
        synchronized (queue) {
            c62Var = (c62) queue.poll();
        }
        if (c62Var == null) {
            c62Var = new c62();
        }
        c62Var.d(inputStream);
        return c62Var;
    }

    public IOException a() {
        return this.b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    void d(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.a.read(bArr);
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }

    public void release() {
        this.b = null;
        this.a = null;
        Queue queue = c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.a.skip(j);
        } catch (IOException e) {
            this.b = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.a.read(bArr, i, i2);
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.a.read();
        } catch (IOException e) {
            this.b = e;
            return -1;
        }
    }
}
