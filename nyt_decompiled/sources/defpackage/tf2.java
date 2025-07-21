package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import org.threeten.bp.Instant;
import type.Tone;

/* loaded from: classes3.dex */
public final class tf2 implements rp2 {
    private final String a;
    private final String b;
    private final a c;
    private final String d;
    private final String e;
    private final String f;
    private final Instant g;
    private final Instant h;
    private final String i;
    private final String j;
    private final Tone k;
    private final String l;
    private final String m;
    private final b n;
    private final c o;

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
        private final Instant b;

        public b(String str, Instant instant) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = instant;
        }

        public final Instant a() {
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
            int hashCode = this.a.hashCode() * 31;
            Instant instant = this.b;
            return hashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "HybridBody(__typename=" + this.a + ", lastModified=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final xg2 b;

        public c(String str, xg2 xg2Var) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", filterPromotionalMedia=" + this.b + ")";
        }
    }

    public tf2(String str, String str2, a aVar, String str3, String str4, String str5, Instant instant, Instant instant2, String str6, String str7, Tone tone, String str8, String str9, b bVar, c cVar) {
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
        this.i = str6;
        this.j = str7;
        this.k = tone;
        this.l = str8;
        this.m = str9;
        this.n = bVar;
        this.o = cVar;
    }

    public final String a() {
        return this.m;
    }

    public final a b() {
        return this.c;
    }

    public final b c() {
        return this.n;
    }

    public final String d() {
        return this.f;
    }

    public final Instant e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2)) {
            return false;
        }
        tf2 tf2Var = (tf2) obj;
        return zq3.c(this.a, tf2Var.a) && zq3.c(this.b, tf2Var.b) && zq3.c(this.c, tf2Var.c) && zq3.c(this.d, tf2Var.d) && zq3.c(this.e, tf2Var.e) && zq3.c(this.f, tf2Var.f) && zq3.c(this.g, tf2Var.g) && zq3.c(this.h, tf2Var.h) && zq3.c(this.i, tf2Var.i) && zq3.c(this.j, tf2Var.j) && this.k == tf2Var.k && zq3.c(this.l, tf2Var.l) && zq3.c(this.m, tf2Var.m) && zq3.c(this.n, tf2Var.n) && zq3.c(this.o, tf2Var.o);
    }

    public final Instant f() {
        return this.g;
    }

    public final c g() {
        return this.o;
    }

    public final String h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        a aVar = this.c;
        int hashCode2 = (((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Instant instant = this.g;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.h;
        int hashCode4 = (((((((((((hashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
        b bVar = this.n;
        int hashCode5 = (hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.o;
        return hashCode5 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String i() {
        return this.i;
    }

    public final String j() {
        return this.d;
    }

    public final Tone k() {
        return this.k;
    }

    public final String l() {
        return this.j;
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
        return "FilterInterestArticleAsset(__typename=" + this.a + ", uri=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", url=" + this.e + ", kicker=" + this.f + ", lastModified=" + this.g + ", lastMajorModification=" + this.h + ", sourceId=" + this.i + ", type=" + this.j + ", tone=" + this.k + ", slug=" + this.l + ", desk=" + this.m + ", hybridBody=" + this.n + ", promotionalMedia=" + this.o + ")";
    }
}
