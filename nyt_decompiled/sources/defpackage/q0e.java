package defpackage;

/* loaded from: classes3.dex */
final class q0e implements nid {
    final /* synthetic */ s0e a;

    q0e(s0e s0eVar) {
        this.a = s0eVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
            this.a.d = null;
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        uqc uqcVar;
        h1e h1eVar;
        synchronized (this.a) {
            try {
                this.a.d = (uqc) obj;
                if (((Boolean) pla.c().a(mpa.q3)).booleanValue()) {
                    l1e j = ((uqc) obj).j();
                    h1eVar = this.a.c;
                    j.a = h1eVar;
                }
                uqcVar = this.a.d;
                uqcVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
