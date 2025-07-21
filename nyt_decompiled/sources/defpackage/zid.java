package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zb;

/* loaded from: classes3.dex */
public final class zid implements gqd {
    private final Context a;

    zid(Context context) {
        this.a = context;
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 2;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        if (((Boolean) pla.c().a(mpa.J2)).booleanValue()) {
            return zb.h(new ajd(mx0.a(this.a, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zb.h(null);
    }
}
