package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
final class mbe implements nbe {
    private static final n1 a;

    static {
        u0 l0 = n1.l0();
        l0.x0(QueryKeys.ENGAGED_SECONDS);
        a = (n1) l0.i();
    }

    mbe() {
    }

    @Override // defpackage.nbe
    public final n1 zza() {
        return a;
    }
}
