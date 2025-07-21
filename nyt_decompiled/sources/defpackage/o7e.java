package defpackage;

/* loaded from: classes3.dex */
final class o7e implements gke {
    final /* synthetic */ q7e a;
    final /* synthetic */ f7e b;

    o7e(q7e q7eVar, f7e f7eVar) {
        this.a = q7eVar;
        this.b = f7eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        f7e f7eVar = this.b;
        f7eVar.d(th);
        f7eVar.S(false);
        this.a.a(f7eVar);
    }

    @Override // defpackage.gke
    public final void zzb(Object obj) {
    }
}
