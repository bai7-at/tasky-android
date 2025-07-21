package io.embrace.android.embracesdk.internal.logs;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.Severity;
import java.util.Map;

/* loaded from: classes5.dex */
public interface LogService extends BaseLogService {
    void log(String str, Severity severity, Map<String, ? extends Object> map);

    void logException(String str, Severity severity, LogExceptionType logExceptionType, Map<String, ? extends Object> map, String str2, Embrace.AppFramework appFramework, String str3, String str4);

    void logFlutterException(String str, Severity severity, LogExceptionType logExceptionType, Map<String, ? extends Object> map, String str2, String str3, String str4, String str5, String str6);
}
