package defpackage;

/* loaded from: classes3.dex */
public final class rd7 implements rp2 {
    private final a a;
    private final String b;
    private final String c;

    public static final class a {
        private final String a;

        public a(String str) {
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
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Headline(default=" + this.a + ")";
        }
    }

    public rd7(a aVar, String str, String str2) {
        zq3.h(str, "summary");
        zq3.h(str2, "kicker");
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final a a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd7)) {
            return false;
        }
        rd7 rd7Var = (rd7) obj;
        return zq3.c(this.a, rd7Var.a) && zq3.c(this.b, rd7Var.b) && zq3.c(this.c, rd7Var.c);
    }

    public int hashCode() {
        a aVar = this.a;
        return ((((aVar == null ? 0 : aVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SearchCreativeWork(headline=" + this.a + ", summary=" + this.b + ", kicker=" + this.c + ")";
    }
}
