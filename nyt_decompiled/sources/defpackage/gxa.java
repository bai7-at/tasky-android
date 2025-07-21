package defpackage;

import com.google.android.gms.ads.internal.overlay.h;
import java.util.Map;

/* loaded from: classes3.dex */
final class gxa implements uxa {
    gxa() {
    }

    @Override // defpackage.uxa
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        if (wlbVar.d() != null) {
            wlbVar.d().zza();
        }
        h u = wlbVar.u();
        if (u != null) {
            u.zzb();
            return;
        }
        h H = wlbVar.H();
        if (H != null) {
            H.zzb();
        } else {
            fgb.g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
