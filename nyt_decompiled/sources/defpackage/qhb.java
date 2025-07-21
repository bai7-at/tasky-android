package defpackage;

/* loaded from: classes3.dex */
final class qhb implements Runnable {
    final /* synthetic */ vhb a;

    qhb(vhb vhbVar) {
        this.a = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        whb whbVar2;
        vhb vhbVar = this.a;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            whbVar2 = vhbVar.s;
            whbVar2.zzh();
        }
    }
}
