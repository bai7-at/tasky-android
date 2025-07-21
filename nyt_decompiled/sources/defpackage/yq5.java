package defpackage;

/* loaded from: classes.dex */
final class yq5 implements i01 {
    private final float a;

    public yq5(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.i01
    public float a(long j, fm1 fm1Var) {
        return zt7.h(j) * (this.a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq5) && Float.compare(this.a, ((yq5) obj).a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
