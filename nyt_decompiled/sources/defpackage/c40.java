package defpackage;

/* loaded from: classes4.dex */
public final class c40 {
    private final float a;
    private final float b;
    private final int c;
    private final int d;

    public c40(float f, float f2, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c40)) {
            return false;
        }
        c40 c40Var = (c40) obj;
        return Float.compare(this.a, c40Var.a) == 0 && Float.compare(this.b, c40Var.b) == 0 && this.c == c40Var.c && this.d == c40Var.d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "BalloonLayoutInfo(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
