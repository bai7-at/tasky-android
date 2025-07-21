package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiz;

/* loaded from: classes3.dex */
public final class jyd implements v3f {
    private final l4f a;
    private final l4f b;
    private final l4f c;

    public jyd(l4f l4fVar, l4f l4fVar2, l4f l4fVar3) {
        this.a = l4fVar;
        this.b = l4fVar2;
        this.c = l4fVar3;
    }

    @Override // defpackage.l4f
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gyd zzb() {
        Context context = (Context) this.a.zzb();
        e3e e3eVar = (e3e) this.b.zzb();
        x3e x3eVar = (x3e) this.c.zzb();
        efb zzh = ((Boolean) pla.c().a(mpa.r6)).booleanValue() ? dyf.q().i().zzh() : dyf.q().i().zzi();
        boolean z = false;
        if (zzh != null && zzh.h()) {
            z = true;
        }
        if (((Integer) pla.c().a(mpa.t6)).intValue() > 0) {
            if (!((Boolean) pla.c().a(mpa.q6)).booleanValue() || z) {
                w3e a = x3eVar.a(zzfiz.Rewarded, context, e3eVar, new hxd(new exd()));
                txd txdVar = new txd(new sxd());
                i3e i3eVar = a.a;
                kke kkeVar = pgb.a;
                return new jxd(txdVar, new pxd(i3eVar, kkeVar), a.b, a.a.zza().zzf, kkeVar);
            }
        }
        return new sxd();
    }
}
