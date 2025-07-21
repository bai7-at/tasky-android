package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class dld implements gqd {
    private final kke a;

    dld(kke kkeVar) {
        this.a = kkeVar;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 54;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: cld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return eld.b();
            }
        });
    }
}
