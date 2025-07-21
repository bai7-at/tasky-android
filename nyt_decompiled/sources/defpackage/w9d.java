package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
final class w9d implements iic {
    private final zzcei a;
    private final j64 b;
    private final v0e c;
    private final wlb d;
    private final s1e e;
    private final wxa f;
    private final boolean g;
    private final l8d h;

    w9d(zzcei zzceiVar, j64 j64Var, v0e v0eVar, wlb wlbVar, s1e s1eVar, boolean z, wxa wxaVar, l8d l8dVar) {
        this.a = zzceiVar;
        this.b = j64Var;
        this.c = v0eVar;
        this.d = wlbVar;
        this.e = s1eVar;
        this.g = z;
        this.f = wxaVar;
        this.h = l8dVar;
    }

    @Override // defpackage.iic
    public final void a(boolean z, Context context, m7c m7cVar) {
        vxb vxbVar = (vxb) zb.q(this.b);
        this.d.L0(true);
        boolean e = this.g ? this.f.e(true) : true;
        boolean z2 = this.g;
        zzj zzjVar = new zzj(e, true, z2 ? this.f.d() : false, z2 ? this.f.a() : 0.0f, -1, z, this.c.P, false);
        if (m7cVar != null) {
            m7cVar.zzf();
        }
        dyf.k();
        yhc i = vxbVar.i();
        wlb wlbVar = this.d;
        int i2 = this.c.R;
        if (i2 == -1) {
            zzw zzwVar = this.e.j;
            if (zzwVar != null) {
                int i3 = zzwVar.zza;
                if (i3 == 1) {
                    i2 = 7;
                } else if (i3 == 2) {
                    i2 = 6;
                }
            }
            fgb.b("Error setting app open orientation; no targeting orientation available.");
            i2 = this.c.R;
        }
        int i4 = i2;
        zzcei zzceiVar = this.a;
        v0e v0eVar = this.c;
        String str = v0eVar.C;
        z0e z0eVar = v0eVar.t;
        thf.a(context, new AdOverlayInfoParcel((jq9) null, i, (wq9) null, wlbVar, i4, zzceiVar, str, zzjVar, z0eVar.b, z0eVar.a, this.e.f, m7cVar, v0eVar.j0 ? this.h : null), true);
    }
}
