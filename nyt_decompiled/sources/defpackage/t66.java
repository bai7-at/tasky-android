package defpackage;

/* loaded from: classes3.dex */
public final class t66 implements rp2 {
    private final a a;

    public static final class a {
        private final String a;
        private final n59 b;
        private final ho3 c;
        private final kf3 d;
        private final uu7 e;
        private final gz1 f;

        public a(String str, n59 n59Var, ho3 ho3Var, kf3 kf3Var, uu7 uu7Var, gz1 gz1Var) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
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

    public t66(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t66) && zq3.c(this.a, ((t66) obj).a);
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "PromotionalProperties(promotionalMedia=" + this.a + ")";
    }
}
