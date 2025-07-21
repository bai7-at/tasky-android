package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class yld implements gqd {
    private final kke a;
    private final rsc b;
    private final String c;
    private final s1e d;

    public yld(kke kkeVar, rsc rscVar, s1e s1eVar, String str) {
        this.a = kkeVar;
        this.b = rscVar;
        this.d = s1eVar;
        this.c = str;
    }

    final /* synthetic */ zld a() {
        s1e s1eVar = this.d;
        rsc rscVar = this.b;
        return new zld(rscVar.b(s1eVar.f, this.c), rscVar.a());
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 17;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: xld
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yld.this.a();
            }
        });
    }
}
