package defpackage;

import defpackage.eb7;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.schedulers.ScheduledAction;
import rx.internal.util.RxThreadFactory;

/* loaded from: classes5.dex */
public class r55 extends eb7.a implements gb8 {
    private static final boolean d;
    private static volatile Object h;
    private static final Object i;
    private final ScheduledExecutorService a;
    private final s47 b;
    volatile boolean c;
    private static final ConcurrentHashMap f = new ConcurrentHashMap();
    private static final AtomicReference g = new AtomicReference();
    public static final int e = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT).intValue();

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r55.g();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int a2 = gu5.a();
        d = !z && (a2 == 0 || a2 >= 21);
        i = new Object();
    }

    public r55(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!l(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            h((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.b = r47.b().e();
        this.a = newScheduledThreadPool;
    }

    public static void e(ScheduledExecutorService scheduledExecutorService) {
        f.remove(scheduledExecutorService);
    }

    static Method f(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    static void g() {
        try {
            Iterator it2 = f.keySet().iterator();
            while (it2.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it2.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    it2.remove();
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (Throwable th) {
            e62.d(th);
            r47.b().a().a(th);
        }
    }

    public static void h(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference atomicReference = g;
            if (((ScheduledExecutorService) atomicReference.get()) != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge-"));
            if (kz4.a(atomicReference, null, newScheduledThreadPool)) {
                a aVar = new a();
                int i2 = e;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i2, i2, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean l(ScheduledExecutorService scheduledExecutorService) {
        Method f2;
        if (d) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = h;
                Object obj2 = i;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    f2 = f(scheduledExecutorService);
                    if (f2 != null) {
                        obj2 = f2;
                    }
                    h = obj2;
                } else {
                    f2 = (Method) obj;
                }
            } else {
                f2 = f(scheduledExecutorService);
            }
            if (f2 != null) {
                try {
                    f2.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (Exception e2) {
                    r47.b().a().a(e2);
                }
            }
        }
        return false;
    }

    @Override // eb7.a
    public gb8 b(v3 v3Var) {
        return c(v3Var, 0L, null);
    }

    @Override // eb7.a
    public gb8 c(v3 v3Var, long j, TimeUnit timeUnit) {
        return this.c ? tb8.c() : i(v3Var, j, timeUnit);
    }

    public ScheduledAction i(v3 v3Var, long j, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(this.b.k(v3Var));
        scheduledAction.a(j <= 0 ? this.a.submit(scheduledAction) : this.a.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return this.c;
    }

    public ScheduledAction j(v3 v3Var, long j, TimeUnit timeUnit, vs0 vs0Var) {
        ScheduledAction scheduledAction = new ScheduledAction(this.b.k(v3Var), vs0Var);
        vs0Var.a(scheduledAction);
        scheduledAction.a(j <= 0 ? this.a.submit(scheduledAction) : this.a.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    public ScheduledAction k(v3 v3Var, long j, TimeUnit timeUnit, jb8 jb8Var) {
        ScheduledAction scheduledAction = new ScheduledAction(this.b.k(v3Var), jb8Var);
        jb8Var.a(scheduledAction);
        scheduledAction.a(j <= 0 ? this.a.submit(scheduledAction) : this.a.schedule(scheduledAction, j, timeUnit));
        return scheduledAction;
    }

    @Override // defpackage.gb8
    public void unsubscribe() {
        this.c = true;
        this.a.shutdownNow();
        e(this.a);
    }
}
