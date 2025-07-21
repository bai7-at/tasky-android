package defpackage;

/* loaded from: classes.dex */
public abstract class d37 {
    private static final c37 a = a(50);

    public static final c37 a(int i) {
        return b(j01.a(i));
    }

    public static final c37 b(i01 i01Var) {
        return new c37(i01Var, i01Var, i01Var, i01Var);
    }

    public static final c37 c(float f) {
        return b(j01.b(f));
    }

    public static final c37 d(float f, float f2, float f3, float f4) {
        return new c37(j01.b(f), j01.b(f2), j01.b(f3), j01.b(f4));
    }

    public static /* synthetic */ c37 e(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = bu1.g(0);
        }
        if ((i & 2) != 0) {
            f2 = bu1.g(0);
        }
        if ((i & 4) != 0) {
            f3 = bu1.g(0);
        }
        if ((i & 8) != 0) {
            f4 = bu1.g(0);
        }
        return d(f, f2, f3, f4);
    }

    public static final c37 f() {
        return a;
    }
}
