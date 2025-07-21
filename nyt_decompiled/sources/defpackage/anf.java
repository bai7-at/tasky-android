package defpackage;

/* loaded from: classes3.dex */
final class anf implements zlf {
    private final n7g a;
    private final n7g b;

    private anf(byte[] bArr, byte[] bArr2) {
        this.a = n7g.b(bArr);
        this.b = n7g.b(bArr2);
    }

    static anf a(byte[] bArr, byte[] bArr2, int i) {
        h5g.e(h5g.j(h5g.k(i), 1, bArr2), h5g.h(i, bArr));
        return new anf(bArr, bArr2);
    }
}
