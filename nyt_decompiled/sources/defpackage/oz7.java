package defpackage;

/* loaded from: classes.dex */
public final class oz7 {
    private float a;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double b = Math.sqrt(50.0d);
    private float g = 1.0f;

    public oz7(float f) {
        this.a = f;
    }

    private final void c() {
        if (this.c) {
            return;
        }
        if (this.a == pz7.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f = this.g;
        double d = f * f;
        if (f > 1.0f) {
            double d2 = this.b;
            double d3 = d - 1;
            this.d = ((-f) * d2) + (d2 * Math.sqrt(d3));
            double d4 = -this.g;
            double d5 = this.b;
            this.e = (d4 * d5) - (d5 * Math.sqrt(d3));
        } else if (f >= 0.0f && f < 1.0f) {
            this.f = this.b * Math.sqrt(1 - d);
        }
        this.c = true;
    }

    public final float a() {
        return this.g;
    }

    public final float b() {
        double d = this.b;
        return (float) (d * d);
    }

    public final void d(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.g = f;
        this.c = false;
    }

    public final void e(float f) {
        this.a = f;
    }

    public final void f(float f) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.b = Math.sqrt(f);
        this.c = false;
    }

    public final long g(float f, float f2, long j) {
        double cos;
        double d;
        c();
        float f3 = f - this.a;
        double d2 = j / 1000.0d;
        float f4 = this.g;
        if (f4 > 1.0f) {
            double d3 = f3;
            double d4 = this.e;
            double d5 = f2;
            double d6 = this.d;
            double d7 = d3 - (((d4 * d3) - d5) / (d4 - d6));
            double d8 = ((d3 * d4) - d5) / (d4 - d6);
            d = (Math.exp(d4 * d2) * d7) + (Math.exp(this.d * d2) * d8);
            double d9 = this.e;
            double exp = d7 * d9 * Math.exp(d9 * d2);
            double d10 = this.d;
            cos = exp + (d8 * d10 * Math.exp(d10 * d2));
        } else if (f4 == 1.0f) {
            double d11 = this.b;
            double d12 = f3;
            double d13 = f2 + (d11 * d12);
            double d14 = d12 + (d13 * d2);
            double exp2 = Math.exp((-d11) * d2) * d14;
            double exp3 = d14 * Math.exp((-this.b) * d2);
            double d15 = this.b;
            cos = (exp3 * (-d15)) + (d13 * Math.exp((-d15) * d2));
            d = exp2;
        } else {
            double d16 = 1 / this.f;
            double d17 = this.b;
            double d18 = f3;
            double d19 = d16 * ((f4 * d17 * d18) + f2);
            double exp4 = Math.exp((-f4) * d17 * d2) * ((Math.cos(this.f * d2) * d18) + (Math.sin(this.f * d2) * d19));
            double d20 = this.b;
            double d21 = (-d20) * exp4 * this.g;
            double exp5 = Math.exp((-r5) * d20 * d2);
            double d22 = this.f;
            double sin = (-d22) * d18 * Math.sin(d22 * d2);
            double d23 = this.f;
            cos = d21 + (exp5 * (sin + (d19 * d23 * Math.cos(d23 * d2))));
            d = exp4;
        }
        return pz7.a((float) (d + this.a), (float) cos);
    }
}
