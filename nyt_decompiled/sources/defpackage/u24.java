package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class u24 implements rp2 {
    private final c a;

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
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class b {
        private final String a;
        private final ap3 b;
        private final ip3 c;

        public b(String str, ap3 ap3Var, ip3 ip3Var) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = ap3Var;
            this.c = ip3Var;
        }

        public final ap3 a() {
            return this.b;
        }

        public final ip3 b() {
            return this.c;
        }

        public final String c() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ap3 ap3Var = this.b;
            int hashCode2 = (hashCode + (ap3Var == null ? 0 : ap3Var.hashCode())) * 31;
            ip3 ip3Var = this.c;
            return hashCode2 + (ip3Var != null ? ip3Var.hashCode() : 0);
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", interestArticleAsset=" + this.b + ", interestInteractiveAsset=" + this.c + ")";
        }
    }

    public static final class c {
        private final List a;

        public c(List list) {
            this.a = list;
        }

        public final List a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Stream(edges=" + this.a + ")";
        }
    }

    public u24(c cVar) {
        this.a = cVar;
    }

    public final c a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u24) && zq3.c(this.a, ((u24) obj).a);
    }

    public int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public String toString() {
        return "LegacyCollectionAssetsFragment(stream=" + this.a + ")";
    }
}
