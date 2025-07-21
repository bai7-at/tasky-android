package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ukd implements gqd {
    final kfb a;
    vm b;
    private final ScheduledExecutorService c;
    private final kke d;
    private final Context e;

    ukd(Context context, kfb kfbVar, ScheduledExecutorService scheduledExecutorService, kke kkeVar) {
        if (!((Boolean) pla.c().a(mpa.G2)).booleanValue()) {
            this.b = um.a(context);
        }
        this.e = context;
        this.a = kfbVar;
        this.c = scheduledExecutorService;
        this.d = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 11;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if (((Boolean) pla.c().a(mpa.C2)).booleanValue()) {
            if (!((Boolean) pla.c().a(mpa.H2)).booleanValue()) {
                if (!((Boolean) pla.c().a(mpa.D2)).booleanValue()) {
                    return zb.m(tde.a(this.b.b(), null), new gge() { // from class: rkd
                        @Override // defpackage.gge
                        public final Object apply(Object obj) {
                            wm wmVar = (wm) obj;
                            return new vkd(wmVar.a(), wmVar.b());
                        }
                    }, pgb.f);
                }
                og8 a = ((Boolean) pla.c().a(mpa.G2)).booleanValue() ? z2e.a(this.e) : this.b.b();
                if (a == null) {
                    return zb.h(new vkd(null, -1));
                }
                j64 n = zb.n(tde.a(a, null), new ake() { // from class: skd
                    @Override // defpackage.ake
                    public final j64 zza(Object obj) {
                        wm wmVar = (wm) obj;
                        return wmVar == null ? zb.h(new vkd(null, -1)) : zb.h(new vkd(wmVar.a(), wmVar.b()));
                    }
                }, pgb.f);
                if (((Boolean) pla.c().a(mpa.E2)).booleanValue()) {
                    n = zb.o(n, ((Long) pla.c().a(mpa.F2)).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zb.e(n, Exception.class, new gge() { // from class: tkd
                    @Override // defpackage.gge
                    public final Object apply(Object obj) {
                        ukd.this.a.w((Exception) obj, "AppSetIdInfoSignal");
                        return new vkd(null, -1);
                    }
                }, this.d);
            }
        }
        return zb.h(new vkd(null, -1));
    }
}
