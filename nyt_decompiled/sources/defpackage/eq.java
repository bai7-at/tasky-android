package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class eq implements rp2 {
    private final b a;
    private final List b;
    private final String c;
    private final String d;
    private final Integer e;

    public static final class a {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
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

    public static final class b {
        private final String a;

        public b(String str) {
            zq3.h(str, "default");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Headline(default=" + this.a + ")";
        }
    }

    public eq(b bVar, List list, String str, String str2, Integer num) {
        zq3.h(list, "bylines");
        zq3.h(str, "summary");
        zq3.h(str2, "kicker");
        this.a = bVar;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = num;
    }

    public final List a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final Integer e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return zq3.c(this.a, eqVar.a) && zq3.c(this.b, eqVar.b) && zq3.c(this.c, eqVar.c) && zq3.c(this.d, eqVar.d) && zq3.c(this.e, eqVar.e);
    }

    public int hashCode() {
        b bVar = this.a;
        int hashCode = (((((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        Integer num = this.e;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ArticleDetails(headline=" + this.a + ", bylines=" + this.b + ", summary=" + this.c + ", kicker=" + this.d + ", wordCount=" + this.e + ")";
    }
}
