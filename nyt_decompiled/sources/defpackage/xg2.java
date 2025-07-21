package defpackage;

/* loaded from: classes3.dex */
public final class xg2 implements rp2 {
    private final String a;
    private final c b;
    private final e c;
    private final d d;
    private final a e;
    private final b f;

    public static final class a {
        private final String a;
        private final f b;

        public a(String str, f fVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = fVar;
        }

        public final f a() {
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
            f fVar = this.b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "OnAudio(__typename=" + this.a + ", podcastCollection=" + this.b + ")";
        }
    }

    public static final class b {
        private final i a;

        public b(i iVar) {
            this.a = iVar;
        }

        public final i a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            i iVar = this.a;
            if (iVar == null) {
                return 0;
            }
            return iVar.hashCode();
        }

        public String toString() {
            return "OnEmbeddedInteractive(promotionalMedia=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final sg2 b;

        public c(String str, sg2 sg2Var) {
            zq3.h(str, "__typename");
            zq3.h(sg2Var, "filterInterestPromoImageFragment");
            this.a = str;
            this.b = sg2Var;
        }

        public final sg2 a() {
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
            return "OnImage(__typename=" + this.a + ", filterInterestPromoImageFragment=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final g b;

        public d(String str, g gVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gVar;
        }

        public final g a() {
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
            int hashCode = this.a.hashCode() * 31;
            g gVar = this.b;
            return hashCode + (gVar == null ? 0 : gVar.hashCode());
        }

        public String toString() {
            return "OnSlideshow(__typename=" + this.a + ", promotionalMedia=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final j b;

        public e(String str, j jVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = jVar;
        }

        public final j a() {
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
            int hashCode = this.a.hashCode() * 31;
            j jVar = this.b;
            return hashCode + (jVar == null ? 0 : jVar.hashCode());
        }

        public String toString() {
            return "OnVideo(__typename=" + this.a + ", promotionalMedia=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final h b;

        public f(String str, h hVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = hVar;
        }

        public final h a() {
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
            int hashCode = this.a.hashCode() * 31;
            h hVar = this.b;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            return "PodcastCollection(__typename=" + this.a + ", promotionalMedia=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final sg2 b;

        public g(String str, sg2 sg2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = sg2Var;
        }

        public final sg2 a() {
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
            sg2 sg2Var = this.b;
            return hashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia1(__typename=" + this.a + ", filterInterestPromoImageFragment=" + this.b + ")";
        }
    }

    public static final class h {
        private final String a;
        private final sg2 b;

        public h(String str, sg2 sg2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = sg2Var;
        }

        public final sg2 a() {
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
            int hashCode = this.a.hashCode() * 31;
            sg2 sg2Var = this.b;
            return hashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia2(__typename=" + this.a + ", filterInterestPromoImageFragment=" + this.b + ")";
        }
    }

    public static final class i {
        private final String a;
        private final sg2 b;

        public i(String str, sg2 sg2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = sg2Var;
        }

        public final sg2 a() {
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
            sg2 sg2Var = this.b;
            return hashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia3(__typename=" + this.a + ", filterInterestPromoImageFragment=" + this.b + ")";
        }
    }

    public static final class j {
        private final String a;
        private final sg2 b;

        public j(String str, sg2 sg2Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = sg2Var;
        }

        public final sg2 a() {
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
            int hashCode = this.a.hashCode() * 31;
            sg2 sg2Var = this.b;
            return hashCode + (sg2Var == null ? 0 : sg2Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", filterInterestPromoImageFragment=" + this.b + ")";
        }
    }

    public xg2(String str, c cVar, e eVar, d dVar, a aVar, b bVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = cVar;
        this.c = eVar;
        this.d = dVar;
        this.e = aVar;
        this.f = bVar;
    }

    public final a a() {
        return this.e;
    }

    public final b b() {
        return this.f;
    }

    public final c c() {
        return this.b;
    }

    public final d d() {
        return this.d;
    }

    public final e e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg2)) {
            return false;
        }
        xg2 xg2Var = (xg2) obj;
        return zq3.c(this.a, xg2Var.a) && zq3.c(this.b, xg2Var.b) && zq3.c(this.c, xg2Var.c) && zq3.c(this.d, xg2Var.d) && zq3.c(this.e, xg2Var.e) && zq3.c(this.f, xg2Var.f);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        e eVar = this.c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.d;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.e;
        int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "FilterPromotionalMedia(__typename=" + this.a + ", onImage=" + this.b + ", onVideo=" + this.c + ", onSlideshow=" + this.d + ", onAudio=" + this.e + ", onEmbeddedInteractive=" + this.f + ")";
    }
}
