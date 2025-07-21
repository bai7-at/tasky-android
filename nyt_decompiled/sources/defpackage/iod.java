package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class iod implements gqd {
    private final gqd a;
    private final long b;
    private final ScheduledExecutorService c;

    public iod(gqd gqdVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = gqdVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return this.a.zza();
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        j64 zzb = this.a.zzb();
        long j = this.b;
        if (j > 0) {
            zzb = zb.o(zzb, j, TimeUnit.MILLISECONDS, this.c);
        }
        return zb.f(zzb, Throwable.class, new ake() { // from class: hod
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return zb.h(null);
            }
        }, pgb.f);
    }
}
