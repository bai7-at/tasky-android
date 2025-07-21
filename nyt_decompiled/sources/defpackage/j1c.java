package defpackage;

import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzead;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class j1c {
    private final Executor a;
    private final ScheduledExecutorService b;
    private final j64 c;
    private volatile boolean d = true;

    public j1c(Executor executor, ScheduledExecutorService scheduledExecutorService, j64 j64Var) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = j64Var;
    }

    static /* bridge */ /* synthetic */ void b(final j1c j1cVar, List list, final gke gkeVar) {
        if (list == null || list.isEmpty()) {
            j1cVar.a.execute(new Runnable() { // from class: e1c
                @Override // java.lang.Runnable
                public final void run() {
                    gke.this.zza(new zzead(3));
                }
            });
            return;
        }
        j64 h = zb.h(null);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final j64 j64Var = (j64) it2.next();
            h = zb.n(zb.f(h, Throwable.class, new ake() { // from class: f1c
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    gke.this.zza((Throwable) obj);
                    return zb.h(null);
                }
            }, j1cVar.a), new ake() { // from class: g1c
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return j1c.this.a(gkeVar, j64Var, (u0c) obj);
                }
            }, j1cVar.a);
        }
        zb.r(h, new i1c(j1cVar, gkeVar), j1cVar.a);
    }

    final /* synthetic */ j64 a(gke gkeVar, j64 j64Var, u0c u0cVar) {
        if (u0cVar != null) {
            gkeVar.zzb(u0cVar);
        }
        return zb.o(j64Var, ((Long) isa.b.e()).longValue(), TimeUnit.MILLISECONDS, this.b);
    }

    final /* synthetic */ void d() {
        this.d = false;
    }

    public final void e(gke gkeVar) {
        zb.r(this.c, new h1c(this, gkeVar), this.a);
    }

    public final boolean f() {
        return this.d;
    }
}
