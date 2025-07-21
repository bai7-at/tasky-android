package defpackage;

import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbze;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pxd implements gyd {
    private final i3e a;
    private final Executor b;
    private final gke c = new nxd(this);

    public pxd(i3e i3eVar, Executor executor) {
        this.a = i3eVar;
        this.b = executor;
    }

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ j64 a(hyd hydVar, fyd fydVar, Object obj) {
        return c(hydVar, fydVar, null);
    }

    final /* synthetic */ j64 b(d6c d6cVar, yxd yxdVar) {
        i3e i3eVar = this.a;
        t3e t3eVar = yxdVar.b;
        zzbze zzbzeVar = yxdVar.a;
        s3e d = i3eVar.d(t3eVar);
        if (d != null && zzbzeVar != null) {
            zb.r(d6cVar.zzb().h(zzbzeVar), this.c, this.b);
        }
        return zb.h(new oxd(t3eVar, zzbzeVar, d));
    }

    public final j64 c(hyd hydVar, fyd fydVar, final d6c d6cVar) {
        return zb.e(zb.n(vb.C(new zxd(this.a, d6cVar, this.b).c()), new ake() { // from class: lxd
            @Override // defpackage.ake
            public final j64 zza(Object obj) {
                return pxd.this.b(d6cVar, (yxd) obj);
            }
        }, this.b), Exception.class, new mxd(this), this.b);
    }

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
