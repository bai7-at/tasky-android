package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.t;

/* loaded from: classes.dex */
public abstract class qi5 {
    private static final int c(t tVar) {
        int a0 = tVar.a0();
        int c0 = tVar.c0();
        while (c0 >= 0 && !tVar.r0(c0)) {
            c0 = tVar.E0(c0);
        }
        int i = c0 + 1;
        int i2 = 0;
        while (i < a0) {
            if (tVar.m0(a0, i)) {
                if (tVar.r0(i)) {
                    i2 = 0;
                }
                i++;
            } else {
                i2 += tVar.r0(i) ? 1 : tVar.C0(i);
                i += tVar.j0(i);
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(t tVar, hd hdVar, ln lnVar) {
        int G = tVar.G(hdVar);
        b.Q(tVar.a0() < G);
        e(tVar, lnVar, G);
        int c = c(tVar);
        while (tVar.a0() < G) {
            if (tVar.l0(G)) {
                if (tVar.q0()) {
                    lnVar.g(tVar.A0(tVar.a0()));
                    c = 0;
                }
                tVar.b1();
            } else {
                c += tVar.U0();
            }
        }
        b.Q(tVar.a0() == G);
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(t tVar, ln lnVar, int i) {
        while (!tVar.n0(i)) {
            tVar.V0();
            if (tVar.r0(tVar.c0())) {
                lnVar.i();
            }
            tVar.T();
        }
    }
}
