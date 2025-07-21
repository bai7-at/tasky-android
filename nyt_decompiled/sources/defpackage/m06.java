package defpackage;

import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes4.dex */
public final class m06 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final oh3 e;

    public m06(String str, String str2, String str3, String str4, oh3 oh3Var) {
        zq3.h(str, "accountStatus");
        zq3.h(str2, "userMessage");
        zq3.h(str3, AppsFlyerProperties.USER_EMAIL);
        zq3.h(str4, "header");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = oh3Var;
    }

    public static /* synthetic */ m06 b(m06 m06Var, String str, String str2, String str3, String str4, oh3 oh3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = m06Var.a;
        }
        if ((i & 2) != 0) {
            str2 = m06Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = m06Var.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = m06Var.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            oh3Var = m06Var.e;
        }
        return m06Var.a(str, str5, str6, str7, oh3Var);
    }

    public final m06 a(String str, String str2, String str3, String str4, oh3 oh3Var) {
        zq3.h(str, "accountStatus");
        zq3.h(str2, "userMessage");
        zq3.h(str3, AppsFlyerProperties.USER_EMAIL);
        zq3.h(str4, "header");
        return new m06(str, str2, str3, str4, oh3Var);
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public final oh3 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m06)) {
            return false;
        }
        m06 m06Var = (m06) obj;
        return zq3.c(this.a, m06Var.a) && zq3.c(this.b, m06Var.b) && zq3.c(this.c, m06Var.c) && zq3.c(this.d, m06Var.d) && zq3.c(this.e, m06Var.e);
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        oh3 oh3Var = this.e;
        return hashCode + (oh3Var == null ? 0 : oh3Var.hashCode());
    }

    public String toString() {
        return "PostAuthHeaderData(accountStatus=" + this.a + ", userMessage=" + this.b + ", userEmail=" + this.c + ", header=" + this.d + ", icons=" + this.e + ")";
    }
}
