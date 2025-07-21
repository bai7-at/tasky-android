package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ljd implements gqd {
    private final kke a;
    private final s1e b;
    private final g2e c;

    ljd(kke kkeVar, s1e s1eVar, g2e g2eVar) {
        this.a = kkeVar;
        this.b = s1eVar;
        this.c = g2eVar;
    }

    final /* synthetic */ mjd a() {
        String str = null;
        if (((Boolean) pla.c().a(mpa.i7)).booleanValue() && "requester_type_2".equals(ktd.b(this.b.d))) {
            str = g2e.a();
        }
        return new mjd(str);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 5;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: kjd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ljd.this.a();
            }
        });
    }
}
