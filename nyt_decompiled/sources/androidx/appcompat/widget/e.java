package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fo6;
import defpackage.k99;

/* loaded from: classes.dex */
class e {
    private final View a;
    private f0 d;
    private f0 e;
    private f0 f;
    private int c = -1;
    private final j b = j.b();

    e(View view) {
        this.a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new f0();
        }
        f0 f0Var = this.f;
        f0Var.a();
        ColorStateList p = k99.p(this.a);
        if (p != null) {
            f0Var.d = true;
            f0Var.a = p;
        }
        PorterDuff.Mode q = k99.q(this.a);
        if (q != null) {
            f0Var.c = true;
            f0Var.b = q;
        }
        if (!f0Var.d && !f0Var.c) {
            return false;
        }
        j.i(drawable, f0Var, this.a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.d != null;
    }

    void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            f0 f0Var = this.e;
            if (f0Var != null) {
                j.i(background, f0Var, this.a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.d;
            if (f0Var2 != null) {
                j.i(background, f0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i) {
        h0 v = h0.v(this.a.getContext(), attributeSet, fo6.ViewBackgroundHelper, i, 0);
        View view = this.a;
        k99.j0(view, view.getContext(), fo6.ViewBackgroundHelper, attributeSet, v.r(), i, 0);
        try {
            if (v.s(fo6.ViewBackgroundHelper_android_background)) {
                this.c = v.n(fo6.ViewBackgroundHelper_android_background, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            if (v.s(fo6.ViewBackgroundHelper_backgroundTint)) {
                k99.q0(this.a, v.c(fo6.ViewBackgroundHelper_backgroundTint));
            }
            if (v.s(fo6.ViewBackgroundHelper_backgroundTintMode)) {
                k99.r0(this.a, w.e(v.k(fo6.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            v.w();
        } catch (Throwable th) {
            v.w();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    void g(int i) {
        this.c = i;
        j jVar = this.b;
        h(jVar != null ? jVar.f(this.a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new f0();
            }
            f0 f0Var = this.d;
            f0Var.a = colorStateList;
            f0Var.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new f0();
        }
        f0 f0Var = this.e;
        f0Var.a = colorStateList;
        f0Var.d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new f0();
        }
        f0 f0Var = this.e;
        f0Var.b = mode;
        f0Var.c = true;
        b();
    }
}
