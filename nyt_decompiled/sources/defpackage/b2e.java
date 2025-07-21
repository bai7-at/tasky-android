package defpackage;

/* loaded from: classes3.dex */
final class b2e implements gke {
    final /* synthetic */ wlb a;
    final /* synthetic */ gwb b;
    final /* synthetic */ d8e c;
    final /* synthetic */ a8d d;

    b2e(wlb wlbVar, gwb gwbVar, d8e d8eVar, a8d a8dVar) {
        this.a = wlbVar;
        this.b = gwbVar;
        this.c = d8eVar;
        this.d = a8dVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.a.b().j0) {
            if (((Boolean) pla.c().a(mpa.L9)).booleanValue() && this.b != null && gwb.h(str)) {
                this.b.g(str, this.c, kia.e());
                return;
            } else {
                this.c.c(str, null);
                return;
            }
        }
        long currentTimeMillis = dyf.b().currentTimeMillis();
        String str2 = this.a.j().b;
        int i = 2;
        if (!dyf.q().z(this.a.getContext())) {
            if (!((Boolean) pla.c().a(mpa.o6)).booleanValue() || !this.a.b().T) {
                i = 1;
            }
        }
        this.d.h(new c8d(currentTimeMillis, str2, str, i));
    }
}
