package com.google.android.gms.internal.atv_ads_framework;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import io.reactivex.annotations.SchedulerSupport;

/* loaded from: classes3.dex */
public enum zza {
    TV_LAUNCHER("watson"),
    LAUNCHER_X("launcher_x"),
    CUSTOM(SchedulerSupport.CUSTOM),
    UNKNOWN(DatasetUtils.UNKNOWN_IDENTITY_ID);

    private final String zzf;

    zza(String str) {
        this.zzf = str;
    }

    public final String zza() {
        return this.zzf;
    }
}
