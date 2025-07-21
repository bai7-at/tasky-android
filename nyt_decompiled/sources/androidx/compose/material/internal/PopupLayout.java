package androidx.compose.material.internal;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.c;
import androidx.compose.runtime.y;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import defpackage.bn3;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hn3;
import defpackage.ib9;
import defpackage.kg6;
import defpackage.mt6;
import defpackage.ok6;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xz5;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
final class PopupLayout extends AbstractComposeView implements ib9, ViewTreeObserver.OnGlobalLayoutListener {
    private final Rect B;
    private final sy4 H;
    private boolean L;
    private qs2 i;
    private String j;
    private final View k;
    private final boolean l;
    private final WindowManager m;
    private final WindowManager.LayoutParams n;
    private xz5 r;
    private LayoutDirection s;
    private final sy4 t;
    private final sy4 u;
    private final x08 w;
    private final float x;
    private final Rect y;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public /* synthetic */ class b {
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

    public PopupLayout(qs2 qs2Var, String str, View view, boolean z, fm1 fm1Var, xz5 xz5Var, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.i = qs2Var;
        this.j = str;
        this.k = view;
        this.l = z;
        Object systemService = view.getContext().getSystemService("window");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.m = (WindowManager) systemService;
        this.n = l();
        this.r = xz5Var;
        this.s = LayoutDirection.Ltr;
        this.t = b0.e(null, null, 2, null);
        this.u = b0.e(null, null, 2, null);
        this.w = y.d(new qs2() { // from class: androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf((PopupLayout.this.m() == null || PopupLayout.this.m43getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float g = bu1.g(8);
        this.x = g;
        this.y = new Rect();
        this.B = new Rect();
        setId(R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(kg6.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(fm1Var.f1(g));
        setOutlineProvider(new a());
        this.H = b0.e(ComposableSingletons$ExposedDropdownMenuPopup_androidKt.a.a(), null, 2, null);
    }

    private final gt2 getContent() {
        return (gt2) this.H.getValue();
    }

    private final WindowManager.LayoutParams l() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393216;
        layoutParams.flags = this.l ? 393216 & (-9) : 393216 | 8;
        layoutParams.softInputMode = 1;
        layoutParams.type = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        layoutParams.token = this.k.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.k.getContext().getResources().getString(ok6.default_popup_window_title));
        return layoutParams;
    }

    private final void q(LayoutDirection layoutDirection) {
        int i = b.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    private final void setContent(gt2 gt2Var) {
        this.H.setValue(gt2Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        Composer h = composer.h(-864350873);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(-864350873, i, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.android.kt:300)");
        }
        getContent().invoke(h, 0);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.internal.PopupLayout$Content$4
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
        this.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.m.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
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
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final hn3 m43getPopupContentSizebOM6tXw() {
        return (hn3) this.u.getValue();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.L;
    }

    public final bn3 m() {
        return (bn3) this.t.getValue();
    }

    public final void n(c cVar, gt2 gt2Var) {
        setParentCompositionContext(cVar);
        setContent(gt2Var);
        this.L = true;
    }

    public final void o(bn3 bn3Var) {
        this.t.setValue(bn3Var);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.k.getWindowVisibleDisplayFrame(this.B);
        if (zq3.c(this.B, this.y)) {
            return;
        }
        s();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            boolean z = motionEvent.getRawX() == 0.0f && motionEvent.getRawY() == 0.0f;
            if (m() == null || !z) {
                qs2 qs2Var = this.i;
                if (qs2Var != null) {
                    qs2Var.mo865invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        this.m.addView(this, this.n);
    }

    public final void r(qs2 qs2Var, String str, LayoutDirection layoutDirection) {
        this.i = qs2Var;
        this.j = str;
        q(layoutDirection);
    }

    public final void s() {
        hn3 m43getPopupContentSizebOM6tXw;
        bn3 m = m();
        if (m == null || (m43getPopupContentSizebOM6tXw = m43getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m43getPopupContentSizebOM6tXw.j();
        Rect rect = this.y;
        this.k.getWindowVisibleDisplayFrame(rect);
        long a2 = this.r.a(m, mt6.b(rect).f(), this.s, j);
        this.n.x = vm3.j(a2);
        this.n.y = vm3.k(a2);
        this.m.updateViewLayout(this, this.n);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.s = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m44setPopupContentSizefhxjrPA(hn3 hn3Var) {
        this.u.setValue(hn3Var);
    }

    public final void setPositionProvider(xz5 xz5Var) {
        this.r = xz5Var;
    }
}
