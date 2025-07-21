package defpackage;

/* loaded from: classes.dex */
public interface iv1 {
    static /* synthetic */ void g(iv1 iv1Var, ip5 ip5Var, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = ql0.a.b();
        }
        iv1Var.d(ip5Var, i);
    }

    static /* synthetic */ void h(iv1 iv1Var, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        iv1Var.c(f, f2);
    }

    void a(float[] fArr);

    void b(float f, float f2, float f3, float f4, int i);

    void c(float f, float f2);

    void d(ip5 ip5Var, int i);

    void e(float f, float f2, long j);

    void f(float f, long j);

    void i(float f, float f2, float f3, float f4);
}
