package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class uld implements gqd {
    private final kke a;

    uld(kke kkeVar) {
        this.a = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 55;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: tld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vld(dyf.b().currentTimeMillis() - dyf.q().i().zzh().a());
            }
        });
    }
}
