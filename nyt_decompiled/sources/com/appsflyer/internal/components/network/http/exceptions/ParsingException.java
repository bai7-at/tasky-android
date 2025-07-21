package com.appsflyer.internal.components.network.http.exceptions;

import android.support.annotation.NonNull;
import com.appsflyer.internal.AFc1oSDK;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ParsingException extends IOException {

    @NonNull
    private final AFc1oSDK<String> AFInAppEventParameterName;

    public ParsingException(String str, Throwable th, @NonNull AFc1oSDK<String> aFc1oSDK) {
        super(str, th);
        this.AFInAppEventParameterName = aFc1oSDK;
    }

    @NonNull
    public AFc1oSDK<String> getRawResponse() {
        return this.AFInAppEventParameterName;
    }
}
