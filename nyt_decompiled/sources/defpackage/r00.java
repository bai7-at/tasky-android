package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class r00 extends s11.a {
    private final int a;
    private final String b;
    private final int c;
    private final int d;
    private final long e;
    private final long f;
    private final long g;
    private final String h;

    static final class b extends s11.a.AbstractC0521a {
        private Integer a;
        private String b;
        private Integer c;
        private Integer d;
        private Long e;
        private Long f;
        private Long g;
        private String h;

        b() {
        }

        @Override // s11.a.AbstractC0521a
        public s11.a a() {
            String str = "";
            if (this.a == null) {
                str = " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.d == null) {
                str = str + " importance";
            }
            if (this.e == null) {
                str = str + " pss";
            }
            if (this.f == null) {
                str = str + " rss";
            }
            if (this.g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new r00(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a e(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a f(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a g(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a h(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // s11.a.AbstractC0521a
        public s11.a.AbstractC0521a i(String str) {
            this.h = str;
            return this;
        }
    }

    @Override // s11.a
    public int b() {
        return this.d;
    }

    @Override // s11.a
    public int c() {
        return this.a;
    }

    @Override // s11.a
    public String d() {
        return this.b;
    }

    @Override // s11.a
    public long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.a)) {
            return false;
        }
        s11.a aVar = (s11.a) obj;
        if (this.a == aVar.c() && this.b.equals(aVar.d()) && this.c == aVar.f() && this.d == aVar.b() && this.e == aVar.e() && this.f == aVar.g() && this.g == aVar.h()) {
            String str = this.h;
            if (str == null) {
                if (aVar.i() == null) {
                    return true;
                }
            } else if (str.equals(aVar.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // s11.a
    public int f() {
        return this.c;
    }

    @Override // s11.a
    public long g() {
        return this.f;
    }

    @Override // s11.a
    public long h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        return (str == null ? 0 : str.hashCode()) ^ i3;
    }

    @Override // s11.a
    public String i() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + "}";
    }

    private r00(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
    }
}
