package defpackage;

import com.google.android.gms.internal.ads.zzecf;

/* loaded from: classes3.dex */
final class vxd implements gge {
    final /* synthetic */ zxd a;

    vxd(zxd zxdVar) {
        this.a = zxdVar;
    }

    @Override // defpackage.gge
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        t3e e;
        yxd yxdVar;
        fgb.e("", (zzecf) obj);
        pzc.k("Failed to get a cache key, reverting to legacy flow.");
        zxd zxdVar = this.a;
        e = zxdVar.e();
        zxdVar.d = new yxd(null, e, null);
        yxdVar = this.a.d;
        return yxdVar;
    }
}
