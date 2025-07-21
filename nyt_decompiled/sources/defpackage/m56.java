package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import type.ImageCropName;

/* loaded from: classes3.dex */
public final class m56 implements rp2 {
    private final String a;
    private final b b;

    public static final class a {
        private final String a;
        private final ImageCropName b;
        private final List c;

        public a(String str, ImageCropName imageCropName, List list) {
            zq3.h(str, "__typename");
            zq3.h(imageCropName, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(list, "renditions");
            this.a = str;
            this.b = imageCropName;
            this.c = list;
        }

        public final ImageCropName a() {
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && this.b == aVar.b && zq3.c(this.c, aVar.c);
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Crop(__typename=" + this.a + ", name=" + this.b + ", renditions=" + this.c + ")";
        }
    }

    public static final class b {
        private final List a;

        public b(List list) {
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
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "OnImage(crops=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final int c;
        private final int d;
        private final String e;

        public c(String str, String str2, int i, int i2, String str3) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && zq3.c(this.e, cVar.e);
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", name=" + this.b + ", height=" + this.c + ", width=" + this.d + ", url=" + this.e + ")";
        }
    }

    public m56(String str, b bVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = bVar;
    }

    public final b a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m56)) {
            return false;
        }
        m56 m56Var = (m56) obj;
        return zq3.c(this.a, m56Var.a) && zq3.c(this.b, m56Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "PromotionalImages(__typename=" + this.a + ", onImage=" + this.b + ")";
    }
}
