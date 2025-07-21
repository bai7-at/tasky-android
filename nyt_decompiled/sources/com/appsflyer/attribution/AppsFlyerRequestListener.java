package com.appsflyer.attribution;

import android.support.annotation.NonNull;

/* loaded from: classes2.dex */
public interface AppsFlyerRequestListener {
    void onError(int i, @NonNull String str);

    void onSuccess();
}
