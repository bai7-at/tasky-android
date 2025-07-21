package defpackage;

/* loaded from: classes4.dex */
public final class qp7 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Integer e;

    public qp7(String str, String str2, String str3, String str4, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp7)) {
            return false;
        }
        qp7 qp7Var = (qp7) obj;
        return zq3.c(this.a, qp7Var.a) && zq3.c(this.b, qp7Var.b) && zq3.c(this.c, qp7Var.c) && zq3.c(this.d, qp7Var.d) && zq3.c(this.e, qp7Var.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ShareCode(nytUri=" + this.a + ", url=" + this.b + ", creationDate=" + this.c + ", expirationDate=" + this.d + ", regiID=" + this.e + ")";
    }
}
