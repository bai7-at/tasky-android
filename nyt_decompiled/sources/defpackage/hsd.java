package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class hsd implements gqd {
    private final kfb a;
    private final String b;
    private final ScheduledExecutorService c;
    private final kke d;
    private final ima e;

    hsd(String str, ima imaVar, kfb kfbVar, ScheduledExecutorService scheduledExecutorService, kke kkeVar) {
        this.b = str;
        this.e = imaVar;
        this.a = kfbVar;
        this.c = scheduledExecutorService;
        this.d = kkeVar;
    }

    final /* synthetic */ isd a(Exception exc) {
        this.a.w(exc, "AppSetIdInfoGmscoreSignal");
        return new isd(null, -1);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 43;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if (((Boolean) pla.c().a(mpa.C2)).booleanValue()) {
            if (((Boolean) pla.c().a(mpa.H2)).booleanValue()) {
                j64 n = zb.n(tde.a(vg8.e(null), null), new ake() { // from class: fsd
                    @Override // defpackage.ake
                    public final j64 zza(Object obj) {
                        wm wmVar = (wm) obj;
                        return wmVar == null ? zb.h(new isd(null, -1)) : zb.h(new isd(wmVar.a(), wmVar.b()));
                    }
                }, this.d);
                if (((Boolean) fra.a.e()).booleanValue()) {
                    n = zb.o(n, ((Long) fra.b.e()).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return zb.e(n, Exception.class, new gge() { // from class: gsd
                    @Override // defpackage.gge
                    public final Object apply(Object obj) {
                        return hsd.this.a((Exception) obj);
                    }
                }, this.d);
            }
        }
        return zb.h(new isd(null, -1));
    }
}
