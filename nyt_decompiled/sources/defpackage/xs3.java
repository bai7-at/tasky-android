package defpackage;

/* loaded from: classes.dex */
public final class xs3 {
    private final Object a;
    private final Object b;

    public xs3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs3)) {
            return false;
        }
        xs3 xs3Var = (xs3) obj;
        return zq3.c(this.a, xs3Var.a) && zq3.c(this.b, xs3Var.b);
    }

    public int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
