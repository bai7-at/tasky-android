package defpackage;

/* loaded from: classes3.dex */
public final class gz1 implements rp2 {
    private final a a;

    public static final class a {
        private final String a;
        private final kf3 b;

        public a(String str, kf3 kf3Var) {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
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

    public gz1(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gz1) && zq3.c(this.a, ((gz1) obj).a);
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "EmbeddedInteractiveAsset(promotionalMedia=" + this.a + ")";
    }
}
