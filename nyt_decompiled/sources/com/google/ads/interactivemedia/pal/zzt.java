package com.google.ads.interactivemedia.pal;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes2.dex */
enum zzt {
    NONCE_LOADED(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
    ERROR_EVENT("2");

    private final String zzd;

    zzt(String str) {
        this.zzd = str;
    }

    final String zza() {
        return this.zzd;
    }
}
