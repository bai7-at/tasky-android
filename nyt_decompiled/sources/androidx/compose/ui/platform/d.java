package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.aj8;
import defpackage.dg4;
import defpackage.uo6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d extends androidx.compose.ui.platform.a {
    private static d h;
    private aj8 c;
    private SemanticsNode d;
    private Rect e;
    public static final a f = new a(null);
    public static final int g = 8;
    private static final ResolvedTextDirection i = ResolvedTextDirection.Rtl;
    private static final ResolvedTextDirection j = ResolvedTextDirection.Ltr;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            if (d.h == null) {
                d.h = new d(null);
            }
            d dVar = d.h;
            zq3.f(dVar, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return dVar;
        }

        private a() {
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i2, ResolvedTextDirection resolvedTextDirection) {
        aj8 aj8Var = this.c;
        aj8 aj8Var2 = null;
        if (aj8Var == null) {
            zq3.z("layoutResult");
            aj8Var = null;
        }
        int u = aj8Var.u(i2);
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
            return aj8Var2.u(i2);
        }
        aj8 aj8Var5 = this.c;
        if (aj8Var5 == null) {
            zq3.z("layoutResult");
            aj8Var5 = null;
        }
        return aj8.p(aj8Var5, i2, false, 2, null) - 1;
    }

    @Override // defpackage.y2
    public int[] a(int i2) {
        int n;
        aj8 aj8Var = null;
        if (d().length() <= 0 || i2 >= d().length()) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.d;
            if (semanticsNode == null) {
                zq3.z("node");
                semanticsNode = null;
            }
            int d = dg4.d(semanticsNode.i().h());
            int d2 = uo6.d(0, i2);
            aj8 aj8Var2 = this.c;
            if (aj8Var2 == null) {
                zq3.z("layoutResult");
                aj8Var2 = null;
            }
            int q = aj8Var2.q(d2);
            aj8 aj8Var3 = this.c;
            if (aj8Var3 == null) {
                zq3.z("layoutResult");
                aj8Var3 = null;
            }
            float v = aj8Var3.v(q) + d;
            aj8 aj8Var4 = this.c;
            if (aj8Var4 == null) {
                zq3.z("layoutResult");
                aj8Var4 = null;
            }
            aj8 aj8Var5 = this.c;
            if (aj8Var5 == null) {
                zq3.z("layoutResult");
                aj8Var5 = null;
            }
            if (v < aj8Var4.v(aj8Var5.n() - 1)) {
                aj8 aj8Var6 = this.c;
                if (aj8Var6 == null) {
                    zq3.z("layoutResult");
                } else {
                    aj8Var = aj8Var6;
                }
                n = aj8Var.r(v);
            } else {
                aj8 aj8Var7 = this.c;
                if (aj8Var7 == null) {
                    zq3.z("layoutResult");
                } else {
                    aj8Var = aj8Var7;
                }
                n = aj8Var.n();
            }
            return c(d2, i(n - 1, j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.y2
    public int[] b(int i2) {
        int i3;
        aj8 aj8Var = null;
        if (d().length() <= 0 || i2 <= 0) {
            return null;
        }
        try {
            SemanticsNode semanticsNode = this.d;
            if (semanticsNode == null) {
                zq3.z("node");
                semanticsNode = null;
            }
            int d = dg4.d(semanticsNode.i().h());
            int i4 = uo6.i(d().length(), i2);
            aj8 aj8Var2 = this.c;
            if (aj8Var2 == null) {
                zq3.z("layoutResult");
                aj8Var2 = null;
            }
            int q = aj8Var2.q(i4);
            aj8 aj8Var3 = this.c;
            if (aj8Var3 == null) {
                zq3.z("layoutResult");
                aj8Var3 = null;
            }
            float v = aj8Var3.v(q) - d;
            if (v > 0.0f) {
                aj8 aj8Var4 = this.c;
                if (aj8Var4 == null) {
                    zq3.z("layoutResult");
                } else {
                    aj8Var = aj8Var4;
                }
                i3 = aj8Var.r(v);
            } else {
                i3 = 0;
            }
            if (i4 == d().length() && i3 < q) {
                i3++;
            }
            return c(i(i3, i), i4);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, aj8 aj8Var, SemanticsNode semanticsNode) {
        f(str);
        this.c = aj8Var;
        this.d = semanticsNode;
    }

    private d() {
        this.e = new Rect();
    }
}
