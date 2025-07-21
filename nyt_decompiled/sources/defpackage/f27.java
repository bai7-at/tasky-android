package defpackage;

/* loaded from: classes.dex */
public abstract class f27 {
    private static final float a = bu1.g(10);

    public static final float a(fm1 fm1Var, boolean z, long j) {
        float m = fd5.m(hd5.a(zt7.i(j), zt7.g(j))) / 2.0f;
        return z ? m + fm1Var.f1(a) : m;
    }

    public static final float b(long j) {
        return Math.max(zt7.i(j), zt7.g(j)) * 0.3f;
    }
}
