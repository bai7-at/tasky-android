package defpackage;

import androidx.compose.foundation.layout.o;

/* loaded from: classes.dex */
public abstract class uh9 {
    public static final o a(int i, int i2, int i3, int i4) {
        return new rj2(i, i2, i3, i4);
    }

    public static final o b(float f, float f2, float f3, float f4) {
        return new pj2(f, f2, f3, f4, null);
    }

    public static /* synthetic */ o c(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return b(f, f2, f3, f4);
    }

    public static final ym5 d(o oVar, fm1 fm1Var) {
        return new kl3(oVar, fm1Var);
    }

    public static final o e(o oVar, o oVar2) {
        return new i62(oVar, oVar2);
    }

    public static final o f(o oVar, int i) {
        return new o44(oVar, i, null);
    }

    public static final o g(o oVar, o oVar2) {
        return new uw8(oVar, oVar2);
    }
}
