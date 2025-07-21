package defpackage;

/* loaded from: classes3.dex */
public final class jz0 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final a d;

    public static final class a {
        private final String a;
        private final pz0 b;
        private final yy0 c;

        public a(String str, pz0 pz0Var, yy0 yy0Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = pz0Var;
            this.c = yy0Var;
        }

        public final yy0 a() {
            return this.c;
        }

        public final pz0 b() {
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
            int hashCode = this.a.hashCode() * 31;
            pz0 pz0Var = this.b;
            int hashCode2 = (hashCode + (pz0Var == null ? 0 : pz0Var.hashCode())) * 31;
            yy0 yy0Var = this.c;
            return hashCode2 + (yy0Var != null ? yy0Var.hashCode() : 0);
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", cookingVideo=" + this.b + ", cookingImage=" + this.c + ")";
        }
    }

    public jz0(String str, String str2, String str3, a aVar) {
        zq3.h(str, "__typename");
        zq3.h(str2, "promotionalHeadline");
        zq3.h(str3, "promotionalSummary");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    public final String a() {
        return this.b;
    }

    public final a b() {
        return this.d;
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
        if (!(obj instanceof jz0)) {
            return false;
        }
        jz0 jz0Var = (jz0) obj;
        return zq3.c(this.a, jz0Var.a) && zq3.c(this.b, jz0Var.b) && zq3.c(this.c, jz0Var.c) && zq3.c(this.d, jz0Var.d);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        a aVar = this.d;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CookingPromotional(__typename=" + this.a + ", promotionalHeadline=" + this.b + ", promotionalSummary=" + this.c + ", promotionalMedia=" + this.d + ")";
    }
}
