package io.embrace.android.embracesdk;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.capture.crash.CrashService;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.payload.JsException;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final class ReactNativeInternalInterfaceImpl implements EmbraceInternalInterface, ReactNativeInternalInterface {
    private final CrashService crashService;
    private final EmbraceImpl embrace;
    private final Embrace.AppFramework framework;
    private final HostedSdkVersionInfo hostedSdkVersionInfo;
    private final EmbraceInternalInterface impl;
    private final InternalEmbraceLogger logger;
    private final MetadataService metadataService;

    public ReactNativeInternalInterfaceImpl(EmbraceImpl embraceImpl, EmbraceInternalInterface embraceInternalInterface, Embrace.AppFramework appFramework, CrashService crashService, MetadataService metadataService, HostedSdkVersionInfo hostedSdkVersionInfo, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(embraceImpl, "embrace");
        zq3.h(embraceInternalInterface, "impl");
        zq3.h(appFramework, "framework");
        zq3.h(crashService, "crashService");
        zq3.h(metadataService, "metadataService");
        zq3.h(hostedSdkVersionInfo, "hostedSdkVersionInfo");
        zq3.h(internalEmbraceLogger, "logger");
        this.embrace = embraceImpl;
        this.impl = embraceInternalInterface;
        this.framework = appFramework;
        this.crashService = crashService;
        this.metadataService = metadataService;
        this.hostedSdkVersionInfo = hostedSdkVersionInfo;
        this.logger = internalEmbraceLogger;
    }

    static /* synthetic */ void setJavaScriptBundleUrl$default(ReactNativeInternalInterfaceImpl reactNativeInternalInterfaceImpl, Context context, String str, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        reactNativeInternalInterfaceImpl.setJavaScriptBundleUrl(context, str, bool);
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

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void logHandledJsException(String str, String str2, Map<String, ? extends Object> map, String str3) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "message");
        zq3.h(map, "properties");
        if (this.embrace.isStarted()) {
            this.embrace.logMessage(EventType.ERROR_LOG, str2, map, null, str3, LogExceptionType.HANDLED, null, null);
        } else {
            this.logger.logSDKNotInitialized("log JS exception");
        }
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

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void logRnAction(String str, long j, long j2, Map<String, ? extends Object> map, int i, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(map, "properties");
        zq3.h(str2, "output");
        this.embrace.logRnAction(str, j, j2, map, i, str2);
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void logRnView(String str) {
        zq3.h(str, "screen");
        this.embrace.logRnView(str);
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void logUnhandledJsException(String str, String str2, String str3, String str4) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "message");
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("log JS exception");
        } else {
            this.crashService.logUnhandledJsException(new JsException(str, str2, str3, str4));
        }
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

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void setCacheableJavaScriptBundleUrl(Context context, String str, boolean z) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        setJavaScriptBundleUrl(context, str, Boolean.valueOf(z));
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void setJavaScriptBundleUrl(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        setJavaScriptBundleUrl(context, str, null);
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void setJavaScriptPatchNumber(String str) {
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("set JavaScript patch number");
            return;
        }
        if (str == null) {
            this.logger.log("JavaScript patch number must not be null", InternalEmbraceLogger.Severity.ERROR, null, false);
        } else if (str.length() == 0) {
            this.logger.log("JavaScript patch number must have non-zero length", InternalEmbraceLogger.Severity.ERROR, null, false);
        } else {
            this.hostedSdkVersionInfo.setJavaScriptPatchNumber(str);
        }
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void setProcessStartedByNotification() {
        this.impl.setProcessStartedByNotification();
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void setReactNativeSdkVersion(String str) {
        if (this.embrace.isStarted()) {
            this.hostedSdkVersionInfo.setHostedSdkVersion(str);
        } else {
            this.logger.logSDKNotInitialized("set React Native SDK version");
        }
    }

    @Override // io.embrace.android.embracesdk.ReactNativeInternalInterface
    public void setReactNativeVersionNumber(String str) {
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("set React Native version number");
            return;
        }
        if (str == null) {
            this.logger.log("ReactNative version must not be null", InternalEmbraceLogger.Severity.ERROR, null, false);
        } else if (str.length() == 0) {
            this.logger.log("ReactNative version must have non-zero length", InternalEmbraceLogger.Severity.ERROR, null, false);
        } else {
            this.hostedSdkVersionInfo.setHostedPlatformVersion(str);
        }
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

    private final void setJavaScriptBundleUrl(Context context, String str, Boolean bool) {
        if (!this.embrace.isStarted()) {
            this.logger.logSDKNotInitialized("set JavaScript bundle URL");
            return;
        }
        if (this.framework == Embrace.AppFramework.REACT_NATIVE) {
            this.metadataService.setReactNativeBundleId(context, str, bool);
            return;
        }
        this.logger.log("Failed to set Java Script bundle ID URL. Current framework: " + this.framework.name() + " is not React Native.", InternalEmbraceLogger.Severity.ERROR, null, false);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(Throwable th) {
        zq3.h(th, "error");
        this.impl.logInternalError(th);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, Throwable th, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
        this.impl.recordIncompleteNetworkRequest(str, str2, j, j2, th, str3, networkCaptureData);
    }
}
