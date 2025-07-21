package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class eb7 {
    static final long a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    public static abstract class a implements gb8 {

        /* renamed from: eb7$a$a, reason: collision with other inner class name */
        class C0480a implements v3 {
            long a;
            long b;
            long c;
            final /* synthetic */ long d;
            final /* synthetic */ long e;
            final /* synthetic */ ux4 f;
            final /* synthetic */ v3 g;
            final /* synthetic */ long h;

            C0480a(long j, long j2, ux4 ux4Var, v3 v3Var, long j3) {
                this.d = j;
                this.e = j2;
                this.f = ux4Var;
                this.g = v3Var;
                this.h = j3;
                this.b = j;
                this.c = j2;
            }

            @Override // defpackage.v3
            public void call() {
                long j;
                if (this.f.isUnsubscribed()) {
                    return;
                }
                this.g.call();
                long nanos = TimeUnit.MILLISECONDS.toNanos(a.this.a());
                long j2 = eb7.a;
                long j3 = nanos + j2;
                long j4 = this.b;
                if (j3 >= j4) {
                    long j5 = this.h;
                    if (nanos < j4 + j5 + j2) {
                        long j6 = this.c;
                        long j7 = this.a + 1;
                        this.a = j7;
                        j = j6 + (j7 * j5);
                        this.b = nanos;
                        this.f.a(a.this.c(this, j - nanos, TimeUnit.NANOSECONDS));
                    }
                }
                long j8 = this.h;
                long j9 = nanos + j8;
                long j10 = this.a + 1;
                this.a = j10;
                this.c = j9 - (j8 * j10);
                j = j9;
                this.b = nanos;
                this.f.a(a.this.c(this, j - nanos, TimeUnit.NANOSECONDS));
            }
        }

        public long a() {
            return System.currentTimeMillis();
        }

        public abstract gb8 b(v3 v3Var);

        public abstract gb8 c(v3 v3Var, long j, TimeUnit timeUnit);

        public gb8 d(v3 v3Var, long j, long j2, TimeUnit timeUnit) {
            long nanos = timeUnit.toNanos(j2);
            long nanos2 = TimeUnit.MILLISECONDS.toNanos(a());
            long nanos3 = nanos2 + timeUnit.toNanos(j);
            ux4 ux4Var = new ux4();
            C0480a c0480a = new C0480a(nanos2, nanos3, ux4Var, v3Var, nanos);
            ux4 ux4Var2 = new ux4();
            ux4Var.a(ux4Var2);
            ux4Var2.a(c(c0480a, j, timeUnit));
            return ux4Var;
        }
    }

    public abstract a a();
}
