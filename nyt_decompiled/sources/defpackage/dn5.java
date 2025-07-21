package defpackage;

import com.nytimes.xwords.hybrid.analytics.HybridGamesReferringSourceData;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class dn5 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Boolean g;
    private final HybridGamesReferringSourceData h;

    public dn5(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, HybridGamesReferringSourceData hybridGamesReferringSourceData) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = bool;
        this.h = hybridGamesReferringSourceData;
    }

    public final String a() {
        return this.f;
    }

    public final String b() {
        return this.c;
    }

    public final HybridGamesReferringSourceData c() {
        return this.h;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn5)) {
            return false;
        }
        dn5 dn5Var = (dn5) obj;
        return zq3.c(this.a, dn5Var.a) && zq3.c(this.b, dn5Var.b) && zq3.c(this.c, dn5Var.c) && zq3.c(this.d, dn5Var.d) && zq3.c(this.e, dn5Var.e) && zq3.c(this.f, dn5Var.f) && zq3.c(this.g, dn5Var.g) && zq3.c(this.h, dn5Var.h);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final Boolean h() {
        return this.g;
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
        String str5 = this.e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.g;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        HybridGamesReferringSourceData hybridGamesReferringSourceData = this.h;
        return hashCode7 + (hybridGamesReferringSourceData != null ? hybridGamesReferringSourceData.hashCode() : 0);
    }

    public String toString() {
        return "PageEvent(section=" + this.a + ", type=" + this.b + ", nytsCookie=" + this.c + ", regi_id=" + this.d + ", user_type=" + this.e + ", entitlements=" + this.f + ", isUpgradeable=" + this.g + ", referringSource=" + this.h + ")";
    }

    public /* synthetic */ dn5(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, HybridGamesReferringSourceData hybridGamesReferringSourceData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : hybridGamesReferringSourceData);
    }
}
