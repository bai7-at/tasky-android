package defpackage;

/* loaded from: classes2.dex */
public final class q46 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public q46(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q46)) {
            return false;
        }
        q46 q46Var = (q46) obj;
        return z19.c(this.a, q46Var.a) && z19.c(this.b, q46Var.b) && z19.c(this.c, q46Var.c) && z19.c(this.d, q46Var.d) && z19.c(this.e, q46Var.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
