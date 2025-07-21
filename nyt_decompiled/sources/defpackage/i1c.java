package defpackage;

/* loaded from: classes3.dex */
final class i1c implements gke {
    final /* synthetic */ gke a;
    final /* synthetic */ j1c b;

    i1c(j1c j1cVar, gke gkeVar) {
        this.a = gkeVar;
        this.b = j1cVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        pgb.e.execute(new Runnable() { // from class: d1c
            @Override // java.lang.Runnable
            public final void run() {
                j1c.this.d();
            }
        });
        this.a.zza(th);
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        pgb.e.execute(new Runnable() { // from class: d1c
            @Override // java.lang.Runnable
            public final void run() {
                j1c.this.d();
            }
        });
        this.a.zzb((u0c) obj);
    }
}
