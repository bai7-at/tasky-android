package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.logger.SdkInternalLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public final class d75 implements rq3 {
    public static final d75 a = new d75();
    private static final String b = "no-op";
    private static final wl8 c;

    public static final class a implements ExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
            return new ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return null;
        }
    }

    static {
        long currentTimeMillis = System.currentTimeMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c = new wl8(timeUnit.toNanos(currentTimeMillis), timeUnit.toNanos(currentTimeMillis), 0L, 0L);
    }

    private d75() {
    }

    @Override // defpackage.jb2
    public Map a(String str) {
        zq3.h(str, "featureName");
        return t.i();
    }

    @Override // defpackage.rq3
    public List b() {
        return i.l();
    }

    @Override // defpackage.vc7
    public String c() {
        return "";
    }

    @Override // defpackage.jb2
    public ib2 d(String str) {
        zq3.h(str, "featureName");
        return null;
    }

    @Override // defpackage.jb2
    public void e(String str, ss2 ss2Var) {
        zq3.h(str, "featureName");
        zq3.h(ss2Var, "updateCallback");
    }

    @Override // defpackage.jb2
    public InternalLogger f() {
        return new SdkInternalLogger(this, null, null, 6, null);
    }

    @Override // defpackage.rq3
    public mj2 g() {
        return new lh1(t.i());
    }

    @Override // defpackage.vc7
    public String getName() {
        return b;
    }

    @Override // defpackage.jb2
    public void h(String str, za2 za2Var) {
        zq3.h(str, "featureName");
        zq3.h(za2Var, "receiver");
    }

    @Override // defpackage.jb2
    public void i(String str) {
        zq3.h(str, "featureName");
    }

    @Override // defpackage.jb2
    public void j(ya2 ya2Var) {
        zq3.h(ya2Var, "feature");
    }

    @Override // defpackage.rq3
    public ExecutorService k() {
        return new a();
    }

    @Override // defpackage.rq3
    public ua1 l() {
        return null;
    }
}
