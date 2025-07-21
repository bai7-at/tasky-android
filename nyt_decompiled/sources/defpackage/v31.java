package defpackage;

/* loaded from: classes.dex */
public final class v31 implements vx1 {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public v31(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.').toString());
        }
    }

    private final float b(float f, float f2, float f3) {
        float f4 = 3;
        float f5 = 1 - f3;
        return (f * f4 * f5 * f5 * f3) + (f4 * f2 * f5 * f3 * f3) + (f3 * f3 * f3);
    }

    @Override // defpackage.vx1
    public float a(float f) {
        float f2 = 0.0f;
        if (f > 0.0f) {
            float f3 = 1.0f;
            if (f < 1.0f) {
                while (true) {
                    float f4 = (f2 + f3) / 2;
                    float b = b(this.a, this.c, f4);
                    if (Math.abs(f - b) < 0.001f) {
                        return b(this.b, this.d, f4);
                    }
                    if (b < f) {
                        f2 = f4;
                    } else {
                        f3 = f4;
                    }
                }
            }
        }
        return f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v31) {
            v31 v31Var = (v31) obj;
            if (this.a == v31Var.a && this.b == v31Var.b && this.c == v31Var.c && this.d == v31Var.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }
}
