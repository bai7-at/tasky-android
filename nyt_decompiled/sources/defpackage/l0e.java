package defpackage;

/* loaded from: classes3.dex */
final class l0e implements nid {
    final /* synthetic */ m0e a;

    l0e(m0e m0eVar) {
        this.a = m0eVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
            this.a.i = null;
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        uqc uqcVar;
        h1e h1eVar;
        synchronized (this.a) {
            try {
                this.a.i = (uqc) obj;
                if (((Boolean) pla.c().a(mpa.q3)).booleanValue()) {
                    l1e j = ((uqc) obj).j();
                    h1eVar = this.a.d;
                    j.a = h1eVar;
                }
                uqcVar = this.a.i;
                uqcVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
