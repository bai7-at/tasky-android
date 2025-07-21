package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import defpackage.a3;
import defpackage.h3;
import defpackage.hf6;
import defpackage.hi;
import defpackage.hw4;
import defpackage.k99;
import defpackage.lc6;
import defpackage.vj6;

/* loaded from: classes3.dex */
class p extends s {
    private static final boolean s = true;
    private final int e;
    private final int f;
    private final TimeInterpolator g;
    private AutoCompleteTextView h;
    private final View.OnClickListener i;
    private final View.OnFocusChangeListener j;
    private final a3.a k;
    private boolean l;
    private boolean m;
    private boolean n;
    private long o;
    private AccessibilityManager p;
    private ValueAnimator q;
    private ValueAnimator r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.J(view);
            }
        };
        this.j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                p.this.K(view, z);
            }
        };
        this.k = new a3.a() { // from class: com.google.android.material.textfield.n
            @Override // a3.a
            public final void onTouchExplorationStateChanged(boolean z) {
                p.this.L(z);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = hw4.f(rVar.getContext(), lc6.motionDurationShort3, 67);
        this.e = hw4.f(rVar.getContext(), lc6.motionDurationShort3, 50);
        this.g = hw4.g(rVar.getContext(), lc6.motionEasingLinearInterpolator, hi.a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.g);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.this.I(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void F() {
        this.r = E(this.f, 0.0f, 1.0f);
        ValueAnimator E = E(this.e, 1.0f, 0.0f);
        this.q = E;
        E.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.h.isPopupShowing();
        O(isPopupShowing);
        this.m = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z) {
        this.l = z;
        r();
        if (z) {
            return;
        }
        O(false);
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        k99.v0(this.d, z ? 2 : 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    private void P() {
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean M;
                M = p.this.M(view, motionEvent);
                return M;
            }
        });
        if (s) {
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.this.N();
                }
            });
        }
        this.h.setThreshold(0);
    }

    private void Q() {
        if (this.h == null) {
            return;
        }
        if (G()) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        if (s) {
            O(!this.n);
        } else {
            this.n = !this.n;
            r();
        }
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }

    private void R() {
        this.m = true;
        this.o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.p.isTouchExplorationEnabled() && q.a(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.this.H();
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return vj6.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return s ? hf6.mtrl_dropdown_arrow : hf6.mtrl_ic_arrow_drop_down;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.i;
    }

    @Override // com.google.android.material.textfield.s
    public a3.a h() {
        return this.k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.h = D(editText);
        P();
        this.a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.p.isTouchExplorationEnabled()) {
            k99.v0(this.d, 2);
        }
        this.a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, h3 h3Var) {
        if (!q.a(this.h)) {
            h3Var.e0(Spinner.class.getName());
        }
        if (h3Var.R()) {
            h3Var.r0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || q.a(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            Q();
            R();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (s) {
                this.h.setOnDismissListener(null);
            }
        }
    }
}
