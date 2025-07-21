package defpackage;

/* loaded from: classes.dex */
public final class qu7 {
    private final ss2 a;
    private final ph2 b;

    public qu7(ss2 ss2Var, ph2 ph2Var) {
        this.a = ss2Var;
        this.b = ph2Var;
    }

    public final ph2 a() {
        return this.b;
    }

    public final ss2 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu7)) {
            return false;
        }
        qu7 qu7Var = (qu7) obj;
        return zq3.c(this.a, qu7Var.a) && zq3.c(this.b, qu7Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
