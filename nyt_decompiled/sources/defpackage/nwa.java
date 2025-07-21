package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class nwa implements uxa {
    public final /* synthetic */ bgc a;
    public final /* synthetic */ gwb b;

    public /* synthetic */ nwa(bgc bgcVar, gwb gwbVar) {
        this.a = bgcVar;
        this.b = gwbVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        wlb wlbVar = (wlb) obj;
        txa.c(map, this.a);
        final String str = (String) map.get(QueryKeys.USER_ID);
        if (str == null) {
            fgb.g("URL missing from click GMSG.");
            return;
        }
        final gwb gwbVar = this.b;
        vb C = vb.C(txa.a(wlbVar, str));
        ake akeVar = new ake() { // from class: pwa
            @Override // defpackage.ake
            public final j64 zza(Object obj2) {
                gwb gwbVar2;
                String str2 = (String) obj2;
                uxa uxaVar = txa.a;
                return (((Boolean) pla.c().a(mpa.L9)).booleanValue() && (gwbVar2 = gwb.this) != null && gwb.h(str)) ? gwbVar2.b(str2, kia.e()) : zb.h(str2);
            }
        };
        kke kkeVar = pgb.a;
        zb.r(zb.n(C, akeVar, kkeVar), new dxa(wlbVar), kkeVar);
    }
}
