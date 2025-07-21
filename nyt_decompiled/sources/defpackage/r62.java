package defpackage;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class r62 {

    class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* renamed from: r62$a$a, reason: collision with other inner class name */
        class C0520a extends q30 {
            final /* synthetic */ Runnable a;

            C0520a(Runnable runnable) {
                this.a = runnable;
            }

            @Override // defpackage.q30
            public void a() {
                this.a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0520a(runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    class b extends q30 {
        final /* synthetic */ String a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ long c;
        final /* synthetic */ TimeUnit d;

        b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.a = str;
            this.b = executorService;
            this.c = j;
            this.d = timeUnit;
        }

        @Override // defpackage.q30
        public void a() {
            try {
                m94.f().b("Executing shutdown hook for " + this.a);
                this.b.shutdown();
                if (this.b.awaitTermination(this.c, this.d)) {
                    return;
                }
                m94.f().b(this.a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.b.shutdownNow();
            } catch (InterruptedException unused) {
                m94.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.a));
                this.b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e);
        return e;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
