package defpackage;

/* loaded from: classes2.dex */
public final class iy6 {
    private final int a;
    private final Integer b;

    public iy6(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final int a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy6)) {
            return false;
        }
        iy6 iy6Var = (iy6) obj;
        return this.a == iy6Var.a && zq3.c(this.b, iy6Var.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "RequestExecutionContext(attemptNumber=" + this.a + ", previousResponseCode=" + this.b + ")";
    }
}
