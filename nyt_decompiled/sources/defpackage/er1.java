package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class er1 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final a f;

    public static final class a {
        private final String a;
        private final List b;

        public a(String str, List list) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = list;
        }

        public final List a() {
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
            List list = this.b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Assets(__typename=" + this.a + ", edges=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final c b;

        public b(String str, c cVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = cVar;
        }

        public final c a() {
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
            c cVar = this.b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Edge(__typename=" + this.a + ", node=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final gp b;
        private final n59 c;
        private final ho3 d;
        private final kf3 e;
        private final uu7 f;
        private final lv g;
        private final wb2 h;
        private final g56 i;

        public c(String str, gp gpVar, n59 n59Var, ho3 ho3Var, kf3 kf3Var, uu7 uu7Var, lv lvVar, wb2 wb2Var, g56 g56Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = gpVar;
            this.c = n59Var;
            this.d = ho3Var;
            this.e = kf3Var;
            this.f = uu7Var;
            this.g = lvVar;
            this.h = wb2Var;
            this.i = g56Var;
        }

        public final gp a() {
            return this.b;
        }

        public final lv b() {
            return this.g;
        }

        public final wb2 c() {
            return this.h;
        }

        public final kf3 d() {
            return this.e;
        }

        public final ho3 e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c) && zq3.c(this.d, cVar.d) && zq3.c(this.e, cVar.e) && zq3.c(this.f, cVar.f) && zq3.c(this.g, cVar.g) && zq3.c(this.h, cVar.h) && zq3.c(this.i, cVar.i);
        }

        public final g56 f() {
            return this.i;
        }

        public final uu7 g() {
            return this.f;
        }

        public final n59 h() {
            return this.c;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            gp gpVar = this.b;
            int hashCode2 = (hashCode + (gpVar == null ? 0 : gpVar.hashCode())) * 31;
            n59 n59Var = this.c;
            int hashCode3 = (hashCode2 + (n59Var == null ? 0 : n59Var.hashCode())) * 31;
            ho3 ho3Var = this.d;
            int hashCode4 = (hashCode3 + (ho3Var == null ? 0 : ho3Var.hashCode())) * 31;
            kf3 kf3Var = this.e;
            int hashCode5 = (hashCode4 + (kf3Var == null ? 0 : kf3Var.hashCode())) * 31;
            uu7 uu7Var = this.f;
            int hashCode6 = (hashCode5 + (uu7Var == null ? 0 : uu7Var.hashCode())) * 31;
            lv lvVar = this.g;
            int hashCode7 = (hashCode6 + (lvVar == null ? 0 : lvVar.hashCode())) * 31;
            wb2 wb2Var = this.h;
            int hashCode8 = (hashCode7 + (wb2Var == null ? 0 : wb2Var.hashCode())) * 31;
            g56 g56Var = this.i;
            return hashCode8 + (g56Var != null ? g56Var.hashCode() : 0);
        }

        public final String i() {
            return this.a;
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", articleAsset=" + this.b + ", videoAsset=" + this.c + ", interactiveAsset=" + this.d + ", imageAsset=" + this.e + ", slideshowAsset=" + this.f + ", audioAsset=" + this.g + ", feedPublicationAsset=" + this.h + ", promoAsset=" + this.i + ")";
        }
    }

    public er1(String str, String str2, String str3, String str4, String str5, a aVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "dataId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = aVar;
    }

    public final a a() {
        return this.f;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er1)) {
            return false;
        }
        er1 er1Var = (er1) obj;
        return zq3.c(this.a, er1Var.a) && zq3.c(this.b, er1Var.b) && zq3.c(this.c, er1Var.c) && zq3.c(this.d, er1Var.d) && zq3.c(this.e, er1Var.e) && zq3.c(this.f, er1Var.f);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.f;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "Discover_OnPersonalizedBlockBeta(__typename=" + this.a + ", dataId=" + this.b + ", title=" + this.c + ", link=" + this.d + ", dataSource=" + this.e + ", assets=" + this.f + ")";
    }
}
