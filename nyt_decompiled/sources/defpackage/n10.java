package defpackage;

import defpackage.c42;
import java.util.Map;

/* loaded from: classes2.dex */
final class n10 extends c42 {
    private final String a;
    private final Integer b;
    private final x02 c;
    private final long d;
    private final long e;
    private final Map f;

    static final class b extends c42.a {
        private String a;
        private Integer b;
        private x02 c;
        private Long d;
        private Long e;
        private Map f;

        b() {
        }

        @Override // c42.a
        public c42 d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new n10(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // c42.a
        protected Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // c42.a
        protected c42.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // c42.a
        public c42.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // c42.a
        public c42.a h(x02 x02Var) {
            if (x02Var == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = x02Var;
            return this;
        }

        @Override // c42.a
        public c42.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // c42.a
        public c42.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        @Override // c42.a
        public c42.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.c42
    protected Map c() {
        return this.f;
    }

    @Override // defpackage.c42
    public Integer d() {
        return this.b;
    }

    @Override // defpackage.c42
    public x02 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c42)) {
            return false;
        }
        c42 c42Var = (c42) obj;
        return this.a.equals(c42Var.j()) && ((num = this.b) != null ? num.equals(c42Var.d()) : c42Var.d() == null) && this.c.equals(c42Var.e()) && this.d == c42Var.f() && this.e == c42Var.k() && this.f.equals(c42Var.c());
    }

    @Override // defpackage.c42
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    @Override // defpackage.c42
    public String j() {
        return this.a;
    }

    @Override // defpackage.c42
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    private n10(String str, Integer num, x02 x02Var, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = x02Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
