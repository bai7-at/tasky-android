package com.google.android.gms.internal.ads;

import defpackage.m0f;
import defpackage.n0f;

/* loaded from: classes3.dex */
public enum zzbbz implements m0f {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);

    private static final n0f zzm = new n0f() { // from class: com.google.android.gms.internal.ads.j2
    };
    private final int zzo;

    zzbbz(int i) {
        this.zzo = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzo);
    }

    public final int zza() {
        return this.zzo;
    }
}
