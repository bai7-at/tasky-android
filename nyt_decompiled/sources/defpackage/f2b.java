package defpackage;

/* loaded from: classes3.dex */
final class f2b implements ygb {
    final /* synthetic */ l1b a;
    final /* synthetic */ Object b;
    final /* synthetic */ ugb c;
    final /* synthetic */ n2b d;

    f2b(n2b n2bVar, l1b l1bVar, Object obj, ugb ugbVar) {
        this.a = l1bVar;
        this.b = obj;
        this.c = ugbVar;
        this.d = n2bVar;
    }

    @Override // defpackage.ygb
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        pzc.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.b;
        ugb ugbVar = this.c;
        n2b.b(this.d, this.a, (s1b) obj, obj2, ugbVar);
    }
}
