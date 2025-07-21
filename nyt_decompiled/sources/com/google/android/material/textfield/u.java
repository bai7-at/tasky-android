package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bg6;
import defpackage.hi;
import defpackage.hk8;
import defpackage.hw4;
import defpackage.k99;
import defpackage.lc6;
import defpackage.qi;
import defpackage.tf4;
import defpackage.zd6;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class u {
    private ColorStateList A;
    private Typeface B;
    private final int a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator e;
    private final TimeInterpolator f;
    private final Context g;
    private final TextInputLayout h;
    private LinearLayout i;
    private int j;
    private FrameLayout k;
    private Animator l;
    private final float m;
    private int n;
    private int o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private CharSequence s;
    private int t;
    private int u;
    private ColorStateList v;
    private CharSequence w;
    private boolean x;
    private TextView y;
    private int z;

    class a extends AnimatorListenerAdapter {
        final /* synthetic */ int a;
        final /* synthetic */ TextView b;
        final /* synthetic */ int c;
        final /* synthetic */ TextView d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.a = i;
            this.b = textView;
            this.c = i2;
            this.d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.n = this.a;
            u.this.l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.c == 1 && u.this.r != null) {
                    u.this.r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
                this.d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(zd6.design_textinput_caption_translate_y);
        this.a = hw4.f(context, lc6.motionDurationShort4, 217);
        this.b = hw4.f(context, lc6.motionDurationMedium4, 167);
        this.c = hw4.f(context, lc6.motionDurationShort4, 167);
        this.d = hw4.g(context, lc6.motionEasingEmphasizedDecelerateInterpolator, hi.d);
        int i = lc6.motionEasingEmphasizedDecelerateInterpolator;
        TimeInterpolator timeInterpolator = hi.a;
        this.e = hw4.g(context, i, timeInterpolator);
        this.f = hw4.g(context, lc6.motionEasingLinearInterpolator, timeInterpolator);
    }

    private void D(int i, int i2) {
        TextView m;
        TextView m2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (m2 = m(i2)) != null) {
            m2.setVisibility(0);
            m2.setAlpha(1.0f);
        }
        if (i != 0 && (m = m(i)) != null) {
            m.setVisibility(4);
            if (i == 1) {
                m.setText((CharSequence) null);
            }
        }
        this.n = i2;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        return k99.P(this.h) && this.h.isEnabled() && !(this.o == this.n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void S(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.x, this.y, 2, i, i2);
            i(arrayList, this.q, this.r, 1, i, i2);
            qi.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, m(i), i, m(i2)));
            animatorSet.start();
        } else {
            D(i, i2);
        }
        this.h.p0();
        this.h.u0(z);
        this.h.A0();
    }

    private boolean g() {
        return (this.i == null || this.h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator j = j(textView, i3 == i);
            if (i == i3 && i2 != 0) {
                j.setStartDelay(this.c);
            }
            list.add(j);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator k = k(textView);
            k.setStartDelay(this.c);
            list.add(k);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(z ? this.b : this.c);
        ofFloat.setInterpolator(z ? this.e : this.f);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
        ofFloat.setDuration(this.a);
        ofFloat.setInterpolator(this.d);
        return ofFloat;
    }

    private TextView m(int i) {
        if (i == 1) {
            return this.r;
        }
        if (i != 2) {
            return null;
        }
        return this.y;
    }

    private int v(boolean z, int i, int i2) {
        return z ? this.g.getResources().getDimensionPixelSize(i) : i2;
    }

    private boolean y(int i) {
        return (i != 1 || this.r == null || TextUtils.isEmpty(this.p)) ? false : true;
    }

    boolean A() {
        return this.q;
    }

    boolean B() {
        return this.x;
    }

    void C(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.i == null) {
            return;
        }
        if (!z(i) || (frameLayout = this.k) == null) {
            this.i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        O(this.i, i2);
    }

    void E(int i) {
        this.t = i;
        TextView textView = this.r;
        if (textView != null) {
            k99.n0(textView, i);
        }
    }

    void F(CharSequence charSequence) {
        this.s = charSequence;
        TextView textView = this.r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z) {
        if (this.q == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.g);
            this.r = appCompatTextView;
            appCompatTextView.setId(bg6.textinput_error);
            this.r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            H(this.u);
            I(this.v);
            F(this.s);
            E(this.t);
            this.r.setVisibility(4);
            e(this.r, 0);
        } else {
            w();
            C(this.r, 0);
            this.r = null;
            this.h.p0();
            this.h.A0();
        }
        this.q = z;
    }

    void H(int i) {
        this.u = i;
        TextView textView = this.r;
        if (textView != null) {
            this.h.c0(textView, i);
        }
    }

    void I(ColorStateList colorStateList) {
        this.v = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i) {
        this.z = i;
        TextView textView = this.y;
        if (textView != null) {
            hk8.m(textView, i);
        }
    }

    void K(boolean z) {
        if (this.x == z) {
            return;
        }
        h();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.g);
            this.y = appCompatTextView;
            appCompatTextView.setId(bg6.textinput_helper_text);
            this.y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.y.setTypeface(typeface);
            }
            this.y.setVisibility(4);
            k99.n0(this.y, 1);
            J(this.z);
            L(this.A);
            e(this.y, 1);
            this.y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.y, 1);
            this.y = null;
            this.h.p0();
            this.h.A0();
        }
        this.x = z;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.r, typeface);
            M(this.y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.n;
        if (i != 1) {
            this.o = 1;
        }
        S(i, this.o, P(this.r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.w = charSequence;
        this.y.setText(charSequence);
        int i = this.n;
        if (i != 2) {
            this.o = 2;
        }
        S(i, this.o, P(this.y, charSequence));
    }

    void e(TextView textView, int i) {
        if (this.i == null && this.k == null) {
            LinearLayout linearLayout = new LinearLayout(this.g);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            this.h.addView(this.i, -1, -2);
            this.k = new FrameLayout(this.g);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.h.getEditText() != null) {
                f();
            }
        }
        if (z(i)) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.h.getEditText();
            boolean g = tf4.g(this.g);
            k99.B0(this.i, v(g, zd6.material_helper_text_font_1_3_padding_horizontal, k99.C(editText)), v(g, zd6.material_helper_text_font_1_3_padding_top, this.g.getResources().getDimensionPixelSize(zd6.material_helper_text_default_padding_top)), v(g, zd6.material_helper_text_font_1_3_padding_horizontal, k99.B(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.o);
    }

    int n() {
        return this.t;
    }

    CharSequence o() {
        return this.s;
    }

    CharSequence p() {
        return this.p;
    }

    int q() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.w;
    }

    View t() {
        return this.y;
    }

    int u() {
        TextView textView = this.y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.p = null;
        h();
        if (this.n == 1) {
            if (!this.x || TextUtils.isEmpty(this.w)) {
                this.o = 0;
            } else {
                this.o = 2;
            }
        }
        S(this.n, this.o, P(this.r, ""));
    }

    void x() {
        h();
        int i = this.n;
        if (i == 2) {
            this.o = 0;
        }
        S(i, this.o, P(this.y, ""));
    }

    boolean z(int i) {
        return i == 0 || i == 1;
    }
}
