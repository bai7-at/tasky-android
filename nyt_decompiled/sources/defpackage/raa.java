package defpackage;

/* loaded from: classes3.dex */
final class raa implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ zaa c;

    raa(zaa zaaVar, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = zaaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fba fbaVar;
        fba fbaVar2;
        fbaVar = this.c.a;
        fbaVar.a(this.a, this.b);
        zaa zaaVar = this.c;
        fbaVar2 = zaaVar.a;
        fbaVar2.b(zaaVar.toString());
    }
}
