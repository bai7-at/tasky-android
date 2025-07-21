package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkCapturedCall {
    private final Long duration;
    private final String encryptedPayload;
    private final Long endTime;
    private final String errorMessage;
    private final String httpMethod;
    private final String matchedUrl;
    private final String networkId;
    private final String requestBody;
    private final Integer requestBodySize;
    private final String requestQuery;
    private final Map<String, String> requestQueryHeaders;
    private final Integer requestSize;
    private final String responseBody;
    private final Integer responseBodySize;
    private final Map<String, String> responseHeaders;
    private final Integer responseSize;
    private final Integer responseStatus;
    private final String sessionId;
    private final Long startTime;
    private final String url;

    public NetworkCapturedCall() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final Long component1() {
        return this.duration;
    }

    public final Integer component10() {
        return this.requestSize;
    }

    public final String component11() {
        return this.responseBody;
    }

    public final Integer component12() {
        return this.responseBodySize;
    }

    public final Map<String, String> component13() {
        return this.responseHeaders;
    }

    public final Integer component14() {
        return this.responseSize;
    }

    public final Integer component15() {
        return this.responseStatus;
    }

    public final String component16() {
        return this.sessionId;
    }

    public final Long component17() {
        return this.startTime;
    }

    public final String component18() {
        return this.url;
    }

    public final String component19() {
        return this.errorMessage;
    }

    public final Long component2() {
        return this.endTime;
    }

    public final String component20() {
        return this.encryptedPayload;
    }

    public final String component3() {
        return this.httpMethod;
    }

    public final String component4() {
        return this.matchedUrl;
    }

    public final String component5() {
        return this.networkId;
    }

    public final String component6() {
        return this.requestBody;
    }

    public final Integer component7() {
        return this.requestBodySize;
    }

    public final String component8() {
        return this.requestQuery;
    }

    public final Map<String, String> component9() {
        return this.requestQueryHeaders;
    }

    public final NetworkCapturedCall copy(@bt3(name = "dur") Long l, @bt3(name = "et") Long l2, @bt3(name = "m") String str, @bt3(name = "mu") String str2, @bt3(name = "id") String str3, @bt3(name = "qb") String str4, @bt3(name = "qi") Integer num, @bt3(name = "qq") String str5, @bt3(name = "qh") Map<String, String> map, @bt3(name = "qz") Integer num2, @bt3(name = "sb") String str6, @bt3(name = "si") Integer num3, @bt3(name = "sh") Map<String, String> map2, @bt3(name = "sz") Integer num4, @bt3(name = "sc") Integer num5, @bt3(name = "sid") String str7, @bt3(name = "st") Long l3, @bt3(name = "url") String str8, @bt3(name = "em") String str9, @bt3(name = "ne") String str10) {
        zq3.h(str3, "networkId");
        return new NetworkCapturedCall(l, l2, str, str2, str3, str4, num, str5, map, num2, str6, num3, map2, num4, num5, str7, l3, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCapturedCall)) {
            return false;
        }
        NetworkCapturedCall networkCapturedCall = (NetworkCapturedCall) obj;
        return zq3.c(this.duration, networkCapturedCall.duration) && zq3.c(this.endTime, networkCapturedCall.endTime) && zq3.c(this.httpMethod, networkCapturedCall.httpMethod) && zq3.c(this.matchedUrl, networkCapturedCall.matchedUrl) && zq3.c(this.networkId, networkCapturedCall.networkId) && zq3.c(this.requestBody, networkCapturedCall.requestBody) && zq3.c(this.requestBodySize, networkCapturedCall.requestBodySize) && zq3.c(this.requestQuery, networkCapturedCall.requestQuery) && zq3.c(this.requestQueryHeaders, networkCapturedCall.requestQueryHeaders) && zq3.c(this.requestSize, networkCapturedCall.requestSize) && zq3.c(this.responseBody, networkCapturedCall.responseBody) && zq3.c(this.responseBodySize, networkCapturedCall.responseBodySize) && zq3.c(this.responseHeaders, networkCapturedCall.responseHeaders) && zq3.c(this.responseSize, networkCapturedCall.responseSize) && zq3.c(this.responseStatus, networkCapturedCall.responseStatus) && zq3.c(this.sessionId, networkCapturedCall.sessionId) && zq3.c(this.startTime, networkCapturedCall.startTime) && zq3.c(this.url, networkCapturedCall.url) && zq3.c(this.errorMessage, networkCapturedCall.errorMessage) && zq3.c(this.encryptedPayload, networkCapturedCall.encryptedPayload);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final String getEncryptedPayload() {
        return this.encryptedPayload;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getHttpMethod() {
        return this.httpMethod;
    }

    public final String getMatchedUrl() {
        return this.matchedUrl;
    }

    public final String getNetworkId() {
        return this.networkId;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final Integer getRequestBodySize() {
        return this.requestBodySize;
    }

    public final String getRequestQuery() {
        return this.requestQuery;
    }

    public final Map<String, String> getRequestQueryHeaders() {
        return this.requestQueryHeaders;
    }

    public final Integer getRequestSize() {
        return this.requestSize;
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final Integer getResponseBodySize() {
        return this.responseBodySize;
    }

    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public final Integer getResponseSize() {
        return this.responseSize;
    }

    public final Integer getResponseStatus() {
        return this.responseStatus;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Long l = this.duration;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.endTime;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.httpMethod;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.matchedUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.networkId;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.requestBody;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Integer num = this.requestBodySize;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str5 = this.requestQuery;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, String> map = this.requestQueryHeaders;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num2 = this.requestSize;
        int hashCode10 = (hashCode9 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str6 = this.responseBody;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Integer num3 = this.responseBodySize;
        int hashCode12 = (hashCode11 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.responseHeaders;
        int hashCode13 = (hashCode12 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Integer num4 = this.responseSize;
        int hashCode14 = (hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.responseStatus;
        int hashCode15 = (hashCode14 + (num5 != null ? num5.hashCode() : 0)) * 31;
        String str7 = this.sessionId;
        int hashCode16 = (hashCode15 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Long l3 = this.startTime;
        int hashCode17 = (hashCode16 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str8 = this.url;
        int hashCode18 = (hashCode17 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.errorMessage;
        int hashCode19 = (hashCode18 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.encryptedPayload;
        return hashCode19 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        return "NetworkCapturedCall(duration=" + this.duration + ", endTime=" + this.endTime + ", httpMethod=" + this.httpMethod + ", matchedUrl=" + this.matchedUrl + ", networkId=" + this.networkId + ", requestBody=" + this.requestBody + ", requestBodySize=" + this.requestBodySize + ", requestQuery=" + this.requestQuery + ", requestQueryHeaders=" + this.requestQueryHeaders + ", requestSize=" + this.requestSize + ", responseBody=" + this.responseBody + ", responseBodySize=" + this.responseBodySize + ", responseHeaders=" + this.responseHeaders + ", responseSize=" + this.responseSize + ", responseStatus=" + this.responseStatus + ", sessionId=" + this.sessionId + ", startTime=" + this.startTime + ", url=" + this.url + ", errorMessage=" + this.errorMessage + ", encryptedPayload=" + this.encryptedPayload + ")";
    }

    public NetworkCapturedCall(@bt3(name = "dur") Long l, @bt3(name = "et") Long l2, @bt3(name = "m") String str, @bt3(name = "mu") String str2, @bt3(name = "id") String str3, @bt3(name = "qb") String str4, @bt3(name = "qi") Integer num, @bt3(name = "qq") String str5, @bt3(name = "qh") Map<String, String> map, @bt3(name = "qz") Integer num2, @bt3(name = "sb") String str6, @bt3(name = "si") Integer num3, @bt3(name = "sh") Map<String, String> map2, @bt3(name = "sz") Integer num4, @bt3(name = "sc") Integer num5, @bt3(name = "sid") String str7, @bt3(name = "st") Long l3, @bt3(name = "url") String str8, @bt3(name = "em") String str9, @bt3(name = "ne") String str10) {
        zq3.h(str3, "networkId");
        this.duration = l;
        this.endTime = l2;
        this.httpMethod = str;
        this.matchedUrl = str2;
        this.networkId = str3;
        this.requestBody = str4;
        this.requestBodySize = num;
        this.requestQuery = str5;
        this.requestQueryHeaders = map;
        this.requestSize = num2;
        this.responseBody = str6;
        this.responseBodySize = num3;
        this.responseHeaders = map2;
        this.responseSize = num4;
        this.responseStatus = num5;
        this.sessionId = str7;
        this.startTime = l3;
        this.url = str8;
        this.errorMessage = str9;
        this.encryptedPayload = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ NetworkCapturedCall(java.lang.Long r22, java.lang.Long r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.Integer r28, java.lang.String r29, java.util.Map r30, java.lang.Integer r31, java.lang.String r32, java.lang.Integer r33, java.util.Map r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.String r37, java.lang.Long r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, int r42, kotlin.jvm.internal.DefaultConstructorMarker r43) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.payload.NetworkCapturedCall.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.util.Map, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.Map, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
