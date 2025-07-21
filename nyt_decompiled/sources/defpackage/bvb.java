package defpackage;

import com.google.android.gms.internal.ads.vb;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Map;

/* loaded from: classes3.dex */
final class bvb implements oub {
    private final e9d a;

    bvb(e9d e9dVar) {
        this.a = e9dVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        if (((Boolean) pla.c().a(mpa.U9)).booleanValue()) {
            zb.f(vb.C(this.a.a(true)), Throwable.class, new ake() { // from class: avb
                @Override // defpackage.ake
                public final j64 zza(Object obj) {
                    dyf.q().w((Throwable) obj, "GetTopicsApiWithRecordObservationActionHandler");
                    return zb.h(new az2(zzgaa.t()));
                }
            }, pgb.a);
        }
    }
}
