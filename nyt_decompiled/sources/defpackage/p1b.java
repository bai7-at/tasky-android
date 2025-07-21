package defpackage;

/* loaded from: classes3.dex */
final class p1b implements ygb {
    final /* synthetic */ q1b a;

    p1b(q1b q1bVar) {
        this.a = q1bVar;
    }

    @Override // defpackage.ygb
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final h0b h0bVar = (h0b) obj;
        pgb.e.execute(new Runnable() { // from class: o1b
            @Override // java.lang.Runnable
            public final void run() {
                h0b h0bVar2 = h0bVar;
                h0bVar2.z0("/result", txa.o);
                h0bVar2.zzc();
            }
        });
    }
}
