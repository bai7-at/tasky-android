package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class ud7 implements rp2 {
    private final List a;

    public static final class a {
        private final String a;
        private final List b;

        public a(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "renditions");
            this.a = str;
            this.b = list;
        }

        public final List a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Crop(__typename=" + this.a + ", renditions=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final int b;
        private final String c;
        private final String d;
        private final int e;

        public b(String str, int i, String str2, String str3, int i2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "url");
            zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = i2;
        }

        public final int a() {
            return this.e;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.b;
        }

        public final String e() {
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
            return zq3.c(this.a, bVar.a) && this.b == bVar.b && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d) && this.e == bVar.e;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", width=" + this.b + ", url=" + this.c + ", name=" + this.d + ", height=" + this.e + ")";
        }
    }

    public ud7(List list) {
        zq3.h(list, "crops");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud7) && zq3.c(this.a, ((ud7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SearchImage(crops=" + this.a + ")";
    }
}
