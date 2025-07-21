package defpackage;

/* loaded from: classes.dex */
public abstract class ju1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(iu1 iu1Var, long j) {
        if (!iu1Var.c0().L1()) {
            return false;
        }
        cz3 l = rl1.k(iu1Var).l();
        if (!l.m()) {
            return false;
        }
        long a = l.a();
        int g = hn3.g(a);
        int f = hn3.f(a);
        long e = ez3.e(l);
        float e2 = fd5.e(e);
        float f2 = fd5.f(e);
        float f3 = g + e2;
        float f4 = f + f2;
        float o = fd5.o(j);
        if (e2 > o || o > f3) {
            return false;
        }
        float p = fd5.p(j);
        return f2 <= p && p <= f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ku1 ku1Var, gu1 gu1Var) {
        ku1Var.C(gu1Var);
        ku1Var.p1(gu1Var);
    }
}
