package com.google.ads.interactivemedia.v3.api.signals;

/* loaded from: classes2.dex */
public final class SecureSignals {
    private final String zza;

    private SecureSignals(String str) {
        this.zza = str;
    }

    public static SecureSignals create(String str) {
        return new SecureSignals(str);
    }

    public String getSecureSignal() {
        return this.zza;
    }
}
