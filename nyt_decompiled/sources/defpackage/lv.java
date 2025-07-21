package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Platform;
import type.Sensitivity;

/* loaded from: classes3.dex */
public final class lv implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final h f;
    private final List g;
    private final f h;
    private final String i;
    private final String j;
    private final String k;
    private final List l;
    private final d m;
    private final e n;
    private final Instant o;
    private final Instant p;
    private final String q;
    private final String r;
    private final i s;
    private final b t;
    private final List u;
    private final String v;
    private final j w;
    private final l x;

    public static final class a {
        private final String a;
        private final kg8 b;

        public a(String str, kg8 kg8Var) {
            zq3.h(str, "__typename");
            zq3.h(kg8Var, "targetingParam");
            this.a = str;
            this.b = kg8Var;
        }

        public final kg8 a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "AdTargetingParam(__typename=" + this.a + ", targetingParam=" + this.b + ")";
        }
    }

    public static final class b {
        private final Sensitivity a;

        public b(Sensitivity sensitivity) {
            zq3.h(sensitivity, "sensitivity");
            this.a = sensitivity;
        }

        public final Sensitivity a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "AdvertisingProperties(sensitivity=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Byline(renderedRepresentation=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final uo0 b;

        public d(String str, uo0 uo0Var) {
            zq3.h(str, "__typename");
            zq3.h(uo0Var, "column");
            this.a = str;
            this.b = uo0Var;
        }

        public final uo0 a() {
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
            return "Column(__typename=" + this.a + ", column=" + this.b + ")";
        }
    }

    public static final class e {
        private final CommentStatus a;

        public e(CommentStatus commentStatus) {
            zq3.h(commentStatus, "status");
            this.a = commentStatus;
        }

        public final CommentStatus a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "CommentProperties(status=" + this.a + ")";
        }
    }

    public static final class f {
        private final String a;
        private final String b;

        public f(String str, String str2) {
            zq3.h(str, "default");
            zq3.h(str2, "seo");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Headline(default=" + this.a + ", seo=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final kf3 b;

        public g(String str, kf3 kf3Var) {
            zq3.h(str, "__typename");
            zq3.h(kf3Var, "imageAsset");
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Image(__typename=" + this.a + ", imageAsset=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final g f;

        public h(String str, String str2, String str3, String str4, String str5, g gVar) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str2, "title");
            zq3.h(str3, "subtitle");
            zq3.h(str4, "summary");
            zq3.h(str5, "itunesUrl");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = gVar;
        }

        public final g a() {
            return this.f;
        }

        public final String b() {
            return this.e;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c) && zq3.c(this.d, hVar.d) && zq3.c(this.e, hVar.e) && zq3.c(this.f, hVar.f);
        }

        public final String f() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
            g gVar = this.f;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "PodcastSeries(name=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", summary=" + this.d + ", itunesUrl=" + this.e + ", image=" + this.f + ")";
        }
    }

    public static final class i {
        private final String a;
        private final kf3 b;

        public i(String str, kf3 kf3Var) {
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
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b);
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

    public static final class j {
        private final String a;
        private final qt b;

        public j(String str, qt qtVar) {
            zq3.h(str, "__typename");
            zq3.h(qtVar, "assetSection");
            this.a = str;
            this.b = qtVar;
        }

        public final qt a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Section(__typename=" + this.a + ", assetSection=" + this.b + ")";
        }
    }

    public static final class k {
        private final String a;
        private final Platform b;

        public k(String str, Platform platform) {
            zq3.h(str, "url");
            zq3.h(platform, "platform");
            this.a = str;
            this.b = platform;
        }

        public final Platform a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return zq3.c(this.a, kVar.a) && this.b == kVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SubscribeUrl(url=" + this.a + ", platform=" + this.b + ")";
        }
    }

    public static final class l {
        private final String a;
        private final String b;

        public l(String str, String str2) {
            zq3.h(str, "displayName");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Subsection(displayName=" + this.a + ", name=" + this.b + ")";
        }
    }

    public lv(String str, String str2, String str3, String str4, int i2, h hVar, List list, f fVar, String str5, String str6, String str7, List list2, d dVar, e eVar, Instant instant, Instant instant2, String str8, String str9, i iVar, b bVar, List list3, String str10, j jVar, l lVar) {
        zq3.h(str, "uri");
        zq3.h(str2, "credit");
        zq3.h(str3, "fileName");
        zq3.h(str4, "fileUrl");
        zq3.h(list, "subscribeUrls");
        zq3.h(str5, "summary");
        zq3.h(str6, "url");
        zq3.h(str7, "kicker");
        zq3.h(list2, "bylines");
        zq3.h(eVar, "commentProperties");
        zq3.h(str8, "sourceId");
        zq3.h(str9, TransferTable.COLUMN_TYPE);
        zq3.h(str10, "slug");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i2;
        this.f = hVar;
        this.g = list;
        this.h = fVar;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = list2;
        this.m = dVar;
        this.n = eVar;
        this.o = instant;
        this.p = instant2;
        this.q = str8;
        this.r = str9;
        this.s = iVar;
        this.t = bVar;
        this.u = list3;
        this.v = str10;
        this.w = jVar;
        this.x = lVar;
    }

    public final List a() {
        return this.u;
    }

    public final b b() {
        return this.t;
    }

    public final List c() {
        return this.l;
    }

    public final d d() {
        return this.m;
    }

    public final e e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv)) {
            return false;
        }
        lv lvVar = (lv) obj;
        return zq3.c(this.a, lvVar.a) && zq3.c(this.b, lvVar.b) && zq3.c(this.c, lvVar.c) && zq3.c(this.d, lvVar.d) && this.e == lvVar.e && zq3.c(this.f, lvVar.f) && zq3.c(this.g, lvVar.g) && zq3.c(this.h, lvVar.h) && zq3.c(this.i, lvVar.i) && zq3.c(this.j, lvVar.j) && zq3.c(this.k, lvVar.k) && zq3.c(this.l, lvVar.l) && zq3.c(this.m, lvVar.m) && zq3.c(this.n, lvVar.n) && zq3.c(this.o, lvVar.o) && zq3.c(this.p, lvVar.p) && zq3.c(this.q, lvVar.q) && zq3.c(this.r, lvVar.r) && zq3.c(this.s, lvVar.s) && zq3.c(this.t, lvVar.t) && zq3.c(this.u, lvVar.u) && zq3.c(this.v, lvVar.v) && zq3.c(this.w, lvVar.w) && zq3.c(this.x, lvVar.x);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31;
        h hVar = this.f;
        int hashCode2 = (((hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.g.hashCode()) * 31;
        f fVar = this.h;
        int hashCode3 = (((((((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        d dVar = this.m;
        int hashCode4 = (((hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.n.hashCode()) * 31;
        Instant instant = this.o;
        int hashCode5 = (hashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.p;
        int hashCode6 = (((((hashCode5 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        i iVar = this.s;
        int hashCode7 = (hashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        b bVar = this.t;
        int hashCode8 = (hashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.u;
        int hashCode9 = (((hashCode8 + (list == null ? 0 : list.hashCode())) * 31) + this.v.hashCode()) * 31;
        j jVar = this.w;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l lVar = this.x;
        return hashCode10 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final f i() {
        return this.h;
    }

    public final String j() {
        return this.k;
    }

    public final Instant k() {
        return this.p;
    }

    public final Instant l() {
        return this.o;
    }

    public final int m() {
        return this.e;
    }

    public final h n() {
        return this.f;
    }

    public final i o() {
        return this.s;
    }

    public final j p() {
        return this.w;
    }

    public final String q() {
        return this.v;
    }

    public final String r() {
        return this.q;
    }

    public final List s() {
        return this.g;
    }

    public final l t() {
        return this.x;
    }

    public String toString() {
        return "AudioAsset(uri=" + this.a + ", credit=" + this.b + ", fileName=" + this.c + ", fileUrl=" + this.d + ", length=" + this.e + ", podcastSeries=" + this.f + ", subscribeUrls=" + this.g + ", headline=" + this.h + ", summary=" + this.i + ", url=" + this.j + ", kicker=" + this.k + ", bylines=" + this.l + ", column=" + this.m + ", commentProperties=" + this.n + ", lastModified=" + this.o + ", lastMajorModification=" + this.p + ", sourceId=" + this.q + ", type=" + this.r + ", promotionalMedia=" + this.s + ", advertisingProperties=" + this.t + ", adTargetingParams=" + this.u + ", slug=" + this.v + ", section=" + this.w + ", subsection=" + this.x + ")";
    }

    public final String u() {
        return this.i;
    }

    public final String v() {
        return this.r;
    }

    public final String w() {
        return this.a;
    }

    public final String x() {
        return this.j;
    }
}
