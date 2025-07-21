package defpackage;

/* loaded from: classes3.dex */
final class c2e implements gke {
    final /* synthetic */ d2e a;
    final /* synthetic */ int b;

    c2e(d2e d2eVar, int i) {
        this.b = i;
        this.a = d2eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        dyf.q().w(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.b;
        this.a.b((String) obj, i);
    }
}
