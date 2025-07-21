package defpackage;

/* loaded from: classes.dex */
public final class eg9 {
    private final float a;
    private final float b;

    public eg9(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final float[] c() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg9)) {
            return false;
        }
        eg9 eg9Var = (eg9) obj;
        return Float.compare(this.a, eg9Var.a) == 0 && Float.compare(this.b, eg9Var.b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ')';
    }

    public eg9(float f, float f2, float f3) {
        this(f, f2, f3, f + f2 + f3);
    }

    private eg9(float f, float f2, float f3, float f4) {
        this(f / f4, f2 / f4);
    }
}
