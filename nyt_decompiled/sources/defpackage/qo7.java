package defpackage;

import defpackage.el5;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class qo7 {
    private static final boolean a(a37 a37Var) {
        return f01.d(a37Var.h()) + f01.d(a37Var.i()) <= a37Var.j() && f01.d(a37Var.b()) + f01.d(a37Var.c()) <= a37Var.j() && f01.e(a37Var.h()) + f01.e(a37Var.b()) <= a37Var.d() && f01.e(a37Var.i()) + f01.e(a37Var.c()) <= a37Var.d();
    }

    public static final boolean b(el5 el5Var, float f, float f2, ip5 ip5Var, ip5 ip5Var2) {
        if (el5Var instanceof el5.b) {
            return d(((el5.b) el5Var).a(), f, f2);
        }
        if (el5Var instanceof el5.c) {
            return e((el5.c) el5Var, f, f2, ip5Var, ip5Var2);
        }
        if (el5Var instanceof el5.a) {
            return c(((el5.a) el5Var).a(), f, f2, ip5Var, ip5Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean c(ip5 ip5Var, float f, float f2, ip5 ip5Var2, ip5 ip5Var3) {
        kt6 kt6Var = new kt6(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (ip5Var2 == null) {
            ip5Var2 = cg.a();
        }
        ip5Var2.E(kt6Var);
        if (ip5Var3 == null) {
            ip5Var3 = cg.a();
        }
        ip5Var3.G(ip5Var, ip5Var2, wp5.a.b());
        boolean isEmpty = ip5Var3.isEmpty();
        ip5Var3.a();
        ip5Var2.a();
        return !isEmpty;
    }

    private static final boolean d(kt6 kt6Var, float f, float f2) {
        return kt6Var.i() <= f && f < kt6Var.j() && kt6Var.l() <= f2 && f2 < kt6Var.e();
    }

    private static final boolean e(el5.c cVar, float f, float f2, ip5 ip5Var, ip5 ip5Var2) {
        a37 a = cVar.a();
        if (f < a.e() || f >= a.f() || f2 < a.g() || f2 >= a.a()) {
            return false;
        }
        if (!a(a)) {
            ip5 a2 = ip5Var2 == null ? cg.a() : ip5Var2;
            a2.D(a);
            return c(a2, f, f2, ip5Var, ip5Var2);
        }
        float d = f01.d(a.h()) + a.e();
        float e = f01.e(a.h()) + a.g();
        float f3 = a.f() - f01.d(a.i());
        float e2 = f01.e(a.i()) + a.g();
        float f4 = a.f() - f01.d(a.c());
        float a3 = a.a() - f01.e(a.c());
        float a4 = a.a() - f01.e(a.b());
        float d2 = f01.d(a.b()) + a.e();
        if (f < d && f2 < e) {
            return f(f, f2, a.h(), d, e);
        }
        if (f < d2 && f2 > a4) {
            return f(f, f2, a.b(), d2, a4);
        }
        if (f > f3 && f2 < e2) {
            return f(f, f2, a.i(), f3, e2);
        }
        if (f <= f4 || f2 <= a3) {
            return true;
        }
        return f(f, f2, a.c(), f4, a3);
    }

    private static final boolean f(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float d = f01.d(j);
        float e = f01.e(j);
        return ((f5 * f5) / (d * d)) + ((f6 * f6) / (e * e)) <= 1.0f;
    }
}
