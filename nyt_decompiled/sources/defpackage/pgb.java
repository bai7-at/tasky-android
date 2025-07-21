package defpackage;

import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.lc;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class pgb {
    public static final kke a;
    public static final kke b;
    public static final kke c;
    public static final ScheduledExecutorService d;
    public static final kke e;
    public static final kke f;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            bde.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new lgb("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new lgb("Default"));
        }
        ngb ngbVar = null;
        a = new ogb(threadPoolExecutor, ngbVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = bde.a().b(5, new lgb("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new lgb("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        b = new ogb(executor, ngbVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = bde.a().a(new lgb("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new lgb("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        c = new ogb(executor2, ngbVar);
        d = new kgb(3, new lgb("Schedule"));
        e = new ogb(new mgb(), ngbVar);
        f = new ogb(lc.b(), ngbVar);
    }
}
