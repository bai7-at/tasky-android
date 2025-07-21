package io.embrace.android.embracesdk;

import android.webkit.ConsoleMessage;
import defpackage.ey7;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.spans.TracingApi;

/* loaded from: classes5.dex */
interface EmbraceApi extends LogsApi, MomentsApi, NetworkRequestApi, SessionApi, UserApi, TracingApi {
    void addBreadcrumb(String str);

    void addSpanExporter(ey7 ey7Var);

    String generateW3cTraceparent();

    String getCurrentSessionId();

    String getDeviceId();

    Embrace.LastRunEndState getLastRunEndState();

    String getTraceIdHeader();

    boolean setAppId(String str);

    void trackWebViewPerformance(String str, ConsoleMessage consoleMessage);

    void trackWebViewPerformance(String str, String str2);
}
