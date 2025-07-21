package io.embrace.android.embracesdk;

import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;

@InternalApi
/* loaded from: classes5.dex */
public interface UnityInternalInterface extends EmbraceInternalInterface {
    void installUnityThreadSampler();

    void logHandledUnityException(String str, String str2, String str3);

    void logUnhandledUnityException(String str, String str2, String str3);

    void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3);

    void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5);

    void setUnityMetaData(String str, String str2, String str3);
}
