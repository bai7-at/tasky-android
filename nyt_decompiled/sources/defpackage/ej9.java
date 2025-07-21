package defpackage;

/* loaded from: classes.dex */
public final class ej9 {
    private final String a;
    private final int b;

    public ej9(String str, int i) {
        zq3.h(str, "workSpecId");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej9)) {
            return false;
        }
        ej9 ej9Var = (ej9) obj;
        return zq3.c(this.a, ej9Var.a) && this.b == ej9Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
