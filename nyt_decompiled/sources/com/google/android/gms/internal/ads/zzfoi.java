package com.google.android.gms.internal.ads;

import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes3.dex */
public enum zzfoi {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(AssetConstants.VIDEO_TYPE),
    AUDIO(AssetConstants.AUDIO_TYPE);

    private final String zzg;

    zzfoi(String str) {
        this.zzg = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }
}
