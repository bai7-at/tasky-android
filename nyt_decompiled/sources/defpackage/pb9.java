package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import defpackage.ch9;

/* loaded from: classes3.dex */
public abstract class pb9 {

    class a implements d {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ boolean c;
        final /* synthetic */ d d;

        a(boolean z, boolean z2, boolean z3, d dVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = dVar;
        }

        @Override // pb9.d
        public ch9 a(View view, ch9 ch9Var, e eVar) {
            if (this.a) {
                eVar.d += ch9Var.i();
            }
            boolean i = pb9.i(view);
            if (this.b) {
                if (i) {
                    eVar.c += ch9Var.j();
                } else {
                    eVar.a += ch9Var.j();
                }
            }
            if (this.c) {
                if (i) {
                    eVar.a += ch9Var.k();
                } else {
                    eVar.c += ch9Var.k();
                }
            }
            eVar.a(view);
            d dVar = this.d;
            return dVar != null ? dVar.a(view, ch9Var, eVar) : ch9Var;
        }
    }

    class b implements be5 {
        final /* synthetic */ d a;
        final /* synthetic */ e b;

        b(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            return this.a.a(view, ch9Var, new e(this.b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            k99.i0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        ch9 a(View view, ch9 ch9Var, e eVar);
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view, d dVar) {
        k99.A0(view, new b(dVar, new e(k99.C(view), view.getPaddingTop(), k99.B(view), view.getPaddingBottom())));
        n(view);
    }

    public static void d(View view, AttributeSet attributeSet, int i, int i2, d dVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, nn6.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(nn6.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(nn6.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(nn6.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        c(view, new a(z, z2, z3, dVar));
    }

    public static float e(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static Integer f(View view) {
        ColorStateList f = tv1.f(view.getBackground());
        if (f != null) {
            return Integer.valueOf(f.getDefaultColor());
        }
        return null;
    }

    private static InputMethodManager g(View view) {
        return (InputMethodManager) mx0.j(view.getContext(), InputMethodManager.class);
    }

    public static float h(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += k99.s((View) parent);
        }
        return f;
    }

    public static boolean i(View view) {
        return k99.x(view) == 1;
    }

    public static PorterDuff.Mode k(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(View view) {
        if (k99.O(view)) {
            k99.i0(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void o(final View view, final boolean z) {
        view.requestFocus();
        view.post(new Runnable() { // from class: ob9
            @Override // java.lang.Runnable
            public final void run() {
                pb9.p(view, z);
            }
        });
    }

    public static void p(View view, boolean z) {
        ph9 H;
        if (!z || (H = k99.H(view)) == null) {
            g(view).showSoftInput(view, 1);
        } else {
            H.g(ch9.l.c());
        }
    }

    public static class e {
        public int a;
        public int b;
        public int c;
        public int d;

        public e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public void a(View view) {
            k99.B0(view, this.a, this.b, this.c, this.d);
        }

        public e(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
        }
    }
}
