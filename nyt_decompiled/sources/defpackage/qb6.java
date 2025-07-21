package defpackage;

/* loaded from: classes4.dex */
public final class qb6 {
    private final String a;
    private final String b;

    public qb6(String str, String str2) {
        zq3.h(str2, "expected");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb6)) {
            return false;
        }
        qb6 qb6Var = (qb6) obj;
        return zq3.c(this.a, qb6Var.a) && zq3.c(this.b, qb6Var.b);
    }

    public int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Abra variant '" + this.a + "' (expected: " + this.b + ")";
    }
}
