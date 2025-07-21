package defpackage;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class pp0 extends AbstractExecutorService {
    public static final pp0 b = new pp0();
    private final ScheduledExecutorService a;

    private static class a implements Runnable {
        private final WeakReference a;
        private final c b;
        private volatile ScheduledFuture c = null;

        public a(c cVar, Object obj) {
            this.a = new WeakReference(obj);
            this.b = cVar;
        }

        public void a(ScheduledFuture scheduledFuture) {
            this.c = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.a.get();
            if (obj != null) {
                this.b.a(obj);
            } else if (this.c != null) {
                this.c.cancel(false);
            }
        }
    }

    private static final class b extends Thread {
        private final ScheduledExecutorService a;

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.a.shutdown();
            try {
                if (this.a.awaitTermination(5L, TimeUnit.SECONDS)) {
                    return;
                }
                this.a.shutdownNow();
            } catch (InterruptedException unused) {
                this.a.shutdownNow();
            }
        }

        private b(ScheduledExecutorService scheduledExecutorService) {
            super("dd-exec-shutdown-hook");
            this.a = scheduledExecutorService;
        }
    }

    public interface c {
        void a(Object obj);
    }

    private static class d implements ScheduledFuture {
        private final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return 0;
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return null;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return null;
        }
    }

    private pp0() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(d61.d);
        this.a = newSingleThreadScheduledExecutor;
        try {
            Runtime.getRuntime().addShutdownHook(new b(newSingleThreadScheduledExecutor));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public ScheduledFuture b(c cVar, Object obj, long j, long j2, TimeUnit timeUnit, String str) {
        if (!b.isShutdown()) {
            try {
                a aVar = new a(cVar, obj);
                ScheduledFuture<?> scheduleWithFixedDelay = this.a.scheduleWithFixedDelay(new a(cVar, obj), j, j2, timeUnit);
                aVar.a(scheduleWithFixedDelay);
                return scheduleWithFixedDelay;
            } catch (RejectedExecutionException unused) {
            }
        }
        return new d(str);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.a.shutdownNow();
    }
}
