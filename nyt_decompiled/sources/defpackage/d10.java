package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class d10 extends s11.e.d.a.b.c {
    private final String a;
    private final String b;
    private final nh3 c;
    private final s11.e.d.a.b.c d;
    private final int e;

    static final class b extends s11.e.d.a.b.c.AbstractC0527a {
        private String a;
        private String b;
        private nh3 c;
        private s11.e.d.a.b.c d;
        private Integer e;

        b() {
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c a() {
            String str = "";
            if (this.a == null) {
                str = " type";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (this.e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new d10(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c.AbstractC0527a b(s11.e.d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c.AbstractC0527a c(nh3 nh3Var) {
            if (nh3Var == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = nh3Var;
            return this;
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c.AbstractC0527a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c.AbstractC0527a e(String str) {
            this.b = str;
            return this;
        }

        @Override // s11.e.d.a.b.c.AbstractC0527a
        public s11.e.d.a.b.c.AbstractC0527a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.e.d.a.b.c
    public s11.e.d.a.b.c b() {
        return this.d;
    }

    @Override // s11.e.d.a.b.c
    public nh3 c() {
        return this.c;
    }

    @Override // s11.e.d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // s11.e.d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        s11.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b.c)) {
            return false;
        }
        s11.e.d.a.b.c cVar2 = (s11.e.d.a.b.c) obj;
        return this.a.equals(cVar2.f()) && ((str = this.b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.c.equals(cVar2.c()) && ((cVar = this.d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.e == cVar2.d();
    }

    @Override // s11.e.d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        s11.e.d.a.b.c cVar = this.d;
        return this.e ^ ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003);
    }

    public String toString() {
        return "Exception{type=" + this.a + ", reason=" + this.b + ", frames=" + this.c + ", causedBy=" + this.d + ", overflowCount=" + this.e + "}";
    }

    private d10(String str, String str2, nh3 nh3Var, s11.e.d.a.b.c cVar, int i) {
        this.a = str;
        this.b = str2;
        this.c = nh3Var;
        this.d = cVar;
        this.e = i;
    }
}
