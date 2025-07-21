package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.InternalTracingApi;
import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes5.dex */
public final class UninitializedSdkInternalInterfaceImpl implements EmbraceInternalInterface, InternalTracingApi {
    private final /* synthetic */ InternalTracingApi $$delegate_0;

    public UninitializedSdkInternalInterfaceImpl(InternalTracingApi internalTracingApi) {
        zq3.h(internalTracingApi, "internalTracer");
        this.$$delegate_0 = internalTracingApi;
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
        return System.currentTimeMillis();
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isAnrCaptureEnabled() {
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isInternalNetworkCaptureDisabled() {
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNdkEnabled() {
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean isNetworkSpanForwardingEnabled() {
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logComposeTap(Pair<Float, Float> pair, String str) {
        zq3.h(pair, "point");
        zq3.h(str, "elementName");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logError(String str, Map<String, ? extends Object> map, String str2, boolean z) {
        zq3.h(str, "message");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logHandledException(Throwable th, LogType logType, Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr) {
        zq3.h(th, "throwable");
        zq3.h(logType, TransferTable.COLUMN_TYPE);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInfo(String str, Map<String, ? extends Object> map) {
        zq3.h(str, "message");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(String str, String str2) {
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logWarning(String str, Map<String, ? extends Object> map, String str2) {
        zq3.h(str, "message");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordCompletedNetworkRequest(String str, String str2, long j, long j2, long j3, long j4, int i, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.$$delegate_0.recordCompletedSpan(str, j, j2, errorCode, str2, map, list);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        zq3.h(embraceNetworkRequest, "embraceNetworkRequest");
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public <T> T recordSpan(String str, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        return (T) this.$$delegate_0.recordSpan(str, str2, map, list, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void setProcessStartedByNotification() {
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public boolean shouldCaptureNetworkBody(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "method");
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public String startSpan(String str, String str2, Long l) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.$$delegate_0.startSpan(str, str2, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void stopSdk() {
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean stopSpan(String str, ErrorCode errorCode, Long l) {
        zq3.h(str, "spanId");
        return this.$$delegate_0.stopSpan(str, errorCode, l);
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void logInternalError(Throwable th) {
        zq3.h(th, "error");
    }

    @Override // io.embrace.android.embracesdk.internal.EmbraceInternalInterface
    public void recordIncompleteNetworkRequest(String str, String str2, long j, long j2, Throwable th, String str3, NetworkCaptureData networkCaptureData) {
        zq3.h(str, "url");
        zq3.h(str2, "httpMethod");
    }
}
