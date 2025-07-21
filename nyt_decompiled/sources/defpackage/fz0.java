package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes3.dex */
public final class fz0 implements rp2 {
    private final String a;
    private final a b;

    public static final class a {
        private final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public final b a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            b bVar = this.a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "AssociatedNewsletter(newsletterProduct=" + this.a + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;
        private final String c;

        public b(String str, String str2, String str3) {
            zq3.h(str, "id");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "url");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.c;
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
            return "NewsletterProduct(id=" + this.a + ", name=" + this.b + ", url=" + this.c + ")";
        }
    }

    public fz0(String str, a aVar) {
        zq3.h(str, "id");
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
        if (!(obj instanceof fz0)) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        return zq3.c(this.a, fz0Var.a) && zq3.c(this.b, fz0Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CookingNewsletter(id=" + this.a + ", associatedNewsletter=" + this.b + ")";
    }
}
