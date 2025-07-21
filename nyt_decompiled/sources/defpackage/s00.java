package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class s00 extends s11.c {
    private final String a;
    private final String b;

    static final class b extends s11.c.a {
        private String a;
        private String b;

        b() {
        }

        @Override // s11.c.a
        public s11.c a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new s00(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.c.a
        public s11.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.a = str;
            return this;
        }

        @Override // s11.c.a
        public s11.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.b = str;
            return this;
        }
    }

    @Override // s11.c
    public String b() {
        return this.a;
    }

    @Override // s11.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.c)) {
            return false;
        }
        s11.c cVar = (s11.c) obj;
        return this.a.equals(cVar.b()) && this.b.equals(cVar.c());
    }

    public int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    private s00(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
