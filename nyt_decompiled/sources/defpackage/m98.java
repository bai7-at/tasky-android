package defpackage;

import java.util.Set;

/* loaded from: classes4.dex */
public final class m98 {
    private final String a;
    private final String b;
    private final Set c;

    public m98(String str, String str2, Set set) {
        this.a = str;
        this.b = str2;
        this.c = set;
    }

    public final String a() {
        return this.b;
    }

    public final Set b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m98)) {
            return false;
        }
        m98 m98Var = (m98) obj;
        return zq3.c(this.a, m98Var.a) && zq3.c(this.b, m98Var.b) && zq3.c(this.c, m98Var.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Set set = this.c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "SubauthUserAnalyticsHelper(regiId=" + this.a + ", cachedEmail=" + this.b + ", cachedEntitlements=" + this.c + ")";
    }
}
