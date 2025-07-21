package defpackage;

/* loaded from: classes3.dex */
final class n7e implements gke {
    final /* synthetic */ q7e a;
    final /* synthetic */ f7e b;
    final /* synthetic */ boolean c;

    n7e(q7e q7eVar, f7e f7eVar, boolean z) {
        this.a = q7eVar;
        this.b = f7eVar;
        this.c = z;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        f7e f7eVar = this.b;
        if (f7eVar.zzj()) {
            q7e q7eVar = this.a;
            f7eVar.d(th);
            f7eVar.S(false);
            q7eVar.a(f7eVar);
            if (this.c) {
                this.a.g();
            }
        }
    }

    @Override // defpackage.gke
    public final void zzb(Object obj) {
        f7e f7eVar = this.b;
        f7eVar.S(true);
        this.a.a(f7eVar);
        if (this.c) {
            this.a.g();
        }
    }
}
