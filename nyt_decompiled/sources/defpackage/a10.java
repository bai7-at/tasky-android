package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class a10 extends s11.e.d.a {
    private final s11.e.d.a.b a;
    private final nh3 b;
    private final nh3 c;
    private final Boolean d;
    private final int e;

    static final class b extends s11.e.d.a.AbstractC0523a {
        private s11.e.d.a.b a;
        private nh3 b;
        private nh3 c;
        private Boolean d;
        private Integer e;

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new a10(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a.AbstractC0523a b(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a.AbstractC0523a c(nh3 nh3Var) {
            this.b = nh3Var;
            return this;
        }

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a.AbstractC0523a d(s11.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.a = bVar;
            return this;
        }

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a.AbstractC0523a e(nh3 nh3Var) {
            this.c = nh3Var;
            return this;
        }

        @Override // s11.e.d.a.AbstractC0523a
        public s11.e.d.a.AbstractC0523a f(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        b() {
        }

        private b(s11.e.d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.e();
            this.d = aVar.b();
            this.e = Integer.valueOf(aVar.f());
        }
    }

    @Override // s11.e.d.a
    public Boolean b() {
        return this.d;
    }

    @Override // s11.e.d.a
    public nh3 c() {
        return this.b;
    }

    @Override // s11.e.d.a
    public s11.e.d.a.b d() {
        return this.a;
    }

    @Override // s11.e.d.a
    public nh3 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        nh3 nh3Var;
        nh3 nh3Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a)) {
            return false;
        }
        s11.e.d.a aVar = (s11.e.d.a) obj;
        return this.a.equals(aVar.d()) && ((nh3Var = this.b) != null ? nh3Var.equals(aVar.c()) : aVar.c() == null) && ((nh3Var2 = this.c) != null ? nh3Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.e == aVar.f();
    }

    @Override // s11.e.d.a
    public int f() {
        return this.e;
    }

    @Override // s11.e.d.a
    public s11.e.d.a.AbstractC0523a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        nh3 nh3Var = this.b;
        int hashCode2 = (hashCode ^ (nh3Var == null ? 0 : nh3Var.hashCode())) * 1000003;
        nh3 nh3Var2 = this.c;
        int hashCode3 = (hashCode2 ^ (nh3Var2 == null ? 0 : nh3Var2.hashCode())) * 1000003;
        Boolean bool = this.d;
        return this.e ^ ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", uiOrientation=" + this.e + "}";
    }

    private a10(s11.e.d.a.b bVar, nh3 nh3Var, nh3 nh3Var2, Boolean bool, int i) {
        this.a = bVar;
        this.b = nh3Var;
        this.c = nh3Var2;
        this.d = bool;
        this.e = i;
    }
}
