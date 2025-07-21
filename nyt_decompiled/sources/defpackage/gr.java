package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes3.dex */
public final class gr implements rp2 {
    private final String a;
    private final a b;

    public static final class a {
        private final String a;
        private final c b;

        public a(String str, c cVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = cVar;
        }

        public final c a() {
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
            c cVar = this.b;
            return hashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "PromotionalImage(__typename=" + this.a + ", signableRendition=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final String c;
        private final int d;
        private final int e;

        public b(String str, String str2, String str3, int i, int i2) {
            zq3.h(str, "__typename");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "url");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = i2;
        }

        public final int a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
        }

        public final int d() {
            return this.e;
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
        }

        public int hashCode() {
            return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e);
        }

        public String toString() {
            return "Rendition(__typename=" + this.a + ", name=" + this.b + ", url=" + this.c + ", height=" + this.d + ", width=" + this.e + ")";
        }
    }

    public static final class c {
        private final String a;
        private final b b;

        public c(String str, b bVar) {
            zq3.h(str, "__typename");
            zq3.h(bVar, "rendition");
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "SignableRendition(__typename=" + this.a + ", rendition=" + this.b + ")";
        }
    }

    public gr(String str, a aVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final a a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr)) {
            return false;
        }
        gr grVar = (gr) obj;
        return zq3.c(this.a, grVar.a) && zq3.c(this.b, grVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ArticlePromotionalProperties(__typename=" + this.a + ", promotionalImage=" + this.b + ")";
    }
}
