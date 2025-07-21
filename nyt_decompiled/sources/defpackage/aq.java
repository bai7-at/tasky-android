package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aq implements rp2 {
    private final String a;
    private final b b;
    private final List c;

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Byline(__typename=" + this.a + ", renderedRepresentation=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "default");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Headline(__typename=" + this.a + ", default=" + this.b + ")";
        }
    }

    public aq(String str, b bVar, List list) {
        zq3.h(str, "__typename");
        zq3.h(list, "bylines");
        this.a = str;
        this.b = bVar;
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final b b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq)) {
            return false;
        }
        aq aqVar = (aq) obj;
        return zq3.c(this.a, aqVar.a) && zq3.c(this.b, aqVar.b) && zq3.c(this.c, aqVar.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ArticleCreativeWork(__typename=" + this.a + ", headline=" + this.b + ", bylines=" + this.c + ")";
    }
}
