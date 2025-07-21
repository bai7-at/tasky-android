package defpackage;

/* loaded from: classes2.dex */
public final class xm1 {
    public final String a;
    public final String b;
    public final String c;

    public xm1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xm1.class != obj.getClass()) {
            return false;
        }
        xm1 xm1Var = (xm1) obj;
        return z19.c(this.a, xm1Var.a) && z19.c(this.b, xm1Var.b) && z19.c(this.c, xm1Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
