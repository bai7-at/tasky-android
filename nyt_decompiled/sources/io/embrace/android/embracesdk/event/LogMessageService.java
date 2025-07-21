package io.embrace.android.embracesdk.event;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.internal.logs.BaseLogService;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface LogMessageService extends BaseLogService {
    List<String> findNetworkLogIds(long j, long j2);

    void log(String str, EventType eventType, LogExceptionType logExceptionType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr, String str2, Embrace.AppFramework appFramework, String str3, String str4, String str5, String str6);

    void logNetwork(NetworkCapturedCall networkCapturedCall);
}
