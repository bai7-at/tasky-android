package defpackage;

/* loaded from: classes.dex */
final class gm1 implements fm1 {
    private final float a;
    private final float b;

    public gm1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.an2
    public float c1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm1)) {
            return false;
        }
        gm1 gm1Var = (gm1) obj;
        return Float.compare(this.a, gm1Var.a) == 0 && Float.compare(this.b, gm1Var.b) == 0;
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a;
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ')';
    }
}
