package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class b10 extends s11.e.d.a.b {
    private final nh3 a;
    private final s11.e.d.a.b.c b;
    private final s11.a c;
    private final s11.e.d.a.b.AbstractC0528d d;
    private final nh3 e;

    static final class b extends s11.e.d.a.b.AbstractC0526b {
        private nh3 a;
        private s11.e.d.a.b.c b;
        private s11.a c;
        private s11.e.d.a.b.AbstractC0528d d;
        private nh3 e;

        b() {
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b a() {
            String str = "";
            if (this.d == null) {
                str = " signal";
            }
            if (this.e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new b10(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b.AbstractC0526b b(s11.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b.AbstractC0526b c(nh3 nh3Var) {
            if (nh3Var == null) {
                throw new NullPointerException("Null binaries");
            }
            this.e = nh3Var;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b.AbstractC0526b d(s11.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b.AbstractC0526b e(s11.e.d.a.b.AbstractC0528d abstractC0528d) {
            if (abstractC0528d == null) {
                throw new NullPointerException("Null signal");
            }
            this.d = abstractC0528d;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0526b
        public s11.e.d.a.b.AbstractC0526b f(nh3 nh3Var) {
            this.a = nh3Var;
            return this;
        }
    }

    @Override // s11.e.d.a.b
    public s11.a b() {
        return this.c;
    }

    @Override // s11.e.d.a.b
    public nh3 c() {
        return this.e;
    }

    @Override // s11.e.d.a.b
    public s11.e.d.a.b.c d() {
        return this.b;
    }

    @Override // s11.e.d.a.b
    public s11.e.d.a.b.AbstractC0528d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b)) {
            return false;
        }
        s11.e.d.a.b bVar = (s11.e.d.a.b) obj;
        nh3 nh3Var = this.a;
        if (nh3Var != null ? nh3Var.equals(bVar.f()) : bVar.f() == null) {
            s11.e.d.a.b.c cVar = this.b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                s11.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // s11.e.d.a.b
    public nh3 f() {
        return this.a;
    }

    public int hashCode() {
        nh3 nh3Var = this.a;
        int hashCode = ((nh3Var == null ? 0 : nh3Var.hashCode()) ^ 1000003) * 1000003;
        s11.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        s11.a aVar = this.c;
        return this.e.hashCode() ^ ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    private b10(nh3 nh3Var, s11.e.d.a.b.c cVar, s11.a aVar, s11.e.d.a.b.AbstractC0528d abstractC0528d, nh3 nh3Var2) {
        this.a = nh3Var;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0528d;
        this.e = nh3Var2;
    }
}
