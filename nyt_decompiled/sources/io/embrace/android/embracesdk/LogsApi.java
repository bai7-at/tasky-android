package io.embrace.android.embracesdk;

import java.util.Map;

/* loaded from: classes5.dex */
public interface LogsApi {
    void logCustomStacktrace(StackTraceElement[] stackTraceElementArr);

    void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity);

    void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity, Map<String, ? extends Object> map);

    void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity, Map<String, ? extends Object> map, String str);

    void logError(String str);

    void logException(Throwable th);

    void logException(Throwable th, Severity severity);

    void logException(Throwable th, Severity severity, Map<String, ? extends Object> map);

    void logException(Throwable th, Severity severity, Map<String, ? extends Object> map, String str);

    void logInfo(String str);

    void logMessage(String str, Severity severity);

    void logMessage(String str, Severity severity, Map<String, ? extends Object> map);

    void logPushNotification(String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, Boolean bool2);

    void logWarning(String str);
}
