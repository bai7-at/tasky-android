package defpackage;

/* loaded from: classes3.dex */
final class fid implements nid {
    final /* synthetic */ gid a;

    fid(gid gidVar) {
        this.a = gidVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
            this.a.j = null;
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ygc ygcVar;
        ygc ygcVar2 = (ygc) obj;
        synchronized (this.a) {
            this.a.j = ygcVar2;
            ygcVar = this.a.j;
            ygcVar.b();
        }
    }
}
