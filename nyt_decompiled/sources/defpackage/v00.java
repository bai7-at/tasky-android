package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class v00 extends s11.e {
    private final String a;
    private final String b;
    private final long c;
    private final Long d;
    private final boolean e;
    private final s11.e.a f;
    private final s11.e.f g;
    private final s11.e.AbstractC0535e h;
    private final s11.e.c i;
    private final nh3 j;
    private final int k;

    static final class b extends s11.e.b {
        private String a;
        private String b;
        private Long c;
        private Long d;
        private Boolean e;
        private s11.e.a f;
        private s11.e.f g;
        private s11.e.AbstractC0535e h;
        private s11.e.c i;
        private nh3 j;
        private Integer k;

        @Override // s11.e.b
        public s11.e a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.c == null) {
                str = str + " startedAt";
            }
            if (this.e == null) {
                str = str + " crashed";
            }
            if (this.f == null) {
                str = str + " app";
            }
            if (this.k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new v00(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.b
        public s11.e.b b(s11.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f = aVar;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // s11.e.b
        public s11.e.b d(s11.e.c cVar) {
            this.i = cVar;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b e(Long l) {
            this.d = l;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b f(nh3 nh3Var) {
            this.j = nh3Var;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.a = str;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b h(int i) {
            this.k = Integer.valueOf(i);
            return this;
        }

        @Override // s11.e.b
        public s11.e.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.b = str;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b k(s11.e.AbstractC0535e abstractC0535e) {
            this.h = abstractC0535e;
            return this;
        }

        @Override // s11.e.b
        public s11.e.b l(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.b
        public s11.e.b m(s11.e.f fVar) {
            this.g = fVar;
            return this;
        }

        b() {
        }

        private b(s11.e eVar) {
            this.a = eVar.f();
            this.b = eVar.h();
            this.c = Long.valueOf(eVar.k());
            this.d = eVar.d();
            this.e = Boolean.valueOf(eVar.m());
            this.f = eVar.b();
            this.g = eVar.l();
            this.h = eVar.j();
            this.i = eVar.c();
            this.j = eVar.e();
            this.k = Integer.valueOf(eVar.g());
        }
    }

    @Override // s11.e
    public s11.e.a b() {
        return this.f;
    }

    @Override // s11.e
    public s11.e.c c() {
        return this.i;
    }

    @Override // s11.e
    public Long d() {
        return this.d;
    }

    @Override // s11.e
    public nh3 e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        Long l;
        s11.e.f fVar;
        s11.e.AbstractC0535e abstractC0535e;
        s11.e.c cVar;
        nh3 nh3Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e)) {
            return false;
        }
        s11.e eVar = (s11.e) obj;
        return this.a.equals(eVar.f()) && this.b.equals(eVar.h()) && this.c == eVar.k() && ((l = this.d) != null ? l.equals(eVar.d()) : eVar.d() == null) && this.e == eVar.m() && this.f.equals(eVar.b()) && ((fVar = this.g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0535e = this.h) != null ? abstractC0535e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((nh3Var = this.j) != null ? nh3Var.equals(eVar.e()) : eVar.e() == null) && this.k == eVar.g();
    }

    @Override // s11.e
    public String f() {
        return this.a;
    }

    @Override // s11.e
    public int g() {
        return this.k;
    }

    @Override // s11.e
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.d;
        int hashCode2 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        s11.e.f fVar = this.g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        s11.e.AbstractC0535e abstractC0535e = this.h;
        int hashCode4 = (hashCode3 ^ (abstractC0535e == null ? 0 : abstractC0535e.hashCode())) * 1000003;
        s11.e.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        nh3 nh3Var = this.j;
        return this.k ^ ((hashCode5 ^ (nh3Var != null ? nh3Var.hashCode() : 0)) * 1000003);
    }

    @Override // s11.e
    public s11.e.AbstractC0535e j() {
        return this.h;
    }

    @Override // s11.e
    public long k() {
        return this.c;
    }

    @Override // s11.e
    public s11.e.f l() {
        return this.g;
    }

    @Override // s11.e
    public boolean m() {
        return this.e;
    }

    @Override // s11.e
    public s11.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", startedAt=" + this.c + ", endedAt=" + this.d + ", crashed=" + this.e + ", app=" + this.f + ", user=" + this.g + ", os=" + this.h + ", device=" + this.i + ", events=" + this.j + ", generatorType=" + this.k + "}";
    }

    private v00(String str, String str2, long j, Long l, boolean z, s11.e.a aVar, s11.e.f fVar, s11.e.AbstractC0535e abstractC0535e, s11.e.c cVar, nh3 nh3Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = abstractC0535e;
        this.i = cVar;
        this.j = nh3Var;
        this.k = i;
    }
}
