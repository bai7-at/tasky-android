package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class f10 extends s11.e.d.a.b.AbstractC0530e {
    private final String a;
    private final int b;
    private final nh3 c;

    static final class b extends s11.e.d.a.b.AbstractC0530e.AbstractC0531a {
        private String a;
        private Integer b;
        private nh3 c;

        b() {
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0531a
        public s11.e.d.a.b.AbstractC0530e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new f10(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0531a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0531a b(nh3 nh3Var) {
            if (nh3Var == null) {
                throw new NullPointerException("Null frames");
            }
            this.c = nh3Var;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0531a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0531a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0531a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0531a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.e.d.a.b.AbstractC0530e
    public nh3 b() {
        return this.c;
    }

    @Override // s11.e.d.a.b.AbstractC0530e
    public int c() {
        return this.b;
    }

    @Override // s11.e.d.a.b.AbstractC0530e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b.AbstractC0530e)) {
            return false;
        }
        s11.e.d.a.b.AbstractC0530e abstractC0530e = (s11.e.d.a.b.AbstractC0530e) obj;
        return this.a.equals(abstractC0530e.d()) && this.b == abstractC0530e.c() && this.c.equals(abstractC0530e.b());
    }

    public int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }

    private f10(String str, int i, nh3 nh3Var) {
        this.a = str;
        this.b = i;
        this.c = nh3Var;
    }
}
