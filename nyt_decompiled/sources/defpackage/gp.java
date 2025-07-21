package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Sensitivity;

/* loaded from: classes3.dex */
public final class gp implements rp2 {
    private final String a;
    private final String b;
    private final f c;
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
    private final h n;
    private final b o;
    private final List p;
    private final String q;
    private final String r;
    private final i s;
    private final j t;
    private final g u;

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
        private final String c;

        public f(String str, String str2, String str3) {
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
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b) && zq3.c(this.c, fVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Headline(__typename=" + this.a + ", default=" + this.b + ", seo=" + this.c + ")";
        }
    }

    public static final class g {
        private final String a;
        private final Instant b;

        public g(String str, Instant instant) {
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
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
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

    public static final class h {
        private final String a;
        private final n59 b;
        private final ho3 c;
        private final kf3 d;
        private final uu7 e;
        private final gz1 f;

        public h(String str, n59 n59Var, ho3 ho3Var, kf3 kf3Var, uu7 uu7Var, gz1 gz1Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = n59Var;
            this.c = ho3Var;
            this.d = kf3Var;
            this.e = uu7Var;
            this.f = gz1Var;
        }

        public final gz1 a() {
            return this.f;
        }

        public final kf3 b() {
            return this.d;
        }

        public final ho3 c() {
            return this.c;
        }

        public final uu7 d() {
            return this.e;
        }

        public final n59 e() {
            return this.b;
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
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            n59 n59Var = this.b;
            int hashCode2 = (hashCode + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            ho3 ho3Var = this.c;
            int hashCode3 = (hashCode2 + (ho3Var == null ? 0 : ho3Var.hashCode())) * 31;
            kf3 kf3Var = this.d;
            int hashCode4 = (hashCode3 + (kf3Var == null ? 0 : kf3Var.hashCode())) * 31;
            uu7 uu7Var = this.e;
            int hashCode5 = (hashCode4 + (uu7Var == null ? 0 : uu7Var.hashCode())) * 31;
            gz1 gz1Var = this.f;
            return hashCode5 + (gz1Var != null ? gz1Var.hashCode() : 0);
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", videoAsset=" + this.b + ", interactiveAsset=" + this.c + ", imageAsset=" + this.d + ", slideshowAsset=" + this.e + ", embeddedInteractiveAsset=" + this.f + ")";
        }
    }

    public static final class i {
        private final String a;
        private final qt b;

        public i(String str, qt qtVar) {
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
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Section(__typename=" + this.a + ", assetSection=" + this.b + ")";
        }
    }

    public static final class j {
        private final String a;
        private final String b;
        private final String c;

        public j(String str, String str2, String str3) {
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
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return zq3.c(this.a, jVar.a) && zq3.c(this.b, jVar.b) && zq3.c(this.c, jVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Subsection(__typename=" + this.a + ", displayName=" + this.b + ", name=" + this.c + ")";
        }
    }

    public gp(String str, String str2, f fVar, String str3, String str4, String str5, List list, d dVar, e eVar, Instant instant, Instant instant2, String str6, String str7, h hVar, b bVar, List list2, String str8, String str9, i iVar, j jVar, g gVar) {
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
        zq3.h(str9, "desk");
        this.a = str;
        this.b = str2;
        this.c = fVar;
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
        this.n = hVar;
        this.o = bVar;
        this.p = list2;
        this.q = str8;
        this.r = str9;
        this.s = iVar;
        this.t = jVar;
        this.u = gVar;
    }

    public final List a() {
        return this.p;
    }

    public final b b() {
        return this.o;
    }

    public final List c() {
        return this.g;
    }

    public final d d() {
        return this.h;
    }

    public final e e() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp)) {
            return false;
        }
        gp gpVar = (gp) obj;
        return zq3.c(this.a, gpVar.a) && zq3.c(this.b, gpVar.b) && zq3.c(this.c, gpVar.c) && zq3.c(this.d, gpVar.d) && zq3.c(this.e, gpVar.e) && zq3.c(this.f, gpVar.f) && zq3.c(this.g, gpVar.g) && zq3.c(this.h, gpVar.h) && zq3.c(this.i, gpVar.i) && zq3.c(this.j, gpVar.j) && zq3.c(this.k, gpVar.k) && zq3.c(this.l, gpVar.l) && zq3.c(this.m, gpVar.m) && zq3.c(this.n, gpVar.n) && zq3.c(this.o, gpVar.o) && zq3.c(this.p, gpVar.p) && zq3.c(this.q, gpVar.q) && zq3.c(this.r, gpVar.r) && zq3.c(this.s, gpVar.s) && zq3.c(this.t, gpVar.t) && zq3.c(this.u, gpVar.u);
    }

    public final String f() {
        return this.r;
    }

    public final f g() {
        return this.c;
    }

    public final g h() {
        return this.u;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        f fVar = this.c;
        int hashCode2 = (((((((((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        d dVar = this.h;
        int hashCode3 = (((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.i.hashCode()) * 31;
        Instant instant = this.j;
        int hashCode4 = (hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.k;
        int hashCode5 = (((((hashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31;
        h hVar = this.n;
        int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        b bVar = this.o;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.p;
        int hashCode8 = (((((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31;
        i iVar = this.s;
        int hashCode9 = (hashCode8 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.t;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        g gVar = this.u;
        return hashCode10 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String i() {
        return this.f;
    }

    public final Instant j() {
        return this.k;
    }

    public final Instant k() {
        return this.j;
    }

    public final h l() {
        return this.n;
    }

    public final i m() {
        return this.s;
    }

    public final String n() {
        return this.q;
    }

    public final String o() {
        return this.l;
    }

    public final j p() {
        return this.t;
    }

    public final String q() {
        return this.d;
    }

    public final String r() {
        return this.m;
    }

    public final String s() {
        return this.b;
    }

    public final String t() {
        return this.e;
    }

    public String toString() {
        return "ArticleAsset(__typename=" + this.a + ", uri=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", url=" + this.e + ", kicker=" + this.f + ", bylines=" + this.g + ", column=" + this.h + ", commentProperties=" + this.i + ", lastModified=" + this.j + ", lastMajorModification=" + this.k + ", sourceId=" + this.l + ", type=" + this.m + ", promotionalMedia=" + this.n + ", advertisingProperties=" + this.o + ", adTargetingParams=" + this.p + ", slug=" + this.q + ", desk=" + this.r + ", section=" + this.s + ", subsection=" + this.t + ", hybridBody=" + this.u + ")";
    }

    public final String u() {
        return this.a;
    }
}
