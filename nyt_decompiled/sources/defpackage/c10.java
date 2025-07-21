package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class c10 extends s11.e.d.a.b.AbstractC0524a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    static final class b extends s11.e.d.a.b.AbstractC0524a.AbstractC0525a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        b() {
        }

        @Override // s11.e.d.a.b.AbstractC0524a.AbstractC0525a
        public s11.e.d.a.b.AbstractC0524a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new c10(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.AbstractC0524a.AbstractC0525a
        public s11.e.d.a.b.AbstractC0524a.AbstractC0525a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0524a.AbstractC0525a
        public s11.e.d.a.b.AbstractC0524a.AbstractC0525a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.c = str;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0524a.AbstractC0525a
        public s11.e.d.a.b.AbstractC0524a.AbstractC0525a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0524a.AbstractC0525a
        public s11.e.d.a.b.AbstractC0524a.AbstractC0525a e(String str) {
            this.d = str;
            return this;
        }
    }

    @Override // s11.e.d.a.b.AbstractC0524a
    public long b() {
        return this.a;
    }

    @Override // s11.e.d.a.b.AbstractC0524a
    public String c() {
        return this.c;
    }

    @Override // s11.e.d.a.b.AbstractC0524a
    public long d() {
        return this.b;
    }

    @Override // s11.e.d.a.b.AbstractC0524a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b.AbstractC0524a)) {
            return false;
        }
        s11.e.d.a.b.AbstractC0524a abstractC0524a = (s11.e.d.a.b.AbstractC0524a) obj;
        if (this.a == abstractC0524a.b() && this.b == abstractC0524a.d() && this.c.equals(abstractC0524a.c())) {
            String str = this.d;
            if (str == null) {
                if (abstractC0524a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0524a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    private c10(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
