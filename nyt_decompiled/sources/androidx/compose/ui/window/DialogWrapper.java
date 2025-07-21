package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import defpackage.an6;
import defpackage.bu1;
import defpackage.ce5;
import defpackage.ci7;
import defpackage.ee5;
import defpackage.eq1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.ib9;
import defpackage.kg6;
import defpackage.kg9;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xq0;
import defpackage.zq3;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
final class DialogWrapper extends xq0 implements ib9 {
    private qs2 d;
    private eq1 e;
    private final View f;
    private final DialogLayout g;
    private final float h;
    private final int i;

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

    public DialogWrapper(qs2 qs2Var, eq1 eq1Var, View view, LayoutDirection layoutDirection, fm1 fm1Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || eq1Var.a()) ? an6.DialogWindowTheme : an6.FloatingDialogWindowTheme), 0, 2, null);
        this.d = qs2Var;
        this.e = eq1Var;
        this.f = view;
        float g = bu1.g(8);
        this.h = g;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.i = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        kg9.b(window, this.e.a());
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(kg6.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(fm1Var.f1(g));
        dialogLayout.setOutlineProvider(new a());
        this.g = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.b(dialogLayout, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(dialogLayout, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(dialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
        l(this.d, this.e, layoutDirection);
        ee5.b(getOnBackPressedDispatcher(), this, false, new ss2() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            public final void b(ce5 ce5Var) {
                if (DialogWrapper.this.e.b()) {
                    DialogWrapper.this.d.mo865invoke();
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((ce5) obj);
                return ww8.a;
            }
        }, 2, null);
    }

    private static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    private final void j(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout = this.g;
        int i = b.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout.setLayoutDirection(i2);
    }

    private final void k(SecureFlagPolicy secureFlagPolicy) {
        boolean a2 = ci7.a(secureFlagPolicy, AndroidPopup_androidKt.f(this.f));
        Window window = getWindow();
        zq3.e(window);
        window.setFlags(a2 ? 8192 : -8193, 8192);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }

    public final void h() {
        this.g.f();
    }

    public final void i(androidx.compose.runtime.c cVar, gt2 gt2Var) {
        this.g.m(cVar, gt2Var);
    }

    public final void l(qs2 qs2Var, eq1 eq1Var, LayoutDirection layoutDirection) {
        Window window;
        this.d = qs2Var;
        this.e = eq1Var;
        k(eq1Var.d());
        j(layoutDirection);
        if (eq1Var.e() && !this.g.l() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.g.n(eq1Var.e());
        if (Build.VERSION.SDK_INT < 31) {
            if (eq1Var.a()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.i);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.e.c()) {
            this.d.mo865invoke();
        }
        return onTouchEvent;
    }
}
