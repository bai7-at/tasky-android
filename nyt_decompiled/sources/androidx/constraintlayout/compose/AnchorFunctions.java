package androidx.constraintlayout.compose;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.gt2;
import defpackage.it2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class AnchorFunctions {
    public static final AnchorFunctions a = new AnchorFunctions();
    private static final it2[][] b = {new it2[]{new it2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$1
        @Override // defpackage.it2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            zq3.h(layoutDirection, "layoutDirection");
            AnchorFunctions.a.c(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a r = aVar.r(obj);
            zq3.g(r, "leftToLeft(other)");
            return r;
        }
    }, new it2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$2
        @Override // defpackage.it2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            zq3.h(layoutDirection, "layoutDirection");
            AnchorFunctions.a.c(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a s = aVar.s(obj);
            zq3.g(s, "leftToRight(other)");
            return s;
        }
    }}, new it2[]{new it2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$3
        @Override // defpackage.it2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            zq3.h(layoutDirection, "layoutDirection");
            AnchorFunctions.a.d(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a x = aVar.x(obj);
            zq3.g(x, "rightToLeft(other)");
            return x;
        }
    }, new it2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$verticalAnchorFunctions$4
        @Override // defpackage.it2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj, LayoutDirection layoutDirection) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            zq3.h(layoutDirection, "layoutDirection");
            AnchorFunctions.a.d(aVar, layoutDirection);
            androidx.constraintlayout.core.state.a y = aVar.y(obj);
            zq3.g(y, "rightToRight(other)");
            return y;
        }
    }}};
    private static final gt2[][] c = {new gt2[]{new gt2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            aVar.F(null);
            aVar.f(null);
            androidx.constraintlayout.core.state.a G = aVar.G(obj);
            zq3.g(G, "topToTop(other)");
            return G;
        }
    }, new gt2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$2
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            aVar.G(null);
            aVar.f(null);
            androidx.constraintlayout.core.state.a F = aVar.F(obj);
            zq3.g(F, "topToBottom(other)");
            return F;
        }
    }}, new gt2[]{new gt2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$3
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            aVar.g(null);
            aVar.f(null);
            androidx.constraintlayout.core.state.a h = aVar.h(obj);
            zq3.g(h, "bottomToTop(other)");
            return h;
        }
    }, new gt2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$horizontalAnchorFunctions$4
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            zq3.h(aVar, "$this$arrayOf");
            zq3.h(obj, "other");
            aVar.h(null);
            aVar.f(null);
            androidx.constraintlayout.core.state.a g = aVar.g(obj);
            zq3.g(g, "bottomToBottom(other)");
            return g;
        }
    }}};
    private static final gt2 d = new gt2() { // from class: androidx.constraintlayout.compose.AnchorFunctions$baselineAnchorFunction$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.constraintlayout.core.state.a invoke(androidx.constraintlayout.core.state.a aVar, Object obj) {
            zq3.h(aVar, "$this$null");
            zq3.h(obj, "other");
            aVar.G(null);
            aVar.F(null);
            aVar.h(null);
            aVar.g(null);
            androidx.constraintlayout.core.state.a f = aVar.f(obj);
            zq3.g(f, "baselineToBaseline(other)");
            return f;
        }
    };

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    private AnchorFunctions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.r(null);
        aVar.s(null);
        int i = a.a[layoutDirection.ordinal()];
        if (i == 1) {
            aVar.E(null);
            aVar.D(null);
        } else {
            if (i != 2) {
                return;
            }
            aVar.l(null);
            aVar.k(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(androidx.constraintlayout.core.state.a aVar, LayoutDirection layoutDirection) {
        aVar.x(null);
        aVar.y(null);
        int i = a.a[layoutDirection.ordinal()];
        if (i == 1) {
            aVar.l(null);
            aVar.k(null);
        } else {
            if (i != 2) {
                return;
            }
            aVar.E(null);
            aVar.D(null);
        }
    }

    public final gt2[][] e() {
        return c;
    }

    public final it2[][] f() {
        return b;
    }

    public final int g(int i, LayoutDirection layoutDirection) {
        zq3.h(layoutDirection, "layoutDirection");
        return i >= 0 ? i : layoutDirection == LayoutDirection.Ltr ? i + 2 : (-i) - 1;
    }
}
