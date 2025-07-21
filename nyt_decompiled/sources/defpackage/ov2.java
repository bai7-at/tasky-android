package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class ov2 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final Instant f;
    private final String g;

    public ov2(String str, String str2, String str3, String str4, String str5, Instant instant, String str6) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "targetUrl");
        zq3.h(str4, "promotionalHeadline");
        zq3.h(str5, "promotionalSummary");
        zq3.h(str6, "sourceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = instant;
        this.g = str6;
    }

    public final Instant a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov2)) {
            return false;
        }
        ov2 ov2Var = (ov2) obj;
        return zq3.c(this.a, ov2Var.a) && zq3.c(this.b, ov2Var.b) && zq3.c(this.c, ov2Var.c) && zq3.c(this.d, ov2Var.d) && zq3.c(this.e, ov2Var.e) && zq3.c(this.f, ov2Var.f) && zq3.c(this.g, ov2Var.g);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Instant instant = this.f;
        return ((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "GamesPromo(__typename=" + this.a + ", uri=" + this.b + ", targetUrl=" + this.c + ", promotionalHeadline=" + this.d + ", promotionalSummary=" + this.e + ", lastModified=" + this.f + ", sourceId=" + this.g + ")";
    }
}
