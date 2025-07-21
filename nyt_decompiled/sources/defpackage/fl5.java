package defpackage;

import defpackage.el5;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class fl5 {
    public static final void b(fv1 fv1Var, el5 el5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        ip5 a;
        if (el5Var instanceof el5.b) {
            kt6 a2 = ((el5.b) el5Var).a();
            fv1Var.z1(yc0Var, i(a2), g(a2), f, gv1Var, qn0Var, i);
            return;
        }
        if (el5Var instanceof el5.c) {
            el5.c cVar = (el5.c) el5Var;
            a = cVar.b();
            if (a == null) {
                a37 a3 = cVar.a();
                fv1Var.q0(yc0Var, j(a3), h(a3), g01.b(f01.d(a3.b()), 0.0f, 2, null), f, gv1Var, qn0Var, i);
                return;
            }
        } else {
            if (!(el5Var instanceof el5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a = ((el5.a) el5Var).a();
        }
        fv1Var.r1(a, yc0Var, f, gv1Var, qn0Var, i);
    }

    public static /* synthetic */ void c(fv1 fv1Var, el5 el5Var, yc0 yc0Var, float f, gv1 gv1Var, qn0 qn0Var, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            gv1Var = qf2.a;
        }
        gv1 gv1Var2 = gv1Var;
        if ((i2 & 16) != 0) {
            qn0Var = null;
        }
        qn0 qn0Var2 = qn0Var;
        if ((i2 & 32) != 0) {
            i = fv1.p.a();
        }
        b(fv1Var, el5Var, yc0Var, f2, gv1Var2, qn0Var2, i);
    }

    public static final void d(fv1 fv1Var, el5 el5Var, long j, float f, gv1 gv1Var, qn0 qn0Var, int i) {
        ip5 a;
        if (el5Var instanceof el5.b) {
            kt6 a2 = ((el5.b) el5Var).a();
            fv1Var.s1(j, i(a2), g(a2), f, gv1Var, qn0Var, i);
            return;
        }
        if (el5Var instanceof el5.c) {
            el5.c cVar = (el5.c) el5Var;
            a = cVar.b();
            if (a == null) {
                a37 a3 = cVar.a();
                fv1Var.n1(j, j(a3), h(a3), g01.b(f01.d(a3.b()), 0.0f, 2, null), gv1Var, f, qn0Var, i);
                return;
            }
        } else {
            if (!(el5Var instanceof el5.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a = ((el5.a) el5Var).a();
        }
        fv1Var.T0(a, j, f, gv1Var, qn0Var, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(a37 a37Var) {
        return ((f01.d(a37Var.b()) > f01.d(a37Var.c()) ? 1 : (f01.d(a37Var.b()) == f01.d(a37Var.c()) ? 0 : -1)) == 0 && (f01.d(a37Var.c()) > f01.d(a37Var.i()) ? 1 : (f01.d(a37Var.c()) == f01.d(a37Var.i()) ? 0 : -1)) == 0 && (f01.d(a37Var.i()) > f01.d(a37Var.h()) ? 1 : (f01.d(a37Var.i()) == f01.d(a37Var.h()) ? 0 : -1)) == 0) && ((f01.e(a37Var.b()) > f01.e(a37Var.c()) ? 1 : (f01.e(a37Var.b()) == f01.e(a37Var.c()) ? 0 : -1)) == 0 && (f01.e(a37Var.c()) > f01.e(a37Var.i()) ? 1 : (f01.e(a37Var.c()) == f01.e(a37Var.i()) ? 0 : -1)) == 0 && (f01.e(a37Var.i()) > f01.e(a37Var.h()) ? 1 : (f01.e(a37Var.i()) == f01.e(a37Var.h()) ? 0 : -1)) == 0);
    }

    private static final long g(kt6 kt6Var) {
        return du7.a(kt6Var.n(), kt6Var.h());
    }

    private static final long h(a37 a37Var) {
        return du7.a(a37Var.j(), a37Var.d());
    }

    private static final long i(kt6 kt6Var) {
        return hd5.a(kt6Var.i(), kt6Var.l());
    }

    private static final long j(a37 a37Var) {
        return hd5.a(a37Var.e(), a37Var.g());
    }
}
