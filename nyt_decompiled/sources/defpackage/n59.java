package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Sensitivity;
import type.VideoProductionType;

/* loaded from: classes3.dex */
public final class n59 implements rp2 {
    private final Integer A;
    private final VideoProductionType B;
    private final String C;
    private final String a;
    private final String b;
    private final g c;
    private final String d;
    private final String e;
    private final String f;
    private final List g;
    private final d h;
    private final e i;
    private final Instant j;
    private final Instant k;
    private final String l;
    private final String m;
    private final i n;
    private final b o;
    private final List p;
    private final String q;
    private final k r;
    private final l s;
    private final List t;
    private final boolean u;
    private final boolean v;
    private final h w;
    private final String x;
    private final String y;
    private final List z;

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
        private final String a;
        private final Sensitivity b;

        public b(String str, Sensitivity sensitivity) {
            zq3.h(str, "__typename");
            zq3.h(sensitivity, "sensitivity");
            this.a = str;
            this.b = sensitivity;
        }

        public final Sensitivity a() {
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
            return zq3.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "AdvertisingProperties(__typename=" + this.a + ", sensitivity=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            zq3.h(str, "__typename");
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Byline(__typename=" + this.a + ", renderedRepresentation=" + this.b + ")";
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
        private final String a;
        private final CommentStatus b;

        public e(String str, CommentStatus commentStatus) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && this.b == eVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "CommentProperties(__typename=" + this.a + ", status=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final String b;

        public f(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "default");
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
            return "Headline1(__typename=" + this.a + ", default=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final String b;
        private final String c;

        public g(String str, String str2, String str3) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Headline(__typename=" + this.a + ", default=" + this.b + ", seo=" + this.c + ")";
        }
    }

    public static final class h {
        private final String a;
        private final String b;
        private final String c;
        private final f d;

        public h(String str, String str2, String str3, f fVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "sourceId");
            zq3.h(str3, "uri");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = fVar;
        }

        public final f a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b) && zq3.c(this.c, hVar.c) && zq3.c(this.d, hVar.d);
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            f fVar = this.d;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Playlist(__typename=" + this.a + ", sourceId=" + this.b + ", uri=" + this.c + ", headline=" + this.d + ")";
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
        private final Integer b;
        private final String c;
        private final String d;

        public j(String str, Integer num, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(str3, TransferTable.COLUMN_TYPE);
            this.a = str;
            this.b = num;
            this.c = str2;
            this.d = str3;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final Integer c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && zq3.c(this.c, jVar.c) && zq3.c(this.d, jVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", width=" + this.b + ", url=" + this.c + ", type=" + this.d + ")";
        }
    }

    public static final class k {
        private final String a;
        private final qt b;

        public k(String str, qt qtVar) {
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
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return zq3.c(this.a, kVar.a) && zq3.c(this.b, kVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Section(__typename=" + this.a + ", assetSection=" + this.b + ")";
        }
    }

    public static final class l {
        private final String a;
        private final String b;
        private final String c;

        public l(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, "displayName");
            zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
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
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return zq3.c(this.a, lVar.a) && zq3.c(this.b, lVar.b) && zq3.c(this.c, lVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Subsection(__typename=" + this.a + ", displayName=" + this.b + ", name=" + this.c + ")";
        }
    }

    public n59(String str, String str2, g gVar, String str3, String str4, String str5, List list, d dVar, e eVar, Instant instant, Instant instant2, String str6, String str7, i iVar, b bVar, List list2, String str8, k kVar, l lVar, List list3, boolean z, boolean z2, h hVar, String str9, String str10, List list4, Integer num, VideoProductionType videoProductionType, String str11) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "summary");
        zq3.h(str4, "url");
        zq3.h(str5, "kicker");
        zq3.h(list, "bylines");
        zq3.h(eVar, "commentProperties");
        zq3.h(str6, "sourceId");
        zq3.h(str7, TransferTable.COLUMN_TYPE);
        zq3.h(str8, "slug");
        zq3.h(list3, "liveUrls");
        zq3.h(str9, "contentSeries");
        zq3.h(str10, "aspectRatio");
        zq3.h(list4, "renditions");
        zq3.h(videoProductionType, "productionType");
        zq3.h(str11, "transcript");
        this.a = str;
        this.b = str2;
        this.c = gVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = dVar;
        this.i = eVar;
        this.j = instant;
        this.k = instant2;
        this.l = str6;
        this.m = str7;
        this.n = iVar;
        this.o = bVar;
        this.p = list2;
        this.q = str8;
        this.r = kVar;
        this.s = lVar;
        this.t = list3;
        this.u = z;
        this.v = z2;
        this.w = hVar;
        this.x = str9;
        this.y = str10;
        this.z = list4;
        this.A = num;
        this.B = videoProductionType;
        this.C = str11;
    }

    public final String A() {
        return this.a;
    }

    public final boolean B() {
        return this.u;
    }

    public final boolean C() {
        return this.v;
    }

    public final List a() {
        return this.p;
    }

    public final b b() {
        return this.o;
    }

    public final String c() {
        return this.y;
    }

    public final List d() {
        return this.g;
    }

    public final d e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n59)) {
            return false;
        }
        n59 n59Var = (n59) obj;
        return zq3.c(this.a, n59Var.a) && zq3.c(this.b, n59Var.b) && zq3.c(this.c, n59Var.c) && zq3.c(this.d, n59Var.d) && zq3.c(this.e, n59Var.e) && zq3.c(this.f, n59Var.f) && zq3.c(this.g, n59Var.g) && zq3.c(this.h, n59Var.h) && zq3.c(this.i, n59Var.i) && zq3.c(this.j, n59Var.j) && zq3.c(this.k, n59Var.k) && zq3.c(this.l, n59Var.l) && zq3.c(this.m, n59Var.m) && zq3.c(this.n, n59Var.n) && zq3.c(this.o, n59Var.o) && zq3.c(this.p, n59Var.p) && zq3.c(this.q, n59Var.q) && zq3.c(this.r, n59Var.r) && zq3.c(this.s, n59Var.s) && zq3.c(this.t, n59Var.t) && this.u == n59Var.u && this.v == n59Var.v && zq3.c(this.w, n59Var.w) && zq3.c(this.x, n59Var.x) && zq3.c(this.y, n59Var.y) && zq3.c(this.z, n59Var.z) && zq3.c(this.A, n59Var.A) && this.B == n59Var.B && zq3.c(this.C, n59Var.C);
    }

    public final e f() {
        return this.i;
    }

    public final String g() {
        return this.x;
    }

    public final Integer h() {
        return this.A;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        g gVar = this.c;
        int hashCode2 = (((((((((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        d dVar = this.h;
        int hashCode3 = (((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.i.hashCode()) * 31;
        Instant instant = this.j;
        int hashCode4 = (hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.k;
        int hashCode5 = (((((hashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
        i iVar = this.n;
        int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        b bVar = this.o;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.p;
        int hashCode8 = (((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.q.hashCode()) * 31;
        k kVar = this.r;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.s;
        int hashCode10 = (((((((hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31) + this.t.hashCode()) * 31) + Boolean.hashCode(this.u)) * 31) + Boolean.hashCode(this.v)) * 31;
        h hVar = this.w;
        int hashCode11 = (((((((hashCode10 + (hVar == null ? 0 : hVar.hashCode())) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31;
        Integer num = this.A;
        return ((((hashCode11 + (num != null ? num.hashCode() : 0)) * 31) + this.B.hashCode()) * 31) + this.C.hashCode();
    }

    public final g i() {
        return this.c;
    }

    public final String j() {
        return this.f;
    }

    public final Instant k() {
        return this.k;
    }

    public final Instant l() {
        return this.j;
    }

    public final List m() {
        return this.t;
    }

    public final h n() {
        return this.w;
    }

    public final VideoProductionType o() {
        return this.B;
    }

    public final i p() {
        return this.n;
    }

    public final List q() {
        return this.z;
    }

    public final k r() {
        return this.r;
    }

    public final String s() {
        return this.q;
    }

    public final String t() {
        return this.l;
    }

    public String toString() {
        return "VideoAsset(__typename=" + this.a + ", uri=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", url=" + this.e + ", kicker=" + this.f + ", bylines=" + this.g + ", column=" + this.h + ", commentProperties=" + this.i + ", lastModified=" + this.j + ", lastMajorModification=" + this.k + ", sourceId=" + this.l + ", type=" + this.m + ", promotionalMedia=" + this.n + ", advertisingProperties=" + this.o + ", adTargetingParams=" + this.p + ", slug=" + this.q + ", section=" + this.r + ", subsection=" + this.s + ", liveUrls=" + this.t + ", is360=" + this.u + ", isLive=" + this.v + ", playlist=" + this.w + ", contentSeries=" + this.x + ", aspectRatio=" + this.y + ", renditions=" + this.z + ", duration=" + this.A + ", productionType=" + this.B + ", transcript=" + this.C + ")";
    }

    public final l u() {
        return this.s;
    }

    public final String v() {
        return this.d;
    }

    public final String w() {
        return this.C;
    }

    public final String x() {
        return this.m;
    }

    public final String y() {
        return this.b;
    }

    public final String z() {
        return this.e;
    }
}
