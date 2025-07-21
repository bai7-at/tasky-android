package androidx.compose.foundation.text.selection;

import defpackage.cz3;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.kt6;
import defpackage.nt6;

/* loaded from: classes.dex */
public abstract class g {
    private static final kt6 a = new kt6(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(kt6 kt6Var, long j) {
        float i = kt6Var.i();
        float j2 = kt6Var.j();
        float o = fd5.o(j);
        if (i <= o && o <= j2) {
            float l = kt6Var.l();
            float e = kt6Var.e();
            float p = fd5.p(j);
            if (l <= p && p <= e) {
                return true;
            }
        }
        return false;
    }

    public static final kt6 b(cz3 cz3Var) {
        kt6 c = ez3.c(cz3Var);
        return nt6.a(cz3Var.u(c.m()), cz3Var.u(c.f()));
    }
}
