package defpackage;

/* loaded from: classes3.dex */
public final class tj5 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final a d;

    public static final class a {
        private final String a;
        private final oj5 b;

        public a(String str, oj5 oj5Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = oj5Var;
        }

        public final oj5 a() {
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
            oj5 oj5Var = this.b;
            return hashCode + (oj5Var == null ? 0 : oj5Var.hashCode());
        }

        public String toString() {
            return "PromotionalMedia(__typename=" + this.a + ", opinionImage=" + this.b + ")";
        }
    }

    public tj5(String str, String str2, String str3, a aVar) {
        zq3.h(str, "id");
        zq3.h(str2, "displayName");
        zq3.h(str3, "title");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final a c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj5)) {
            return false;
        }
        tj5 tj5Var = (tj5) obj;
        return zq3.c(this.a, tj5Var.a) && zq3.c(this.b, tj5Var.b) && zq3.c(this.c, tj5Var.c) && zq3.c(this.d, tj5Var.d);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        a aVar = this.d;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "OpinionPerson(id=" + this.a + ", displayName=" + this.b + ", title=" + this.c + ", promotionalMedia=" + this.d + ")";
    }
}
