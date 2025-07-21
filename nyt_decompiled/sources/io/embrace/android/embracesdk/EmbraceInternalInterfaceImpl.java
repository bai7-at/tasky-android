package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.injection.InitModule;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.InternalTracingApi;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.internal.spans.InternalTracer;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes5.dex */
public final class EmbraceInternalInterfaceImpl implements EmbraceInternalInterface, InternalTracingApi {
    private final /* synthetic */ InternalTracer $$delegate_0;
    private final ConfigService configService;
    private final EmbraceImpl embraceImpl;
    private final InitModule initModule;

    public EmbraceInternalInterfaceImpl(EmbraceImpl embraceImpl, InitModule initModule, ConfigService configService, InternalTracer internalTracer) {
        zq3.h(embraceImpl, "embraceImpl");
        zq3.h(initModule, "initModule");
        zq3.h(configService, "configService");
        zq3.h(internalTracer, "internalTracer");
        this.$$delegate_0 = internalTracer;
        this.embraceImpl = embraceImpl;
        this.initModule = initModule;
        this.configService = configService;
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanAttribute(String str, String str2, String str3) {
        zq3.h(str, "spanId");
        zq3.h(str2, TransferTable.COLUMN_KEY);
        zq3.h(str3, "value");
        return this.$$delegate_0.addSpanAttribute(str, str2, str3);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanEvent(String str, String str2, Long l, Map<String, String> map) {
        zq3.h(str, "spanId");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.$$delegate_0.addSpanEvent(str, str2, l, map);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public long getSdkCurrentTime() {
        return this.initModule.getClock().now();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isAnrCaptureEnabled() {
        return this.configService.getAnrBehavior().isAnrCaptureEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isInternalNetworkCaptureDisabled() {
        return ApkToolsConfig.IS_NETWORK_CAPTURE_DISABLED;
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNdkEnabled() {
        return this.configService.getAutoDataCaptureBehavior().isNdkEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNetworkSpanForwardingEnabled() {
        return this.configService.getNetworkSpanForwardingBehavior().isNetworkSpanForwardingEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logComposeTap(Pair<Float, Float> pair, String str) {
        zq3.h(pair, "point");
        zq3.h(str, "elementName");
        this.embraceImpl.logTap(pair, str, TapBreadcrumb.TapBreadcrumbType.TAP);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logError(String str, Map<String, ? extends Object> map, String str2, boolean z) {
        zq3.h(str, "message");
        this.embraceImpl.logMessage(EventType.ERROR_LOG, str, map, null, str2, LogExceptionType.NONE, null, null);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logHandledException(Throwable th, LogType logType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr) {
        zq3.h(th, "throwable");
        zq3.h(logType, TransferTable.COLUMN_TYPE);
        EmbraceImpl embraceImpl = this.embraceImpl;
        EventType eventType = logType.toEventType();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = th.getStackTrace();
        }
        embraceImpl.logMessage(eventType, str, map, stackTraceElementArr, null, LogExceptionType.NONE, null, null);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInfo(String str, Map<String, ? extends Object> map) {
        zq3.h(str, "message");
        this.embraceImpl.logMessage(EventType.INFO_LOG, str, map, null, null, LogExceptionType.NONE, null, null);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(String str, String str2) {
        this.embraceImpl.logInternalError(str, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logWarning(String str, Map<String, ? extends Object> map, String str2) {
        zq3.h(str, "message");
        this.embraceImpl.logMessage(EventType.WARNING_LOG, str, map, null, str2, LogExceptionType.NONE, null, null);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.embraceImpl.recordNetworkRequest(EmbraceNetworkRequest.fromCompletedRequest(str, HttpMethod.fromString(str2), j, j2, j3, j4, i, str3, null, networkCaptureData));
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.$$delegate_0.recordCompletedSpan(str, j, j2, errorCode, str2, map, list);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, Throwable th, String str3, NetworkCaptureData networkCaptureData) {
        String localizedMessage;
        String canonicalName;
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.embraceImpl.recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(str, HttpMethod.fromString(str2), j, j2, (th == null || (canonicalName = th.getClass().getCanonicalName()) == null) ? "" : canonicalName, (th == null || (localizedMessage = th.getLocalizedMessage()) == null) ? "" : localizedMessage, str3, null, networkCaptureData));
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        zq3.h(embraceNetworkRequest, "embraceNetworkRequest");
        this.embraceImpl.recordNetworkRequest(embraceNetworkRequest);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public <T> T recordSpan(String str, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) this.$$delegate_0.recordSpan(str, str2, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void setProcessStartedByNotification() {
        this.embraceImpl.setProcessStartedByNotification();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean shouldCaptureNetworkBody(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "method");
        return this.embraceImpl.shouldCaptureNetworkCall(str, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public String startSpan(String str, String str2, Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.$$delegate_0.startSpan(str, str2, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void stopSdk() {
        this.embraceImpl.stop();
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean stopSpan(String str, ErrorCode errorCode, Long l) {
        zq3.h(str, "spanId");
        return this.$$delegate_0.stopSpan(str, errorCode, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(Throwable th) {
        zq3.h(th, "error");
        this.embraceImpl.logInternalError(th);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.embraceImpl.recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(str, HttpMethod.fromString(str2), j, j2, str3 == null ? "" : str3, str4 == null ? "" : str4, str5, null, networkCaptureData));
    }
}
