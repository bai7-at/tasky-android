package defpackage;

import java.util.List;
import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class tp implements rp2 {
    private final String a;
    private final b b;
    private final gp c;

    public static final class a {
        private final String a;
        private final int b;

        public a(String str, int i) {
            zq3.h(str, "target");
            this.a = str;
            this.b = i;
        }

        public final int a() {
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
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "Crop(target=" + this.a + ", minViewportWidth=" + this.b + ")";
        }
    }

    public static final class b {
        private final Instant a;
        private final d b;
        private final List c;
        private final List d;

        public b(Instant instant, d dVar, List list, List list2) {
            zq3.h(dVar, "main");
            zq3.h(list, "subResources");
            zq3.h(list2, "images");
            this.a = instant;
            this.b = dVar;
            this.c = list;
            this.d = list2;
        }

        public final List a() {
            return this.d;
        }

        public final Instant b() {
            return this.a;
        }

        public final d c() {
            return this.b;
        }

        public final List d() {
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
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b) && zq3.c(this.c, bVar.c) && zq3.c(this.d, bVar.d);
        }

        public int hashCode() {
            Instant instant = this.a;
            return ((((((instant == null ? 0 : instant.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "HybridBody(lastModified=" + this.a + ", main=" + this.b + ", subResources=" + this.c + ", images=" + this.d + ")";
        }
    }

    public static final class c {
        private final List a;

        public c(List list) {
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
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Image(crops=" + this.a + ")";
        }
    }

    public static final class d {
        private final String a;

        public d(String str) {
            zq3.h(str, "contents");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && zq3.c(this.a, ((d) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Main(contents=" + this.a + ")";
        }
    }

    public static final class e {
        private final String a;

        public e(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && zq3.c(this.a, ((e) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SubResource(target=" + this.a + ")";
        }
    }

    public tp(String str, b bVar, gp gpVar) {
        zq3.h(str, "__typename");
        zq3.h(gpVar, "articleAsset");
        this.a = str;
        this.b = bVar;
        this.c = gpVar;
    }

    public final gp a() {
        return this.c;
    }

    public final b b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return zq3.c(this.a, tpVar.a) && zq3.c(this.b, tpVar.b) && zq3.c(this.c, tpVar.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        return ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ArticleAssetWithHybridBody(__typename=" + this.a + ", hybridBody=" + this.b + ", articleAsset=" + this.c + ")";
    }
}
