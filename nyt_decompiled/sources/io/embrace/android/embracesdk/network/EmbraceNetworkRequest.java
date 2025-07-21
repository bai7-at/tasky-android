package io.embrace.android.embracesdk.network;

import io.embrace.android.embracesdk.internal.network.http.NetworkCaptureData;
import io.embrace.android.embracesdk.network.http.HttpMethod;

/* loaded from: classes5.dex */
public final class EmbraceNetworkRequest {
    private final Long bytesReceived;
    private final Long bytesSent;
    private final Long endTime;
    private final Throwable error = null;
    private final String errorMessage;
    private final String errorType;
    private final HttpMethod httpMethod;
    private final NetworkCaptureData networkCaptureData;
    private final Integer responseCode;
    private final Long startTime;
    private final String traceId;
    private final String url;
    private final String w3cTraceparent;

    private EmbraceNetworkRequest(String str, HttpMethod httpMethod, Long l, Long l2, Long l3, Long l4, Integer num, String str2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData) {
        this.url = str;
        this.httpMethod = httpMethod;
        this.startTime = l;
        this.endTime = l2;
        this.bytesSent = l3;
        this.bytesReceived = l4;
        this.responseCode = num;
        this.errorType = str2;
        this.errorMessage = str3;
        this.traceId = str4;
        this.w3cTraceparent = str5;
        this.networkCaptureData = networkCaptureData;
    }

    public static EmbraceNetworkRequest fromCompletedRequest(String str, HttpMethod httpMethod, long j, long j2, long j3, long j4, int i) {
        return fromCompletedRequest(str, httpMethod, j, j2, j3, j4, i, null, null);
    }

    public static EmbraceNetworkRequest fromIncompleteRequest(String str, HttpMethod httpMethod, long j, long j2, String str2, String str3) {
        return fromIncompleteRequest(str, httpMethod, j, j2, str2, str3, null);
    }

    public Long getBytesIn() {
        Long l = this.bytesReceived;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public Long getBytesOut() {
        Long l = this.bytesSent;
        return Long.valueOf(l == null ? 0L : l.longValue());
    }

    public Long getBytesReceived() {
        return this.bytesReceived;
    }

    public Long getBytesSent() {
        return this.bytesSent;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public Throwable getError() {
        return this.error;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getErrorType() {
        return this.errorType;
    }

    public String getHttpMethod() {
        HttpMethod httpMethod = this.httpMethod;
        if (httpMethod != null) {
            return httpMethod.name().toUpperCase();
        }
        return null;
    }

    public NetworkCaptureData getNetworkCaptureData() {
        return this.networkCaptureData;
    }

    public Integer getResponseCode() {
        return this.responseCode;
    }

    public Long getStartTime() {
        return this.startTime;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getUrl() {
        return this.url;
    }

    public String getW3cTraceparent() {
        return this.w3cTraceparent;
    }

    public static EmbraceNetworkRequest fromCompletedRequest(String str, HttpMethod httpMethod, long j, long j2, long j3, long j4, int i, String str2) {
        return fromCompletedRequest(str, httpMethod, j, j2, j3, j4, i, str2, null, null);
    }

    public static EmbraceNetworkRequest fromIncompleteRequest(String str, HttpMethod httpMethod, long j, long j2, String str2, String str3, String str4) {
        return fromIncompleteRequest(str, httpMethod, j, j2, str2, str3, str4, null, null);
    }

    public static EmbraceNetworkRequest fromCompletedRequest(String str, HttpMethod httpMethod, long j, long j2, long j3, long j4, int i, String str2, NetworkCaptureData networkCaptureData) {
        return fromCompletedRequest(str, httpMethod, j, j2, j3, j4, i, str2, null, networkCaptureData);
    }

    public static EmbraceNetworkRequest fromIncompleteRequest(String str, HttpMethod httpMethod, long j, long j2, String str2, String str3, String str4, NetworkCaptureData networkCaptureData) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j), Long.valueOf(j2), null, null, null, str2, str3, str4, null, networkCaptureData);
    }

    public static EmbraceNetworkRequest fromCompletedRequest(String str, HttpMethod httpMethod, long j, long j2, long j3, long j4, int i, String str2, String str3, NetworkCaptureData networkCaptureData) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Integer.valueOf(i), null, null, str2, str3, networkCaptureData);
    }

    public static EmbraceNetworkRequest fromIncompleteRequest(String str, HttpMethod httpMethod, long j, long j2, String str2, String str3, String str4, String str5, NetworkCaptureData networkCaptureData) {
        return new EmbraceNetworkRequest(str, httpMethod, Long.valueOf(j), Long.valueOf(j2), null, null, null, str2, str3, str4, str5, networkCaptureData);
    }
}
