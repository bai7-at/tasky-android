package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class oba extends FilterInputStream {
    private final long a;
    private long b;

    oba(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    final long a() {
        return this.a - this.b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.b += read;
        }
        return read;
    }
}
