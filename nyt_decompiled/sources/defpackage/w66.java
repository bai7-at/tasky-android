package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class w66 implements rp2 {
    private final c a;

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
        private final String b;
        private final List c;

        public b(String str, String str2, List list) {
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Image(id=" + this.a + ", altText=" + this.b + ", crops=" + this.c + ")";
        }
    }

    public static final class c {
        private final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "PromotionalImage(image=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;

        public d(String str) {
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
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Rendition(url=" + this.a + ")";
        }
    }

    public w66(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w66) && zq3.c(this.a, ((w66) obj).a);
    }

    public int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public String toString() {
        return "PromotionalPropertiesSmall(promotionalImage=" + this.a + ")";
    }
}
