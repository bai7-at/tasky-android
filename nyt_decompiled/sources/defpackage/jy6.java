package defpackage;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
abstract class jy6 {

    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* renamed from: jy6$a$a, reason: collision with other inner class name */
        private static class C0493a extends Thread {
            private final int a;

            C0493a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.a = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.a);
                super.run();
            }
        }

        a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0493a(runnable, this.a, this.b);
        }
    }

    private static class b implements Runnable {
        private Callable a;
        private lv0 b;
        private Handler c;

        class a implements Runnable {
            final /* synthetic */ lv0 a;
            final /* synthetic */ Object b;

            a(lv0 lv0Var, Object obj) {
                this.a = lv0Var;
                this.b = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.accept(this.b);
            }
        }

        b(Handler handler, Callable callable, lv0 lv0Var) {
            this.a = callable;
            this.b = lv0Var;
            this.c = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.a.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.c.post(new a(this.b, obj));
        }
    }

    static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static void b(Executor executor, Callable callable, lv0 lv0Var) {
        executor.execute(new b(bh0.a(), callable, lv0Var));
    }

    static Object c(ExecutorService executorService, Callable callable, int i) {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
