package defpackage;

/* loaded from: classes3.dex */
final class ky9 implements fy9 {
    public final int a;
    public final int b;
    public final int c;

    private ky9(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static ky9 a(b9e b9eVar) {
        int x = b9eVar.x();
        b9eVar.l(8);
        int x2 = b9eVar.x();
        int x3 = b9eVar.x();
        b9eVar.l(4);
        int x4 = b9eVar.x();
        b9eVar.l(12);
        return new ky9(x, x2, x3, x4);
    }

    @Override // defpackage.fy9
    public final int zza() {
        return 1751742049;
    }
}
