package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
final class x62 extends InputStream {
    private final InputStream a;
    private int b = 1073741824;

    public x62(InputStream inputStream) {
        this.a = inputStream;
    }

    private final int a(int i) {
        if (i == -1) {
            this.b = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return a(this.a.read());
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.a.skip(j);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return a(this.a.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return a(this.a.read(bArr, i, i2));
    }
}
