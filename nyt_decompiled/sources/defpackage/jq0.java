package defpackage;

/* loaded from: classes.dex */
public final class jq0 {
    private double a;
    private double b;

    public jq0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final double e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq0)) {
            return false;
        }
        jq0 jq0Var = (jq0) obj;
        return Double.compare(this.a, jq0Var.a) == 0 && Double.compare(this.b, jq0Var.b) == 0;
    }

    public final double f() {
        return this.a;
    }

    public int hashCode() {
        return (Double.hashCode(this.a) * 31) + Double.hashCode(this.b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}
