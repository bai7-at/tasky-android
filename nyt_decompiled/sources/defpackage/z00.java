package defpackage;

import defpackage.s11;

/* loaded from: classes3.dex */
final class z00 extends s11.e.d {
    private final long a;
    private final String b;
    private final s11.e.d.a c;
    private final s11.e.d.c d;
    private final s11.e.d.AbstractC0534d e;

    static final class b extends s11.e.d.b {
        private Long a;
        private String b;
        private s11.e.d.a c;
        private s11.e.d.c d;
        private s11.e.d.AbstractC0534d e;

        @Override // s11.e.d.b
        public s11.e.d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new z00(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // s11.e.d.b
        public s11.e.d.b b(s11.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.c = aVar;
            return this;
        }

        @Override // s11.e.d.b
        public s11.e.d.b c(s11.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.d = cVar;
            return this;
        }

        @Override // s11.e.d.b
        public s11.e.d.b d(s11.e.d.AbstractC0534d abstractC0534d) {
            this.e = abstractC0534d;
            return this;
        }

        @Override // s11.e.d.b
        public s11.e.d.b e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // s11.e.d.b
        public s11.e.d.b f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.b = str;
            return this;
        }

        b() {
        }

        private b(s11.e.d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
        }
    }

    @Override // s11.e.d
    public s11.e.d.a b() {
        return this.c;
    }

    @Override // s11.e.d
    public s11.e.d.c c() {
        return this.d;
    }

    @Override // s11.e.d
    public s11.e.d.AbstractC0534d d() {
        return this.e;
    }

    @Override // s11.e.d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s11.e.d)) {
            return false;
        }
        s11.e.d dVar = (s11.e.d) obj;
        if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c())) {
            s11.e.d.AbstractC0534d abstractC0534d = this.e;
            if (abstractC0534d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC0534d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // s11.e.d
    public String f() {
        return this.b;
    }

    @Override // s11.e.d
    public s11.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        s11.e.d.AbstractC0534d abstractC0534d = this.e;
        return (abstractC0534d == null ? 0 : abstractC0534d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }

    private z00(long j, String str, s11.e.d.a aVar, s11.e.d.c cVar, s11.e.d.AbstractC0534d abstractC0534d) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0534d;
    }
}
