package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class e31 implements rp2 {
    private final String a;
    private final String b;
    private final List c;

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
        private final String b;
        private final int c;
        private final int d;
        private final String e;

        public b(String str, String str2, int i, int i2, String str3) {
            zq3.h(str, "__typename");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "url");
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = str3;
        }

        public final int a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.e;
        }

        public final int d() {
            return this.d;
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && zq3.c(this.e, bVar.e);
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", name=" + this.b + ", height=" + this.c + ", width=" + this.d + ", url=" + this.e + ")";
        }
    }

    public e31(String str, String str2, List list) {
        zq3.h(str, "__typename");
        zq3.h(str2, "credit");
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
        if (!(obj instanceof e31)) {
            return false;
        }
        e31 e31Var = (e31) obj;
        return zq3.c(this.a, e31Var.a) && zq3.c(this.b, e31Var.b) && zq3.c(this.c, e31Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CropOrPosterFields(__typename=" + this.a + ", credit=" + this.b + ", crops=" + this.c + ")";
    }
}
