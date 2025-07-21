package defpackage;

/* loaded from: classes2.dex */
public final class dc9 {
    private final int a;
    private final int b;

    public dc9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc9)) {
            return false;
        }
        dc9 dc9Var = (dc9) obj;
        return this.a == dc9Var.a && this.b == dc9Var.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "Viewport(width=" + this.a + ", height=" + this.b + ")";
    }
}
