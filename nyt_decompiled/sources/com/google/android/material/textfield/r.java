package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.a3;
import defpackage.al;
import defpackage.bg6;
import defpackage.hk8;
import defpackage.k99;
import defpackage.kk8;
import defpackage.kv1;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.tf4;
import defpackage.vj6;
import defpackage.xi6;
import defpackage.zd6;
import defpackage.ze4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
class r extends LinearLayout {
    private final TextWatcher B;
    private final TextInputLayout.f H;
    final TextInputLayout a;
    private final FrameLayout b;
    private final CheckableImageButton c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private View.OnLongClickListener f;
    private final CheckableImageButton g;
    private final d h;
    private int i;
    private final LinkedHashSet j;
    private ColorStateList k;
    private PorterDuff.Mode l;
    private int m;
    private ImageView.ScaleType n;
    private View.OnLongClickListener r;
    private CharSequence s;
    private final TextView t;
    private boolean u;
    private EditText w;
    private final AccessibilityManager x;
    private a3.a y;

    class a extends kk8 {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // defpackage.kk8, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            r.this.m().b(charSequence, i, i2, i3);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (r.this.w == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.w != null) {
                r.this.w.removeTextChangedListener(r.this.B);
                if (r.this.w.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.w.setOnFocusChangeListener(null);
                }
            }
            r.this.w = textInputLayout.getEditText();
            if (r.this.w != null) {
                r.this.w.addTextChangedListener(r.this.B);
            }
            r.this.m().n(r.this.w);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {
        private final SparseArray a = new SparseArray();
        private final r b;
        private final int c;
        private final int d;

        d(r rVar, h0 h0Var) {
            this.b = rVar;
            this.c = h0Var.n(nn6.TextInputLayout_endIconDrawable, 0);
            this.d = h0Var.n(nn6.TextInputLayout_passwordToggleDrawable, 0);
        }

        private s b(int i) {
            if (i == -1) {
                return new g(this.b);
            }
            if (i == 0) {
                return new w(this.b);
            }
            if (i == 1) {
                return new y(this.b, this.d);
            }
            if (i == 2) {
                return new f(this.b);
            }
            if (i == 3) {
                return new p(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i);
        }

        s c(int i) {
            s sVar = (s) this.a.get(i);
            if (sVar != null) {
                return sVar;
            }
            s b = b(i);
            this.a.append(i, b);
            return b;
        }
    }

    r(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.i = 0;
        this.j = new LinkedHashSet();
        this.B = new a();
        b bVar = new b();
        this.H = bVar;
        this.x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i = i(this, from, bg6.text_input_error_icon);
        this.c = i;
        CheckableImageButton i2 = i(frameLayout, from, bg6.text_input_end_icon);
        this.g = i2;
        this.h = new d(this, h0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.t = appCompatTextView;
        C(h0Var);
        B(h0Var);
        D(h0Var);
        frameLayout.addView(i2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(i);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(h0 h0Var) {
        if (!h0Var.s(nn6.TextInputLayout_passwordToggleEnabled)) {
            if (h0Var.s(nn6.TextInputLayout_endIconTint)) {
                this.k = tf4.b(getContext(), h0Var, nn6.TextInputLayout_endIconTint);
            }
            if (h0Var.s(nn6.TextInputLayout_endIconTintMode)) {
                this.l = pb9.k(h0Var.k(nn6.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (h0Var.s(nn6.TextInputLayout_endIconMode)) {
            U(h0Var.k(nn6.TextInputLayout_endIconMode, 0));
            if (h0Var.s(nn6.TextInputLayout_endIconContentDescription)) {
                Q(h0Var.p(nn6.TextInputLayout_endIconContentDescription));
            }
            O(h0Var.a(nn6.TextInputLayout_endIconCheckable, true));
        } else if (h0Var.s(nn6.TextInputLayout_passwordToggleEnabled)) {
            if (h0Var.s(nn6.TextInputLayout_passwordToggleTint)) {
                this.k = tf4.b(getContext(), h0Var, nn6.TextInputLayout_passwordToggleTint);
            }
            if (h0Var.s(nn6.TextInputLayout_passwordToggleTintMode)) {
                this.l = pb9.k(h0Var.k(nn6.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            U(h0Var.a(nn6.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            Q(h0Var.p(nn6.TextInputLayout_passwordToggleContentDescription));
        }
        T(h0Var.f(nn6.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(zd6.mtrl_min_touch_target_size)));
        if (h0Var.s(nn6.TextInputLayout_endIconScaleType)) {
            X(t.b(h0Var.k(nn6.TextInputLayout_endIconScaleType, -1)));
        }
    }

    private void C(h0 h0Var) {
        if (h0Var.s(nn6.TextInputLayout_errorIconTint)) {
            this.d = tf4.b(getContext(), h0Var, nn6.TextInputLayout_errorIconTint);
        }
        if (h0Var.s(nn6.TextInputLayout_errorIconTintMode)) {
            this.e = pb9.k(h0Var.k(nn6.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (h0Var.s(nn6.TextInputLayout_errorIconDrawable)) {
            c0(h0Var.g(nn6.TextInputLayout_errorIconDrawable));
        }
        this.c.setContentDescription(getResources().getText(vj6.error_icon_content_description));
        k99.v0(this.c, 2);
        this.c.setClickable(false);
        this.c.setPressable(false);
        this.c.setFocusable(false);
    }

    private void D(h0 h0Var) {
        this.t.setVisibility(8);
        this.t.setId(bg6.textinput_suffix_text);
        this.t.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        k99.n0(this.t, 1);
        q0(h0Var.n(nn6.TextInputLayout_suffixTextAppearance, 0));
        if (h0Var.s(nn6.TextInputLayout_suffixTextColor)) {
            r0(h0Var.c(nn6.TextInputLayout_suffixTextColor));
        }
        p0(h0Var.p(nn6.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        a3.a aVar = this.y;
        if (aVar == null || (accessibilityManager = this.x) == null) {
            return;
        }
        a3.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.y == null || this.x == null || !k99.O(this)) {
            return;
        }
        a3.a(this.x, this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.w == null) {
            return;
        }
        if (sVar.e() != null) {
            this.w.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.g.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(xi6.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        t.e(checkableImageButton);
        if (tf4.g(getContext())) {
            ze4.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i) {
        Iterator it2 = this.j.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.y = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i = this.h.c;
        return i == 0 ? sVar.d() : i;
    }

    private void t0(s sVar) {
        M();
        this.y = null;
        sVar.u();
    }

    private void u0(boolean z) {
        if (!z || n() == null) {
            t.a(this.a, this.g, this.k, this.l);
            return;
        }
        Drawable mutate = kv1.r(n()).mutate();
        kv1.n(mutate, this.a.getErrorCurrentTextColors());
        this.g.setImageDrawable(mutate);
    }

    private void v0() {
        this.b.setVisibility((this.g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.s == null || this.u) ? 8 : false)) ? 0 : 8);
    }

    private void w0() {
        this.c.setVisibility(s() != null && this.a.N() && this.a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.a.o0();
    }

    private void y0() {
        int visibility = this.t.getVisibility();
        int i = (this.s == null || this.u) ? 8 : 0;
        if (visibility != i) {
            m().q(i == 0);
        }
        v0();
        this.t.setVisibility(i);
        this.a.o0();
    }

    boolean A() {
        return this.i != 0;
    }

    boolean E() {
        return A() && this.g.isChecked();
    }

    boolean F() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    boolean G() {
        return this.c.getVisibility() == 0;
    }

    void H(boolean z) {
        this.u = z;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.a.d0());
        }
    }

    void J() {
        t.d(this.a, this.g, this.k);
    }

    void K() {
        t.d(this.a, this.c, this.d);
    }

    void L(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        s m = m();
        boolean z3 = true;
        if (!m.l() || (isChecked = this.g.isChecked()) == m.m()) {
            z2 = false;
        } else {
            this.g.setChecked(!isChecked);
            z2 = true;
        }
        if (!m.j() || (isActivated = this.g.isActivated()) == m.k()) {
            z3 = z2;
        } else {
            N(!isActivated);
        }
        if (z || z3) {
            J();
        }
    }

    void N(boolean z) {
        this.g.setActivated(z);
    }

    void O(boolean z) {
        this.g.setCheckable(z);
    }

    void P(int i) {
        Q(i != 0 ? getResources().getText(i) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.g.setContentDescription(charSequence);
        }
    }

    void R(int i) {
        S(i != 0 ? al.b(getContext(), i) : null);
    }

    void S(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.a, this.g, this.k, this.l);
            J();
        }
    }

    void T(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != this.m) {
            this.m = i;
            t.g(this.g, i);
            t.g(this.c, i);
        }
    }

    void U(int i) {
        if (this.i == i) {
            return;
        }
        t0(m());
        int i2 = this.i;
        this.i = i;
        j(i2);
        a0(i != 0);
        s m = m();
        R(t(m));
        P(m.c());
        O(m.l());
        if (!m.i(this.a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        s0(m);
        V(m.f());
        EditText editText = this.w;
        if (editText != null) {
            m.n(editText);
            h0(m);
        }
        t.a(this.a, this.g, this.k, this.l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.g, onClickListener, this.r);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.r = onLongClickListener;
        t.i(this.g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.n = scaleType;
        t.j(this.g, scaleType);
        t.j(this.c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            t.a(this.a, this.g, colorStateList, this.l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            t.a(this.a, this.g, this.k, mode);
        }
    }

    void a0(boolean z) {
        if (F() != z) {
            this.g.setVisibility(z ? 0 : 8);
            v0();
            x0();
            this.a.o0();
        }
    }

    void b0(int i) {
        c0(i != 0 ? al.b(getContext(), i) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.c.setImageDrawable(drawable);
        w0();
        t.a(this.a, this.c, this.d, this.e);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.c, onClickListener, this.f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f = onLongClickListener;
        t.i(this.c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.d != colorStateList) {
            this.d = colorStateList;
            t.a(this.a, this.c, colorStateList, this.e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            t.a(this.a, this.c, this.d, mode);
        }
    }

    void h() {
        this.g.performClick();
        this.g.jumpDrawablesToCurrentState();
    }

    void i0(int i) {
        j0(i != 0 ? getResources().getText(i) : null);
    }

    void j0(CharSequence charSequence) {
        this.g.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.c;
        }
        if (A() && F()) {
            return this.g;
        }
        return null;
    }

    void k0(int i) {
        l0(i != 0 ? al.b(getContext(), i) : null);
    }

    CharSequence l() {
        return this.g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    s m() {
        return this.h.c(this.i);
    }

    void m0(boolean z) {
        if (z && this.i != 1) {
            U(1);
        } else {
            if (z) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.k = colorStateList;
        t.a(this.a, this.g, colorStateList, this.l);
    }

    int o() {
        return this.m;
    }

    void o0(PorterDuff.Mode mode) {
        this.l = mode;
        t.a(this.a, this.g, this.k, mode);
    }

    int p() {
        return this.i;
    }

    void p0(CharSequence charSequence) {
        this.s = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.t.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.n;
    }

    void q0(int i) {
        hk8.m(this.t, i);
    }

    CheckableImageButton r() {
        return this.g;
    }

    void r0(ColorStateList colorStateList) {
        this.t.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.c.getDrawable();
    }

    CharSequence u() {
        return this.g.getContentDescription();
    }

    Drawable v() {
        return this.g.getDrawable();
    }

    CharSequence w() {
        return this.s;
    }

    ColorStateList x() {
        return this.t.getTextColors();
    }

    void x0() {
        if (this.a.d == null) {
            return;
        }
        k99.B0(this.t, getContext().getResources().getDimensionPixelSize(zd6.material_input_text_to_prefix_suffix_padding), this.a.d.getPaddingTop(), (F() || G()) ? 0 : k99.B(this.a.d), this.a.d.getPaddingBottom());
    }

    int y() {
        return k99.B(this) + k99.B(this.t) + ((F() || G()) ? this.g.getMeasuredWidth() + ze4.b((ViewGroup.MarginLayoutParams) this.g.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.t;
    }
}
