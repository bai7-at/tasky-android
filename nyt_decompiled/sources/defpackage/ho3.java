package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Sensitivity;

/* loaded from: classes3.dex */
public final class ho3 implements rp2 {
    private final String a;
    private final f b;
    private final String c;
    private final String d;
    private final String e;
    private final List f;
    private final d g;
    private final e h;
    private final Instant i;
    private final Instant j;
    private final String k;
    private final String l;
    private final g m;
    private final b n;
    private final List o;
    private final String p;
    private final h q;
    private final i r;

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
        private final n59 b;
        private final kf3 c;
        private final uu7 d;

        public g(String str, n59 n59Var, kf3 kf3Var, uu7 uu7Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = n59Var;
            this.c = kf3Var;
            this.d = uu7Var;
        }

        public final kf3 a() {
            return this.c;
        }

        public final uu7 b() {
            return this.d;
        }

        public final n59 c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b) && zq3.c(this.c, gVar.c) && zq3.c(this.d, gVar.d);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            n59 n59Var = this.b;
            int hashCode2 = (hashCode + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            kf3 kf3Var = this.c;
            int hashCode3 = (hashCode2 + (kf3Var == null ? 0 : kf3Var.hashCode())) * 31;
            uu7 uu7Var = this.d;
            return hashCode3 + (uu7Var != null ? uu7Var.hashCode() : 0);
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", videoAsset=" + this.b + ", imageAsset=" + this.c + ", slideshowAsset=" + this.d + ")";
        }
    }

    public static final class h {
        private final String a;
        private final qt b;

        public h(String str, qt qtVar) {
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
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return zq3.c(this.a, hVar.a) && zq3.c(this.b, hVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Section(__typename=" + this.a + ", assetSection=" + this.b + ")";
        }
    }

    public static final class i {
        private final String a;
        private final String b;

        public i(String str, String str2) {
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
            return "Subsection(displayName=" + this.a + ", name=" + this.b + ")";
        }
    }

    public ho3(String str, f fVar, String str2, String str3, String str4, List list, d dVar, e eVar, Instant instant, Instant instant2, String str5, String str6, g gVar, b bVar, List list2, String str7, h hVar, i iVar) {
        zq3.h(str, "uri");
        zq3.h(str2, "summary");
        zq3.h(str3, "url");
        zq3.h(str4, "kicker");
        zq3.h(list, "bylines");
        zq3.h(eVar, "commentProperties");
        zq3.h(str5, "sourceId");
        zq3.h(str6, TransferTable.COLUMN_TYPE);
        zq3.h(str7, "slug");
        this.a = str;
        this.b = fVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = dVar;
        this.h = eVar;
        this.i = instant;
        this.j = instant2;
        this.k = str5;
        this.l = str6;
        this.m = gVar;
        this.n = bVar;
        this.o = list2;
        this.p = str7;
        this.q = hVar;
        this.r = iVar;
    }

    public final List a() {
        return this.o;
    }

    public final b b() {
        return this.n;
    }

    public final List c() {
        return this.f;
    }

    public final d d() {
        return this.g;
    }

    public final e e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho3)) {
            return false;
        }
        ho3 ho3Var = (ho3) obj;
        return zq3.c(this.a, ho3Var.a) && zq3.c(this.b, ho3Var.b) && zq3.c(this.c, ho3Var.c) && zq3.c(this.d, ho3Var.d) && zq3.c(this.e, ho3Var.e) && zq3.c(this.f, ho3Var.f) && zq3.c(this.g, ho3Var.g) && zq3.c(this.h, ho3Var.h) && zq3.c(this.i, ho3Var.i) && zq3.c(this.j, ho3Var.j) && zq3.c(this.k, ho3Var.k) && zq3.c(this.l, ho3Var.l) && zq3.c(this.m, ho3Var.m) && zq3.c(this.n, ho3Var.n) && zq3.c(this.o, ho3Var.o) && zq3.c(this.p, ho3Var.p) && zq3.c(this.q, ho3Var.q) && zq3.c(this.r, ho3Var.r);
    }

    public final f f() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final Instant h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f fVar = this.b;
        int hashCode2 = (((((((((hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        d dVar = this.g;
        int hashCode3 = (((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.h.hashCode()) * 31;
        Instant instant = this.i;
        int hashCode4 = (hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.j;
        int hashCode5 = (((((hashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        g gVar = this.m;
        int hashCode6 = (hashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        b bVar = this.n;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.o;
        int hashCode8 = (((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.p.hashCode()) * 31;
        h hVar = this.q;
        int hashCode9 = (hashCode8 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.r;
        return hashCode9 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final Instant i() {
        return this.i;
    }

    public final g j() {
        return this.m;
    }

    public final h k() {
        return this.q;
    }

    public final String l() {
        return this.p;
    }

    public final String m() {
        return this.k;
    }

    public final i n() {
        return this.r;
    }

    public final String o() {
        return this.c;
    }

    public final String p() {
        return this.l;
    }

    public final String q() {
        return this.a;
    }

    public final String r() {
        return this.d;
    }

    public String toString() {
        return "InteractiveAsset(uri=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ", url=" + this.d + ", kicker=" + this.e + ", bylines=" + this.f + ", column=" + this.g + ", commentProperties=" + this.h + ", lastModified=" + this.i + ", lastMajorModification=" + this.j + ", sourceId=" + this.k + ", type=" + this.l + ", promotionalMedia=" + this.m + ", advertisingProperties=" + this.n + ", adTargetingParams=" + this.o + ", slug=" + this.p + ", section=" + this.q + ", subsection=" + this.r + ")";
    }
}
