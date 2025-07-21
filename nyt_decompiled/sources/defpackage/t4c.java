package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.nc;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class t4c implements w6c, cfc, jcc, p7c, via {
    private final r7c a;
    private final v0e b;
    private final ScheduledExecutorService c;
    private final Executor d;
    private ScheduledFuture f;
    private final String h;
    private final nc e = nc.C();
    private final AtomicBoolean g = new AtomicBoolean();

    t4c(r7c r7cVar, v0e v0eVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.a = r7cVar;
        this.b = v0eVar;
        this.c = scheduledExecutorService;
        this.d = executor;
        this.h = str;
    }

    private final boolean n() {
        return this.h.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        if (((Boolean) pla.c().a(mpa.Qa)).booleanValue() && n() && uiaVar.j && this.g.compareAndSet(false, true) && this.b.f != 3) {
            pzc.k("Full screen 1px impression occurred");
            this.a.zza();
        }
    }

    @Override // defpackage.w6c
    public final void c(iab iabVar, String str, String str2) {
    }

    @Override // defpackage.p7c
    public final synchronized void k(zze zzeVar) {
        try {
            if (this.e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.e.g(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void l() {
        synchronized (this) {
            try {
                if (this.e.isDone()) {
                    return;
                }
                this.e.f(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w6c
    public final void zza() {
    }

    @Override // defpackage.w6c
    public final void zzb() {
    }

    @Override // defpackage.w6c
    public final void zzc() {
        v0e v0eVar = this.b;
        if (v0eVar.f == 3) {
            return;
        }
        int i = v0eVar.Z;
        if (i == 0 || i == 1) {
            if (((Boolean) pla.c().a(mpa.Qa)).booleanValue() && n()) {
                return;
            }
            this.a.zza();
        }
    }

    @Override // defpackage.w6c
    public final void zze() {
    }

    @Override // defpackage.w6c
    public final void zzf() {
    }

    @Override // defpackage.jcc
    public final void zzi() {
    }

    @Override // defpackage.jcc
    public final synchronized void zzj() {
        try {
            if (this.e.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.e.f(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.cfc
    public final void zzk() {
        if (this.b.f == 3) {
            return;
        }
        if (((Boolean) pla.c().a(mpa.w1)).booleanValue()) {
            v0e v0eVar = this.b;
            if (v0eVar.Z == 2) {
                if (v0eVar.r == 0) {
                    this.a.zza();
                } else {
                    zb.r(this.e, new s4c(this), this.d);
                    this.f = this.c.schedule(new Runnable() { // from class: r4c
                        @Override // java.lang.Runnable
                        public final void run() {
                            t4c.this.l();
                        }
                    }, this.b.r, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // defpackage.cfc
    public final void zzl() {
    }
}
