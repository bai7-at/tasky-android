package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class yr implements rp2 {
    private final String a;
    private final a b;

    public static final class a {
        private final List a;

        public a(List list) {
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
            List list = this.a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Assets(edges=" + this.a + ")";
        }
    }

    public static final class b {
        private final c a;

        public b(c cVar) {
            this.a = cVar;
        }

        public final c a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            c cVar = this.a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Edge(node=" + this.a + ")";
        }
    }

    public static final class c {
        private final String a;
        private final ps b;
        private final w66 c;

        public c(String str, ps psVar, w66 w66Var) {
            zq3.h(str, "__typename");
            zq3.h(w66Var, "promotionalPropertiesSmall");
            this.a = str;
            this.b = psVar;
            this.c = w66Var;
        }

        public final ps a() {
            return this.b;
        }

        public final w66 b() {
            return this.c;
        }

        public final String c() {
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
            return zq3.c(this.a, cVar.a) && zq3.c(this.b, cVar.b) && zq3.c(this.c, cVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            ps psVar = this.b;
            return ((hashCode + (psVar == null ? 0 : psVar.hashCode())) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Node(__typename=" + this.a + ", assetNode=" + this.b + ", promotionalPropertiesSmall=" + this.c + ")";
        }
    }

    public yr(String str, a aVar) {
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
        if (!(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return zq3.c(this.a, yrVar.a) && zq3.c(this.b, yrVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AssetCollection(id=" + this.a + ", assets=" + this.b + ")";
    }
}
