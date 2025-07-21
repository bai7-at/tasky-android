package defpackage;

/* loaded from: classes.dex */
public final class u2 {
    private final String a;
    private final lt2 b;

    public u2(String str, lt2 lt2Var) {
        this.a = str;
        this.b = lt2Var;
    }

    public final lt2 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return zq3.c(this.a, u2Var.a) && zq3.c(this.b, u2Var.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        lt2 lt2Var = this.b;
        return hashCode + (lt2Var != null ? lt2Var.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
