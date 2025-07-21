package com.google.android.gms.internal.ads;

import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes3.dex */
public enum zzeih {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(AssetConstants.VIDEO_TYPE);

    private final String zze;

    zzeih(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
