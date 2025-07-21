package defpackage;

/* loaded from: classes3.dex */
final class iid implements nid {
    final /* synthetic */ jid a;

    iid(jid jidVar) {
        this.a = jidVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.a) {
            this.a.c = ((u0c) obj).c();
            ((u0c) obj).b();
        }
    }
}
