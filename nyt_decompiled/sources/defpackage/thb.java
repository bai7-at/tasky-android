package defpackage;

/* loaded from: classes3.dex */
final class thb implements Runnable {
    final /* synthetic */ vhb a;

    thb(vhb vhbVar) {
        this.a = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        boolean z;
        whb whbVar2;
        whb whbVar3;
        vhb vhbVar = this.a;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            z = vhbVar.t;
            if (!z) {
                whbVar3 = vhbVar.s;
                whbVar3.zzg();
                this.a.t = true;
            }
            whbVar2 = this.a.s;
            whbVar2.zze();
        }
    }
}
