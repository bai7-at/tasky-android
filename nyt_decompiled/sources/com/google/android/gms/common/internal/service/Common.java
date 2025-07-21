package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* loaded from: classes2.dex */
public final class Common {

    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;

    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;
    public static final zae zaa;
    private static final Api.AbstractClientBuilder zab;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        a aVar = new a();
        zab = aVar;
        API = new Api<>("Common.API", aVar, clientKey);
        zaa = new zae();
    }
}
