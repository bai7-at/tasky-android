package defpackage;

/* loaded from: classes.dex */
public final class yy6 {
    private final float a;
    private final float b;
    private final float c;

    public yy6(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final float a(float f) {
        float f2 = f < 0.0f ? this.b : this.c;
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (this.a / f2) * ((float) Math.sin((uo6.l(f / this.a, -1.0f, 1.0f) * 3.1415927f) / 2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy6)) {
            return false;
        }
        yy6 yy6Var = (yy6) obj;
        return this.a == yy6Var.a && this.b == yy6Var.b && this.c == yy6Var.c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "ResistanceConfig(basis=" + this.a + ", factorAtMin=" + this.b + ", factorAtMax=" + this.c + ')';
    }
}
