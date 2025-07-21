package androidx.compose.ui.node;

import androidx.compose.ui.layout.l;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.text.font.d;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bk8;
import defpackage.cl3;
import defpackage.ex7;
import defpackage.fm1;
import defpackage.hu1;
import defpackage.jm5;
import defpackage.l20;
import defpackage.ng9;
import defpackage.qs2;
import defpackage.r20;
import defpackage.r99;
import defpackage.ri8;
import defpackage.rx5;
import defpackage.sl0;
import defpackage.ss2;
import defpackage.u63;
import defpackage.uz3;
import defpackage.vl2;
import defpackage.z2;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public interface m {
    public static final a G = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();
        private static boolean b;

        private a() {
        }

        public final boolean a() {
            return b;
        }
    }

    public interface b {
        void i();
    }

    static /* synthetic */ void b(m mVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        mVar.a(z);
    }

    static /* synthetic */ void d(m mVar, LayoutNode layoutNode, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        mVar.c(layoutNode, z, z2);
    }

    static /* synthetic */ void j(m mVar, LayoutNode layoutNode, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        mVar.i(layoutNode, z);
    }

    static /* synthetic */ void v(m mVar, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        mVar.p(layoutNode, z, z2, z3);
    }

    void a(boolean z);

    void c(LayoutNode layoutNode, boolean z, boolean z2);

    long e(long j);

    void f(LayoutNode layoutNode);

    void g(LayoutNode layoutNode);

    z2 getAccessibilityManager();

    l20 getAutofill();

    r20 getAutofillTree();

    sl0 getClipboardManager();

    CoroutineContext getCoroutineContext();

    fm1 getDensity();

    hu1 getDragAndDropManager();

    vl2 getFocusOwner();

    e.b getFontFamilyResolver();

    d.a getFontLoader();

    u63 getHapticFeedBack();

    cl3 getInputModeManager();

    LayoutDirection getLayoutDirection();

    ModifierLocalManager getModifierLocalManager();

    l.a getPlacementScope();

    rx5 getPointerIconService();

    LayoutNode getRoot();

    uz3 getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    ex7 getSoftwareKeyboardController();

    ri8 getTextInputService();

    bk8 getTextToolbar();

    r99 getViewConfiguration();

    ng9 getWindowInfo();

    void i(LayoutNode layoutNode, boolean z);

    void m(LayoutNode layoutNode);

    void n(LayoutNode layoutNode, long j);

    long o(long j);

    void p(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    jm5 q(ss2 ss2Var, qs2 qs2Var);

    void r(qs2 qs2Var);

    boolean requestFocus();

    void s(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    void t();

    void u();
}
