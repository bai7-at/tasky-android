package defpackage;

import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzecf;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zxd {
    private final i3e a;
    private final d6c b;
    private final Executor c;
    private yxd d;

    public zxd(i3e i3eVar, d6c d6cVar, Executor executor) {
        this.a = i3eVar;
        this.b = d6cVar;
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t3e e() {
        s1e zzg = this.b.zzg();
        return this.a.b(zzg.d, zzg.f, zzg.j);
    }

    public final j64 c() {
        j64 e;
        yxd yxdVar = this.d;
        if (yxdVar != null) {
            return zb.h(yxdVar);
        }
        if (((Boolean) csa.a.e()).booleanValue()) {
            e = zb.e(zb.m(vb.C(this.b.zzb().e(this.a.zza())), new wxd(this), this.c), zzecf.class, new vxd(this), this.c);
        } else {
            yxd yxdVar2 = new yxd(null, e(), null);
            this.d = yxdVar2;
            e = zb.h(yxdVar2);
        }
        return zb.m(e, new gge() { // from class: uxd
            @Override // defpackage.gge
            public final Object apply(Object obj) {
                return (yxd) obj;
            }
        }, this.c);
    }
}
