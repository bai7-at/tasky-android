package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class lpd implements gqd {
    private final String a;
    private final kke b;
    private final ScheduledExecutorService c;
    private final Context d;
    private final s1e e;
    private final aob f;

    lpd(kke kkeVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, s1e s1eVar, aob aobVar) {
        this.b = kkeVar;
        this.c = scheduledExecutorService;
        this.a = str;
        this.d = context;
        this.e = s1eVar;
        this.f = aobVar;
    }

    public static /* synthetic */ j64 a(lpd lpdVar) {
        iie t = lpdVar.f.t();
        e6c e6cVar = new e6c();
        e6cVar.e(lpdVar.d);
        q1e q1eVar = new q1e();
        q1eVar.J("adUnitId");
        q1eVar.e(lpdVar.e.d);
        q1eVar.I(new zzq());
        q1eVar.O(true);
        e6cVar.i(q1eVar.g());
        t.a(e6cVar.j());
        ju9 ju9Var = new ju9();
        ju9Var.a(lpdVar.a);
        t.b(ju9Var.b());
        new mdc();
        return zb.e(zb.m((vb) zb.o(vb.C(t.zzc().c()), ((Long) pla.c().a(mpa.g7)).longValue(), TimeUnit.MILLISECONDS, lpdVar.c), new gge() { // from class: ipd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                k6a k6aVar = (k6a) obj;
                return k6aVar != null ? new mpd(k6aVar.a) : new mpd(null);
            }
        }, lpdVar.b), Exception.class, new gge() { // from class: jpd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                fgb.e("", (Exception) obj);
                return new mpd(null);
            }
        }, lpdVar.b);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 33;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return (!((Boolean) pla.c().a(mpa.f7)).booleanValue() || this.e.q) ? zb.h(new mpd(null)) : zb.k(new zje() { // from class: kpd
            @Override // defpackage.zje
            public final j64 zza() {
                return lpd.a(lpd.this);
            }
        }, this.b);
    }
}
