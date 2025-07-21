package defpackage;

import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class txd implements gyd {
    private final gyd a;
    private d6c b;

    public txd(gyd gydVar) {
        this.a = gydVar;
    }

    @Override // defpackage.gyd
    public final /* bridge */ /* synthetic */ j64 a(hyd hydVar, fyd fydVar, Object obj) {
        return c(hydVar, fydVar, null);
    }

    @Override // defpackage.gyd
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized d6c zzd() {
        return this.b;
    }

    public final synchronized j64 c(hyd hydVar, fyd fydVar, d6c d6cVar) {
        this.b = d6cVar;
        if (hydVar.a == null) {
            return ((sxd) this.a).c(hydVar, fydVar, d6cVar);
        }
        g2c zzb = d6cVar.zzb();
        return zzb.i(zzb.k(zb.h(hydVar.a)));
    }
}
