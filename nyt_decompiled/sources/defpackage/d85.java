package defpackage;

/* loaded from: classes4.dex */
public final class d85 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public d85(String str, String str2, String str3, String str4, String str5) {
        zq3.h(str2, "applicationId");
        zq3.h(str3, "apiKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d85)) {
            return false;
        }
        d85 d85Var = (d85) obj;
        return zq3.c(this.a, d85Var.a) && zq3.c(this.b, d85Var.b) && zq3.c(this.c, d85Var.c) && zq3.c(this.d, d85Var.d) && zq3.c(this.e, d85Var.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "NonDefaultFirebaseApp(projectId=" + this.a + ", applicationId=" + this.b + ", apiKey=" + this.c + ", databaseUrl=" + this.d + ", storageBucket=" + this.e + ")";
    }
}
