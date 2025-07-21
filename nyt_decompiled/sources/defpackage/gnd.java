package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class gnd implements gqd {
    private final kke a;
    private final eyc b;

    gnd(kke kkeVar, eyc eycVar) {
        this.a = kkeVar;
        this.b = eycVar;
    }

    final /* synthetic */ knd a() {
        eyc eycVar = this.b;
        String c = eycVar.c();
        boolean q = eycVar.q();
        boolean l = dyf.u().l();
        eyc eycVar2 = this.b;
        return new knd(c, q, l, eycVar2.o(), eycVar2.r());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 23;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: fnd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return gnd.this.a();
            }
        });
    }
}
