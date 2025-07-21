package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class b73 implements rp2 {
    private final String a;
    private final b b;

    public static final class a {
        private final String a;
        private final int b;
        private final String c;

        public a(String str, int i, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "target");
            this.a = str;
            this.b = i;
            this.c = str2;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
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
            return (((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode();
        }

        public String toString() {
            return "Crop(__typename=" + this.a + ", minViewportWidth=" + this.b + ", target=" + this.c + ")";
        }
    }

    public static final class b {
        private final String a;
        private final d b;
        private final List c;
        private final List d;

        public b(String str, d dVar, List list, List list2) {
            zq3.h(str, "__typename");
            zq3.h(dVar, "main");
            zq3.h(list, "subResources");
            zq3.h(list2, "images");
            this.a = str;
            this.b = dVar;
            this.c = list;
            this.d = list2;
        }

        public final List a() {
            return this.d;
        }

        public final d b() {
            return this.b;
        }

        public final List c() {
            return this.c;
        }

        public final String d() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "HybridBody(__typename=" + this.a + ", main=" + this.b + ", subResources=" + this.c + ", images=" + this.d + ")";
        }
    }

    public static final class c {
        private final String a;
        private final List b;

        public c(String str, List list) {
            zq3.h(str, "__typename");
            zq3.h(list, "crops");
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
            return "Image(__typename=" + this.a + ", crops=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final String b;

        public d(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "contents");
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
            return "Main(__typename=" + this.a + ", contents=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final String b;

        public e(String str, String str2) {
            zq3.h(str, "__typename");
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
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return zq3.c(this.a, eVar.a) && zq3.c(this.b, eVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SubResource(__typename=" + this.a + ", target=" + this.b + ")";
        }
    }

    public b73(String str, b bVar) {
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
        if (!(obj instanceof b73)) {
            return false;
        }
        b73 b73Var = (b73) obj;
        return zq3.c(this.a, b73Var.a) && zq3.c(this.b, b73Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        return "HasHybridProperties(__typename=" + this.a + ", hybridBody=" + this.b + ")";
    }
}
