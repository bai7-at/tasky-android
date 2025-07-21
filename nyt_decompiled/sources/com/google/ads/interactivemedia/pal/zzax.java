package com.google.ads.interactivemedia.pal;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.internal.pal.a3;

/* loaded from: classes2.dex */
public final class zzax {
    private final zzs zza;
    private final String zzb;

    zzax(zzs zzsVar, String str) {
        this.zza = zzsVar;
        this.zzb = str;
    }

    public final void zza(int i, String str) {
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        a3 a3Var = new a3();
        a3Var.a(zzaw.DEVICE_TYPE.zza(), String.valueOf(4));
        a3Var.a(zzaw.EVENT_TYPE.zza(), String.valueOf(i - 1));
        a3Var.a(zzaw.SPAM_CORRELATOR.zza(), this.zzb);
        a3Var.a(zzaw.SPAM_SIGNAL.zza(), str);
        this.zza.zza("asscs", "116", a3Var.c());
    }
}
