package com.google.ads.interactivemedia.pal;

import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes2.dex */
enum zzr {
    CORRELATOR(QueryKeys.TIME_ON_VIEW_IN_MINUTES),
    EVENT_ID("lid"),
    LOGGER_ID("id"),
    PALV("palv"),
    SDKV("sdkv");

    private final String zzg;

    zzr(String str) {
        this.zzg = str;
    }

    final String zza() {
        return this.zzg;
    }
}
