package androidx.compose.material3;

import android.R;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.material3.ModalBottomSheetWindow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.ib9;
import defpackage.kg6;
import defpackage.ok6;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.vu4;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
final class ModalBottomSheetWindow extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener, ib9 {
    private final vu4 i;
    private qs2 j;
    private final View k;
    private Object l;
    private final WindowManager m;
    private final WindowManager.LayoutParams n;
    private final sy4 r;
    private boolean s;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final OnBackInvokedCallback b(final qs2 qs2Var) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.f
                public final void onBackInvoked() {
                    ModalBottomSheetWindow.a.c(qs2.this);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(qs2 qs2Var) {
            qs2Var.mo865invoke();
        }

        public static final void d(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }

        public static final void e(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
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

    public ModalBottomSheetWindow(vu4 vu4Var, qs2 qs2Var, View view, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        boolean o;
        this.i = vu4Var;
        this.j = qs2Var;
        this.k = view;
        setId(R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        setTag(kg6.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.m = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
        layoutParams.width = getDisplayWidth();
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(ok6.default_popup_window_title));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        o = ModalBottomSheet_androidKt.o(vu4Var.a(), ModalBottomSheet_androidKt.i(view));
        if (o) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        if (vu4Var.c()) {
            layoutParams.flags &= -9;
        } else {
            layoutParams.flags |= 8;
        }
        this.n = layoutParams;
        this.r = b0.e(ComposableSingletons$ModalBottomSheet_androidKt.a.b(), null, 2, null);
    }

    private final gt2 getContent() {
        return (gt2) this.r.getValue();
    }

    private final int getDisplayWidth() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private final void l() {
        if (!this.i.b() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.l == null) {
            this.l = a.b(this.j);
        }
        a.d(this, this.l);
    }

    private final void m() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.l);
        }
        this.l = null;
    }

    private final void setContent(gt2 gt2Var) {
        this.r.setValue(gt2Var);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-463309699);
        if ((i & 6) == 0) {
            i2 = (h.C(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-463309699, i2, -1, "androidx.compose.material3.ModalBottomSheetWindow.Content (ModalBottomSheet.android.kt:562)");
            }
            getContent().invoke(h, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.ModalBottomSheetWindow$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ModalBottomSheetWindow.this.b(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.b(this, null);
        ViewTreeSavedStateRegistryOwner.b(this, null);
        this.k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.m.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.i.b()) {
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
                this.j.mo865invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.s;
    }

    public final void n(androidx.compose.runtime.c cVar, gt2 gt2Var) {
        if (cVar != null) {
            setParentCompositionContext(cVar);
        }
        setContent(gt2Var);
        this.s = true;
    }

    public final void o() {
        this.m.addView(this, this.n);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public final void p(LayoutDirection layoutDirection) {
        int i = b.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
