package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.AFc1tSDK;
import java.io.IOException;

/* loaded from: classes2.dex */
public class HttpException extends IOException {
    private final AFc1tSDK AFInAppEventParameterName;

    public HttpException(@NonNull Throwable th, @NonNull AFc1tSDK aFc1tSDK) {
        super(th.getMessage(), th);
        this.AFInAppEventParameterName = aFc1tSDK;
    }

    @NonNull
    public AFc1tSDK getMetrics() {
        return this.AFInAppEventParameterName;
    }
}
