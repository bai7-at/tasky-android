package defpackage;

import org.threeten.bp.OffsetDateTime;

/* loaded from: classes4.dex */
public final class z18 {
    private final long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final OffsetDateTime h;
    private final OffsetDateTime i;
    private final int j;
    private final String k;
    private final String l;
    private final int m;

    public z18(long j, String str, String str2, String str3, String str4, String str5, String str6, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, String str7, String str8, int i2) {
        zq3.h(str, "title");
        zq3.h(str3, "summary");
        zq3.h(str4, "assetType");
        zq3.h(str5, "sectionName");
        zq3.h(offsetDateTime, "lastUpdated");
        zq3.h(offsetDateTime2, "lastAccessed");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = offsetDateTime;
        this.i = offsetDateTime2;
        this.j = i;
        this.k = str7;
        this.l = str8;
        this.m = i2;
    }

    public final z18 a(long j, String str, String str2, String str3, String str4, String str5, String str6, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i, String str7, String str8, int i2) {
        zq3.h(str, "title");
        zq3.h(str3, "summary");
        zq3.h(str4, "assetType");
        zq3.h(str5, "sectionName");
        zq3.h(offsetDateTime, "lastUpdated");
        zq3.h(offsetDateTime2, "lastAccessed");
        return new z18(j, str, str2, str3, str4, str5, str6, offsetDateTime, offsetDateTime2, i, str7, str8, i2);
    }

    public final String c() {
        return this.e;
    }

    public final int d() {
        return this.j;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z18)) {
            return false;
        }
        z18 z18Var = (z18) obj;
        return this.a == z18Var.a && zq3.c(this.b, z18Var.b) && zq3.c(this.c, z18Var.c) && zq3.c(this.d, z18Var.d) && zq3.c(this.e, z18Var.e) && zq3.c(this.f, z18Var.f) && zq3.c(this.g, z18Var.g) && zq3.c(this.h, z18Var.h) && zq3.c(this.i, z18Var.i) && this.j == z18Var.j && zq3.c(this.k, z18Var.k) && zq3.c(this.l, z18Var.l) && this.m == z18Var.m;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.g;
    }

    public final OffsetDateTime h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.a) * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str2 = this.g;
        int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + Integer.hashCode(this.j)) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        return ((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.m);
    }

    public final OffsetDateTime i() {
        return this.h;
    }

    public final int j() {
        return this.m;
    }

    public final String k() {
        return this.f;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.b;
    }

    public final String n() {
        return this.l;
    }

    public final String o() {
        return this.k;
    }

    public String toString() {
        return "StorableAsset(id=" + this.a + ", title=" + this.b + ", imageUrl=" + this.c + ", summary=" + this.d + ", assetType=" + this.e + ", sectionName=" + this.f + ", kicker=" + this.g + ", lastUpdated=" + this.h + ", lastAccessed=" + this.i + ", commentCount=" + this.j + ", url=" + this.k + ", uri=" + this.l + ", readBeforeButUpdated=" + this.m + ")";
    }
}
