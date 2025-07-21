package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.lc;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class nsd implements gqd {
    private final Context a;
    private final kfb b;
    private final ScheduledExecutorService c;
    private final Executor d;
    private final String e;
    private final bfb f;

    public nsd(bfb bfbVar, int i, Context context, kfb kfbVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str) {
        this.f = bfbVar;
        this.a = context;
        this.b = kfbVar;
        this.c = scheduledExecutorService;
        this.d = executor;
        this.e = str;
    }

    final /* synthetic */ osd a(Exception exc) {
        this.b.w(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 44;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return zb.e((vb) zb.o(zb.m(vb.C(zb.k(new zje() { // from class: ksd
            @Override // defpackage.zje
            public final j64 zza() {
                return zb.h(null);
            }
        }, this.d)), new gge() { // from class: lsd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new osd(str);
            }
        }, this.d), ((Long) pla.c().a(mpa.V0)).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new gge() { // from class: msd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                nsd.this.a((Exception) obj);
                return null;
            }
        }, lc.b());
    }
}
