package defpackage;

/* loaded from: classes3.dex */
final class uhb implements Runnable {
    final /* synthetic */ vhb a;

    uhb(vhb vhbVar) {
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
            whbVar2.zzd();
        }
    }
}
