package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
final class pbd implements iic {
    private final Context a;
    private final zzcei b;
    private final j64 c;
    private final v0e d;
    private final wlb e;
    private final s1e f;
    private final wxa g;
    private final boolean h;
    private final l8d i;

    pbd(Context context, zzcei zzceiVar, j64 j64Var, v0e v0eVar, wlb wlbVar, s1e s1eVar, boolean z, wxa wxaVar, l8d l8dVar) {
        this.a = context;
        this.b = zzceiVar;
        this.c = j64Var;
        this.d = v0eVar;
        this.e = wlbVar;
        this.f = s1eVar;
        this.g = wxaVar;
        this.h = z;
        this.i = l8dVar;
    }

    @Override // defpackage.iic
    public final void a(boolean z, Context context, m7c m7cVar) {
        zgc zgcVar = (zgc) zb.q(this.c);
        this.e.L0(true);
        boolean e = this.h ? this.g.e(false) : false;
        dyf.r();
        zzj zzjVar = new zzj(e, wxf.h(this.a), this.h ? this.g.d() : false, this.h ? this.g.a() : 0.0f, -1, z, this.d.P, false);
        if (m7cVar != null) {
            m7cVar.zzf();
        }
        dyf.k();
        yhc j = zgcVar.j();
        wlb wlbVar = this.e;
        v0e v0eVar = this.d;
        zzcei zzceiVar = this.b;
        int i = v0eVar.R;
        String str = v0eVar.C;
        z0e z0eVar = v0eVar.t;
        thf.a(context, new AdOverlayInfoParcel((jq9) null, j, (wq9) null, wlbVar, i, zzceiVar, str, zzjVar, z0eVar.b, z0eVar.a, this.f.f, m7cVar, v0eVar.j0 ? this.i : null), true);
    }
}
