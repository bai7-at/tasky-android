package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.a;
import defpackage.dk9;
import defpackage.ej9;
import defpackage.h94;
import defpackage.j64;
import defpackage.mx0;
import defpackage.n62;
import defpackage.q08;
import defpackage.rc9;
import defpackage.rg8;
import defpackage.wo2;
import defpackage.yo2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class a implements yo2 {
    private static final String l = h94.i("Processor");
    private Context b;
    private androidx.work.a c;
    private rg8 d;
    private WorkDatabase e;
    private Map g = new HashMap();
    private Map f = new HashMap();
    private Set i = new HashSet();
    private final List j = new ArrayList();
    private PowerManager.WakeLock a = null;
    private final Object k = new Object();
    private Map h = new HashMap();

    public a(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = aVar;
        this.d = rg8Var;
        this.e = workDatabase;
    }

    private WorkerWrapper f(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f.remove(str);
        boolean z = workerWrapper != null;
        if (!z) {
            workerWrapper = (WorkerWrapper) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            u();
        }
        return workerWrapper;
    }

    private WorkerWrapper h(String str) {
        WorkerWrapper workerWrapper = (WorkerWrapper) this.f.get(str);
        return workerWrapper == null ? (WorkerWrapper) this.g.get(str) : workerWrapper;
    }

    private static boolean i(String str, WorkerWrapper workerWrapper, int i) {
        if (workerWrapper == null) {
            h94.e().a(l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.o(i);
        h94.e().a(l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(ej9 ej9Var, boolean z) {
        synchronized (this.k) {
            try {
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    ((n62) it2.next()).a(ej9Var, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dk9 m(ArrayList arrayList, String str) {
        arrayList.addAll(this.e.j().a(str));
        return this.e.i().h(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(j64 j64Var, WorkerWrapper workerWrapper) {
        boolean z;
        try {
            z = ((Boolean) j64Var.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z = true;
        }
        o(workerWrapper, z);
    }

    private void o(WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.k) {
            try {
                ej9 l2 = workerWrapper.l();
                String b = l2.b();
                if (h(b) == workerWrapper) {
                    f(b);
                }
                h94.e().a(l, getClass().getSimpleName() + " " + b + " executed; reschedule = " + z);
                Iterator it2 = this.j.iterator();
                while (it2.hasNext()) {
                    ((n62) it2.next()).a(l2, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void q(final ej9 ej9Var, final boolean z) {
        this.d.a().execute(new Runnable() { // from class: y36
            @Override // java.lang.Runnable
            public final void run() {
                a.this.l(ej9Var, z);
            }
        });
    }

    private void u() {
        synchronized (this.k) {
            try {
                if (this.f.isEmpty()) {
                    try {
                        this.b.startService(androidx.work.impl.foreground.a.g(this.b));
                    } catch (Throwable th) {
                        h94.e().d(l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.yo2
    public void a(String str, wo2 wo2Var) {
        synchronized (this.k) {
            try {
                h94.e().f(l, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapper = (WorkerWrapper) this.g.remove(str);
                if (workerWrapper != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock b = rc9.b(this.b, "ProcessorForegroundLck");
                        this.a = b;
                        b.acquire();
                    }
                    this.f.put(str, workerWrapper);
                    mx0.n(this.b, androidx.work.impl.foreground.a.f(this.b, workerWrapper.l(), wo2Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(n62 n62Var) {
        synchronized (this.k) {
            this.j.add(n62Var);
        }
    }

    public dk9 g(String str) {
        synchronized (this.k) {
            try {
                WorkerWrapper h = h(str);
                if (h == null) {
                    return null;
                }
                return h.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.k) {
            contains = this.i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z;
        synchronized (this.k) {
            z = h(str) != null;
        }
        return z;
    }

    public void p(n62 n62Var) {
        synchronized (this.k) {
            this.j.remove(n62Var);
        }
    }

    public boolean r(q08 q08Var) {
        return s(q08Var, null);
    }

    public boolean s(q08 q08Var, WorkerParameters.a aVar) {
        ej9 a = q08Var.a();
        final String b = a.b();
        final ArrayList arrayList = new ArrayList();
        dk9 dk9Var = (dk9) this.e.runInTransaction(new Callable() { // from class: w36
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dk9 m;
                m = a.this.m(arrayList, b);
                return m;
            }
        });
        if (dk9Var == null) {
            h94.e().k(l, "Didn't find WorkSpec for id " + a);
            q(a, false);
            return false;
        }
        synchronized (this.k) {
            try {
                if (k(b)) {
                    Set set = (Set) this.h.get(b);
                    if (((q08) set.iterator().next()).a().a() == a.a()) {
                        set.add(q08Var);
                        h94.e().a(l, "Work " + a + " is already enqueued for processing");
                    } else {
                        q(a, false);
                    }
                    return false;
                }
                if (dk9Var.f() != a.a()) {
                    q(a, false);
                    return false;
                }
                final WorkerWrapper a2 = new WorkerWrapper.a(this.b, this.c, this.d, this, this.e, dk9Var, arrayList).k(aVar).a();
                final j64 q = a2.q();
                q.a(new Runnable() { // from class: x36
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.n(q, a2);
                    }
                }, this.d.a());
                this.g.put(b, a2);
                HashSet hashSet = new HashSet();
                hashSet.add(q08Var);
                this.h.put(b, hashSet);
                h94.e().a(l, getClass().getSimpleName() + ": processing " + a);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(String str, int i) {
        WorkerWrapper f;
        synchronized (this.k) {
            h94.e().a(l, "Processor cancelling " + str);
            this.i.add(str);
            f = f(str);
        }
        return i(str, f, i);
    }

    public boolean v(q08 q08Var, int i) {
        WorkerWrapper f;
        String b = q08Var.a().b();
        synchronized (this.k) {
            f = f(b);
        }
        return i(b, f, i);
    }

    public boolean w(q08 q08Var, int i) {
        String b = q08Var.a().b();
        synchronized (this.k) {
            try {
                if (this.f.get(b) == null) {
                    Set set = (Set) this.h.get(b);
                    if (set != null && set.contains(q08Var)) {
                        return i(b, f(b), i);
                    }
                    return false;
                }
                h94.e().a(l, "Ignored stopWork. WorkerWrapper " + b + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
