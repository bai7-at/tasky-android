package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.ConsoleMessage;
import defpackage.ey7;
import defpackage.qs2;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;

@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes5.dex */
public final class Embrace implements EmbraceAndroidApi {
    static final String NULL_PARAMETER_ERROR_MESSAGE_TEMPLATE = " cannot be invoked because it contains null parameters";
    private static final Embrace embrace = new Embrace();
    private static EmbraceImpl impl = (EmbraceImpl) Systrace.traceSynchronous("embrace-impl-init", new qs2() { // from class: io.embrace.android.embracesdk.a
        @Override // defpackage.qs2
        /* renamed from: invoke */
        public final Object mo865invoke() {
            return new EmbraceImpl();
        }
    });

    public enum AppFramework {
        NATIVE(1),
        REACT_NATIVE(2),
        UNITY(3),
        FLUTTER(4);

        private final int value;

        AppFramework(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum LastRunEndState {
        INVALID(0),
        CRASH(1),
        CLEAN_EXIT(2);

        private final int value;

        LastRunEndState(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    Embrace() {
    }

    static EmbraceImpl getImpl() {
        return impl;
    }

    public static Embrace getInstance() {
        return embrace;
    }

    static void setImpl(EmbraceImpl embraceImpl) {
        impl = embraceImpl;
    }

    private boolean verifyNonNullParameters(String str, Object... objArr) {
        for (Object obj : objArr) {
            if (obj == null) {
                String str2 = str + NULL_PARAMETER_ERROR_MESSAGE_TEMPLATE;
                if (isStarted()) {
                    impl.getEmbraceInternalInterface().logInternalError(new IllegalArgumentException(str2));
                }
                return false;
            }
        }
        return true;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public void addBreadcrumb(String str) {
        if (verifyNonNullParameters("addBreadcrumb", str)) {
            impl.addBreadcrumb(str);
        }
    }

    @Override // io.embrace.android.embracesdk.SessionApi
    public boolean addSessionProperty(String str, String str2, boolean z) {
        if (verifyNonNullParameters("addSessionProperty", str, str2)) {
            return impl.addSessionProperty(str, str2, z);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public void addSpanExporter(ey7 ey7Var) {
        if (verifyNonNullParameters("addSpanExporter", ey7Var)) {
            impl.addSpanExporter(ey7Var);
        }
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void addUserPersona(String str) {
        if (verifyNonNullParameters("addUserPersona", str)) {
            impl.addUserPersona(str);
        }
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearAllUserPersonas() {
        impl.clearAllUserPersonas();
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearUserAsPayer() {
        impl.clearUserAsPayer();
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearUserEmail() {
        impl.clearUserEmail();
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearUserIdentifier() {
        impl.clearUserIdentifier();
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearUserPersona(String str) {
        if (verifyNonNullParameters("clearUserPersona", str)) {
            impl.clearUserPersona(str);
        }
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void clearUsername() {
        impl.clearUsername();
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan createSpan(String str) {
        if (verifyNonNullParameters("createSpan", str)) {
            return impl.tracer.createSpan(str);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endAppStartup() {
        impl.endAppStartup(null);
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endMoment(String str) {
        if (verifyNonNullParameters("endMoment", str)) {
            endMoment(str, null, null);
        }
    }

    @Override // io.embrace.android.embracesdk.SessionApi
    public synchronized void endSession() {
        endSession(false);
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public boolean endView(String str) {
        if (verifyNonNullParameters("endView", str)) {
            return impl.endView(str);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public String generateW3cTraceparent() {
        return impl.generateW3cTraceparent();
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public String getCurrentSessionId() {
        return impl.getCurrentSessionId();
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public String getDeviceId() {
        return impl.getDeviceId();
    }

    @InternalApi
    public FlutterInternalInterface getFlutterInternalInterface() {
        return impl.getFlutterInternalInterface();
    }

    @InternalApi
    public EmbraceInternalInterface getInternalInterface() {
        return impl.getEmbraceInternalInterface();
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public LastRunEndState getLastRunEndState() {
        return impl.getLastRunEndState();
    }

    @InternalApi
    public ReactNativeInternalInterface getReactNativeInternalInterface() {
        return impl.getReactNativeInternalInterface();
    }

    @Override // io.embrace.android.embracesdk.SessionApi
    public Map<String, String> getSessionProperties() {
        return impl.getSessionProperties();
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan getSpan(String str) {
        if (verifyNonNullParameters("getSpan", str)) {
            return impl.tracer.getSpan(str);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public String getTraceIdHeader() {
        return impl.getTraceIdHeader();
    }

    @InternalApi
    public UnityInternalInterface getUnityInternalInterface() {
        return impl.getUnityInternalInterface();
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public boolean isStarted() {
        return impl.isStarted();
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean isTracingAvailable() {
        return impl.tracer.isTracingAvailable();
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logCustomStacktrace(StackTraceElement[] stackTraceElementArr) {
        if (verifyNonNullParameters("logCustomStacktrace", stackTraceElementArr)) {
            logCustomStacktrace(stackTraceElementArr, Severity.ERROR);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logError(String str) {
        if (verifyNonNullParameters("logError", str)) {
            logMessage(str, Severity.ERROR);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logException(Throwable th) {
        if (verifyNonNullParameters("logException", th)) {
            logException(th, Severity.ERROR);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logInfo(String str) {
        if (verifyNonNullParameters("logInfo", str)) {
            logMessage(str, Severity.INFO);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logMessage(String str, Severity severity) {
        if (verifyNonNullParameters("logMessage", str, severity)) {
            logMessage(str, severity, null);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logPushNotification(String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, Boolean bool2) {
        if (verifyNonNullParameters("logPushNotification", num2, bool, bool2)) {
            impl.logPushNotification(str, str2, str3, str4, num, num2, PushNotificationBreadcrumb.NotificationType.Builder.notificationTypeFor(bool2.booleanValue(), bool.booleanValue()));
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logWarning(String str) {
        if (verifyNonNullParameters("logWarning", str)) {
            logMessage(str, Severity.WARNING);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list) {
        if (verifyNonNullParameters("recordCompletedSpan", str)) {
            return impl.tracer.recordCompletedSpan(str, j, j2, errorCode, embraceSpan, map, list);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.NetworkRequestApi
    public void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        if (verifyNonNullParameters("recordNetworkRequest", embraceNetworkRequest)) {
            impl.recordNetworkRequest(embraceNetworkRequest);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public <T> T recordSpan(String str, qs2 qs2Var) {
        return (T) recordSpan(str, null, null, null, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.SessionApi
    public boolean removeSessionProperty(String str) {
        if (verifyNonNullParameters("removeSessionProperty", str)) {
            return impl.removeSessionProperty(str);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public boolean setAppId(String str) {
        if (verifyNonNullParameters("setAppId", str)) {
            return impl.setAppId(str);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void setUserAsPayer() {
        impl.setUserAsPayer();
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void setUserEmail(String str) {
        impl.setUserEmail(str);
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void setUserIdentifier(String str) {
        impl.setUserIdentifier(str);
    }

    @Override // io.embrace.android.embracesdk.UserApi
    public void setUsername(String str) {
        impl.setUsername(str);
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public void start(Context context) {
        if (verifyNonNullParameters("start", context)) {
            start(context, true, AppFramework.NATIVE);
        }
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void startMoment(String str) {
        if (verifyNonNullParameters("startMoment", str)) {
            startMoment(str, null);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan startSpan(String str) {
        return startSpan(str, null, null);
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public boolean startView(String str) {
        if (verifyNonNullParameters("startView", str)) {
            return impl.startView(str);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public void trackWebViewPerformance(String str, ConsoleMessage consoleMessage) {
        if (!verifyNonNullParameters("trackWebViewPerformance", str, consoleMessage) || consoleMessage.message() == null) {
            return;
        }
        trackWebViewPerformance(str, consoleMessage.message());
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endAppStartup(Map<String, Object> map) {
        if (verifyNonNullParameters("endAppStartup", map)) {
            impl.endAppStartup(map);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, qs2 qs2Var) {
        return (T) recordSpan(str, embraceSpan, null, null, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan) {
        return startSpan(str, embraceSpan, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan createSpan(String str, EmbraceSpan embraceSpan) {
        if (verifyNonNullParameters("createSpan", str)) {
            return impl.tracer.createSpan(str, embraceSpan);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endMoment(String str, String str2) {
        if (verifyNonNullParameters("endMoment", str)) {
            endMoment(str, str2, null);
        }
    }

    @Override // io.embrace.android.embracesdk.SessionApi
    public synchronized void endSession(boolean z) {
        impl.endSession(z);
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity) {
        if (verifyNonNullParameters("logCustomStacktrace", stackTraceElementArr, severity)) {
            logCustomStacktrace(stackTraceElementArr, severity, null);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logException(Throwable th, Severity severity) {
        if (verifyNonNullParameters("logException", th, severity)) {
            logException(th, severity, null);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logMessage(String str, Severity severity, Map<String, ?> map) {
        if (verifyNonNullParameters("logMessage", str, severity)) {
            impl.logMessage(str, severity, map);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2) {
        return recordCompletedSpan(str, j, j2, null, null, null, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public <T> T recordSpan(String str, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        return (T) recordSpan(str, null, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public void start(Context context, boolean z) {
        if (verifyNonNullParameters("start", context)) {
            start(context, z, AppFramework.NATIVE);
        }
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void startMoment(String str, String str2) {
        if (verifyNonNullParameters("startMoment", str)) {
            startMoment(str, str2, null);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public EmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l) {
        if (verifyNonNullParameters("startSpan", str)) {
            return impl.tracer.startSpan(str, embraceSpan, l);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode) {
        return recordCompletedSpan(str, j, j2, errorCode, null, null, null);
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        if (verifyNonNullParameters("recordSpan", str, qs2Var)) {
            return (T) impl.tracer.recordSpan(str, embraceSpan, map, list, qs2Var);
        }
        if (qs2Var != null) {
            return (T) qs2Var.mo865invoke();
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.EmbraceApi
    public void trackWebViewPerformance(String str, String str2) {
        if (verifyNonNullParameters("trackWebViewPerformance", str, str2)) {
            impl.trackWebViewPerformance(str, str2);
        }
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endMoment(String str, Map<String, Object> map) {
        if (verifyNonNullParameters("endMoment", str)) {
            endMoment(str, null, map);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity, Map<String, ?> map) {
        if (verifyNonNullParameters("logCustomStacktrace", stackTraceElementArr, severity)) {
            logCustomStacktrace(stackTraceElementArr, severity, map, null);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logException(Throwable th, Severity severity, Map<String, ?> map) {
        if (verifyNonNullParameters("logException", th, severity)) {
            logException(th, severity, map, null);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan) {
        return recordCompletedSpan(str, j, j2, null, embraceSpan, null, null);
    }

    @Override // io.embrace.android.embracesdk.EmbraceAndroidApi
    public void start(Context context, boolean z, AppFramework appFramework) {
        if (verifyNonNullParameters("start", context, appFramework)) {
            impl.start(context, z, appFramework);
        }
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void startMoment(String str, String str2, Map<String, Object> map) {
        if (verifyNonNullParameters("startMoment", str)) {
            impl.startMoment(str, str2, map);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, EmbraceSpan embraceSpan) {
        return recordCompletedSpan(str, j, j2, errorCode, embraceSpan, null, null);
    }

    @Override // io.embrace.android.embracesdk.MomentsApi
    public void endMoment(String str, String str2, Map<String, Object> map) {
        if (verifyNonNullParameters("endMoment", str)) {
            impl.endMoment(str, str2, map);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity, Map<String, ?> map, String str) {
        if (verifyNonNullParameters("logCustomStacktrace", stackTraceElementArr, severity)) {
            impl.logCustomStacktrace(stackTraceElementArr, severity, map, str);
        }
    }

    @Override // io.embrace.android.embracesdk.LogsApi
    public void logException(Throwable th, Severity severity, Map<String, ?> map, String str) {
        if (verifyNonNullParameters("logException", th, severity)) {
            impl.logException(th, severity, map, str);
        }
    }

    @Override // io.embrace.android.embracesdk.spans.TracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, Map<String, String> map, List<EmbraceSpanEvent> list) {
        return recordCompletedSpan(str, j, j2, null, null, map, list);
    }
}
