package defpackage;

import defpackage.x42;

/* loaded from: classes2.dex */
final class o10 extends x42 {
    private final long b;
    private final int c;
    private final int d;
    private final long e;
    private final int f;

    static final class b extends x42.a {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // x42.a
        x42 a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new o10(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // x42.a
        x42.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // x42.a
        x42.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // x42.a
        x42.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // x42.a
        x42.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // x42.a
        x42.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.x42
    int b() {
        return this.d;
    }

    @Override // defpackage.x42
    long c() {
        return this.e;
    }

    @Override // defpackage.x42
    int d() {
        return this.c;
    }

    @Override // defpackage.x42
    int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        return this.b == x42Var.f() && this.c == x42Var.d() && this.d == x42Var.b() && this.e == x42Var.c() && this.f == x42Var.e();
    }

    @Override // defpackage.x42
    long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return this.f ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    private o10(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
