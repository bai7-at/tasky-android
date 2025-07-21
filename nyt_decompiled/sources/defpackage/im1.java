package defpackage;

/* loaded from: classes.dex */
final class im1 implements fm1 {
    private final float a;
    private final float b;
    private final vm2 c;

    public im1(float f, float f2, vm2 vm2Var) {
        this.a = f;
        this.b = f2;
        this.c = vm2Var;
    }

    @Override // defpackage.an2
    public long A(float f) {
        return ek8.f(this.c.a(f));
    }

    @Override // defpackage.an2
    public float F(long j) {
        if (fk8.g(dk8.g(j), fk8.b.b())) {
            return bu1.g(this.c.b(dk8.h(j)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.an2
    public float c1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im1)) {
            return false;
        }
        im1 im1Var = (im1) obj;
        return Float.compare(this.a, im1Var.a) == 0 && Float.compare(this.b, im1Var.b) == 0 && zq3.c(this.c, im1Var.c);
    }

    @Override // defpackage.fm1
    public float getDensity() {
        return this.a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
