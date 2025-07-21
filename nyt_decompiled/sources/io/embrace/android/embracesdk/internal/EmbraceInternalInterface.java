package io.embrace.android.embracesdk.internal;

import io.embrace.android.embracesdk.LogType;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import java.util.Map;
import kotlin.Pair;

@InternalApi
/* loaded from: classes5.dex */
public interface EmbraceInternalInterface extends InternalTracingApi {
    long getSdkCurrentTime();

    boolean isAnrCaptureEnabled();

    boolean isInternalNetworkCaptureDisabled();

    boolean isNdkEnabled();

    boolean isNetworkSpanForwardingEnabled();

    void logComposeTap(Pair<Float, Float> pair, String str);

    void logError(String str, Map<String, ? extends Object> map, String str2, boolean z);

    void logHandledException(Throwable th, LogType logType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr);

    void logInfo(String str, Map<String, ? extends Object> map);

    void logInternalError(String str, String str2);

    void logInternalError(Throwable th);

    void logWarning(String str, Map<String, ? extends Object> map, String str2);

    void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3, NetworkCaptureData networkCaptureData);

    void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData);

    void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, Throwable th, String str3, NetworkCaptureData networkCaptureData);

    void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest);

    void setProcessStartedByNotification();

    boolean shouldCaptureNetworkBody(String str, String str2);

    void stopSdk();
}
