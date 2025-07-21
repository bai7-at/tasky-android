package defpackage;

/* loaded from: classes3.dex */
public final class pf5 implements rp2 {
    private final String a;
    private final String b;
    private final String c;

    public pf5(String str, String str2, String str3) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf5)) {
            return false;
        }
        pf5 pf5Var = (pf5) obj;
        return zq3.c(this.a, pf5Var.a) && zq3.c(this.b, pf5Var.b) && zq3.c(this.c, pf5Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OnShareCodeError(__typename=" + this.a + ", code=" + this.b + ", message=" + this.c + ")";
    }
}
