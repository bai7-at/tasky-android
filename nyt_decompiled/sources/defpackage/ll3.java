package defpackage;

/* loaded from: classes.dex */
public final class ll3 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public ll3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll3)) {
            return false;
        }
        ll3 ll3Var = (ll3) obj;
        return this.a == ll3Var.a && this.b == ll3Var.b && this.c == ll3Var.c && this.d == ll3Var.d;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ')';
    }
}
