package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;

/* loaded from: classes3.dex */
public enum zzb {
    BUILD_FINGERPRINT_PREFIX("atv_bfp"),
    LAUNCHER_TYPE("atv_lt"),
    OPERATOR_TIER("atv_ot"),
    SDK_VERSION("atv_asv"),
    LAUNCHERX_VERSION_CODE("atv_lxvc"),
    TVLAUNCHER_VERSION_CODE("atv_tlvc"),
    TVRECOMMENDATIONS_VERSION_CODE("atv_csvc");

    private final String zzi;

    zzb(String str) {
        aif.c(str.startsWith("atv_"));
        aif.c(!str.endsWith("_tva"));
        this.zzi = str;
    }

    public final String zza() {
        return this.zzi;
    }
}
