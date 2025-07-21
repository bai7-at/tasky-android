package defpackage;

import org.threeten.bp.Instant;
import type.Tone;

/* loaded from: classes3.dex */
public final class d63 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final a e;
    private final Instant f;
    private final b g;
    private final Tone h;

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
            return "HeadlineInfo(__typename=" + this.a + ", headline=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final s56 b;

        public b(String str, s56 s56Var) {
            zq3.h(str, "__typename");
            zq3.h(s56Var, "promotionalMediaFields");
            this.a = str;
            this.b = s56Var;
        }

        public final s56 a() {
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
            return "PromotionalMedia(__typename=" + this.a + ", promotionalMediaFields=" + this.b + ")";
        }
    }

    public d63(String str, String str2, String str3, String str4, a aVar, Instant instant, b bVar, Tone tone) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "url");
        zq3.h(str4, "summary");
        zq3.h(tone, "tone");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = aVar;
        this.f = instant;
        this.g = bVar;
        this.h = tone;
    }

    public final a a() {
        return this.e;
    }

    public final Instant b() {
        return this.f;
    }

    public final b c() {
        return this.g;
    }

    public final String d() {
        return this.d;
    }

    public final Tone e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d63)) {
            return false;
        }
        d63 d63Var = (d63) obj;
        return zq3.c(this.a, d63Var.a) && zq3.c(this.b, d63Var.b) && zq3.c(this.c, d63Var.c) && zq3.c(this.d, d63Var.d) && zq3.c(this.e, d63Var.e) && zq3.c(this.f, d63Var.f) && zq3.c(this.g, d63Var.g) && this.h == d63Var.h;
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        a aVar = this.e;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Instant instant = this.f;
        int hashCode3 = (hashCode2 + (instant == null ? 0 : instant.hashCode())) * 31;
        b bVar = this.g;
        return ((hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "GuideFields(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", summary=" + this.d + ", headlineInfo=" + this.e + ", lastModified=" + this.f + ", promotionalMedia=" + this.g + ", tone=" + this.h + ")";
    }
}
