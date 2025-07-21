package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class umd implements gqd {
    private final kke a;

    public umd(kke kkeVar) {
        this.a = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 20;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: tmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new vmd(dyf.u().b(), dyf.u().m());
            }
        });
    }
}
