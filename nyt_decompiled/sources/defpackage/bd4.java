package defpackage;

import android.view.Choreographer;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes.dex */
public class bd4 extends r50 implements Choreographer.FrameCallback {
    private LottieComposition l;
    private float d = 1.0f;
    private boolean e = false;
    private long f = 0;
    private float g = 0.0f;
    private float h = 0.0f;
    private int i = 0;
    private float j = -2.1474836E9f;
    private float k = 2.1474836E9f;
    protected boolean m = false;
    private boolean n = false;

    private void G() {
        if (this.l == null) {
            return;
        }
        float f = this.h;
        if (f < this.j || f > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.j), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    private float m() {
        LottieComposition lottieComposition = this.l;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.i()) / Math.abs(this.d);
    }

    private boolean q() {
        return p() < 0.0f;
    }

    public void A(float f) {
        B(this.j, f);
    }

    public void B(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        LottieComposition lottieComposition = this.l;
        float p = lottieComposition == null ? -3.4028235E38f : lottieComposition.p();
        LottieComposition lottieComposition2 = this.l;
        float f3 = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.f();
        float b = nu4.b(f, p, f3);
        float b2 = nu4.b(f2, p, f3);
        if (b == this.j && b2 == this.k) {
            return;
        }
        this.j = b;
        this.k = b2;
        z((int) nu4.b(this.h, b, b2));
    }

    public void D(int i) {
        B(i, (int) this.k);
    }

    public void E(float f) {
        this.d = f;
    }

    public void F(boolean z) {
        this.n = z;
    }

    @Override // defpackage.r50
    void a() {
        super.a();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        t();
        if (this.l == null || !isRunning()) {
            return;
        }
        yx3.b("LottieValueAnimator#doFrame");
        float m = (this.f != 0 ? j - r1 : 0L) / m();
        float f = this.g;
        if (q()) {
            m = -m;
        }
        float f2 = f + m;
        boolean d = nu4.d(f2, o(), n());
        float f3 = this.g;
        float b = nu4.b(f2, o(), n());
        this.g = b;
        if (this.n) {
            b = (float) Math.floor(b);
        }
        this.h = b;
        this.f = j;
        if (!this.n || this.g != f3) {
            g();
        }
        if (!d) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                d();
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    x();
                } else {
                    float n = q() ? n() : o();
                    this.g = n;
                    this.h = n;
                }
                this.f = j;
            } else {
                float o = this.d < 0.0f ? o() : n();
                this.g = o;
                this.h = o;
                u();
                b(q());
            }
        }
        G();
        yx3.c("LottieValueAnimator#doFrame");
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o;
        float n;
        float o2;
        if (this.l == null) {
            return 0.0f;
        }
        if (q()) {
            o = n() - this.h;
            n = n();
            o2 = o();
        } else {
            o = this.h - o();
            n = n();
            o2 = o();
        }
        return o / (n - o2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.l;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.d();
    }

    public void h() {
        this.l = null;
        this.j = -2.1474836E9f;
        this.k = 2.1474836E9f;
    }

    public void i() {
        u();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.m;
    }

    public float k() {
        LottieComposition lottieComposition = this.l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.h - lottieComposition.p()) / (this.l.f() - this.l.p());
    }

    public float l() {
        return this.h;
    }

    public float n() {
        LottieComposition lottieComposition = this.l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.k;
        return f == 2.1474836E9f ? lottieComposition.f() : f;
    }

    public float o() {
        LottieComposition lottieComposition = this.l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.j;
        return f == -2.1474836E9f ? lottieComposition.p() : f;
    }

    public float p() {
        return this.d;
    }

    public void r() {
        u();
        c();
    }

    public void s() {
        this.m = true;
        f(q());
        z((int) (q() ? n() : o()));
        this.f = 0L;
        this.i = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        x();
    }

    protected void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected void u() {
        v(true);
    }

    protected void v(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public void w() {
        this.m = true;
        t();
        this.f = 0L;
        if (q() && l() == o()) {
            z(n());
        } else if (!q() && l() == n()) {
            z(o());
        }
        e();
    }

    public void x() {
        E(-p());
    }

    public void y(LottieComposition lottieComposition) {
        boolean z = this.l == null;
        this.l = lottieComposition;
        if (z) {
            B(Math.max(this.j, lottieComposition.p()), Math.min(this.k, lottieComposition.f()));
        } else {
            B((int) lottieComposition.p(), (int) lottieComposition.f());
        }
        float f = this.h;
        this.h = 0.0f;
        this.g = 0.0f;
        z((int) f);
        g();
    }

    public void z(float f) {
        if (this.g == f) {
            return;
        }
        float b = nu4.b(f, o(), n());
        this.g = b;
        if (this.n) {
            b = (float) Math.floor(b);
        }
        this.h = b;
        this.f = 0L;
        g();
    }
}
