package defpackage;

import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzead;
import com.google.android.gms.internal.ads.zzeml;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class vcd {
    private final Executor a;
    private final ScheduledExecutorService b;
    private final x0c c;
    private final odd d;
    private final z7e e;
    private final nc f = nc.C();
    private final AtomicBoolean g = new AtomicBoolean();
    private wcd h;
    private g1e i;

    vcd(Executor executor, ScheduledExecutorService scheduledExecutorService, x0c x0cVar, odd oddVar, z7e z7eVar) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = x0cVar;
        this.d = oddVar;
        this.e = z7eVar;
    }

    private final synchronized j64 d(v0e v0eVar) {
        Iterator it2 = v0eVar.a.iterator();
        while (it2.hasNext()) {
            g9d a = this.c.a(v0eVar.b, (String) it2.next());
            if (a != null && a.b(this.i, v0eVar)) {
                return zb.o(a.a(this.i, v0eVar), v0eVar.S, TimeUnit.MILLISECONDS, this.b);
            }
        }
        return zb.g(new zzead(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(v0e v0eVar) {
        if (v0eVar == null) {
            return;
        }
        j64 d = d(v0eVar);
        this.d.f(this.i, v0eVar, d, this.e);
        zb.r(d, new ucd(this, v0eVar), this.a);
    }

    public final synchronized j64 b(g1e g1eVar) {
        try {
            if (!this.g.getAndSet(true)) {
                if (g1eVar.b.a.isEmpty()) {
                    this.f.g(new zzeml(3, udd.b(g1eVar)));
                } else {
                    this.i = g1eVar;
                    this.h = new wcd(g1eVar, this.d, this.f);
                    this.d.k(g1eVar.b.a);
                    while (this.h.e()) {
                        e(this.h.a());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }
}
