package defpackage;

/* loaded from: classes4.dex */
public final class hz8 extends iz8 {
    private final String a;
    private final String b;
    private final qp7 c;
    private final Integer d;

    public hz8(String str, String str2, qp7 qp7Var, Integer num) {
        super(null);
        this.a = str;
        this.b = str2;
        this.c = qp7Var;
        this.d = num;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz8)) {
            return false;
        }
        hz8 hz8Var = (hz8) obj;
        return zq3.c(this.a, hz8Var.a) && zq3.c(this.b, hz8Var.b) && zq3.c(this.c, hz8Var.c) && zq3.c(this.d, hz8Var.d);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        qp7 qp7Var = this.c;
        int hashCode3 = (hashCode2 + (qp7Var == null ? 0 : qp7Var.hashCode())) * 31;
        Integer num = this.d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UrlShareCodeResponse(url=" + this.a + ", code=" + this.b + ", contents=" + this.c + ", remaining=" + this.d + ")";
    }
}
