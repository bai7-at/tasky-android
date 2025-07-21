package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.List;

/* loaded from: classes3.dex */
public final class aj5 implements rp2 {
    private final String a;
    private final c b;
    private final String c;
    private final String d;
    private final String e;
    private final d f;
    private final List g;

    public static final class a {
        private final List a;

        public a(List list) {
            zq3.h(list, "creators");
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
            return "Byline(creators=" + this.a + ")";
        }
    }

    public static final class b {
        private final String a;
        private final tj5 b;

        public b(String str, tj5 tj5Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = tj5Var;
        }

        public final tj5 a() {
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
            int hashCode = this.a.hashCode() * 31;
            tj5 tj5Var = this.b;
            return hashCode + (tj5Var == null ? 0 : tj5Var.hashCode());
        }

        public String toString() {
            return "Creator(__typename=" + this.a + ", opinionPerson=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;

        public c(String str) {
            zq3.h(str, "default");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Headline(default=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;

        public d(String str, String str2) {
            zq3.h(str, "taxonomyID");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Section(taxonomyID=" + this.a + ", name=" + this.b + ")";
        }
    }

    public aj5(String str, c cVar, String str2, String str3, String str4, d dVar, List list) {
        zq3.h(str, "id");
        zq3.h(str2, "summary");
        zq3.h(str3, "url");
        zq3.h(str4, "uri");
        zq3.h(list, "bylines");
        this.a = str;
        this.b = cVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = dVar;
        this.g = list;
    }

    public final List a() {
        return this.g;
    }

    public final c b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final d d() {
        return this.f;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj5)) {
            return false;
        }
        aj5 aj5Var = (aj5) obj;
        return zq3.c(this.a, aj5Var.a) && zq3.c(this.b, aj5Var.b) && zq3.c(this.c, aj5Var.c) && zq3.c(this.d, aj5Var.d) && zq3.c(this.e, aj5Var.e) && zq3.c(this.f, aj5Var.f) && zq3.c(this.g, aj5Var.g);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        int hashCode2 = (((((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        d dVar = this.f;
        return ((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "OpinionArticle(id=" + this.a + ", headline=" + this.b + ", summary=" + this.c + ", url=" + this.d + ", uri=" + this.e + ", section=" + this.f + ", bylines=" + this.g + ")";
    }
}
