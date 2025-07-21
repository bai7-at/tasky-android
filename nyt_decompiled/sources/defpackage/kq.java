package defpackage;

import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Tone;

/* loaded from: classes3.dex */
public final class kq implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final a e;
    private final Instant f;
    private final b g;
    private final String h;
    private final Instant i;
    private final d j;
    private final Tone k;
    private final Instant l;
    private final c m;

    public static final class a {
        private final String a;
        private final CommentStatus b;

        public a(String str, CommentStatus commentStatus) {
            zq3.h(str, "__typename");
            zq3.h(commentStatus, "status");
            this.a = str;
            this.b = commentStatus;
        }

        public final CommentStatus a() {
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
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "CommentProperties(__typename=" + this.a + ", status=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "headline");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            return "HeadlineInfo(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final Instant b;

        public c(String str, Instant instant) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
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

    public static final class d {
        private final String a;
        private final s56 b;

        public d(String str, s56 s56Var) {
            zq3.h(str, "__typename");
            zq3.h(s56Var, "promotionalMediaFields");
            this.a = str;
            this.b = s56Var;
        }

        public final s56 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", promotionalMediaFields=" + this.b + ")";
        }
    }

    public kq(String str, String str2, String str3, String str4, a aVar, Instant instant, b bVar, String str5, Instant instant2, d dVar, Tone tone, Instant instant3, c cVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "assetID");
        zq3.h(str3, "uri");
        zq3.h(str4, "url");
        zq3.h(aVar, "commentProperties");
        zq3.h(str5, "summary");
        zq3.h(tone, "tone");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = instant;
        this.g = bVar;
        this.h = str5;
        this.i = instant2;
        this.j = dVar;
        this.k = tone;
        this.l = instant3;
        this.m = cVar;
    }

    public final String a() {
        return this.b;
    }

    public final a b() {
        return this.e;
    }

    public final Instant c() {
        return this.f;
    }

    public final b d() {
        return this.g;
    }

    public final c e() {
        return this.m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq)) {
            return false;
        }
        kq kqVar = (kq) obj;
        return zq3.c(this.a, kqVar.a) && zq3.c(this.b, kqVar.b) && zq3.c(this.c, kqVar.c) && zq3.c(this.d, kqVar.d) && zq3.c(this.e, kqVar.e) && zq3.c(this.f, kqVar.f) && zq3.c(this.g, kqVar.g) && zq3.c(this.h, kqVar.h) && zq3.c(this.i, kqVar.i) && zq3.c(this.j, kqVar.j) && this.k == kqVar.k && zq3.c(this.l, kqVar.l) && zq3.c(this.m, kqVar.m);
    }

    public final Instant f() {
        return this.l;
    }

    public final Instant g() {
        return this.i;
    }

    public final d h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Instant instant = this.f;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        b bVar = this.g;
        int hashCode3 = (((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.h.hashCode()) * 31;
        Instant instant2 = this.i;
        int hashCode4 = (hashCode3 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        d dVar = this.j;
        int hashCode5 = (((hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.k.hashCode()) * 31;
        Instant instant3 = this.l;
        int hashCode6 = (hashCode5 + (instant3 == null ? 0 : instant3.hashCode())) * 31;
        c cVar = this.m;
        return hashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String i() {
        return this.h;
    }

    public final Tone j() {
        return this.k;
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.a;
    }

    public String toString() {
        return "ArticleFields(__typename=" + this.a + ", assetID=" + this.b + ", uri=" + this.c + ", url=" + this.d + ", commentProperties=" + this.e + ", fingerprint=" + this.f + ", headlineInfo=" + this.g + ", summary=" + this.h + ", lastUpdatedDate=" + this.i + ", promotionalMedia=" + this.j + ", tone=" + this.k + ", lastModified=" + this.l + ", hybridBody=" + this.m + ")";
    }
}
