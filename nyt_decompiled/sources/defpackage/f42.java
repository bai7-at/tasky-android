package defpackage;

import defpackage.eb7;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.RxThreadFactory;

/* loaded from: classes5.dex */
public final class f42 extends eb7 {
    static final int d;
    static final c e;
    static final b f;
    final ThreadFactory b;
    final AtomicReference c = new AtomicReference(f);

    private static class a extends eb7.a {
        private final jb8 a;
        private final vs0 b;
        private final jb8 c;
        private final c d;

        /* renamed from: f42$a$a, reason: collision with other inner class name */
        class C0482a implements v3 {
            final /* synthetic */ v3 a;

            C0482a(v3 v3Var) {
                this.a = v3Var;
            }

            @Override // defpackage.v3
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        class b implements v3 {
            final /* synthetic */ v3 a;

            b(v3 v3Var) {
                this.a = v3Var;
            }

            @Override // defpackage.v3
            public void call() {
                if (a.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        a(c cVar) {
            jb8 jb8Var = new jb8();
            this.a = jb8Var;
            vs0 vs0Var = new vs0();
            this.b = vs0Var;
            this.c = new jb8(jb8Var, vs0Var);
            this.d = cVar;
        }

        @Override // eb7.a
        public gb8 b(v3 v3Var) {
            return isUnsubscribed() ? tb8.c() : this.d.k(new C0482a(v3Var), 0L, null, this.a);
        }

        @Override // eb7.a
        public gb8 c(v3 v3Var, long j, TimeUnit timeUnit) {
            return isUnsubscribed() ? tb8.c() : this.d.j(new b(v3Var), j, timeUnit, this.b);
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.c.isUnsubscribed();
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            this.c.unsubscribe();
        }
    }

    static final class b {
        final int a;
        final c[] b;
        long c;

        b(ThreadFactory threadFactory, int i) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return f42.e;
            }
            c[] cVarArr = this.b;
            long j = this.c;
            this.c = 1 + j;
            return cVarArr[(int) (j % i)];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.unsubscribe();
            }
        }
    }

    static final class c extends r55 {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        d = intValue;
        c cVar = new c(RxThreadFactory.a);
        e = cVar;
        cVar.unsubscribe();
        f = new b(null, 0);
    }

    public f42(ThreadFactory threadFactory) {
        this.b = threadFactory;
        c();
    }

    @Override // defpackage.eb7
    public eb7.a a() {
        return new a(((b) this.c.get()).a());
    }

    public gb8 b(v3 v3Var) {
        return ((b) this.c.get()).a().i(v3Var, -1L, TimeUnit.NANOSECONDS);
    }

    public void c() {
        b bVar = new b(this.b, d);
        if (kz4.a(this.c, f, bVar)) {
            return;
        }
        bVar.b();
    }
}
