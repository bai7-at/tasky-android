package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class AFb1bSDK<ResponseBody> {
    private final AFc1sSDK AFInAppEventType;
    private final AtomicBoolean AFKeystoreWrapper = new AtomicBoolean(false);
    public final AFb1wSDK valueOf;
    private final AFc1pSDK<ResponseBody> values;

    public AFb1bSDK(AFb1wSDK aFb1wSDK, AFc1sSDK aFc1sSDK, AFc1pSDK<ResponseBody> aFc1pSDK) {
        this.valueOf = aFb1wSDK;
        this.AFInAppEventType = aFc1sSDK;
        this.values = aFc1pSDK;
    }

    public final AFc1oSDK<ResponseBody> AFKeystoreWrapper() throws IOException {
        if (this.AFKeystoreWrapper.getAndSet(true)) {
            throw new IllegalStateException("Http call is already executed");
        }
        AFc1oSDK<String> AFInAppEventParameterName = this.AFInAppEventType.AFInAppEventParameterName(this.valueOf);
        try {
            return new AFc1oSDK<>(this.values.values(AFInAppEventParameterName.getBody()), AFInAppEventParameterName.valueOf, AFInAppEventParameterName.AFKeystoreWrapper, AFInAppEventParameterName.AFInAppEventType, AFInAppEventParameterName.values);
        } catch (JSONException e) {
            throw new ParsingException(e.getMessage(), e, AFInAppEventParameterName);
        }
    }
}
