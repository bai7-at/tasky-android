package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class d1d {
    private final ScheduledExecutorService a;
    private final kke b;
    private final kke c;
    private final u1d d;
    private final l3f e;

    public d1d(ScheduledExecutorService scheduledExecutorService, kke kkeVar, kke kkeVar2, u1d u1dVar, l3f l3fVar) {
        this.a = scheduledExecutorService;
        this.b = kkeVar;
        this.c = kkeVar2;
        this.d = u1dVar;
        this.e = l3fVar;
    }

    final /* synthetic */ j64 a(zzbze zzbzeVar, int i, Throwable th) {
        return ((y4d) this.e.zzb()).y6(zzbzeVar, i);
    }

    public final j64 b(final zzbze zzbzeVar) {
        j64 j;
        String str = zzbzeVar.zzd;
        dyf.r();
        if (wxf.b(str)) {
            j = zb.g(new zzecf(1));
        } else {
            j = ((Boolean) pla.c().a(mpa.A7)).booleanValue() ? this.c.j(new Callable() { // from class: y0d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return d1d.this.c(zzbzeVar);
                }
            }) : this.d.b(zzbzeVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zb.f((vb) zb.o(vb.C(j), ((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new ake() { // from class: c1d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return d1d.this.a(zzbzeVar, callingUid, (Throwable) obj);
            }
        }, this.b);
    }

    final /* synthetic */ InputStream c(zzbze zzbzeVar) {
        return (InputStream) this.d.b(zzbzeVar).get(((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS);
    }
}
