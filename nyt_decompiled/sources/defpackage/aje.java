package defpackage;

import java.io.OutputStream;

/* loaded from: classes3.dex */
final class aje extends OutputStream {
    aje() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        tge.h(i, i2 + i, bArr.length);
    }
}
