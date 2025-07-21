package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class w00 extends s11.e.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    static final class b extends s11.e.a.AbstractC0522a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;

        b() {
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new w00(this.a, this.b, this.c, null, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a b(String str) {
            this.e = str;
            return this;
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a c(String str) {
            this.f = str;
            return this;
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a d(String str) {
            this.c = str;
            return this;
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.a = str;
            return this;
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a f(String str) {
            this.d = str;
            return this;
        }

        @Override // s11.e.a.AbstractC0522a
        public s11.e.a.AbstractC0522a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.b = str;
            return this;
        }
    }

    @Override // s11.e.a
    public String b() {
        return this.e;
    }

    @Override // s11.e.a
    public String c() {
        return this.f;
    }

    @Override // s11.e.a
    public String d() {
        return this.c;
    }

    @Override // s11.e.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.a)) {
            return false;
        }
        s11.e.a aVar = (s11.e.a) obj;
        if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
            aVar.g();
            String str2 = this.d;
            if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                String str3 = this.e;
                if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                    String str4 = this.f;
                    if (str4 == null) {
                        if (aVar.c() == null) {
                            return true;
                        }
                    } else if (str4.equals(aVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // s11.e.a
    public String f() {
        return this.d;
    }

    @Override // s11.e.a
    public s11.e.a.b g() {
        return null;
    }

    @Override // s11.e.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        return hashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + ((Object) null) + ", installationUuid=" + this.d + ", developmentPlatform=" + this.e + ", developmentPlatformVersion=" + this.f + "}";
    }

    private w00(String str, String str2, String str3, s11.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }
}
