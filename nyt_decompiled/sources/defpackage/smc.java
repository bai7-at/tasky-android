package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class smc implements gke {
    final /* synthetic */ tmc a;

    smc(tmc tmcVar) {
        this.a = tmcVar;
    }

    @Override // defpackage.gke
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            wlb wlbVar = (wlb) list.get(0);
            if (wlbVar != null) {
                this.a.b(wlbVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) pla.c().a(mpa.b5)).booleanValue()) {
                dyf.q().w(e, "omid native display exp");
            }
        }
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        if (((Boolean) pla.c().a(mpa.b5)).booleanValue()) {
            dyf.q().w(th, "omid native display exp");
        }
    }
}
