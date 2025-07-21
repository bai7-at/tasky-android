package defpackage;

import org.threeten.bp.Instant;

/* loaded from: classes3.dex */
public final class g22 implements rp2 {
    private final String a;
    private final a b;
    private final String c;
    private final Instant d;
    private final int e;
    private final String f;
    private final c g;

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            zq3.h(str, "__typename");
            zq3.h(str2, "headline");
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
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "HeadlineDefault(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final h22 b;

        public b(String str, h22 h22Var) {
            zq3.h(str, "__typename");
            zq3.h(h22Var, "episodeCrop");
            this.a = str;
            this.b = h22Var;
        }

        public final h22 a() {
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
            return "Image(__typename=" + this.a + ", episodeCrop=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;
        private final b c;

        public c(String str, String str2, b bVar) {
            zq3.h(str, "__typename");
            zq3.h(str2, "title");
            this.a = str;
            this.b = str2;
            this.c = bVar;
        }

        public final b a() {
            return this.c;
        }

        public final String b() {
            return this.b;
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
            int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
            b bVar = this.c;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "PodcastSeries(__typename=" + this.a + ", title=" + this.b + ", image=" + this.c + ")";
        }
    }

    public g22(String str, a aVar, String str2, Instant instant, int i, String str3, c cVar) {
        zq3.h(str, "id");
        zq3.h(str2, "summary");
        zq3.h(str3, "fileUrl");
        this.a = str;
        this.b = aVar;
        this.c = str2;
        this.d = instant;
        this.e = i;
        this.f = str3;
        this.g = cVar;
    }

    public final String a() {
        return this.f;
    }

    public final Instant b() {
        return this.d;
    }

    public final a c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g22)) {
            return false;
        }
        g22 g22Var = (g22) obj;
        return zq3.c(this.a, g22Var.a) && zq3.c(this.b, g22Var.b) && zq3.c(this.c, g22Var.c) && zq3.c(this.d, g22Var.d) && this.e == g22Var.e && zq3.c(this.f, g22Var.f) && zq3.c(this.g, g22Var.g);
    }

    public final c f() {
        return this.g;
    }

    public final String g() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        Instant instant = this.d;
        int hashCode3 = (((((hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31) + Integer.hashCode(this.e)) * 31) + this.f.hashCode()) * 31;
        c cVar = this.g;
        return hashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public String toString() {
        return "Episode(id=" + this.a + ", headlineDefault=" + this.b + ", summary=" + this.c + ", firstPublished=" + this.d + ", length=" + this.e + ", fileUrl=" + this.f + ", podcastSeries=" + this.g + ")";
    }
}
