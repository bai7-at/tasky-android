package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ymd implements gqd {
    private final kke a;
    private final s1e b;

    ymd(kke kkeVar, s1e s1eVar) {
        this.a = kkeVar;
        this.b = s1eVar;
    }

    final /* synthetic */ zmd a() {
        return new zmd("requester_type_2".equals(ktd.b(this.b.d)));
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 21;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: xmd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ymd.this.a();
            }
        });
    }
}
