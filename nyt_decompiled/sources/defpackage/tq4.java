package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class tq4 implements rp2 {
    private final String a;
    private final a b;
    private final b c;
    private final List d;
    private final int e;
    private final Boolean f;
    private final String g;
    private final d h;
    private final e i;
    private final f j;
    private final g k;
    private final int l;

    public static final class a {
        private final String a;
        private final ur4 b;

        public a(String str, ur4 ur4Var) {
            zq3.h(str, "__typename");
            zq3.h(ur4Var, "messageProperties");
            this.a = str;
            this.b = ur4Var;
        }

        public final ur4 a() {
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
            return "Action(__typename=" + this.a + ", messageProperties=" + this.b + ")";
        }
    }

    public static final class b {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            zq3.h(str, "moduleName");
            zq3.h(str2, "label");
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
            return "Analytics(moduleName=" + this.a + ", label=" + this.b + ")";
        }
    }

    public static final class c {
        private final String a;
        private final String b;

        public c(String str, String str2) {
            zq3.h(str, "text");
            zq3.h(str2, "style");
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
            return "Body(text=" + this.a + ", style=" + this.b + ")";
        }
    }

    public static final class d {
        private final String a;
        private final ur4 b;

        public d(String str, ur4 ur4Var) {
            zq3.h(str, "__typename");
            zq3.h(ur4Var, "messageProperties");
            this.a = str;
            this.b = ur4Var;
        }

        public final ur4 a() {
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
            return "MediaResource(__typename=" + this.a + ", messageProperties=" + this.b + ")";
        }
    }

    public static final class e {
        private final String a;
        private final ur4 b;

        public e(String str, ur4 ur4Var) {
            zq3.h(str, "__typename");
            zq3.h(ur4Var, "messageProperties");
            this.a = str;
            this.b = ur4Var;
        }

        public final ur4 a() {
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Placement(__typename=" + this.a + ", messageProperties=" + this.b + ")";
        }
    }

    public static final class f {
        private final String a;
        private final ur4 b;

        public f(String str, ur4 ur4Var) {
            zq3.h(str, "__typename");
            zq3.h(ur4Var, "messageProperties");
            this.a = str;
            this.b = ur4Var;
        }

        public final ur4 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return zq3.c(this.a, fVar.a) && zq3.c(this.b, fVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "PresentationRule(__typename=" + this.a + ", messageProperties=" + this.b + ")";
        }
    }

    public static final class g {
        private final String a;
        private final Boolean b;

        public g(String str, Boolean bool) {
            this.a = str;
            this.b = bool;
        }

        public final Boolean a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return zq3.c(this.a, gVar.a) && zq3.c(this.b, gVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.b;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "SequenceInfo(next=" + this.a + ", canSkip=" + this.b + ")";
        }
    }

    public tq4(String str, a aVar, b bVar, List list, int i, Boolean bool, String str2, d dVar, e eVar, f fVar, g gVar, int i2) {
        zq3.h(str, "historyId");
        zq3.h(bVar, "analytics");
        zq3.h(list, "body");
        zq3.h(eVar, "placement");
        this.a = str;
        this.b = aVar;
        this.c = bVar;
        this.d = list;
        this.e = i;
        this.f = bool;
        this.g = str2;
        this.h = dVar;
        this.i = eVar;
        this.j = fVar;
        this.k = gVar;
        this.l = i2;
    }

    public final a a() {
        return this.b;
    }

    public final b b() {
        return this.c;
    }

    public final List c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final Boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq4)) {
            return false;
        }
        tq4 tq4Var = (tq4) obj;
        return zq3.c(this.a, tq4Var.a) && zq3.c(this.b, tq4Var.b) && zq3.c(this.c, tq4Var.c) && zq3.c(this.d, tq4Var.d) && this.e == tq4Var.e && zq3.c(this.f, tq4Var.f) && zq3.c(this.g, tq4Var.g) && zq3.c(this.h, tq4Var.h) && zq3.c(this.i, tq4Var.i) && zq3.c(this.j, tq4Var.j) && zq3.c(this.k, tq4Var.k) && this.l == tq4Var.l;
    }

    public final String f() {
        return this.a;
    }

    public final String g() {
        return this.g;
    }

    public final d h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e)) * 31;
        Boolean bool = this.f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.g;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.h;
        int hashCode5 = (((hashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31) + this.i.hashCode()) * 31;
        f fVar = this.j;
        int hashCode6 = (hashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.k;
        return ((hashCode6 + (gVar != null ? gVar.hashCode() : 0)) * 31) + Integer.hashCode(this.l);
    }

    public final e i() {
        return this.i;
    }

    public final f j() {
        return this.j;
    }

    public final g k() {
        return this.k;
    }

    public final int l() {
        return this.l;
    }

    public String toString() {
        return "MessageContent(historyId=" + this.a + ", action=" + this.b + ", analytics=" + this.c + ", body=" + this.d + ", cadence=" + this.e + ", cancelable=" + this.f + ", kicker=" + this.g + ", mediaResource=" + this.h + ", placement=" + this.i + ", presentationRule=" + this.j + ", sequenceInfo=" + this.k + ", weight=" + this.l + ")";
    }
}
