package com.google.ads.interactivemedia.v3.api;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import com.google.ads.interactivemedia.v3.internal.zzgv;

/* loaded from: classes2.dex */
public interface BaseRequest {
    String getContentUrl();

    SecureSignals getSecureSignals();

    Object getUserRequestContext();

    void setContentUrl(String str);

    void setSecureSignals(SecureSignals secureSignals);

    void setUserRequestContext(Object obj);

    zzgv zza();
}
