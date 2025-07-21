package defpackage;

/* loaded from: classes3.dex */
public final class mf5 implements rp2 {
    private final String a;
    private final String b;
    private final String c;
    private final Integer d;
    private final a e;

    public static final class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final Integer f;

        public a(String str, String str2, String str3, String str4, String str5, Integer num) {
            zq3.h(str, "__typename");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = num;
        }

        public final String a() {
            return this.d;
        }

        public final String b() {
            return this.e;
        }

        public final Integer c() {
            return this.f;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && zq3.c(this.c, aVar.c) && zq3.c(this.d, aVar.d) && zq3.c(this.e, aVar.e) && zq3.c(this.f, aVar.f);
        }

        public final String f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.f;
            return hashCode5 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "Contents(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", creationDate=" + this.d + ", expirationDate=" + this.e + ", regiId=" + this.f + ")";
        }
    }

    public mf5(String str, String str2, String str3, Integer num, a aVar) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = aVar;
    }

    public final String a() {
        return this.c;
    }

    public final a b() {
        return this.e;
    }

    public final Integer c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf5)) {
            return false;
        }
        mf5 mf5Var = (mf5) obj;
        return zq3.c(this.a, mf5Var.a) && zq3.c(this.b, mf5Var.b) && zq3.c(this.c, mf5Var.c) && zq3.c(this.d, mf5Var.d) && zq3.c(this.e, mf5Var.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        a aVar = this.e;
        return hashCode4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "OnShareCodeData(__typename=" + this.a + ", url=" + this.b + ", code=" + this.c + ", remaining=" + this.d + ", contents=" + this.e + ")";
    }
}
