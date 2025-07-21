package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import com.amazonaws.event.ProgressEvent;
import defpackage.ch9;
import defpackage.h3;
import defpackage.pg9;
import defpackage.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class k99 {
    private static WeakHashMap a;
    private static final int[] b = {eh6.accessibility_custom_action_0, eh6.accessibility_custom_action_1, eh6.accessibility_custom_action_2, eh6.accessibility_custom_action_3, eh6.accessibility_custom_action_4, eh6.accessibility_custom_action_5, eh6.accessibility_custom_action_6, eh6.accessibility_custom_action_7, eh6.accessibility_custom_action_8, eh6.accessibility_custom_action_9, eh6.accessibility_custom_action_10, eh6.accessibility_custom_action_11, eh6.accessibility_custom_action_12, eh6.accessibility_custom_action_13, eh6.accessibility_custom_action_14, eh6.accessibility_custom_action_15, eh6.accessibility_custom_action_16, eh6.accessibility_custom_action_17, eh6.accessibility_custom_action_18, eh6.accessibility_custom_action_19, eh6.accessibility_custom_action_20, eh6.accessibility_custom_action_21, eh6.accessibility_custom_action_22, eh6.accessibility_custom_action_23, eh6.accessibility_custom_action_24, eh6.accessibility_custom_action_25, eh6.accessibility_custom_action_26, eh6.accessibility_custom_action_27, eh6.accessibility_custom_action_28, eh6.accessibility_custom_action_29, eh6.accessibility_custom_action_30, eh6.accessibility_custom_action_31};
    private static final gf5 c = new gf5() { // from class: j99
        @Override // defpackage.gf5
        public final bw0 a(bw0 bw0Var) {
            bw0 T;
            T = k99.T(bw0Var);
            return T;
        }
    };
    private static final e d = new e();

    class a extends f {
        a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // k99.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap a = new WeakHashMap();

        e() {
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        void c(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {
        private final int a;
        private final Class b;
        private final int c;
        private final int d;

        f(int i, Class cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.a);
            if (this.b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                k99.i(view);
                view.setTag(this.a, obj);
                k99.U(view, this.d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i, Class cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {
            ch9 a = null;
            final /* synthetic */ View b;
            final /* synthetic */ be5 c;

            a(View view, be5 be5Var) {
                this.b = view;
                this.c = be5Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                ch9 w = ch9.w(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (w.equals(this.a)) {
                        return this.c.a(view, w).u();
                    }
                }
                this.a = w;
                ch9 a = this.c.a(view, w);
                if (i >= 30) {
                    return a.u();
                }
                k99.i0(view);
                return a.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(eh6.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static ch9 b(View view, ch9 ch9Var, Rect rect) {
            WindowInsets u = ch9Var.u();
            if (u != null) {
                return ch9.w(view.computeSystemWindowInsets(u, rect), view);
            }
            rect.setEmpty();
            return ch9Var;
        }

        static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static ch9 j(View view) {
            return ch9.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f) {
            view.setElevation(f);
        }

        static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void u(View view, be5 be5Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(eh6.tag_on_apply_window_listener, be5Var);
            }
            if (be5Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(eh6.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, be5Var));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        static void x(View view, float f) {
            view.setZ(f);
        }

        static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static ch9 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            ch9 v = ch9.v(rootWindowInsets);
            v.t(v);
            v.d(view.getRootView());
            return v;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    static class j {
        static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class k {
        static void a(View view, final p pVar) {
            hs7 hs7Var = (hs7) view.getTag(eh6.tag_unhandled_key_listeners);
            if (hs7Var == null) {
                hs7Var = new hs7();
                view.setTag(eh6.tag_unhandled_key_listeners, hs7Var);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(pVar) { // from class: l99
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            hs7Var.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            hs7 hs7Var = (hs7) view.getTag(eh6.tag_unhandled_key_listeners);
            if (hs7Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hs7Var.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, p20 p20Var) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static void e(View view, wv0 wv0Var) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class m {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static ph9 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return ph9.h(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static bw0 b(View view, bw0 bw0Var) {
            ContentInfo f = bw0Var.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f ? bw0Var : bw0.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, ff5 ff5Var) {
            if (ff5Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(ff5Var));
            }
        }
    }

    private static final class o implements OnReceiveContentListener {
        private final ff5 a;

        o(ff5 ff5Var) {
            this.a = ff5Var;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            bw0 g = bw0.g(contentInfo);
            bw0 a = this.a.a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.f();
        }
    }

    public interface p {
    }

    public static String[] A(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(eh6.tag_on_receive_content_mime_types);
    }

    public static void A0(View view, be5 be5Var) {
        h.u(view, be5Var);
    }

    public static int B(View view) {
        return view.getPaddingEnd();
    }

    public static void B0(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static int C(View view) {
        return view.getPaddingStart();
    }

    public static void C0(View view, int i2, int i3) {
        i.d(view, i2, i3);
    }

    public static ViewParent D(View view) {
        return view.getParentForAccessibility();
    }

    public static void D0(View view, CharSequence charSequence) {
        G0().f(view, charSequence);
    }

    public static ch9 E(View view) {
        return i.a(view);
    }

    public static void E0(View view, String str) {
        h.v(view, str);
    }

    public static CharSequence F(View view) {
        return (CharSequence) G0().e(view);
    }

    public static void F0(View view, pg9.b bVar) {
        pg9.d(view, bVar);
    }

    public static String G(View view) {
        return h.k(view);
    }

    private static f G0() {
        return new c(eh6.tag_state_description, CharSequence.class, 64, 30);
    }

    public static ph9 H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return kg9.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void H0(View view) {
        h.z(view);
    }

    public static int I(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float J(View view) {
        return h.m(view);
    }

    public static boolean K(View view) {
        return l(view) != null;
    }

    public static boolean L(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean M(View view) {
        return view.hasTransientState();
    }

    public static boolean N(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean O(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean P(View view) {
        return view.isLaidOut();
    }

    public static boolean Q(View view) {
        return h.p(view);
    }

    public static boolean R(View view) {
        return view.isPaddingRelative();
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) k0().e(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bw0 T(bw0 bw0Var) {
        return bw0Var;
    }

    static void U(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : ProgressEvent.PART_COMPLETED_EVENT_CODE);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(m(view));
                    w0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void V(View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void W(View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    public static ch9 X(View view, ch9 ch9Var) {
        WindowInsets u = ch9Var.u();
        if (u != null) {
            WindowInsets b2 = g.b(view, u);
            if (!b2.equals(u)) {
                return ch9.w(b2, view);
            }
        }
        return ch9Var;
    }

    public static void Y(View view, h3 h3Var) {
        view.onInitializeAccessibilityNodeInfo(h3Var.T0());
    }

    private static f Z() {
        return new b(eh6.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static boolean a0(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    private static f b() {
        return new d(eh6.tag_accessibility_heading, Boolean.class, 28);
    }

    public static bw0 b0(View view, bw0 bw0Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + bw0Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, bw0Var);
        }
        ff5 ff5Var = (ff5) view.getTag(eh6.tag_on_receive_content_listener);
        if (ff5Var == null) {
            return t(view).a(bw0Var);
        }
        bw0 a2 = ff5Var.a(view, bw0Var);
        if (a2 == null) {
            return null;
        }
        return t(view).a(a2);
    }

    public static int c(View view, CharSequence charSequence, k3 k3Var) {
        int o2 = o(view, charSequence);
        if (o2 != -1) {
            d(view, new h3.a(o2, charSequence, k3Var));
        }
        return o2;
    }

    public static void c0(View view) {
        view.postInvalidateOnAnimation();
    }

    private static void d(View view, h3.a aVar) {
        i(view);
        g0(aVar.b(), view);
        n(view).add(aVar);
        U(view, 0);
    }

    public static void d0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static ab9 e(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        ab9 ab9Var = (ab9) a.get(view);
        if (ab9Var != null) {
            return ab9Var;
        }
        ab9 ab9Var2 = new ab9(view);
        a.put(view, ab9Var2);
        return ab9Var2;
    }

    public static void e0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static ch9 f(View view, ch9 ch9Var, Rect rect) {
        return h.b(view, ch9Var, rect);
    }

    public static void f0(View view, int i2) {
        g0(i2, view);
        U(view, 0);
    }

    public static ch9 g(View view, ch9 ch9Var) {
        WindowInsets u = ch9Var.u();
        if (u != null) {
            WindowInsets a2 = g.a(view, u);
            if (!a2.equals(u)) {
                return ch9.w(a2, view);
            }
        }
        return ch9Var;
    }

    private static void g0(int i2, View view) {
        List n2 = n(view);
        for (int i3 = 0; i3 < n2.size(); i3++) {
            if (((h3.a) n2.get(i3)).b() == i2) {
                n2.remove(i3);
                return;
            }
        }
    }

    static boolean h(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void h0(View view, h3.a aVar, CharSequence charSequence, k3 k3Var) {
        if (k3Var == null && charSequence == null) {
            f0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, k3Var));
        }
    }

    static void i(View view) {
        w2 k2 = k(view);
        if (k2 == null) {
            k2 = new w2();
        }
        l0(view, k2);
    }

    public static void i0(View view) {
        g.c(view);
    }

    public static int j() {
        return View.generateViewId();
    }

    public static void j0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        l.d(view, context, iArr, attributeSet, typedArray, i2, i3);
    }

    public static w2 k(View view) {
        View.AccessibilityDelegate l2 = l(view);
        if (l2 == null) {
            return null;
        }
        return l2 instanceof w2.a ? ((w2.a) l2).a : new w2(l2);
    }

    private static f k0() {
        return new a(eh6.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate l(View view) {
        return l.a(view);
    }

    public static void l0(View view, w2 w2Var) {
        if (w2Var == null && (l(view) instanceof w2.a)) {
            w2Var = new w2();
        }
        w0(view);
        view.setAccessibilityDelegate(w2Var == null ? null : w2Var.d());
    }

    public static CharSequence m(View view) {
        return (CharSequence) Z().e(view);
    }

    public static void m0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    private static List n(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(eh6.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(eh6.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void n0(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    private static int o(View view, CharSequence charSequence) {
        List n2 = n(view);
        for (int i2 = 0; i2 < n2.size(); i2++) {
            if (TextUtils.equals(charSequence, ((h3.a) n2.get(i2)).c())) {
                return ((h3.a) n2.get(i2)).b();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = b;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z = true;
            for (int i6 = 0; i6 < n2.size(); i6++) {
                z &= ((h3.a) n2.get(i6)).b() != i5;
            }
            if (z) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    public static void o0(View view, CharSequence charSequence) {
        Z().f(view, charSequence);
        if (charSequence != null) {
            d.a(view);
        } else {
            d.c(view);
        }
    }

    public static ColorStateList p(View view) {
        return h.g(view);
    }

    public static void p0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode q(View view) {
        return h.h(view);
    }

    public static void q0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static Display r(View view) {
        return view.getDisplay();
    }

    public static void r0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static float s(View view) {
        return h.i(view);
    }

    public static void s0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static gf5 t(View view) {
        return view instanceof gf5 ? (gf5) view : c;
    }

    public static void t0(View view, float f2) {
        h.s(view, f2);
    }

    public static boolean u(View view) {
        return view.getFitsSystemWindows();
    }

    public static void u0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static int v(View view) {
        return view.getImportantForAccessibility();
    }

    public static void v0(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static int w(View view) {
        return j.c(view);
    }

    private static void w0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static int x(View view) {
        return view.getLayoutDirection();
    }

    public static void x0(View view, int i2) {
        j.m(view, i2);
    }

    public static int y(View view) {
        return view.getMinimumHeight();
    }

    public static void y0(View view, int i2) {
        view.setLabelFor(i2);
    }

    public static int z(View view) {
        return view.getMinimumWidth();
    }

    public static void z0(View view, boolean z) {
        h.t(view, z);
    }
}
