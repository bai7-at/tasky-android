package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class oj5 implements rp2 {
    private final String a;
    private final String b;
    private final List c;

    public static final class a {
        private final List a;

        public a(List list) {
            zq3.h(list, "renditions");
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Crop(renditions=" + this.a + ")";
        }
    }

    public static final class b {
        private final String a;

        public b(String str) {
            zq3.h(str, "url");
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
            return "Rendition(url=" + this.a + ")";
        }
    }

    public oj5(String str, String str2, List list) {
        zq3.h(str, "id");
        zq3.h(str2, "altText");
        zq3.h(list, "crops");
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String a() {
        return this.b;
    }

    public final List b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj5)) {
            return false;
        }
        oj5 oj5Var = (oj5) obj;
        return zq3.c(this.a, oj5Var.a) && zq3.c(this.b, oj5Var.b) && zq3.c(this.c, oj5Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "OpinionImage(id=" + this.a + ", altText=" + this.b + ", crops=" + this.c + ")";
    }
}
