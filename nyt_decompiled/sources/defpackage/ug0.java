package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.eb7;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* loaded from: classes5.dex */
public final class ug0 extends eb7 {
    private static final TimeUnit d = TimeUnit.SECONDS;
    static final c e;
    static final a f;
    final ThreadFactory b;
    final AtomicReference c = new AtomicReference(f);

    private static final class a {
        private final ThreadFactory a;
        private final long b;
        private final ConcurrentLinkedQueue c;
        private final vs0 d;
        private final ScheduledExecutorService e;
        private final Future f;

        /* renamed from: ug0$a$a, reason: collision with other inner class name */
        class ThreadFactoryC0546a implements ThreadFactory {
            final /* synthetic */ ThreadFactory a;

            ThreadFactoryC0546a(ThreadFactory threadFactory) {
                this.a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.a.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a();
            }
        }

        a(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            this.a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.b = nanos;
            this.c = new ConcurrentLinkedQueue();
            this.d = new vs0();
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC0546a(threadFactory));
                r55.l(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.e = scheduledExecutorService;
            this.f = scheduledFuture;
        }

        void a() {
            if (this.c.isEmpty()) {
                return;
            }
            long c = c();
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                if (cVar.m() > c) {
                    return;
                }
                if (this.c.remove(cVar)) {
                    this.d.b(cVar);
                }
            }
        }

        c b() {
            if (this.d.isUnsubscribed()) {
                return ug0.e;
            }
            while (!this.c.isEmpty()) {
                c cVar = (c) this.c.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            c cVar2 = new c(this.a);
            this.d.a(cVar2);
            return cVar2;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.n(c() + this.b);
            this.c.offer(cVar);
        }

        void e() {
            try {
                Future future = this.f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.d.unsubscribe();
            } catch (Throwable th) {
                this.d.unsubscribe();
                throw th;
            }
        }
    }

    private static final class b extends eb7.a {
        static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(b.class, QueryKeys.SUBDOMAIN);
        private final vs0 a = new vs0();
        private final a b;
        private final c c;
        volatile int d;

        class a implements v3 {
            final /* synthetic */ v3 a;

            a(v3 v3Var) {
                this.a = v3Var;
            }

            @Override // defpackage.v3
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.a.call();
            }
        }

        b(a aVar) {
            this.b = aVar;
            this.c = aVar.b();
        }

        @Override // eb7.a
        public gb8 b(v3 v3Var) {
            return c(v3Var, 0L, null);
        }

        @Override // eb7.a
        public gb8 c(v3 v3Var, long j, TimeUnit timeUnit) {
            if (this.a.isUnsubscribed()) {
                return tb8.c();
            }
            ScheduledAction i = this.c.i(new a(v3Var), j, timeUnit);
            this.a.a(i);
            i.b(this.a);
            return i;
        }

        @Override // defpackage.gb8
        public boolean isUnsubscribed() {
            return this.a.isUnsubscribed();
        }

        @Override // defpackage.gb8
        public void unsubscribe() {
            if (e.compareAndSet(this, 0, 1)) {
                this.b.d(this.c);
            }
            this.a.unsubscribe();
        }
    }

    private static final class c extends r55 {
        private long j;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.j = 0L;
        }

        public long m() {
            return this.j;
        }

        public void n(long j) {
            this.j = j;
        }
    }

    static {
        c cVar = new c(RxThreadFactory.a);
        e = cVar;
        cVar.unsubscribe();
        a aVar = new a(null, 0L, null);
        f = aVar;
        aVar.e();
    }

    public ug0(ThreadFactory threadFactory) {
        this.b = threadFactory;
        b();
    }

    @Override // defpackage.eb7
    public eb7.a a() {
        return new b((a) this.c.get());
    }

    public void b() {
        a aVar = new a(this.b, 60L, d);
        if (kz4.a(this.c, f, aVar)) {
            return;
        }
        aVar.e();
    }
}
