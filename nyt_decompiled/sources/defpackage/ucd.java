package defpackage;

/* loaded from: classes3.dex */
final class ucd implements gke {
    final /* synthetic */ v0e a;
    final /* synthetic */ vcd b;

    ucd(vcd vcdVar, v0e v0eVar) {
        this.a = v0eVar;
        this.b = vcdVar;
    }

    @Override // defpackage.gke
    public final void zza(Throwable th) {
        wcd wcdVar;
        wcd wcdVar2;
        wcd wcdVar3;
        synchronized (this.b) {
            try {
                wcdVar = this.b.h;
                wcdVar.b(th, this.a);
                wcdVar2 = this.b.h;
                if (wcdVar2.e()) {
                    vcd vcdVar = this.b;
                    wcdVar3 = vcdVar.h;
                    vcdVar.e(wcdVar3.a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.gke
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        wcd wcdVar;
        wcd wcdVar2;
        wcd wcdVar3;
        pdd pddVar = (pdd) obj;
        synchronized (this.b) {
            try {
                wcdVar = this.b.h;
                wcdVar.c(pddVar, this.a);
                wcdVar2 = this.b.h;
                if (wcdVar2.e()) {
                    vcd vcdVar = this.b;
                    wcdVar3 = vcdVar.h;
                    vcdVar.e(wcdVar3.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
