package defpackage;

/* loaded from: classes3.dex */
final class dxa implements gke {
    final /* synthetic */ wlb a;

    dxa(wlb wlbVar) {
        this.a = wlbVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        dyf.q().w(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        wlb wlbVar = this.a;
        new mbb(wlbVar.getContext(), wlbVar.zzn().zza, (String) obj).b();
    }
}
