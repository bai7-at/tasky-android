package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.al;
import defpackage.fh3;
import defpackage.fo6;
import defpackage.k99;

/* loaded from: classes.dex */
public class o {
    private final ImageView a;
    private f0 b;
    private f0 c;
    private f0 d;
    private int e = 0;

    public o(ImageView imageView) {
        this.a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new f0();
        }
        f0 f0Var = this.d;
        f0Var.a();
        ColorStateList a = fh3.a(this.a);
        if (a != null) {
            f0Var.d = true;
            f0Var.a = a;
        }
        PorterDuff.Mode b = fh3.b(this.a);
        if (b != null) {
            f0Var.c = true;
            f0Var.b = b;
        }
        if (!f0Var.d && !f0Var.c) {
            return false;
        }
        j.i(drawable, f0Var, this.a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.b != null;
    }

    void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            w.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            f0 f0Var = this.c;
            if (f0Var != null) {
                j.i(drawable, f0Var, this.a.getDrawableState());
                return;
            }
            f0 f0Var2 = this.b;
            if (f0Var2 != null) {
                j.i(drawable, f0Var2, this.a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        f0 f0Var = this.c;
        if (f0Var != null) {
            return f0Var.a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        f0 f0Var = this.c;
        if (f0Var != null) {
            return f0Var.b;
        }
        return null;
    }

    boolean f() {
        return !(this.a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i) {
        int n;
        h0 v = h0.v(this.a.getContext(), attributeSet, fo6.AppCompatImageView, i, 0);
        ImageView imageView = this.a;
        k99.j0(imageView, imageView.getContext(), fo6.AppCompatImageView, attributeSet, v.r(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (n = v.n(fo6.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = al.b(this.a.getContext(), n)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                w.b(drawable);
            }
            if (v.s(fo6.AppCompatImageView_tint)) {
                fh3.c(this.a, v.c(fo6.AppCompatImageView_tint));
            }
            if (v.s(fo6.AppCompatImageView_tintMode)) {
                fh3.d(this.a, w.e(v.k(fo6.AppCompatImageView_tintMode, -1), null));
            }
            v.w();
        } catch (Throwable th) {
            v.w();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = al.b(this.a.getContext(), i);
            if (b != null) {
                w.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new f0();
        }
        f0 f0Var = this.c;
        f0Var.a = colorStateList;
        f0Var.d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new f0();
        }
        f0 f0Var = this.c;
        f0Var.b = mode;
        f0Var.c = true;
        c();
    }
}
