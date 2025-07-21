package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class g56 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Instant g;
    private final Instant h;
    private final Instant i;
    private final String j;
    private final String k;
    private final a l;

    public static final class a {
        private final String a;
        private final kf3 b;

        public a(String str, kf3 kf3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = kf3Var;
        }

        public final kf3 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            kf3 kf3Var = this.b;
            return hashCode + (kf3Var == null ? 0 : kf3Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", imageAsset=" + this.b + ")";
        }
    }

    public g56(String str, String str2, String str3, String str4, String str5, String str6, Instant instant, Instant instant2, Instant instant3, String str7, String str8, a aVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "url");
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(str5, "promotionalHeadline");
        zq3.h(str6, "promotionalSummary");
        zq3.h(str7, "targetUrl");
        zq3.h(str8, "sourceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = instant;
        this.h = instant2;
        this.i = instant3;
        this.j = str7;
        this.k = str8;
        this.l = aVar;
    }

    public final Instant a() {
        return this.g;
    }

    public final Instant b() {
        return this.h;
    }

    public final Instant c() {
        return this.i;
    }

    public final String d() {
        return this.e;
    }

    public final a e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g56)) {
            return false;
        }
        g56 g56Var = (g56) obj;
        return zq3.c(this.a, g56Var.a) && zq3.c(this.b, g56Var.b) && zq3.c(this.c, g56Var.c) && zq3.c(this.d, g56Var.d) && zq3.c(this.e, g56Var.e) && zq3.c(this.f, g56Var.f) && zq3.c(this.g, g56Var.g) && zq3.c(this.h, g56Var.h) && zq3.c(this.i, g56Var.i) && zq3.c(this.j, g56Var.j) && zq3.c(this.k, g56Var.k) && zq3.c(this.l, g56Var.l);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.k;
    }

    public final String h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Instant instant = this.g;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.h;
        int hashCode3 = (hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.i;
        int hashCode4 = (((((hashCode3 + (instant3 == null ? 0 : instant3.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        a aVar = this.l;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.b;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.a;
    }

    public String toString() {
        return "PromoAsset(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", type=" + this.d + ", promotionalHeadline=" + this.e + ", promotionalSummary=" + this.f + ", firstPublished=" + this.g + ", lastMajorModification=" + this.h + ", lastModified=" + this.i + ", targetUrl=" + this.j + ", sourceId=" + this.k + ", promotionalMedia=" + this.l + ")";
    }
}
