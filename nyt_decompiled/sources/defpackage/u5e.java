package defpackage;

/* loaded from: classes3.dex */
final class u5e implements gke {
    final /* synthetic */ h5e a;
    final /* synthetic */ w5e b;

    u5e(w5e w5eVar, h5e h5eVar) {
        this.a = h5eVar;
        this.b = w5eVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        y5e y5eVar;
        y5eVar = this.b.f.c;
        y5eVar.w0(this.a, th);
    }

    @Override // defpackage.gke
    public final void zzb(Object obj) {
        y5e y5eVar;
        y5eVar = this.b.f.c;
        y5eVar.c(this.a);
    }
}
