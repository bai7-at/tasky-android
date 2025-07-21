package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes.dex */
public abstract class iu0 {

    public static final class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ boolean b;

        a(boolean z) {
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            zq3.h(runnable, "runnable");
            return new Thread(runnable, (this.b ? "WM.task-" : "androidx.work-") + this.a.incrementAndGet());
        }
    }

    public static final class b implements ip8 {
        b() {
        }

        @Override // defpackage.ip8
        public void a(String str) {
            zq3.h(str, "label");
            ro8.b(str);
        }

        @Override // defpackage.ip8
        public void b(String str, int i) {
            zq3.h(str, "methodName");
            ro8.c(str, i);
        }

        @Override // defpackage.ip8
        public void c(String str, int i) {
            zq3.h(str, "methodName");
            ro8.a(str, i);
        }

        @Override // defpackage.ip8
        public void d() {
            ro8.d();
        }

        @Override // defpackage.ip8
        public boolean isEnabled() {
            return ro8.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor d(CoroutineContext coroutineContext) {
        c cVar = coroutineContext != null ? (c) coroutineContext.get(c.P) : null;
        CoroutineDispatcher coroutineDispatcher = cVar instanceof CoroutineDispatcher ? (CoroutineDispatcher) cVar : null;
        if (coroutineDispatcher != null) {
            return ExecutorsKt.asExecutor(coroutineDispatcher);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor e(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(z));
        zq3.g(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ip8 f() {
        return new b();
    }
}
