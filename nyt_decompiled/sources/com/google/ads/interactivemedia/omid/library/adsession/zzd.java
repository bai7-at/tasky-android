package com.google.ads.interactivemedia.omid.library.adsession;

import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public enum zzd {
    HTML(AssetConstants.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String zze;

    zzd(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
