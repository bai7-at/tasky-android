package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.h0;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.bg6;
import defpackage.h3;
import defpackage.hk8;
import defpackage.k99;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.tf4;
import defpackage.xi6;
import defpackage.zd6;
import defpackage.ze4;

/* loaded from: classes3.dex */
class z extends LinearLayout {
    private final TextInputLayout a;
    private final TextView b;
    private CharSequence c;
    private final CheckableImageButton d;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private int g;
    private ImageView.ScaleType h;
    private View.OnLongClickListener i;
    private boolean j;

    z(TextInputLayout textInputLayout, h0 h0Var) {
        super(textInputLayout.getContext());
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(xi6.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.b = appCompatTextView;
        j(h0Var);
        i(h0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void C() {
        int i = (this.c == null || this.j) ? 8 : 0;
        setVisibility((this.d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.b.setVisibility(i);
        this.a.o0();
    }

    private void i(h0 h0Var) {
        this.b.setVisibility(8);
        this.b.setId(bg6.textinput_prefix_text);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        k99.n0(this.b, 1);
        o(h0Var.n(nn6.TextInputLayout_prefixTextAppearance, 0));
        if (h0Var.s(nn6.TextInputLayout_prefixTextColor)) {
            p(h0Var.c(nn6.TextInputLayout_prefixTextColor));
        }
        n(h0Var.p(nn6.TextInputLayout_prefixText));
    }

    private void j(h0 h0Var) {
        if (tf4.g(getContext())) {
            ze4.c((ViewGroup.MarginLayoutParams) this.d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (h0Var.s(nn6.TextInputLayout_startIconTint)) {
            this.e = tf4.b(getContext(), h0Var, nn6.TextInputLayout_startIconTint);
        }
        if (h0Var.s(nn6.TextInputLayout_startIconTintMode)) {
            this.f = pb9.k(h0Var.k(nn6.TextInputLayout_startIconTintMode, -1), null);
        }
        if (h0Var.s(nn6.TextInputLayout_startIconDrawable)) {
            s(h0Var.g(nn6.TextInputLayout_startIconDrawable));
            if (h0Var.s(nn6.TextInputLayout_startIconContentDescription)) {
                r(h0Var.p(nn6.TextInputLayout_startIconContentDescription));
            }
            q(h0Var.a(nn6.TextInputLayout_startIconCheckable, true));
        }
        t(h0Var.f(nn6.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(zd6.mtrl_min_touch_target_size)));
        if (h0Var.s(nn6.TextInputLayout_startIconScaleType)) {
            w(t.b(h0Var.k(nn6.TextInputLayout_startIconScaleType, -1)));
        }
    }

    void A(h3 h3Var) {
        if (this.b.getVisibility() != 0) {
            h3Var.N0(this.d);
        } else {
            h3Var.t0(this.b);
            h3Var.N0(this.b);
        }
    }

    void B() {
        EditText editText = this.a.d;
        if (editText == null) {
            return;
        }
        k99.B0(this.b, k() ? 0 : k99.C(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(zd6.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    CharSequence a() {
        return this.c;
    }

    ColorStateList b() {
        return this.b.getTextColors();
    }

    int c() {
        return k99.C(this) + k99.C(this.b) + (k() ? this.d.getMeasuredWidth() + ze4.a((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()) : 0);
    }

    TextView d() {
        return this.b;
    }

    CharSequence e() {
        return this.d.getContentDescription();
    }

    Drawable f() {
        return this.d.getDrawable();
    }

    int g() {
        return this.g;
    }

    ImageView.ScaleType h() {
        return this.h;
    }

    boolean k() {
        return this.d.getVisibility() == 0;
    }

    void l(boolean z) {
        this.j = z;
        C();
    }

    void m() {
        t.d(this.a, this.d, this.e);
    }

    void n(CharSequence charSequence) {
        this.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.b.setText(charSequence);
        C();
    }

    void o(int i) {
        hk8.m(this.b, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        B();
    }

    void p(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    void q(boolean z) {
        this.d.setCheckable(z);
    }

    void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    void s(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.a, this.d, this.e, this.f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    void t(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != this.g) {
            this.g = i;
            t.g(this.d, i);
        }
    }

    void u(View.OnClickListener onClickListener) {
        t.h(this.d, onClickListener, this.i);
    }

    void v(View.OnLongClickListener onLongClickListener) {
        this.i = onLongClickListener;
        t.i(this.d, onLongClickListener);
    }

    void w(ImageView.ScaleType scaleType) {
        this.h = scaleType;
        t.j(this.d, scaleType);
    }

    void x(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            t.a(this.a, this.d, colorStateList, this.f);
        }
    }

    void y(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            t.a(this.a, this.d, this.e, mode);
        }
    }

    void z(boolean z) {
        if (k() != z) {
            this.d.setVisibility(z ? 0 : 8);
            B();
            C();
        }
    }
}
