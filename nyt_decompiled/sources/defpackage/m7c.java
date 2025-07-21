package defpackage;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzdkv;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class m7c extends ldc implements d7c {
    private final ScheduledExecutorService b;
    private ScheduledFuture c;
    private boolean d;

    public m7c(l7c l7cVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.d = false;
        this.b = scheduledExecutorService;
        C0(l7cVar, executor);
    }

    final /* synthetic */ void M0() {
        synchronized (this) {
            fgb.d("Timeout waiting for show call succeed to be called.");
            l(new zzdkv("Timeout for show call succeed."));
            this.d = true;
        }
    }

    @Override // defpackage.d7c
    public final void k(final zze zzeVar) {
        G0(new kdc() { // from class: e7c
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((d7c) obj).k(zze.this);
            }
        });
    }

    @Override // defpackage.d7c
    public final void l(final zzdkv zzdkvVar) {
        if (this.d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        G0(new kdc() { // from class: h7c
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((d7c) obj).l(zzdkv.this);
            }
        });
    }

    @Override // defpackage.d7c
    public final void zzb() {
        G0(new kdc() { // from class: f7c
            @Override // defpackage.kdc
            public final void zza(Object obj) {
                ((d7c) obj).zzb();
            }
        });
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.c = this.b.schedule(new Runnable() { // from class: g7c
            @Override // java.lang.Runnable
            public final void run() {
                m7c.this.M0();
            }
        }, ((Integer) pla.c().a(mpa.ja)).intValue(), TimeUnit.MILLISECONDS);
    }
}
