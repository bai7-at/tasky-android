package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class vtd implements gqd {
    final kke a;
    final String b;
    final teb c;

    public vtd(teb tebVar, kke kkeVar, String str) {
        this.c = tebVar;
        this.a = kkeVar;
        this.b = str;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 47;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        final j64 h = zb.h(null);
        if (((Boolean) pla.c().a(mpa.P5)).booleanValue()) {
            h = zb.h(null);
        }
        final j64 h2 = zb.h(null);
        return zb.c(h, h2).a(new Callable() { // from class: utd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new wtd((String) j64.this.get(), (String) h2.get());
            }
        }, pgb.a);
    }
}
