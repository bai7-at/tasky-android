package defpackage;

/* loaded from: classes3.dex */
final class shb implements Runnable {
    final /* synthetic */ vhb a;

    shb(vhb vhbVar) {
        this.a = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        whb whbVar2;
        whb whbVar3;
        vhb vhbVar = this.a;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            whbVar2 = vhbVar.s;
            whbVar2.zzd();
            whbVar3 = this.a.s;
            whbVar3.zzi();
        }
    }
}
