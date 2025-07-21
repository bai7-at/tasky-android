package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.comscore.streaming.ContentMediaFormat;
import defpackage.bn3;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.ci7;
import defpackage.cn3;
import defpackage.cz3;
import defpackage.dg4;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.ib9;
import defpackage.in3;
import defpackage.kg6;
import defpackage.ok6;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.wz5;
import defpackage.x08;
import defpackage.xz5;
import defpackage.yz5;
import defpackage.zq3;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$LongRef;

/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ib9 {
    private static final b S = new b(null);
    public static final int e0 = 8;
    private static final ss2 f0 = new ss2() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        public final void b(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.v();
            }
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((PopupLayout) obj);
            return ww8.a;
        }
    };
    private final float B;
    private final Rect H;
    private final SnapshotStateObserver L;
    private final sy4 M;
    private boolean N;
    private final int[] Q;
    private qs2 i;
    private yz5 j;
    private String k;
    private final View l;
    private final wz5 m;
    private final WindowManager n;
    private final WindowManager.LayoutParams r;
    private xz5 s;
    private LayoutDirection t;
    private final sy4 u;
    private final sy4 w;
    private bn3 x;
    private final x08 y;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ PopupLayout(qs2 qs2Var, yz5 yz5Var, String str, View view, fm1 fm1Var, xz5 xz5Var, UUID uuid, wz5 wz5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qs2Var, yz5Var, str, view, fm1Var, xz5Var, uuid, (i & 128) != 0 ? new androidx.compose.ui.window.b() : wz5Var);
    }

    private final gt2 getContent() {
        return (gt2) this.M.getValue();
    }

    private final int getDisplayHeight() {
        return dg4.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return dg4.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cz3 getParentLayoutCoordinates() {
        return (cz3) this.w.getValue();
    }

    private final void m(int i) {
        WindowManager.LayoutParams layoutParams = this.r;
        layoutParams.flags = i;
        this.m.b(this.n, this, layoutParams);
    }

    private final WindowManager.LayoutParams n() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = ContentMediaFormat.FULL_CONTENT_EPISODE;
        layoutParams.token = this.l.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.l.getContext().getResources().getString(ok6.default_popup_window_title));
        return layoutParams;
    }

    private final void r(LayoutDirection layoutDirection) {
        int i = c.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    private final void setClippingEnabled(boolean z) {
        m(z ? this.r.flags & (-513) : this.r.flags | 512);
    }

    private final void setContent(gt2 gt2Var) {
        this.M.setValue(gt2Var);
    }

    private final void setIsFocusable(boolean z) {
        m(!z ? this.r.flags | 8 : this.r.flags & (-9));
    }

    private final void setParentLayoutCoordinates(cz3 cz3Var) {
        this.w.setValue(cz3Var);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        m(ci7.a(secureFlagPolicy, AndroidPopup_androidKt.f(this.l)) ? this.r.flags | 8192 : this.r.flags & (-8193));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        Composer h = composer.h(-857613600);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:475)");
        }
        getContent().invoke(h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.ui.window.PopupLayout$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    PopupLayout.this.b(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.b(this, null);
        this.n.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.j.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                qs2 qs2Var = this.i;
                if (qs2Var != null) {
                    qs2Var.mo865invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.r;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.t;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final hn3 m112getPopupContentSizebOM6tXw() {
        return (hn3) this.u.getValue();
    }

    public final xz5 getPositionProvider() {
        return this.s;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.N;
    }

    @Override // defpackage.ib9
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.k;
    }

    @Override // defpackage.ib9
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void h(boolean z, int i, int i2, int i3, int i4) {
        View childAt;
        super.h(z, i, i2, i3, i4);
        if (this.j.g() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.r.width = childAt.getMeasuredWidth();
        this.r.height = childAt.getMeasuredHeight();
        this.m.b(this.n, this, this.r);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void i(int i, int i2) {
        if (this.j.g()) {
            super.i(i, i2);
        } else {
            super.i(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), RecyclerView.UNDEFINED_DURATION));
        }
    }

    public final void o() {
        int[] iArr = this.Q;
        int i = iArr[0];
        int i2 = iArr[1];
        this.l.getLocationOnScreen(iArr);
        int[] iArr2 = this.Q;
        if (i == iArr2[0] && i2 == iArr2[1]) {
            return;
        }
        t();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L.t();
        this.L.j();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.j.c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            qs2 qs2Var = this.i;
            if (qs2Var != null) {
                qs2Var.mo865invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        qs2 qs2Var2 = this.i;
        if (qs2Var2 != null) {
            qs2Var2.mo865invoke();
        }
        return true;
    }

    public final void p(androidx.compose.runtime.c cVar, gt2 gt2Var) {
        setParentCompositionContext(cVar);
        setContent(gt2Var);
        this.N = true;
    }

    public final void q() {
        this.n.addView(this, this.r);
    }

    public final void s(qs2 qs2Var, yz5 yz5Var, String str, LayoutDirection layoutDirection) {
        this.i = qs2Var;
        if (yz5Var.g() && !this.j.g()) {
            WindowManager.LayoutParams layoutParams = this.r;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.m.b(this.n, this, layoutParams);
        }
        this.j = yz5Var;
        this.k = str;
        setIsFocusable(yz5Var.e());
        setSecurePolicy(yz5Var.f());
        setClippingEnabled(yz5Var.a());
        r(layoutDirection);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.t = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m113setPopupContentSizefhxjrPA(hn3 hn3Var) {
        this.u.setValue(hn3Var);
    }

    public final void setPositionProvider(xz5 xz5Var) {
        this.s = xz5Var;
    }

    public final void setTestTag(String str) {
        this.k = str;
    }

    public final void t() {
        cz3 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long a2 = parentLayoutCoordinates.a();
        long f = ez3.f(parentLayoutCoordinates);
        bn3 a3 = cn3.a(wm3.a(dg4.d(fd5.o(f)), dg4.d(fd5.p(f))), a2);
        if (zq3.c(a3, this.x)) {
            return;
        }
        this.x = a3;
        v();
    }

    public final void u(cz3 cz3Var) {
        setParentLayoutCoordinates(cz3Var);
        t();
    }

    public final void v() {
        hn3 m112getPopupContentSizebOM6tXw;
        bn3 g;
        final bn3 bn3Var = this.x;
        if (bn3Var == null || (m112getPopupContentSizebOM6tXw = m112getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = m112getPopupContentSizebOM6tXw.j();
        Rect rect = this.H;
        this.m.a(this.l, rect);
        g = AndroidPopup_androidKt.g(rect);
        final long a2 = in3.a(g.i(), g.c());
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = vm3.b.a();
        this.L.o(this, f0, new qs2() { // from class: androidx.compose.ui.window.PopupLayout$updatePosition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m114invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m114invoke() {
                Ref$LongRef.this.element = this.getPositionProvider().a(bn3Var, a2, this.getParentLayoutDirection(), j);
            }
        });
        this.r.x = vm3.j(ref$LongRef.element);
        this.r.y = vm3.k(ref$LongRef.element);
        if (this.j.d()) {
            this.m.c(this, hn3.g(a2), hn3.f(a2));
        }
        this.m.b(this.n, this, this.r);
    }

    public PopupLayout(qs2 qs2Var, yz5 yz5Var, String str, View view, fm1 fm1Var, xz5 xz5Var, UUID uuid, wz5 wz5Var) {
        super(view.getContext(), null, 0, 6, null);
        this.i = qs2Var;
        this.j = yz5Var;
        this.k = str;
        this.l = view;
        this.m = wz5Var;
        Object systemService = view.getContext().getSystemService("window");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.n = (WindowManager) systemService;
        this.r = n();
        this.s = xz5Var;
        this.t = LayoutDirection.Ltr;
        this.u = b0.e(null, null, 2, null);
        this.w = b0.e(null, null, 2, null);
        this.y = y.d(new qs2() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                cz3 parentLayoutCoordinates;
                parentLayoutCoordinates = PopupLayout.this.getParentLayoutCoordinates();
                return Boolean.valueOf((parentLayoutCoordinates == null || PopupLayout.this.m112getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float g = bu1.g(8);
        this.B = g;
        this.H = new Rect();
        this.L = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        setTag(kg6.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fm1Var.f1(g));
        setOutlineProvider(new a());
        this.M = b0.e(ComposableSingletons$AndroidPopup_androidKt.a.a(), null, 2, null);
        this.Q = new int[2];
    }
}
