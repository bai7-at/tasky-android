package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.ExistingWorkPolicy;
import androidx.work.impl.UnfinishedWorkListenerKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImplExtKt;
import androidx.work.impl.b;
import androidx.work.impl.utils.CancelWorkRunnable;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.StatusRunnable;
import defpackage.h94;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public class pj9 extends mj9 {
    private static final String m = h94.i("WorkManagerImpl");
    private static pj9 n = null;
    private static pj9 o = null;
    private static final Object p = new Object();
    private Context b;
    private androidx.work.a c;
    private WorkDatabase d;
    private rg8 e;
    private List f;
    private androidx.work.impl.a g;
    private r16 h;
    private boolean i = false;
    private BroadcastReceiver.PendingResult j;
    private final kq8 k;
    private final CoroutineScope l;

    static class a {
        static boolean a(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    public pj9(Context context, androidx.work.a aVar, rg8 rg8Var, WorkDatabase workDatabase, List list, androidx.work.impl.a aVar2, kq8 kq8Var) {
        Context applicationContext = context.getApplicationContext();
        if (a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        h94.h(new h94.a(aVar.j()));
        this.b = applicationContext;
        this.e = rg8Var;
        this.d = workDatabase;
        this.g = aVar2;
        this.k = kq8Var;
        this.c = aVar;
        this.f = list;
        CoroutineScope f = WorkManagerImplExtKt.f(rg8Var);
        this.l = f;
        this.h = new r16(this.d);
        b.g(list, this.g, rg8Var.c(), this.d, aVar);
        this.e.d(new ForceStopRunnable(applicationContext, this));
        UnfinishedWorkListenerKt.c(f, this.b, aVar, workDatabase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (defpackage.pj9.o != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        defpackage.pj9.o = androidx.work.impl.WorkManagerImplExtKt.c(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        defpackage.pj9.n = defpackage.pj9.o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(android.content.Context r3, androidx.work.a r4) {
        /*
            java.lang.Object r0 = defpackage.pj9.p
            monitor-enter(r0)
            pj9 r1 = defpackage.pj9.n     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            pj9 r2 = defpackage.pj9.o     // Catch: java.lang.Throwable -> L14
            if (r2 != 0) goto Lc
            goto L16
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L14
        L14:
            r3 = move-exception
            goto L2c
        L16:
            if (r1 != 0) goto L2a
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L14
            pj9 r1 = defpackage.pj9.o     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L26
            pj9 r3 = androidx.work.impl.WorkManagerImplExtKt.c(r3, r4)     // Catch: java.lang.Throwable -> L14
            defpackage.pj9.o = r3     // Catch: java.lang.Throwable -> L14
        L26:
            pj9 r3 = defpackage.pj9.o     // Catch: java.lang.Throwable -> L14
            defpackage.pj9.n = r3     // Catch: java.lang.Throwable -> L14
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj9.i(android.content.Context, androidx.work.a):void");
    }

    public static boolean j() {
        return o() != null;
    }

    public static pj9 o() {
        synchronized (p) {
            try {
                pj9 pj9Var = n;
                if (pj9Var != null) {
                    return pj9Var;
                }
                return o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static pj9 p(Context context) {
        pj9 o2;
        synchronized (p) {
            try {
                o2 = o();
                if (o2 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ww8 w() {
        te8.a(m());
        u().i().o();
        b.h(n(), u(), s());
        return ww8.a;
    }

    public void A(ej9 ej9Var, int i) {
        this.e.d(new x18(this.g, new q08(ej9Var), true, i));
    }

    @Override // defpackage.mj9
    public hi5 a(String str) {
        return CancelWorkRunnable.i(str, this);
    }

    @Override // defpackage.mj9
    public hi5 b(String str) {
        return CancelWorkRunnable.f(str, this);
    }

    @Override // defpackage.mj9
    public hi5 d(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new xi9(this, list).b();
    }

    @Override // defpackage.mj9
    public hi5 f(String str, ExistingWorkPolicy existingWorkPolicy, List list) {
        return new xi9(this, str, existingWorkPolicy, list).b();
    }

    @Override // defpackage.mj9
    public j64 h(String str) {
        return StatusRunnable.a(this.d, this.e, str);
    }

    public hi5 l(UUID uuid) {
        return CancelWorkRunnable.e(uuid, this);
    }

    public Context m() {
        return this.b;
    }

    public androidx.work.a n() {
        return this.c;
    }

    public r16 q() {
        return this.h;
    }

    public androidx.work.impl.a r() {
        return this.g;
    }

    public List s() {
        return this.f;
    }

    public kq8 t() {
        return this.k;
    }

    public WorkDatabase u() {
        return this.d;
    }

    public rg8 v() {
        return this.e;
    }

    public void x() {
        synchronized (p) {
            try {
                this.i = true;
                BroadcastReceiver.PendingResult pendingResult = this.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y() {
        kp8.a(n().n(), "ReschedulingWork", new qs2() { // from class: oj9
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                ww8 w;
                w = pj9.this.w();
                return w;
            }
        });
    }

    public void z(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (p) {
            try {
                BroadcastReceiver.PendingResult pendingResult2 = this.j;
                if (pendingResult2 != null) {
                    pendingResult2.finish();
                }
                this.j = pendingResult;
                if (this.i) {
                    pendingResult.finish();
                    this.j = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
