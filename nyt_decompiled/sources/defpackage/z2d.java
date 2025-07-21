package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class z2d {
    private final kke a;
    private final kke b;
    private final y3d c;
    private final l3f d;

    z2d(kke kkeVar, kke kkeVar2, y3d y3dVar, l3f l3fVar) {
        this.a = kkeVar;
        this.b = kkeVar2;
        this.c = y3dVar;
        this.d = l3fVar;
    }

    final /* synthetic */ j64 a(zzbym zzbymVar) {
        return this.c.c(zzbymVar, ((Long) pla.c().a(mpa.Xa)).longValue());
    }

    final /* synthetic */ j64 b(zzbym zzbymVar, int i, zzecf zzecfVar) {
        return ((i5d) this.d.zzb()).w6(zzbymVar, i);
    }

    public final j64 c(final zzbym zzbymVar) {
        j64 f;
        String str = zzbymVar.zzf;
        dyf.r();
        if (wxf.b(str)) {
            f = zb.g(new zzecf(1, "Ads service proxy force local"));
        } else {
            f = zb.f(zb.k(new zje() { // from class: w2d
                @Override // defpackage.zje
                public final j64 zza() {
                    return z2d.this.a(zzbymVar);
                }
            }, this.a), ExecutionException.class, new ake() { // from class: x2d
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zb.g(th);
                }
            }, this.b);
        }
        final int callingUid = Binder.getCallingUid();
        return zb.f(f, zzecf.class, new ake() { // from class: y2d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return z2d.this.b(zzbymVar, callingUid, (zzecf) obj);
            }
        }, this.b);
    }
}
