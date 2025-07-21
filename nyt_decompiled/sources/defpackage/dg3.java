package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class dg3 implements rp2 {
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
        private final String c;
        private final List d;

        public b(String str, String str2, String str3, List list) {
            zq3.h(str, "id");
            zq3.h(str2, "altText");
            zq3.h(str3, "credit");
            zq3.h(list, "crops");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = list;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final List c() {
            return this.d;
        }

        public final String d() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Image(id=" + this.a + ", altText=" + this.b + ", credit=" + this.c + ", crops=" + this.d + ")";
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

    public dg3(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg3) && zq3.c(this.a, ((dg3) obj).a);
    }

    public int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public String toString() {
        return "ImageDetails(promotionalImage=" + this.a + ")";
    }
}
