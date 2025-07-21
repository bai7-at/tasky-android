package io.embrace.android.embracesdk;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class UnityInternalInterfaceImpl implements EmbraceInternalInterface, UnityInternalInterface {
    private final EmbraceImpl embrace;
    private final HostedSdkVersionInfo hostedSdkVersionInfo;
    private final EmbraceInternalInterface impl;
    private final InternalEmbraceLogger logger;

    public UnityInternalInterfaceImpl(EmbraceImpl embraceImpl, EmbraceInternalInterface embraceInternalInterface, HostedSdkVersionInfo hostedSdkVersionInfo, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(embraceImpl, "embrace");
        zq3.h(embraceInternalInterface, "impl");
        zq3.h(hostedSdkVersionInfo, "hostedSdkVersionInfo");
        zq3.h(internalEmbraceLogger, "logger");
        this.embrace = embraceImpl;
        this.impl = embraceInternalInterface;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.logger = internalEmbraceLogger;
    }

    private final void logUnityException(String str, String str2, String str3, LogExceptionType logExceptionType) {
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("log Unity exception");
            return;
        }
        this.logger.log("message: " + str2 + " -- stacktrace: " + str3, InternalEmbraceLogger.Severity.ERROR, null, false);
        this.embrace.logMessage(EventType.ERROR_LOG, "Unity exception", null, null, str3, logExceptionType, null, null, str, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanAttribute(String str, String str2, String str3) {
        zq3.h(str, "spanId");
        zq3.h(str2, TransferTable.COLUMN_KEY);
        zq3.h(str3, "value");
        return this.impl.addSpanAttribute(str, str2, str3);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanEvent(String str, String str2, Long l, Map<String, String> map) {
        zq3.h(str, "spanId");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.impl.addSpanEvent(str, str2, l, map);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public long getSdkCurrentTime() {
        return this.impl.getSdkCurrentTime();
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void installUnityThreadSampler() {
        this.embrace.installUnityThreadSampler();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isAnrCaptureEnabled() {
        return this.impl.isAnrCaptureEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isInternalNetworkCaptureDisabled() {
        return this.impl.isInternalNetworkCaptureDisabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNdkEnabled() {
        return this.impl.isNdkEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNetworkSpanForwardingEnabled() {
        return this.impl.isNetworkSpanForwardingEnabled();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logComposeTap(Pair<Float, Float> pair, String str) {
        zq3.h(pair, "point");
        zq3.h(str, "elementName");
        this.impl.logComposeTap(pair, str);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logError(String str, Map<String, ? extends Object> map, String str2, boolean z) {
        zq3.h(str, "message");
        this.impl.logError(str, map, str2, z);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logHandledException(Throwable th, LogType logType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr) {
        zq3.h(th, "throwable");
        zq3.h(logType, TransferTable.COLUMN_TYPE);
        this.impl.logHandledException(th, logType, map, stackTraceElementArr);
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void logHandledUnityException(String str, String str2, String str3) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "message");
        logUnityException(str, str2, str3, LogExceptionType.HANDLED);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInfo(String str, Map<String, ? extends Object> map) {
        zq3.h(str, "message");
        this.impl.logInfo(str, map);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(String str, String str2) {
        this.impl.logInternalError(str, str2);
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void logUnhandledUnityException(String str, String str2, String str3) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "message");
        logUnityException(str, str2, str3, LogExceptionType.UNHANDLED);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logWarning(String str, Map<String, ? extends Object> map, String str2) {
        zq3.h(str, "message");
        this.impl.logWarning(str, map, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.impl.recordCompletedNetworkRequest(str, str2, j, j2, j3, j4, i, str3, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.impl.recordCompletedSpan(str, j, j2, errorCode, str2, map, list);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(str, str2, j, j2, str3, str4, str5, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        zq3.h(embraceNetworkRequest, "embraceNetworkRequest");
        this.impl.recordNetworkRequest(embraceNetworkRequest);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public <T> T recordSpan(String str, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) this.impl.recordSpan(str, str2, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void setProcessStartedByNotification() {
        this.impl.setProcessStartedByNotification();
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void setUnityMetaData(String str, String str2, String str3) {
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("set Unity metadata");
            return;
        }
        if (str != null && str2 != null) {
            if (str3 != null) {
                this.hostedSdkVersionInfo.setHostedPlatformVersion(str);
                this.hostedSdkVersionInfo.setHostedSdkVersion(str3);
                this.hostedSdkVersionInfo.setUnityBuildIdNumber(str2);
                return;
            }
            return;
        }
        if (str3 == null) {
            str3 = "null or previous than 1.7.5";
        }
        this.logger.log("Unity metadata is corrupted or malformed. Unity version is " + str + ", Unity build id is " + str2 + " and Unity SDK version is " + str3, InternalEmbraceLogger.Severity.ERROR, null, false);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean shouldCaptureNetworkBody(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "method");
        return this.impl.shouldCaptureNetworkBody(str, str2);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public String startSpan(String str, String str2, Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.impl.startSpan(str, str2, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void stopSdk() {
        this.impl.stopSdk();
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean stopSpan(String str, ErrorCode errorCode, Long l) {
        zq3.h(str, "spanId");
        return this.impl.stopSpan(str, errorCode, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(Throwable th) {
        zq3.h(th, "error");
        this.impl.logInternalError(th);
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.embrace.recordNetworkRequest(EmbraceNetworkRequest.fromCompletedRequest(str, HttpMethod.fromString(str2), j, j2, j3, j4, i, str3, null, null));
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, Throwable th, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(str, str2, j, j2, th, str3, networkCaptureData);
    }

    @Override // io.embrace.android.embracesdk.UnityInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.embrace.recordNetworkRequest(EmbraceNetworkRequest.fromIncompleteRequest(str, HttpMethod.fromString(str2), j, j2, str3 == null ? "" : str3, str4 == null ? "" : str4, str5, null, null));
    }
}
