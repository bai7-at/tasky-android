package defpackage;

/* loaded from: classes3.dex */
final class zgd implements nid {
    final /* synthetic */ ahd a;

    zgd(ahd ahdVar) {
        this.a = ahdVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
            this.a.i = null;
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        nyb nybVar;
        nyb nybVar2;
        nyb nybVar3;
        nyb nybVar4 = (nyb) obj;
        synchronized (this.a) {
            try {
                ahd ahdVar = this.a;
                nybVar = ahdVar.i;
                if (nybVar != null) {
                    nybVar3 = ahdVar.i;
                    nybVar3.a();
                }
                this.a.i = nybVar4;
                nybVar2 = this.a.i;
                nybVar2.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
