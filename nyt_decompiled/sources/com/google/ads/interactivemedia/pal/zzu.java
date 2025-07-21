package com.google.ads.interactivemedia.pal;

/* loaded from: classes2.dex */
enum zzu {
    ERROR_CODE("errcode"),
    NONCE_LENGTH("length"),
    NONCE_LOADED_TIME("nonload"),
    NONCE_LOADER_INIT_TIME("loaderinit"),
    NONCE_REQUESTED_TIME("nonreq"),
    SERVICE_END_TIME("srvcend"),
    SERVICE_START_TIME("srvcstrt");

    private final String zzi;

    zzu(String str) {
        this.zzi = str;
    }

    final String zza() {
        return this.zzi;
    }
}
