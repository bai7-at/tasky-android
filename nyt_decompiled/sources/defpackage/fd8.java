package defpackage;

/* loaded from: classes.dex */
public final class fd8 {
    private final Object a;
    private final Object b;
    private final float c;

    public fd8(Object obj, Object obj2, float f) {
        this.a = obj;
        this.b = obj2;
        this.c = f;
    }

    public final float a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd8)) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        return zq3.c(this.a, fd8Var.a) && zq3.c(this.b, fd8Var.b) && this.c == fd8Var.c;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.a + ", to=" + this.b + ", fraction=" + this.c + ')';
    }
}
