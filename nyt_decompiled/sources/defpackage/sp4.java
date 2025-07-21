package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class sp4 {
    private final long a;
    private final long b;
    private final TimeUnit c;
    private final long d;

    public static class a {
        private long a = -1;
        private long b = -1;
        private TimeUnit c = TimeUnit.SECONDS;
        private long d = -1;

        public sp4 a() {
            return new sp4(this.a, this.b, this.c, this.d);
        }

        public a b(TimeUnit timeUnit) {
            this.c = timeUnit;
            return this;
        }

        public a c(long j) {
            if (this.b != -1) {
                throw new IllegalStateException("Cannot set expireAfterWrite with expireAfterAccess already set");
            }
            this.a = j;
            return this;
        }

        public a d(long j) {
            this.d = j;
            return this;
        }
    }

    sp4(long j, long j2, TimeUnit timeUnit, long j3) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = j3;
    }

    public static a a() {
        return new a();
    }

    public long b() {
        return this.b;
    }

    public TimeUnit c() {
        return this.c;
    }

    public long d() {
        return this.a;
    }

    public long e() {
        if (h()) {
            return 1L;
        }
        return this.d;
    }

    public boolean f() {
        return this.b != -1;
    }

    public boolean g() {
        return this.a != -1;
    }

    public boolean h() {
        return this.d == -1;
    }
}
