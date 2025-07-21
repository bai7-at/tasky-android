package androidx.compose.foundation.layout;

import defpackage.dg4;
import defpackage.gt2;
import defpackage.it2;
import defpackage.l37;
import defpackage.xq3;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {
    /* JADX INFO: Access modifiers changed from: private */
    public static final it2 a(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.a.a() : IntrinsicMeasureBlocks.a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it2 b(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.a.b() : IntrinsicMeasureBlocks.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it2 c(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.a.c() : IntrinsicMeasureBlocks.a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final it2 d(LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? IntrinsicMeasureBlocks.a.d() : IntrinsicMeasureBlocks.a.h();
    }

    public static final f j(l37 l37Var) {
        if (l37Var != null) {
            return l37Var.a();
        }
        return null;
    }

    public static final boolean k(l37 l37Var) {
        if (l37Var != null) {
            return l37Var.b();
        }
        return true;
    }

    public static final l37 l(xq3 xq3Var) {
        Object d = xq3Var.d();
        if (d instanceof l37) {
            return (l37) d;
        }
        return null;
    }

    public static final float m(l37 l37Var) {
        if (l37Var != null) {
            return l37Var.c();
        }
        return 0.0f;
    }

    private static final int n(List list, gt2 gt2Var, gt2 gt2Var2, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i2, i);
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            xq3 xq3Var = (xq3) list.get(i4);
            float m = m(l(xq3Var));
            if (m == 0.0f) {
                int min2 = Math.min(((Number) gt2Var.invoke(xq3Var, Integer.MAX_VALUE)).intValue(), i - min);
                min += min2;
                i3 = Math.max(i3, ((Number) gt2Var2.invoke(xq3Var, Integer.valueOf(min2))).intValue());
            } else if (m > 0.0f) {
                f += m;
            }
        }
        int d = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : dg4.d(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i5 = 0; i5 < size2; i5++) {
            xq3 xq3Var2 = (xq3) list.get(i5);
            float m2 = m(l(xq3Var2));
            if (m2 > 0.0f) {
                i3 = Math.max(i3, ((Number) gt2Var2.invoke(xq3Var2, Integer.valueOf(d != Integer.MAX_VALUE ? dg4.d(d * m2) : Integer.MAX_VALUE))).intValue());
            }
        }
        return i3;
    }

    private static final int o(List list, gt2 gt2Var, int i, int i2) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            xq3 xq3Var = (xq3) list.get(i5);
            float m = m(l(xq3Var));
            int intValue = ((Number) gt2Var.invoke(xq3Var, Integer.valueOf(i))).intValue();
            if (m == 0.0f) {
                i4 += intValue;
            } else if (m > 0.0f) {
                f += m;
                i3 = Math.max(i3, dg4.d(intValue / m));
            }
        }
        return dg4.d(i3 * f) + i4 + ((list.size() - 1) * i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(List list, gt2 gt2Var, gt2 gt2Var2, int i, int i2, LayoutOrientation layoutOrientation, LayoutOrientation layoutOrientation2) {
        return layoutOrientation == layoutOrientation2 ? o(list, gt2Var, i, i2) : n(list, gt2Var2, gt2Var, i, i2);
    }

    public static final boolean q(l37 l37Var) {
        f j = j(l37Var);
        if (j != null) {
            return j.c();
        }
        return false;
    }
}
