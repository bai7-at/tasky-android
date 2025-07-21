package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class fud implements gqd {
    final ScheduledExecutorService a;
    final Context b;
    final o7b c;

    public fud(o7b o7bVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.c = o7bVar;
        this.a = scheduledExecutorService;
        this.b = context;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 49;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.m(zb.o(zb.h(new Bundle()), ((Long) pla.c().a(mpa.Z3)).longValue(), TimeUnit.MILLISECONDS, this.a), new gge() { // from class: eud
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return new gud((Bundle) obj);
            }
        }, pgb.a);
    }
}
