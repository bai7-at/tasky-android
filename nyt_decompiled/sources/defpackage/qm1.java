package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class qm1 implements rp2 {
    private final String a;
    private final List b;

    public static final class a {
        private final String a;
        private final d b;

        public a(String str, d dVar) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = dVar;
        }

        public final d a() {
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
            d dVar = this.b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        public String toString() {
            return "DescendantAsset(__typename=" + this.a + ", onPublished=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final Instant b;

        public b(String str, Instant instant) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = instant;
        }

        public final Instant a() {
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
            Instant instant = this.b;
            return hashCode + (instant == null ? 0 : instant.hashCode());
        }

        public String toString() {
            return "HybridBody(__typename=" + this.a + ", lastModified=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final b b;

        public c(String str, b bVar) {
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
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            b bVar = this.b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "OnArticle(__typename=" + this.a + ", hybridBody=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;
        private final Instant c;
        private final c d;

        public d(String str, String str2, Instant instant, c cVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "uri");
            this.a = str;
            this.b = str2;
            this.c = instant;
            this.d = cVar;
        }

        public final Instant a() {
            return this.c;
        }

        public final c b() {
            return this.d;
        }

        public final String c() {
            return this.b;
        }

        public final String d() {
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
            return zq3.c(this.a, dVar.a) && zq3.c(this.b, dVar.b) && zq3.c(this.c, dVar.c) && zq3.c(this.d, dVar.d);
        }

        public int hashCode() {
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            Instant instant = this.c;
            int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
            c cVar = this.d;
            return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "OnPublished(__typename=" + this.a + ", uri=" + this.b + ", lastModified=" + this.c + ", onArticle=" + this.d + ")";
        }
    }

    public qm1(String str, List list) {
        zq3.h(str, "__typename");
        zq3.h(list, "descendantAssets");
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
        if (!(obj instanceof qm1)) {
            return false;
        }
        qm1 qm1Var = (qm1) obj;
        return zq3.c(this.a, qm1Var.a) && zq3.c(this.b, qm1Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DescendantAssets(__typename=" + this.a + ", descendantAssets=" + this.b + ")";
    }
}
