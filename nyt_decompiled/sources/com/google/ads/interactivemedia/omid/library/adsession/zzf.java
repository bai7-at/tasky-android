package com.google.ads.interactivemedia.omid.library.adsession;

import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public enum zzf {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(AssetConstants.VIDEO_TYPE),
    AUDIO(AssetConstants.AUDIO_TYPE);

    private final String zzg;

    zzf(String str) {
        this.zzg = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }
}
