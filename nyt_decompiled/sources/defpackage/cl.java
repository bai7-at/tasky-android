package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.w;

/* loaded from: classes.dex */
class cl extends yk {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    cl(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    private void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable r = kv1.r(drawable.mutate());
                this.e = r;
                if (this.h) {
                    kv1.o(r, this.f);
                }
                if (this.i) {
                    kv1.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.yk
    void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        h0 v = h0.v(this.d.getContext(), attributeSet, fo6.AppCompatSeekBar, i, 0);
        SeekBar seekBar = this.d;
        k99.j0(seekBar, seekBar.getContext(), fo6.AppCompatSeekBar, attributeSet, v.r(), i, 0);
        Drawable h = v.h(fo6.AppCompatSeekBar_android_thumb);
        if (h != null) {
            this.d.setThumb(h);
        }
        j(v.g(fo6.AppCompatSeekBar_tickMark));
        if (v.s(fo6.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = w.e(v.k(fo6.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (v.s(fo6.AppCompatSeekBar_tickMarkTint)) {
            this.f = v.c(fo6.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        v.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            kv1.m(drawable, k99.x(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
