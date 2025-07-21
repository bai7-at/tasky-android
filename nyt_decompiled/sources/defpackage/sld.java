package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class sld implements gqd {
    private final AtomicReference a = new AtomicReference();
    private final Clock b;
    private final gqd c;
    private final long d;

    public sld(gqd gqdVar, long j, Clock clock) {
        this.b = clock;
        this.c = gqdVar;
        this.d = j;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 16;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        rld rldVar = (rld) this.a.get();
        if (rldVar == null || rldVar.a()) {
            gqd gqdVar = this.c;
            rld rldVar2 = new rld(gqdVar.zzb(), this.d, this.b);
            this.a.set(rldVar2);
            rldVar = rldVar2;
        }
        return rldVar.a;
    }
}
