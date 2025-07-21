package defpackage;

/* loaded from: classes4.dex */
public final class n73 {
    private final String a;
    private final Integer b;
    private final String c;

    public n73(String str, Integer num, String str2) {
        zq3.h(str, "headline");
        zq3.h(str2, "subheadline");
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final String a() {
        return this.a;
    }

    public final Integer b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n73)) {
            return false;
        }
        n73 n73Var = (n73) obj;
        return zq3.c(this.a, n73Var.a) && zq3.c(this.b, n73Var.b) && zq3.c(this.c, n73Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Header(headline=" + this.a + ", image=" + this.b + ", subheadline=" + this.c + ")";
    }
}
