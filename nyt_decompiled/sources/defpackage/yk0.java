package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class yk0 extends Drawable implements Animatable {
    private static final Interpolator g = new LinearInterpolator();
    private static final Interpolator h = new la2();
    private static final int[] i = {-16777216};
    private final c a;
    private float b;
    private Resources c;
    private Animator d;
    float e;
    boolean f;

    class a implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            yk0.this.q(floatValue, this.a);
            yk0.this.b(floatValue, this.a, false);
            yk0.this.invalidateSelf();
        }
    }

    class b implements Animator.AnimatorListener {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            yk0.this.b(1.0f, this.a, true);
            this.a.D();
            this.a.n();
            yk0 yk0Var = yk0.this;
            if (!yk0Var.f) {
                yk0Var.e += 1.0f;
                return;
            }
            yk0Var.f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.a.A(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            yk0.this.e = 0.0f;
        }
    }

    private static class c {
        final RectF a = new RectF();
        final Paint b;
        final Paint c;
        final Paint d;
        float e;
        float f;
        float g;
        float h;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;

        c() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        void B(float f) {
            this.e = f;
        }

        void C(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }

        void D() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            b(canvas, f5, f6, rectF);
        }

        void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.o;
                if (path == null) {
                    Path path2 = new Path();
                    this.o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f3 = (this.r * this.p) / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.o;
                float f4 = this.r;
                float f5 = this.p;
                path3.lineTo((f4 * f5) / 2.0f, this.s * f5);
                this.o.offset((min + rectF.centerX()) - f3, rectF.centerY() + (this.h / 2.0f));
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }

        int c() {
            return this.t;
        }

        float d() {
            return this.q;
        }

        float e() {
            return this.f;
        }

        int f() {
            return this.i[g()];
        }

        int g() {
            return (this.j + 1) % this.i.length;
        }

        float h() {
            return this.e;
        }

        int i() {
            return this.i[this.j];
        }

        float j() {
            return this.l;
        }

        float k() {
            return this.m;
        }

        float l() {
            return this.k;
        }

        float m() {
            return this.h;
        }

        void n() {
            w(g());
        }

        void o() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            B(0.0f);
            y(0.0f);
            z(0.0f);
        }

        void p(int i) {
            this.t = i;
        }

        void q(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        void r(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }

        void s(int i) {
            this.d.setColor(i);
        }

        void t(float f) {
            this.q = f;
        }

        void u(int i) {
            this.u = i;
        }

        void v(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        void w(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        void x(int[] iArr) {
            this.i = iArr;
            w(0);
        }

        void y(float f) {
            this.f = f;
        }

        void z(float f) {
            this.g = f;
        }
    }

    public yk0(Context context) {
        this.c = ((Context) h16.g(context)).getResources();
        c cVar = new c();
        this.a = cVar;
        cVar.x(i);
        n(2.5f);
        p();
    }

    private void a(float f, c cVar) {
        q(f, cVar);
        float floor = (float) (Math.floor(cVar.k() / 0.8f) + 1.0d);
        cVar.B(cVar.l() + (((cVar.j() - 0.01f) - cVar.l()) * f));
        cVar.y(cVar.j());
        cVar.z(cVar.k() + ((floor - cVar.k()) * f));
    }

    private int c(float f, int i2, int i3) {
        return ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r5) * f))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r0) * f))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r1) * f))) << 8) | ((i2 & 255) + ((int) (f * ((i3 & 255) - r7))));
    }

    private void k(float f) {
        this.b = f;
    }

    private void l(float f, float f2, float f3, float f4) {
        c cVar = this.a;
        float f5 = this.c.getDisplayMetrics().density;
        cVar.C(f2 * f5);
        cVar.t(f * f5);
        cVar.w(0);
        cVar.q(f3 * f5, f4 * f5);
    }

    private void p() {
        c cVar = this.a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new b(cVar));
        this.d = ofFloat;
    }

    void b(float f, c cVar, boolean z) {
        float interpolation;
        float f2;
        if (this.f) {
            a(f, cVar);
            return;
        }
        if (f != 1.0f || z) {
            float k = cVar.k();
            if (f < 0.5f) {
                interpolation = cVar.l();
                f2 = (h.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float l = cVar.l() + 0.79f;
                interpolation = l - (((1.0f - h.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = l;
            }
            float f3 = k + (0.20999998f * f);
            float f4 = (f + this.e) * 216.0f;
            cVar.B(interpolation);
            cVar.y(f2);
            cVar.z(f3);
            k(f4);
        }
    }

    public float d() {
        return this.a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        this.a.a(canvas, bounds);
        canvas.restore();
    }

    public float e() {
        return this.a.m();
    }

    public void f(boolean z) {
        this.a.A(z);
        invalidateSelf();
    }

    public void g(float f) {
        this.a.r(f);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(int i2) {
        this.a.s(i2);
        invalidateSelf();
    }

    public void i(int... iArr) {
        this.a.x(iArr);
        this.a.w(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.d.isRunning();
    }

    public void j(float f) {
        this.a.z(f);
        invalidateSelf();
    }

    public void m(float f, float f2) {
        this.a.B(f);
        this.a.y(f2);
        invalidateSelf();
    }

    public void n(float f) {
        this.a.C(f);
        invalidateSelf();
    }

    public void o(int i2) {
        if (i2 == 0) {
            l(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            l(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void q(float f, c cVar) {
        if (f > 0.75f) {
            cVar.u(c((f - 0.75f) / 0.25f, cVar.i(), cVar.f()));
        } else {
            cVar.u(cVar.i());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.a.p(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.v(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d.cancel();
        this.a.D();
        if (this.a.e() != this.a.h()) {
            this.f = true;
            this.d.setDuration(666L);
            this.d.start();
        } else {
            this.a.w(0);
            this.a.o();
            this.d.setDuration(1332L);
            this.d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d.cancel();
        k(0.0f);
        this.a.A(false);
        this.a.w(0);
        this.a.o();
        invalidateSelf();
    }
}
