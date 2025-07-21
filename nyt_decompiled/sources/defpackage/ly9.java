package defpackage;

/* loaded from: classes3.dex */
final class ly9 implements fy9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private ly9(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static ly9 a(b9e b9eVar) {
        int x = b9eVar.x();
        b9eVar.l(12);
        int x2 = b9eVar.x();
        int x3 = b9eVar.x();
        int x4 = b9eVar.x();
        b9eVar.l(4);
        int x5 = b9eVar.x();
        int x6 = b9eVar.x();
        b9eVar.l(8);
        return new ly9(x, x2, x3, x4, x5, x6);
    }

    @Override // defpackage.fy9
    public final int zza() {
        return 1752331379;
    }
}
