package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import org.threeten.bp.Instant;
import type.CommentStatus;
import type.Sensitivity;

/* loaded from: classes3.dex */
public final class uu7 implements rp2 {
    private final String a;
    private final g b;
    private final String c;
    private final String d;
    private final String e;
    private final List f;
    private final e g;
    private final f h;
    private final Instant i;
    private final Instant j;
    private final String k;
    private final String l;
    private final i m;
    private final b n;
    private final List o;
    private final String p;
    private final j q;
    private final List r;
    private final l s;

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

        public d(String str) {
            zq3.h(str, "text");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Caption(text=" + this.a + ")";
        }
    }

    public static final class e {
        private final String a;
        private final uo0 b;

        public e(String str, uo0 uo0Var) {
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Column(__typename=" + this.a + ", column=" + this.b + ")";
        }
    }

    public static final class f {
        private final CommentStatus a;

        public f(CommentStatus commentStatus) {
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
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "CommentProperties(status=" + this.a + ")";
        }
    }

    public static final class g {
        private final String a;
        private final String b;

        public g(String str, String str2) {
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
            return "Headline(default=" + this.a + ", seo=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final kf3 b;

        public h(String str, kf3 kf3Var) {
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
            return "Image(__typename=" + this.a + ", imageAsset=" + this.b + ")";
        }
    }

    public static final class i {
        private final String a;
        private final n59 b;
        private final kf3 c;

        public i(String str, n59 n59Var, kf3 kf3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = n59Var;
            this.c = kf3Var;
        }

        public final kf3 a() {
            return this.c;
        }

        public final n59 b() {
            return this.b;
        }

        public final String c() {
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
            return zq3.c(this.a, iVar.a) && zq3.c(this.b, iVar.b) && zq3.c(this.c, iVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            n59 n59Var = this.b;
            int hashCode2 = (hashCode + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            kf3 kf3Var = this.c;
            return hashCode2 + (kf3Var != null ? kf3Var.hashCode() : 0);
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", videoAsset=" + this.b + ", imageAsset=" + this.c + ")";
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
        private final d a;
        private final h b;

        public k(d dVar, h hVar) {
            this.a = dVar;
            this.b = hVar;
        }

        public final d a() {
            return this.a;
        }

        public final h b() {
            return this.b;
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
            d dVar = this.a;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            h hVar = this.b;
            return hashCode + (hVar != null ? hVar.hashCode() : 0);
        }

        public String toString() {
            return "Slide(caption=" + this.a + ", image=" + this.b + ")";
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

    public uu7(String str, g gVar, String str2, String str3, String str4, List list, e eVar, f fVar, Instant instant, Instant instant2, String str5, String str6, i iVar, b bVar, List list2, String str7, j jVar, List list3, l lVar) {
        zq3.h(str, "uri");
        zq3.h(str2, "summary");
        zq3.h(str3, "url");
        zq3.h(str4, "kicker");
        zq3.h(list, "bylines");
        zq3.h(fVar, "commentProperties");
        zq3.h(str5, "sourceId");
        zq3.h(str6, TransferTable.COLUMN_TYPE);
        zq3.h(str7, "slug");
        zq3.h(list3, "slides");
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
        this.g = eVar;
        this.h = fVar;
        this.i = instant;
        this.j = instant2;
        this.k = str5;
        this.l = str6;
        this.m = iVar;
        this.n = bVar;
        this.o = list2;
        this.p = str7;
        this.q = jVar;
        this.r = list3;
        this.s = lVar;
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

    public final e d() {
        return this.g;
    }

    public final f e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu7)) {
            return false;
        }
        uu7 uu7Var = (uu7) obj;
        return zq3.c(this.a, uu7Var.a) && zq3.c(this.b, uu7Var.b) && zq3.c(this.c, uu7Var.c) && zq3.c(this.d, uu7Var.d) && zq3.c(this.e, uu7Var.e) && zq3.c(this.f, uu7Var.f) && zq3.c(this.g, uu7Var.g) && zq3.c(this.h, uu7Var.h) && zq3.c(this.i, uu7Var.i) && zq3.c(this.j, uu7Var.j) && zq3.c(this.k, uu7Var.k) && zq3.c(this.l, uu7Var.l) && zq3.c(this.m, uu7Var.m) && zq3.c(this.n, uu7Var.n) && zq3.c(this.o, uu7Var.o) && zq3.c(this.p, uu7Var.p) && zq3.c(this.q, uu7Var.q) && zq3.c(this.r, uu7Var.r) && zq3.c(this.s, uu7Var.s);
    }

    public final g f() {
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
        g gVar = this.b;
        int hashCode2 = (((((((((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        e eVar = this.g;
        int hashCode3 = (((hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.h.hashCode()) * 31;
        Instant instant = this.i;
        int hashCode4 = (hashCode3 + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.j;
        int hashCode5 = (((((hashCode4 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31;
        i iVar = this.m;
        int hashCode6 = (hashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        b bVar = this.n;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.o;
        int hashCode8 = (((hashCode7 + (list == null ? 0 : list.hashCode())) * 31) + this.p.hashCode()) * 31;
        j jVar = this.q;
        int hashCode9 = (((hashCode8 + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.r.hashCode()) * 31;
        l lVar = this.s;
        return hashCode9 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final Instant i() {
        return this.i;
    }

    public final i j() {
        return this.m;
    }

    public final j k() {
        return this.q;
    }

    public final List l() {
        return this.r;
    }

    public final String m() {
        return this.p;
    }

    public final String n() {
        return this.k;
    }

    public final l o() {
        return this.s;
    }

    public final String p() {
        return this.c;
    }

    public final String q() {
        return this.l;
    }

    public final String r() {
        return this.a;
    }

    public final String s() {
        return this.d;
    }

    public String toString() {
        return "SlideshowAsset(uri=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ", url=" + this.d + ", kicker=" + this.e + ", bylines=" + this.f + ", column=" + this.g + ", commentProperties=" + this.h + ", lastModified=" + this.i + ", lastMajorModification=" + this.j + ", sourceId=" + this.k + ", type=" + this.l + ", promotionalMedia=" + this.m + ", advertisingProperties=" + this.n + ", adTargetingParams=" + this.o + ", slug=" + this.p + ", section=" + this.q + ", slides=" + this.r + ", subsection=" + this.s + ")";
    }
}
