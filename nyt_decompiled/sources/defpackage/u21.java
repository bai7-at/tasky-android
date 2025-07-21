package defpackage;

/* loaded from: classes3.dex */
public final class u21 implements rp2 {
    private final a a;
    private final String b;
    private final String c;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, "default");
            zq3.h(str3, "seo");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
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
            return "Headline(__typename=" + this.a + ", default=" + this.b + ", seo=" + this.c + ")";
        }
    }

    public u21(a aVar, String str, String str2) {
        zq3.h(str, "summary");
        zq3.h(str2, "kicker");
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u21)) {
            return false;
        }
        u21 u21Var = (u21) obj;
        return zq3.c(this.a, u21Var.a) && zq3.c(this.b, u21Var.b) && zq3.c(this.c, u21Var.c);
    }

    public int hashCode() {
        a aVar = this.a;
        return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CreativeWorkProperties(headline=" + this.a + ", summary=" + this.b + ", kicker=" + this.c + ")";
    }
}
