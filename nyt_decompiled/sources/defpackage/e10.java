package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class e10 extends s11.e.d.a.b.AbstractC0528d {
    private final String a;
    private final String b;
    private final long c;

    static final class b extends s11.e.d.a.b.AbstractC0528d.AbstractC0529a {
        private String a;
        private String b;
        private Long c;

        b() {
        }

        @Override // s11.e.d.a.b.AbstractC0528d.AbstractC0529a
        public s11.e.d.a.b.AbstractC0528d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new e10(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.AbstractC0528d.AbstractC0529a
        public s11.e.d.a.b.AbstractC0528d.AbstractC0529a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0528d.AbstractC0529a
        public s11.e.d.a.b.AbstractC0528d.AbstractC0529a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.b = str;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0528d.AbstractC0529a
        public s11.e.d.a.b.AbstractC0528d.AbstractC0529a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.a = str;
            return this;
        }
    }

    @Override // s11.e.d.a.b.AbstractC0528d
    public long b() {
        return this.c;
    }

    @Override // s11.e.d.a.b.AbstractC0528d
    public String c() {
        return this.b;
    }

    @Override // s11.e.d.a.b.AbstractC0528d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b.AbstractC0528d)) {
            return false;
        }
        s11.e.d.a.b.AbstractC0528d abstractC0528d = (s11.e.d.a.b.AbstractC0528d) obj;
        return this.a.equals(abstractC0528d.d()) && this.b.equals(abstractC0528d.c()) && this.c == abstractC0528d.b();
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    private e10(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
