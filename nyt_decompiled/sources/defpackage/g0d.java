package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzecf;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class g0d {
    private final kke a;
    private final kke b;
    private final q1d c;
    private final l3f d;

    public g0d(kke kkeVar, kke kkeVar2, q1d q1dVar, l3f l3fVar) {
        this.a = kkeVar;
        this.b = kkeVar2;
        this.c = q1dVar;
        this.d = l3fVar;
    }

    final /* synthetic */ j64 a(zzbze zzbzeVar, int i, zzecf zzecfVar) {
        return ((y4d) this.d.zzb()).x6(zzbzeVar, i);
    }

    public final j64 b(final zzbze zzbzeVar) {
        j64 f;
        String str = zzbzeVar.zzd;
        dyf.r();
        if (wxf.b(str)) {
            f = zb.g(new zzecf(1));
        } else {
            f = zb.f(this.a.j(new Callable() { // from class: d0d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return g0d.this.c(zzbzeVar);
                }
            }), ExecutionException.class, new ake() { // from class: e0d
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    return zb.g(((ExecutionException) obj).getCause());
                }
            }, this.b);
        }
        final int callingUid = Binder.getCallingUid();
        return zb.f(f, zzecf.class, new ake() { // from class: f0d
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return g0d.this.a(zzbzeVar, callingUid, (zzecf) obj);
            }
        }, this.b);
    }

    final /* synthetic */ InputStream c(zzbze zzbzeVar) {
        ugb ugbVar;
        final q1d q1dVar = this.c;
        synchronized (q1dVar.b) {
            try {
                if (q1dVar.c) {
                    ugbVar = q1dVar.a;
                } else {
                    q1dVar.c = true;
                    q1dVar.e = zzbzeVar;
                    q1dVar.f.checkAvailabilityAndConnect();
                    q1dVar.a.a(new Runnable() { // from class: p1d
                        @Override // java.lang.Runnable
                        public final void run() {
                            q1d.this.a();
                        }
                    }, pgb.f);
                    ugbVar = q1dVar.a;
                }
            } finally {
            }
        }
        return (InputStream) ugbVar.get(((Integer) pla.c().a(mpa.x5)).intValue(), TimeUnit.SECONDS);
    }
}
