package defpackage;

/* loaded from: classes.dex */
public final class fa2 {
    private final float a;
    private final ph2 b;

    public fa2(float f, ph2 ph2Var) {
        this.a = f;
        this.b = ph2Var;
    }

    public final float a() {
        return this.a;
    }

    public final ph2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        return Float.compare(this.a, fa2Var.a) == 0 && zq3.c(this.b, fa2Var.b);
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
