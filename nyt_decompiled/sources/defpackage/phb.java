package defpackage;

/* loaded from: classes3.dex */
final class phb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ vhb c;

    phb(vhb vhbVar, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        whb whbVar2;
        vhb vhbVar = this.c;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            String str = this.a;
            String str2 = this.b;
            whbVar2 = vhbVar.s;
            whbVar2.zzb(str, str2);
        }
    }
}
