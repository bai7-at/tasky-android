package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class p00 extends s11 {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final s11.e h;
    private final s11.d i;

    static final class b extends s11.b {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private s11.e g;
        private s11.d h;

        @Override // s11.b
        public s11 a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new p00(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.b
        public s11.b b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.e = str;
            return this;
        }

        @Override // s11.b
        public s11.b c(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f = str;
            return this;
        }

        @Override // s11.b
        public s11.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.b = str;
            return this;
        }

        @Override // s11.b
        public s11.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.d = str;
            return this;
        }

        @Override // s11.b
        public s11.b f(s11.d dVar) {
            this.h = dVar;
            return this;
        }

        @Override // s11.b
        public s11.b g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // s11.b
        public s11.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.a = str;
            return this;
        }

        @Override // s11.b
        public s11.b i(s11.e eVar) {
            this.g = eVar;
            return this;
        }

        b() {
        }

        private b(s11 s11Var) {
            this.a = s11Var.i();
            this.b = s11Var.e();
            this.c = Integer.valueOf(s11Var.h());
            this.d = s11Var.f();
            this.e = s11Var.c();
            this.f = s11Var.d();
            this.g = s11Var.j();
            this.h = s11Var.g();
        }
    }

    @Override // defpackage.s11
    public String c() {
        return this.f;
    }

    @Override // defpackage.s11
    public String d() {
        return this.g;
    }

    @Override // defpackage.s11
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        s11.e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11)) {
            return false;
        }
        s11 s11Var = (s11) obj;
        if (this.b.equals(s11Var.i()) && this.c.equals(s11Var.e()) && this.d == s11Var.h() && this.e.equals(s11Var.f()) && this.f.equals(s11Var.c()) && this.g.equals(s11Var.d()) && ((eVar = this.h) != null ? eVar.equals(s11Var.j()) : s11Var.j() == null)) {
            s11.d dVar = this.i;
            if (dVar == null) {
                if (s11Var.g() == null) {
                    return true;
                }
            } else if (dVar.equals(s11Var.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s11
    public String f() {
        return this.e;
    }

    @Override // defpackage.s11
    public s11.d g() {
        return this.i;
    }

    @Override // defpackage.s11
    public int h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        s11.e eVar = this.h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        s11.d dVar = this.i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // defpackage.s11
    public String i() {
        return this.b;
    }

    @Override // defpackage.s11
    public s11.e j() {
        return this.h;
    }

    @Override // defpackage.s11
    protected s11.b k() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }

    private p00(String str, String str2, int i, String str3, String str4, String str5, s11.e eVar, s11.d dVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = eVar;
        this.i = dVar;
    }
}
