package androidx.compose.ui.platform;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.aj8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class c extends androidx.compose.ui.platform.a {
    private static c f;
    private aj8 c;
    public static final a d = new a(null);
    public static final int e = 8;
    private static final ResolvedTextDirection g = ResolvedTextDirection.Rtl;
    private static final ResolvedTextDirection h = ResolvedTextDirection.Ltr;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            if (c.f == null) {
                c.f = new c(null);
            }
            c cVar = c.f;
            zq3.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return cVar;
        }

        private a() {
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i, ResolvedTextDirection resolvedTextDirection) {
        aj8 aj8Var = this.c;
        aj8 aj8Var2 = null;
        if (aj8Var == null) {
            zq3.z("layoutResult");
            aj8Var = null;
        }
        int u = aj8Var.u(i);
        aj8 aj8Var3 = this.c;
        if (aj8Var3 == null) {
            zq3.z("layoutResult");
            aj8Var3 = null;
        }
        if (resolvedTextDirection != aj8Var3.y(u)) {
            aj8 aj8Var4 = this.c;
            if (aj8Var4 == null) {
                zq3.z("layoutResult");
            } else {
                aj8Var2 = aj8Var4;
            }
            return aj8Var2.u(i);
        }
        aj8 aj8Var5 = this.c;
        if (aj8Var5 == null) {
            zq3.z("layoutResult");
            aj8Var5 = null;
        }
        return aj8.p(aj8Var5, i, false, 2, null) - 1;
    }

    @Override // defpackage.y2
    public int[] a(int i) {
        int i2;
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            aj8 aj8Var = this.c;
            if (aj8Var == null) {
                zq3.z("layoutResult");
                aj8Var = null;
            }
            i2 = aj8Var.q(0);
        } else {
            aj8 aj8Var2 = this.c;
            if (aj8Var2 == null) {
                zq3.z("layoutResult");
                aj8Var2 = null;
            }
            int q = aj8Var2.q(i);
            i2 = i(q, g) == i ? q : q + 1;
        }
        aj8 aj8Var3 = this.c;
        if (aj8Var3 == null) {
            zq3.z("layoutResult");
            aj8Var3 = null;
        }
        if (i2 >= aj8Var3.n()) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    @Override // defpackage.y2
    public int[] b(int i) {
        int i2;
        if (d().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > d().length()) {
            aj8 aj8Var = this.c;
            if (aj8Var == null) {
                zq3.z("layoutResult");
                aj8Var = null;
            }
            i2 = aj8Var.q(d().length());
        } else {
            aj8 aj8Var2 = this.c;
            if (aj8Var2 == null) {
                zq3.z("layoutResult");
                aj8Var2 = null;
            }
            int q = aj8Var2.q(i);
            i2 = i(q, h) + 1 == i ? q : q - 1;
        }
        if (i2 < 0) {
            return null;
        }
        return c(i(i2, g), i(i2, h) + 1);
    }

    public final void j(String str, aj8 aj8Var) {
        f(str);
        this.c = aj8Var;
    }

    private c() {
    }
}
