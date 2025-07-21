package defpackage;

/* loaded from: classes3.dex */
public final class pz0 implements rp2 {
    private final String a;
    private final b b;

    public static final class a {
        private final String a;
        private final String b;
        private final yy0 c;

        public a(String str, String str2, yy0 yy0Var) {
            zq3.h(str, "__typename");
            zq3.h(str2, "id");
            zq3.h(yy0Var, "cookingImage");
            this.a = str;
            this.b = str2;
            this.c = yy0Var;
        }

        public final yy0 a() {
            return this.c;
        }

        public final String b() {
            return this.b;
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
            return "Image(__typename=" + this.a + ", id=" + this.b + ", cookingImage=" + this.c + ")";
        }
    }

    public static final class b {
        private final a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final a a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            return "PromotionalImage(image=" + this.a + ")";
        }
    }

    public pz0(String str, b bVar) {
        zq3.h(str, "id");
        this.a = str;
        this.b = bVar;
    }

    public final String a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return zq3.c(this.a, pz0Var.a) && zq3.c(this.b, pz0Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "CookingVideo(id=" + this.a + ", promotionalImage=" + this.b + ")";
    }
}
