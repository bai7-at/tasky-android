package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class g10 extends s11.e.d.a.b.AbstractC0530e.AbstractC0532b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    static final class b extends s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new g10(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a b(String str) {
            this.c = str;
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a
        public s11.e.d.a.b.AbstractC0530e.AbstractC0532b.AbstractC0533a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.b = str;
            return this;
        }
    }

    @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b
    public String b() {
        return this.c;
    }

    @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b
    public int c() {
        return this.e;
    }

    @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b
    public long d() {
        return this.d;
    }

    @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d.a.b.AbstractC0530e.AbstractC0532b)) {
            return false;
        }
        s11.e.d.a.b.AbstractC0530e.AbstractC0532b abstractC0532b = (s11.e.d.a.b.AbstractC0530e.AbstractC0532b) obj;
        return this.a == abstractC0532b.e() && this.b.equals(abstractC0532b.f()) && ((str = this.c) != null ? str.equals(abstractC0532b.b()) : abstractC0532b.b() == null) && this.d == abstractC0532b.d() && this.e == abstractC0532b.c();
    }

    @Override // s11.e.d.a.b.AbstractC0530e.AbstractC0532b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j2 = this.d;
        return this.e ^ ((hashCode2 ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }

    private g10(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }
}
