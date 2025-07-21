package defpackage;

/* loaded from: classes3.dex */
final class gnf implements zlf {
    private final n7g a;
    private final n7g b;

    private gnf(byte[] bArr, byte[] bArr2) {
        this.a = n7g.b(bArr);
        this.b = n7g.b(bArr2);
    }

    static gnf a(byte[] bArr) {
        return new gnf(bArr, j7g.c(bArr));
    }
}
