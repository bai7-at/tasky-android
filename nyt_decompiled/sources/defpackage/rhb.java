package defpackage;

/* loaded from: classes3.dex */
final class rhb implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ vhb c;

    rhb(vhb vhbVar, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = vhbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        whb whbVar;
        whb whbVar2;
        vhb vhbVar = this.c;
        whbVar = vhbVar.s;
        if (whbVar != null) {
            int i = this.a;
            int i2 = this.b;
            whbVar2 = vhbVar.s;
            whbVar2.a(i, i2);
        }
    }
}
