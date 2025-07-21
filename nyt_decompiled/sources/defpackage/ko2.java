package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class ko2 implements rp2 {
    private final List a;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final b f;

        public a(String str, String str2, String str3, String str4, String str5, b bVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "uri");
            zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = bVar;
        }

        public final String a() {
            return this.d;
        }

        public final b b() {
            return this.f;
        }

        public final String c() {
            return this.c;
        }

        public final String d() {
            return this.e;
        }

        public final String e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            b bVar = this.f;
            return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "Channel(__typename=" + this.a + ", uri=" + this.b + ", name=" + this.c + ", description=" + this.d + ", shortDescription=" + this.e + ", image=" + this.f + ")";
        }
    }

    public static final class b {
        private final String a;
        private final e31 b;

        public b(String str, e31 e31Var) {
            zq3.h(str, "__typename");
            zq3.h(e31Var, "cropOrPosterFields");
            this.a = str;
            this.b = e31Var;
        }

        public final e31 a() {
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
            return "Image(__typename=" + this.a + ", cropOrPosterFields=" + this.b + ")";
        }
    }

    public ko2(List list) {
        zq3.h(list, "channels");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko2) && zq3.c(this.a, ((ko2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ForYou_channelFields(channels=" + this.a + ")";
    }
}
