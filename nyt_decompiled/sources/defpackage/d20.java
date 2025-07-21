package defpackage;

import defpackage.qj7;

/* loaded from: classes2.dex */
final class d20 extends qj7 {
    private final as8 a;
    private final String b;
    private final b32 c;
    private final br8 d;
    private final f12 e;

    static final class b extends qj7.a {
        private as8 a;
        private String b;
        private b32 c;
        private br8 d;
        private f12 e;

        b() {
        }

        @Override // qj7.a
        public qj7 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new d20(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // qj7.a
        qj7.a b(f12 f12Var) {
            if (f12Var == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = f12Var;
            return this;
        }

        @Override // qj7.a
        qj7.a c(b32 b32Var) {
            if (b32Var == null) {
                throw new NullPointerException("Null event");
            }
            this.c = b32Var;
            return this;
        }

        @Override // qj7.a
        qj7.a d(br8 br8Var) {
            if (br8Var == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = br8Var;
            return this;
        }

        @Override // qj7.a
        public qj7.a e(as8 as8Var) {
            if (as8Var == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = as8Var;
            return this;
        }

        @Override // qj7.a
        public qj7.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = str;
            return this;
        }
    }

    @Override // defpackage.qj7
    public f12 b() {
        return this.e;
    }

    @Override // defpackage.qj7
    b32 c() {
        return this.c;
    }

    @Override // defpackage.qj7
    br8 e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qj7)) {
            return false;
        }
        qj7 qj7Var = (qj7) obj;
        return this.a.equals(qj7Var.f()) && this.b.equals(qj7Var.g()) && this.c.equals(qj7Var.c()) && this.d.equals(qj7Var.e()) && this.e.equals(qj7Var.b());
    }

    @Override // defpackage.qj7
    public as8 f() {
        return this.a;
    }

    @Override // defpackage.qj7
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }

    private d20(as8 as8Var, String str, b32 b32Var, br8 br8Var, f12 f12Var) {
        this.a = as8Var;
        this.b = str;
        this.c = b32Var;
        this.d = br8Var;
        this.e = f12Var;
    }
}
