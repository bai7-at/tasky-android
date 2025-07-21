package defpackage;

import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class gd8 {
    public static final gd8 a = new gd8();
    private static final qz7 b = new qz7(0.0f, 0.0f, null, 7, null);
    private static final float c = bu1.g(125);

    private gd8() {
    }

    public static /* synthetic */ yy6 d(gd8 gd8Var, Set set, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 10.0f;
        }
        if ((i & 4) != 0) {
            f2 = 10.0f;
        }
        return gd8Var.c(set, f, f2);
    }

    public final qz7 a() {
        return b;
    }

    public final float b() {
        return c;
    }

    public final yy6 c(Set set, float f, float f2) {
        if (set.size() <= 1) {
            return null;
        }
        Set set2 = set;
        Float A0 = i.A0(set2);
        zq3.e(A0);
        float floatValue = A0.floatValue();
        Float C0 = i.C0(set2);
        zq3.e(C0);
        return new yy6(floatValue - C0.floatValue(), f, f2);
    }
}
