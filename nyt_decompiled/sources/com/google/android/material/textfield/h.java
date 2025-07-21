package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import defpackage.oo7;
import defpackage.uf4;

/* loaded from: classes3.dex */
abstract class h extends uf4 {
    b N;

    private static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        @Override // defpackage.uf4
        protected void r(Canvas canvas) {
            if (this.N.w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.N.w);
            super.r(canvas);
            canvas.restore();
        }
    }

    static h k0(oo7 oo7Var) {
        if (oo7Var == null) {
            oo7Var = new oo7();
        }
        return l0(new b(oo7Var, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h l0(b bVar) {
        return new c(bVar);
    }

    boolean m0() {
        return !this.N.w.isEmpty();
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.N = new b(this.N);
        return this;
    }

    void n0() {
        o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void o0(float f, float f2, float f3, float f4) {
        if (f == this.N.w.left && f2 == this.N.w.top && f3 == this.N.w.right && f4 == this.N.w.bottom) {
            return;
        }
        this.N.w.set(f, f2, f3, f4);
        invalidateSelf();
    }

    void p0(RectF rectF) {
        o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    private static final class b extends uf4.c {
        private final RectF w;

        @Override // uf4.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h l0 = h.l0(this);
            l0.invalidateSelf();
            return l0;
        }

        private b(oo7 oo7Var, RectF rectF) {
            super(oo7Var, null);
            this.w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.w = bVar.w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.N = bVar;
    }
}
