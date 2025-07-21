package defpackage;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class hbd implements g9d {
    private final nzb a;
    private final kad b;
    private final kke c;
    private final y6c d;
    private final ScheduledExecutorService e;
    private final uuc f;

    public hbd(nzb nzbVar, kad kadVar, y6c y6cVar, ScheduledExecutorService scheduledExecutorService, kke kkeVar, uuc uucVar) {
        this.a = nzbVar;
        this.b = kadVar;
        this.d = y6cVar;
        this.e = scheduledExecutorService;
        this.c = kkeVar;
        this.f = uucVar;
    }

    @Override // defpackage.g9d
    public final j64 a(final g1e g1eVar, final v0e v0eVar) {
        return this.c.j(new Callable() { // from class: fbd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hbd.this.c(g1eVar, v0eVar);
            }
        });
    }

    @Override // defpackage.g9d
    public final boolean b(g1e g1eVar, v0e v0eVar) {
        kva a = g1eVar.a.a.a();
        boolean b = this.b.b(g1eVar, v0eVar);
        if (((Boolean) pla.c().a(mpa.qb)).booleanValue()) {
            this.f.a().put("has_dbl", a != null ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            this.f.a().put("crdb", true == b ? IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
        }
        return a != null && b;
    }

    final /* synthetic */ nyb c(final g1e g1eVar, final v0e v0eVar) {
        return this.a.b(new k1c(g1eVar, v0eVar, null), new a0c(g1eVar.a.a.a(), new Runnable() { // from class: ebd
            @Override // java.lang.Runnable
            public final void run() {
                hbd.this.f(g1eVar, v0eVar);
            }
        })).zza();
    }

    final /* synthetic */ void f(g1e g1eVar, v0e v0eVar) {
        zb.r(zb.o(this.b.a(g1eVar, v0eVar), v0eVar.S, TimeUnit.SECONDS, this.e), new gbd(this), this.c);
    }
}
