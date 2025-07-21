package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zud implements gqd {
    private final kfb a;
    private final boolean b;
    private final boolean c;
    private final ScheduledExecutorService d;
    private final kke e;
    private final String f;
    private final zeb g;

    zud(kfb kfbVar, boolean z, boolean z2, zeb zebVar, kke kkeVar, String str, ScheduledExecutorService scheduledExecutorService) {
        this.a = kfbVar;
        this.b = z;
        this.c = z2;
        this.g = zebVar;
        this.e = kkeVar;
        this.f = str;
        this.d = scheduledExecutorService;
    }

    final /* synthetic */ avd a(Exception exc) {
        this.a.w(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 50;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if ((!((Boolean) pla.c().a(mpa.h7)).booleanValue() || !this.c) && this.b) {
            return zb.e(zb.o(zb.m(zb.h(null), new gge() { // from class: xud
                @Override // defpackage.gge
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new avd(str);
                }
            }, this.e), ((Long) jsa.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new gge() { // from class: yud
                @Override // defpackage.gge
                public final Object apply(Object obj) {
                    zud.this.a((Exception) obj);
                    return null;
                }
            }, this.e);
        }
        return zb.h(null);
    }
}
