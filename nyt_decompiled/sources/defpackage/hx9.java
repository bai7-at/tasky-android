package defpackage;

/* loaded from: classes3.dex */
public final class hx9 {
    public static final hx9 c = new hx9(0, 0);
    public final long a;
    public final long b;

    public hx9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hx9.class == obj.getClass()) {
            hx9 hx9Var = (hx9) obj;
            if (this.a == hx9Var.a && this.b == hx9Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
