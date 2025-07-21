package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ztd implements gqd {
    final kke a;
    final List b;
    final soa c;

    public ztd(soa soaVar, kke kkeVar, List list) {
        this.c = soaVar;
        this.a = kkeVar;
        this.b = list;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 48;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: ytd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new aud(ztd.this.b);
            }
        });
    }
}
