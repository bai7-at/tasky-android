package defpackage;

/* loaded from: classes3.dex */
final class h1c implements gke {
    final /* synthetic */ gke a;
    final /* synthetic */ j1c b;

    h1c(j1c j1cVar, gke gkeVar) {
        this.a = gkeVar;
        this.b = j1cVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        this.a.zza(th);
        pgb.e.execute(new Runnable() { // from class: d1c
            @Override // java.lang.Runnable
            public final void run() {
                j1c.this.d();
            }
        });
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        j1c.b(this.b, ((c1c) obj).a, this.a);
    }
}
