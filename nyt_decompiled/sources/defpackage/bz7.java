package defpackage;

/* loaded from: classes.dex */
public final class bz7 implements xk2 {
    private final rk2 a;

    public bz7(fm1 fm1Var) {
        this.a = new rk2(cz7.a(), fm1Var);
    }

    private final float f(float f) {
        return this.a.b(f) * Math.signum(f);
    }

    @Override // defpackage.xk2
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.xk2
    public float b(long j, float f, float f2) {
        return this.a.d(f2).b(j / 1000000);
    }

    @Override // defpackage.xk2
    public long c(float f, float f2) {
        return this.a.c(f2) * 1000000;
    }

    @Override // defpackage.xk2
    public float d(float f, float f2) {
        return f + f(f2);
    }

    @Override // defpackage.xk2
    public float e(long j, float f, float f2) {
        return f + this.a.d(f2).a(j / 1000000);
    }
}
