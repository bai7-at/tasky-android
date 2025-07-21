package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class yy0 implements rp2 {
    private final String a;
    private final List b;
    private final a c;
    private final String d;

    public static final class a {
        private final String a;

        public a(String str) {
            zq3.h(str, "text");
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
            return this.a.hashCode();
        }

        public String toString() {
            return "Caption(text=" + this.a + ")";
        }
    }

    public static final class b {
        private final List a;

        public b(List list) {
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
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Crop(renditions=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final int b;
        private final int c;
        private final String d;

        public c(String str, int i, int i2, String str2) {
            zq3.h(str, "url");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = str2;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final int d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && zq3.c(this.d, cVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Rendition(url=" + this.a + ", width=" + this.b + ", height=" + this.c + ", name=" + this.d + ")";
        }
    }

    public yy0(String str, List list, a aVar, String str2) {
        zq3.h(str, "id");
        zq3.h(list, "crops");
        zq3.h(str2, "credit");
        this.a = str;
        this.b = list;
        this.c = aVar;
        this.d = str2;
    }

    public final a a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final List c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return zq3.c(this.a, yy0Var.a) && zq3.c(this.b, yy0Var.b) && zq3.c(this.c, yy0Var.c) && zq3.c(this.d, yy0Var.d);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        a aVar = this.c;
        return ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CookingImage(id=" + this.a + ", crops=" + this.b + ", caption=" + this.c + ", credit=" + this.d + ")";
    }
}
