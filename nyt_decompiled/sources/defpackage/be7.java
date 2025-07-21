package defpackage;

/* loaded from: classes3.dex */
public final class be7 implements rp2 {
    private final a a;

    public static final class a {
        private final String a;
        private final ud7 b;

        public a(String str, ud7 ud7Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = ud7Var;
        }

        public final ud7 a() {
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
            ud7 ud7Var = this.b;
            return hashCode + (ud7Var == null ? 0 : ud7Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", searchImage=" + this.b + ")";
        }
    }

    public be7(a aVar) {
        this.a = aVar;
    }

    public final a a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be7) && zq3.c(this.a, ((be7) obj).a);
    }

    public int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        return "SearchProperties(promotionalMedia=" + this.a + ")";
    }
}
