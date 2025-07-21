package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.threeten.bp.Instant;
import type.Tone;

/* loaded from: classes3.dex */
public final class og2 implements rp2 {
    private final String a;
    private final String b;
    private final a c;
    private final String d;
    private final String e;
    private final String f;
    private final Instant g;
    private final Instant h;
    private final Instant i;
    private final String j;
    private final String k;
    private final Tone l;
    private final String m;
    private final String n;
    private final b o;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, "default");
            zq3.h(str3, "seo");
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Headline(__typename=" + this.a + ", default=" + this.b + ", seo=" + this.c + ")";
        }
    }

    public static final class b {
        private final String a;
        private final xg2 b;

        public b(String str, xg2 xg2Var) {
            zq3.h(str, "__typename");
            zq3.h(xg2Var, "filterPromotionalMedia");
            this.a = str;
            this.b = xg2Var;
        }

        public final xg2 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", filterPromotionalMedia=" + this.b + ")";
        }
    }

    public og2(String str, String str2, a aVar, String str3, String str4, String str5, Instant instant, Instant instant2, Instant instant3, String str6, String str7, Tone tone, String str8, String str9, b bVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "summary");
        zq3.h(str4, "url");
        zq3.h(str5, "kicker");
        zq3.h(str6, "sourceId");
        zq3.h(str7, TransferTable.COLUMN_TYPE);
        zq3.h(tone, "tone");
        zq3.h(str8, "slug");
        zq3.h(str9, "desk");
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = instant;
        this.h = instant2;
        this.i = instant3;
        this.j = str6;
        this.k = str7;
        this.l = tone;
        this.m = str8;
        this.n = str9;
        this.o = bVar;
    }

    public final String a() {
        return this.n;
    }

    public final Instant b() {
        return this.h;
    }

    public final a c() {
        return this.c;
    }

    public final String d() {
        return this.f;
    }

    public final Instant e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og2)) {
            return false;
        }
        og2 og2Var = (og2) obj;
        return zq3.c(this.a, og2Var.a) && zq3.c(this.b, og2Var.b) && zq3.c(this.c, og2Var.c) && zq3.c(this.d, og2Var.d) && zq3.c(this.e, og2Var.e) && zq3.c(this.f, og2Var.f) && zq3.c(this.g, og2Var.g) && zq3.c(this.h, og2Var.h) && zq3.c(this.i, og2Var.i) && zq3.c(this.j, og2Var.j) && zq3.c(this.k, og2Var.k) && this.l == og2Var.l && zq3.c(this.m, og2Var.m) && zq3.c(this.n, og2Var.n) && zq3.c(this.o, og2Var.o);
    }

    public final Instant f() {
        return this.g;
    }

    public final b g() {
        return this.o;
    }

    public final String h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        a aVar = this.c;
        int hashCode2 = (((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Instant instant = this.g;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.h;
        int hashCode4 = (hashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.i;
        int hashCode5 = (((((((((((hashCode4 + (instant3 == null ? 0 : instant3.hashCode())) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        b bVar = this.o;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String i() {
        return this.j;
    }

    public final String j() {
        return this.d;
    }

    public final Tone k() {
        return this.l;
    }

    public final String l() {
        return this.k;
    }

    public final String m() {
        return this.b;
    }

    public final String n() {
        return this.e;
    }

    public final String o() {
        return this.a;
    }

    public String toString() {
        return "FilterInterestInteractiveAsset(__typename=" + this.a + ", uri=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", url=" + this.e + ", kicker=" + this.f + ", lastModified=" + this.g + ", firstPublished=" + this.h + ", lastMajorModification=" + this.i + ", sourceId=" + this.j + ", type=" + this.k + ", tone=" + this.l + ", slug=" + this.m + ", desk=" + this.n + ", promotionalMedia=" + this.o + ")";
    }
}
