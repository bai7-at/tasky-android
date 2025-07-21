package defpackage;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.a;
import kotlin.collections.i;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes.dex */
public abstract class jj7 {
    static final /* synthetic */ iv3[] a = {zt6.f(new MutablePropertyReference1Impl(jj7.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), zt6.f(new MutablePropertyReference1Impl(jj7.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        semanticsProperties.x();
        semanticsProperties.t();
        semanticsProperties.r();
        semanticsProperties.q();
        semanticsProperties.g();
        semanticsProperties.p();
        semanticsProperties.p();
        semanticsProperties.D();
        semanticsProperties.i();
        semanticsProperties.E();
        semanticsProperties.u();
        semanticsProperties.y();
        semanticsProperties.B();
        semanticsProperties.o();
        semanticsProperties.e();
        semanticsProperties.A();
        semanticsProperties.j();
        semanticsProperties.w();
        semanticsProperties.a();
        semanticsProperties.b();
        semanticsProperties.C();
        aj7.a.d();
    }

    public static /* synthetic */ void A(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        z(lj7Var, str, qs2Var);
    }

    public static final void B(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.s(), ww8.a);
    }

    public static final void C(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.q(), new u2(str, qs2Var));
    }

    public static /* synthetic */ void D(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        C(lj7Var, str, qs2Var);
    }

    public static final void E(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.n(), ww8.a);
    }

    public static final void F(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.r(), new u2(str, qs2Var));
    }

    public static /* synthetic */ void G(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        F(lj7Var, str, qs2Var);
    }

    public static final void H(lj7 lj7Var, String str, gt2 gt2Var) {
        lj7Var.a(aj7.a.s(), new u2(str, gt2Var));
    }

    public static /* synthetic */ void I(lj7 lj7Var, String str, gt2 gt2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        H(lj7Var, str, gt2Var);
    }

    public static final void J(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.t(), new u2(str, ss2Var));
    }

    public static /* synthetic */ void K(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        J(lj7Var, str, ss2Var);
    }

    public static final void L(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.v(), ww8.a);
    }

    public static final void M(lj7 lj7Var, hn0 hn0Var) {
        SemanticsProperties.a.a().d(lj7Var, a[18], hn0Var);
    }

    public static final void N(lj7 lj7Var, boolean z) {
        SemanticsProperties.a.p().d(lj7Var, a[5], Boolean.valueOf(z));
    }

    public static final void O(lj7 lj7Var, String str) {
        lj7Var.a(SemanticsProperties.a.c(), i.e(str));
    }

    public static final void P(lj7 lj7Var, a aVar) {
        SemanticsProperties.a.e().d(lj7Var, a[14], aVar);
    }

    public static final void Q(lj7 lj7Var, boolean z) {
        SemanticsProperties.a.g().d(lj7Var, a[4], Boolean.valueOf(z));
    }

    public static final void R(lj7 lj7Var, nc7 nc7Var) {
        SemanticsProperties.a.i().d(lj7Var, a[8], nc7Var);
    }

    public static final void S(lj7 lj7Var, int i) {
        SemanticsProperties.a.q().d(lj7Var, a[3], s64.c(i));
    }

    public static final void T(lj7 lj7Var, String str) {
        SemanticsProperties.a.r().d(lj7Var, a[2], str);
    }

    public static final void U(lj7 lj7Var, r46 r46Var) {
        SemanticsProperties.a.t().d(lj7Var, a[1], r46Var);
    }

    public static final void V(lj7 lj7Var, int i) {
        SemanticsProperties.a.u().d(lj7Var, a[10], n27.h(i));
    }

    public static final void W(lj7 lj7Var, boolean z) {
        SemanticsProperties.a.w().d(lj7Var, a[17], Boolean.valueOf(z));
    }

    public static final void X(lj7 lj7Var, String str, it2 it2Var) {
        lj7Var.a(aj7.a.v(), new u2(str, it2Var));
    }

    public static /* synthetic */ void Y(lj7 lj7Var, String str, it2 it2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        X(lj7Var, str, it2Var);
    }

    public static final void Z(lj7 lj7Var, boolean z) {
        SemanticsProperties.a.o().d(lj7Var, a[13], Boolean.valueOf(z));
    }

    public static final SemanticsPropertyKey a(String str) {
        return new SemanticsPropertyKey(str, true);
    }

    public static final void a0(lj7 lj7Var, String str) {
        SemanticsProperties.a.y().d(lj7Var, a[11], str);
    }

    public static final SemanticsPropertyKey b(String str, gt2 gt2Var) {
        return new SemanticsPropertyKey(str, true, gt2Var);
    }

    public static final void b0(lj7 lj7Var, a aVar) {
        lj7Var.a(SemanticsProperties.a.z(), i.e(aVar));
    }

    public static final void c(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.a(), new u2(str, qs2Var));
    }

    public static final void c0(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.w(), new u2(str, ss2Var));
    }

    public static /* synthetic */ void d(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c(lj7Var, str, qs2Var);
    }

    public static /* synthetic */ void d0(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c0(lj7Var, str, ss2Var);
    }

    public static final void e(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.b(), new u2(str, qs2Var));
    }

    public static final void e0(lj7 lj7Var, long j) {
        SemanticsProperties.a.A().d(lj7Var, a[15], androidx.compose.ui.text.i.b(j));
    }

    public static final void f(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.c(), new u2(str, qs2Var));
    }

    public static final void f0(lj7 lj7Var, a aVar) {
        SemanticsProperties.a.B().d(lj7Var, a[12], aVar);
    }

    public static /* synthetic */ void g(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        f(lj7Var, str, qs2Var);
    }

    public static final void g0(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.x(), new u2(str, ss2Var));
    }

    public static final void h(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.e(), new u2(str, qs2Var));
    }

    public static /* synthetic */ void h0(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        g0(lj7Var, str, ss2Var);
    }

    public static /* synthetic */ void i(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        h(lj7Var, str, qs2Var);
    }

    public static final void i0(lj7 lj7Var, ToggleableState toggleableState) {
        SemanticsProperties.a.C().d(lj7Var, a[20], toggleableState);
    }

    public static final void j(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.m(), ww8.a);
    }

    public static final void j0(lj7 lj7Var, boolean z) {
        SemanticsProperties.a.p().d(lj7Var, a[6], Boolean.valueOf(z));
    }

    public static final void k(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.d(), ww8.a);
    }

    public static final void k0(lj7 lj7Var, nc7 nc7Var) {
        SemanticsProperties.a.E().d(lj7Var, a[9], nc7Var);
    }

    public static final void l(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.f(), new u2(str, qs2Var));
    }

    public static final void l0(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.y(), new u2(str, ss2Var));
    }

    public static /* synthetic */ void m(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        l(lj7Var, str, qs2Var);
    }

    public static /* synthetic */ void m0(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        l0(lj7Var, str, ss2Var);
    }

    public static final void n(lj7 lj7Var, String str) {
        lj7Var.a(SemanticsProperties.a.f(), str);
    }

    public static final void o(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.g(), new u2(str, qs2Var));
    }

    public static final void p(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.h(), new u2(str, ss2Var));
    }

    public static /* synthetic */ void q(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        p(lj7Var, str, ss2Var);
    }

    public static final void r(lj7 lj7Var) {
        lj7Var.a(SemanticsProperties.a.h(), ww8.a);
    }

    public static final void s(lj7 lj7Var, ss2 ss2Var) {
        lj7Var.a(SemanticsProperties.a.k(), ss2Var);
    }

    public static final void t(lj7 lj7Var, String str, ss2 ss2Var) {
        lj7Var.a(aj7.a.i(), new u2(str, ss2Var));
    }

    public static /* synthetic */ void u(lj7 lj7Var, String str, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        t(lj7Var, str, ss2Var);
    }

    public static final void v(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.j(), new u2(str, qs2Var));
    }

    public static /* synthetic */ void w(lj7 lj7Var, String str, qs2 qs2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        v(lj7Var, str, qs2Var);
    }

    public static final void x(lj7 lj7Var, int i, String str, qs2 qs2Var) {
        lj7Var.a(SemanticsProperties.a.j(), androidx.compose.ui.text.input.a.i(i));
        lj7Var.a(aj7.a.k(), new u2(str, qs2Var));
    }

    public static /* synthetic */ void y(lj7 lj7Var, int i, String str, qs2 qs2Var, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        x(lj7Var, i, str, qs2Var);
    }

    public static final void z(lj7 lj7Var, String str, qs2 qs2Var) {
        lj7Var.a(aj7.a.l(), new u2(str, qs2Var));
    }
}
