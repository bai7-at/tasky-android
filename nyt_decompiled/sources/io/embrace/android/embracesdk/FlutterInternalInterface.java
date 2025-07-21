package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;

@InternalApi
/* loaded from: classes5.dex */
public interface FlutterInternalInterface extends EmbraceInternalInterface {
    void logHandledDartException(String str, String str2, String str3, String str4, String str5);

    void logUnhandledDartException(String str, String str2, String str3, String str4, String str5);

    void setDartVersion(String str);

    void setEmbraceFlutterSdkVersion(String str);
}
