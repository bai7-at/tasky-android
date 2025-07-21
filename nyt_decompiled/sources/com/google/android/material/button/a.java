package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import defpackage.h27;
import defpackage.ip7;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.m27;
import defpackage.nn6;
import defpackage.oo7;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.tf4;
import defpackage.uf4;

/* loaded from: classes3.dex */
class a {
    private static final boolean u = true;
    private static final boolean v = false;
    private final MaterialButton a;
    private oo7 b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean q;
    private LayerDrawable s;
    private int t;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean r = true;

    a(MaterialButton materialButton, oo7 oo7Var) {
        this.a = materialButton;
        this.b = oo7Var;
    }

    private void G(int i, int i2) {
        int C = k99.C(this.a);
        int paddingTop = this.a.getPaddingTop();
        int B = k99.B(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            H();
        }
        k99.B0(this.a, C, (paddingTop + i) - i3, B, (paddingBottom + i2) - i4);
    }

    private void H() {
        this.a.setInternalBackground(a());
        uf4 f = f();
        if (f != null) {
            f.V(this.t);
            f.setState(this.a.getDrawableState());
        }
    }

    private void I(oo7 oo7Var) {
        if (v && !this.o) {
            int C = k99.C(this.a);
            int paddingTop = this.a.getPaddingTop();
            int B = k99.B(this.a);
            int paddingBottom = this.a.getPaddingBottom();
            H();
            k99.B0(this.a, C, paddingTop, B, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(oo7Var);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(oo7Var);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(oo7Var);
        }
    }

    private void J() {
        uf4 f = f();
        uf4 n = n();
        if (f != null) {
            f.d0(this.h, this.k);
            if (n != null) {
                n.c0(this.h, this.n ? qf4.d(this.a, lc6.colorSurface) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.c, this.e, this.d, this.f);
    }

    private Drawable a() {
        uf4 uf4Var = new uf4(this.b);
        uf4Var.M(this.a.getContext());
        kv1.o(uf4Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            kv1.p(uf4Var, mode);
        }
        uf4Var.d0(this.h, this.k);
        uf4 uf4Var2 = new uf4(this.b);
        uf4Var2.setTint(0);
        uf4Var2.c0(this.h, this.n ? qf4.d(this.a, lc6.colorSurface) : 0);
        if (u) {
            uf4 uf4Var3 = new uf4(this.b);
            this.m = uf4Var3;
            kv1.n(uf4Var3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(m27.a(this.l), K(new LayerDrawable(new Drawable[]{uf4Var2, uf4Var})), this.m);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        h27 h27Var = new h27(this.b);
        this.m = h27Var;
        kv1.o(h27Var, m27.a(this.l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{uf4Var2, uf4Var, this.m});
        this.s = layerDrawable;
        return K(layerDrawable);
    }

    private uf4 g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return u ? (uf4) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0) : (uf4) this.s.getDrawable(!z ? 1 : 0);
    }

    private uf4 n() {
        return g(true);
    }

    void A(boolean z) {
        this.n = z;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            J();
        }
    }

    void C(int i) {
        if (this.h != i) {
            this.h = i;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (f() != null) {
                kv1.o(f(), this.j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (f() == null || this.i == null) {
                return;
            }
            kv1.p(f(), this.i);
        }
    }

    void F(boolean z) {
        this.r = z;
    }

    int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.e;
    }

    public ip7 e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.s.getNumberOfLayers() > 2 ? (ip7) this.s.getDrawable(2) : (ip7) this.s.getDrawable(1);
    }

    uf4 f() {
        return g(false);
    }

    ColorStateList h() {
        return this.l;
    }

    oo7 i() {
        return this.b;
    }

    ColorStateList j() {
        return this.k;
    }

    int k() {
        return this.h;
    }

    ColorStateList l() {
        return this.j;
    }

    PorterDuff.Mode m() {
        return this.i;
    }

    boolean o() {
        return this.o;
    }

    boolean p() {
        return this.q;
    }

    boolean q() {
        return this.r;
    }

    void r(TypedArray typedArray) {
        this.c = typedArray.getDimensionPixelOffset(nn6.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(nn6.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(nn6.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(nn6.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(nn6.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(nn6.MaterialButton_cornerRadius, -1);
            this.g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(nn6.MaterialButton_strokeWidth, 0);
        this.i = pb9.k(typedArray.getInt(nn6.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = tf4.a(this.a.getContext(), typedArray, nn6.MaterialButton_backgroundTint);
        this.k = tf4.a(this.a.getContext(), typedArray, nn6.MaterialButton_strokeColor);
        this.l = tf4.a(this.a.getContext(), typedArray, nn6.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(nn6.MaterialButton_android_checkable, false);
        this.t = typedArray.getDimensionPixelSize(nn6.MaterialButton_elevation, 0);
        this.r = typedArray.getBoolean(nn6.MaterialButton_toggleCheckedStateOnClick, true);
        int C = k99.C(this.a);
        int paddingTop = this.a.getPaddingTop();
        int B = k99.B(this.a);
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(nn6.MaterialButton_android_background)) {
            t();
        } else {
            H();
        }
        k99.B0(this.a, C + this.c, paddingTop + this.e, B + this.d, paddingBottom + this.f);
    }

    void s(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    void t() {
        this.o = true;
        this.a.setSupportBackgroundTintList(this.j);
        this.a.setSupportBackgroundTintMode(this.i);
    }

    void u(boolean z) {
        this.q = z;
    }

    void v(int i) {
        if (this.p && this.g == i) {
            return;
        }
        this.g = i;
        this.p = true;
        z(this.b.w(i));
    }

    public void w(int i) {
        G(this.e, i);
    }

    public void x(int i) {
        G(i, this.f);
    }

    void y(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = u;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(m27.a(colorStateList));
            } else {
                if (z || !(this.a.getBackground() instanceof h27)) {
                    return;
                }
                ((h27) this.a.getBackground()).setTintList(m27.a(colorStateList));
            }
        }
    }

    void z(oo7 oo7Var) {
        this.b = oo7Var;
        I(oo7Var);
    }
}
