package defpackage;

/* loaded from: classes2.dex */
public final class gi7 {
    public static final gi7 c = new gi7(0, 0);
    public final long a;
    public final long b;

    public gi7(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gi7.class != obj.getClass()) {
            return false;
        }
        gi7 gi7Var = (gi7) obj;
        return this.a == gi7Var.a && this.b == gi7Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
