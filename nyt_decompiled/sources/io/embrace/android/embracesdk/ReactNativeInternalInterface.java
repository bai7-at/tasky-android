package io.embrace.android.embracesdk;

import android.content.Context;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import java.util.Map;

@InternalApi
/* loaded from: classes5.dex */
public interface ReactNativeInternalInterface extends EmbraceInternalInterface {
    void logHandledJsException(String str, String str2, Map<String, ? extends Object> map, String str3);

    void logRnAction(String str, long j, long j2, Map<String, ? extends Object> map, int i, String str2);

    void logRnView(String str);

    void logUnhandledJsException(String str, String str2, String str3, String str4);

    void setCacheableJavaScriptBundleUrl(Context context, String str, boolean z);

    void setJavaScriptBundleUrl(Context context, String str);

    void setJavaScriptPatchNumber(String str);

    void setReactNativeSdkVersion(String str);

    void setReactNativeVersionNumber(String str);
}
