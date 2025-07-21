package defpackage;

/* loaded from: classes3.dex */
final class hkc implements gke {
    final /* synthetic */ String a = "Google";
    final /* synthetic */ jkc b;

    hkc(jkc jkcVar, String str, boolean z) {
        this.b = jkcVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        if (((Boolean) pla.c().a(mpa.b5)).booleanValue()) {
            dyf.q().v(th, "omid native display exp");
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        rkc rkcVar;
        rkc rkcVar2;
        rkcVar = this.b.k;
        rkcVar.t((wlb) obj);
        jkc jkcVar = this.b;
        rkcVar2 = jkcVar.k;
        ugb c0 = rkcVar2.c0();
        k8e Q = jkcVar.Q(this.a, true);
        if (Q != null && c0 != null) {
            c0.c(Q);
        } else if (c0 != null) {
            c0.cancel(false);
        }
    }
}
