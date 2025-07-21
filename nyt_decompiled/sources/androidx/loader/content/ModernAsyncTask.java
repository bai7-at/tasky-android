package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class ModernAsyncTask {
    private static final ThreadFactory f;
    private static final BlockingQueue g;
    public static final Executor h;
    private static f i;
    private static volatile Executor j;
    private final g a;
    private final FutureTask b;
    private volatile Status c = Status.PENDING;
    final AtomicBoolean d = new AtomicBoolean();
    final AtomicBoolean e = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    class b extends g {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            ModernAsyncTask.this.e.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = ModernAsyncTask.this.b(this.a);
                Binder.flushPendingCommands();
                return obj;
            } finally {
            }
        }
    }

    class c extends FutureTask {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                ModernAsyncTask.this.l(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.l(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    static /* synthetic */ class d {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class e {
        final ModernAsyncTask a;
        final Object[] b;

        e(ModernAsyncTask modernAsyncTask, Object... objArr) {
            this.a = modernAsyncTask;
            this.b = objArr;
        }
    }

    private static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                eVar.a.d(eVar.b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                eVar.a.j(eVar.b);
            }
        }
    }

    private static abstract class g implements Callable {
        Object[] a;

        g() {
        }
    }

    static {
        a aVar = new a();
        f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        h = threadPoolExecutor;
        j = threadPoolExecutor;
    }

    ModernAsyncTask() {
        b bVar = new b();
        this.a = bVar;
        this.b = new c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (ModernAsyncTask.class) {
            try {
                if (i == null) {
                    i = new f();
                }
                fVar = i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public final boolean a(boolean z) {
        this.d.set(true);
        return this.b.cancel(z);
    }

    protected abstract Object b(Object... objArr);

    public final ModernAsyncTask c(Executor executor, Object... objArr) {
        if (this.c == Status.PENDING) {
            this.c = Status.RUNNING;
            i();
            this.a.a = objArr;
            executor.execute(this.b);
            return this;
        }
        int i2 = d.a[this.c.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Object obj) {
        if (f()) {
            g(obj);
        } else {
            h(obj);
        }
        this.c = Status.FINISHED;
    }

    public final boolean f() {
        return this.d.get();
    }

    protected abstract void g(Object obj);

    protected abstract void h(Object obj);

    protected void i() {
    }

    protected void j(Object... objArr) {
    }

    Object k(Object obj) {
        e().obtainMessage(1, new e(this, obj)).sendToTarget();
        return obj;
    }

    void l(Object obj) {
        if (this.e.get()) {
            return;
        }
        k(obj);
    }
}
