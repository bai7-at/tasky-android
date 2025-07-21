package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.be5;
import defpackage.bg6;
import defpackage.ch9;
import defpackage.cy1;
import defpackage.fn6;
import defpackage.h3;
import defpackage.k99;
import defpackage.kg9;
import defpackage.lc6;
import defpackage.lf4;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.uf4;
import defpackage.vk;
import defpackage.w2;
import defpackage.xi6;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes3.dex */
public class a extends vk {
    private BottomSheetBehavior f;
    private FrameLayout g;
    private CoordinatorLayout h;
    private FrameLayout i;
    boolean j;
    boolean k;
    private boolean l;
    private boolean m;
    private f n;
    private boolean r;
    private lf4 s;
    private BottomSheetBehavior.g t;

    /* renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    class C0202a implements be5 {
        C0202a() {
        }

        @Override // defpackage.be5
        public ch9 a(View view, ch9 ch9Var) {
            if (a.this.n != null) {
                a.this.f.a0(a.this.n);
            }
            if (ch9Var != null) {
                a aVar = a.this;
                aVar.n = new f(aVar.i, ch9Var, null);
                a.this.n.e(a.this.getWindow());
                a.this.f.y(a.this.n);
            }
            return ch9Var;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            a aVar = a.this;
            if (aVar.k && aVar.isShowing() && a.this.q()) {
                a.this.cancel();
            }
        }
    }

    class c extends w2 {
        c() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            if (!a.this.k) {
                h3Var.k0(false);
            } else {
                h3Var.a(Constants.MB);
                h3Var.k0(true);
            }
        }

        @Override // defpackage.w2
        public boolean k(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                a aVar = a.this;
                if (aVar.k) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.k(view, i, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    class e extends BottomSheetBehavior.g {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            if (i == 5) {
                a.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {
        private final Boolean a;
        private final ch9 b;
        private Window c;
        private boolean d;

        /* synthetic */ f(View view, ch9 ch9Var, C0202a c0202a) {
            this(view, ch9Var);
        }

        private void d(View view) {
            if (view.getTop() < this.b.l()) {
                Window window = this.c;
                if (window != null) {
                    Boolean bool = this.a;
                    cy1.f(window, bool == null ? this.d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.b.l() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.c;
                if (window2 != null) {
                    cy1.f(window2, this.d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void a(View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            d(view);
        }

        void e(Window window) {
            if (this.c == window) {
                return;
            }
            this.c = window;
            if (window != null) {
                this.d = kg9.a(window, window.getDecorView()).c();
            }
        }

        private f(View view, ch9 ch9Var) {
            this.b = ch9Var;
            uf4 P = BottomSheetBehavior.M(view).P();
            ColorStateList v = P != null ? P.v() : k99.p(view);
            if (v != null) {
                this.a = Boolean.valueOf(qf4.h(v.getDefaultColor()));
                return;
            }
            Integer f = pb9.f(view);
            if (f != null) {
                this.a = Boolean.valueOf(qf4.h(f.intValue()));
            } else {
                this.a = null;
            }
        }
    }

    public a(Context context) {
        this(context, 0);
        this.r = getContext().getTheme().obtainStyledAttributes(new int[]{lc6.enableEdgeToEdge}).getBoolean(0, false);
    }

    private static int f(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(lc6.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : fn6.Theme_Design_Light_BottomSheetDialog;
    }

    private FrameLayout m() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), xi6.design_bottom_sheet_dialog, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(bg6.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(bg6.design_bottom_sheet);
            this.i = frameLayout2;
            BottomSheetBehavior M = BottomSheetBehavior.M(frameLayout2);
            this.f = M;
            M.y(this.t);
            this.f.l0(this.k);
            this.s = new lf4(this.f, this.i);
        }
        return this.g;
    }

    private void r() {
        lf4 lf4Var = this.s;
        if (lf4Var == null) {
            return;
        }
        if (this.k) {
            lf4Var.b();
        } else {
            lf4Var.d();
        }
    }

    private View s(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(bg6.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.r) {
            k99.A0(this.i, new C0202a());
        }
        this.i.removeAllViews();
        if (layoutParams == null) {
            this.i.addView(view);
        } else {
            this.i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(bg6.touch_outside).setOnClickListener(new b());
        k99.l0(this.i, new c());
        this.i.setOnTouchListener(new d());
        return this.g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior n = n();
        if (!this.j || n.Q() == 5) {
            super.cancel();
        } else {
            n.t0(5);
        }
    }

    public BottomSheetBehavior n() {
        if (this.f == null) {
            m();
        }
        return this.f;
    }

    public boolean o() {
        return this.j;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.r && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            kg9.b(window, !z);
            f fVar = this.n;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        r();
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.n;
        if (fVar != null) {
            fVar.e(null);
        }
        lf4 lf4Var = this.s;
        if (lf4Var != null) {
            lf4Var.d();
        }
    }

    @Override // defpackage.xq0, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.Q() != 5) {
            return;
        }
        this.f.t0(4);
    }

    void p() {
        this.f.a0(this.t);
    }

    boolean q() {
        if (!this.m) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.l = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.m = true;
        }
        return this.l;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.k != z) {
            this.k = z;
            BottomSheetBehavior bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.l0(z);
            }
            if (getWindow() != null) {
                r();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.k) {
            this.k = true;
        }
        this.l = z;
        this.m = true;
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(s(i, null, null));
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(s(0, view, null));
    }

    @Override // defpackage.vk, defpackage.xq0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(s(0, view, layoutParams));
    }

    public a(Context context, int i) {
        super(context, f(context, i));
        this.k = true;
        this.l = true;
        this.t = new e();
        h(1);
        this.r = getContext().getTheme().obtainStyledAttributes(new int[]{lc6.enableEdgeToEdge}).getBoolean(0, false);
    }
}
