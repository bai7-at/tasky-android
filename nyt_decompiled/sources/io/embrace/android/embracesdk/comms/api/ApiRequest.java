package io.embrace.android.embracesdk.comms.api;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.du8;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.network.http.HttpMethod;
import java.io.IOException;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import zendesk.core.Constants;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ApiRequest {
    private final String accept;
    private final String acceptEncoding;
    private final String appId;
    private final String contentEncoding;
    private final String contentType;
    private final String deviceId;
    private final String eTag;
    private final String eventId;
    private final HttpMethod httpMethod;
    private final String logId;
    private final EmbraceUrl url;
    private final String userAgent;

    public ApiRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, EmbraceUrl embraceUrl, HttpMethod httpMethod, String str10) {
        zq3.h(str, "contentType");
        zq3.h(str2, "userAgent");
        zq3.h(str4, "accept");
        zq3.h(embraceUrl, "url");
        zq3.h(httpMethod, "httpMethod");
        this.contentType = str;
        this.userAgent = str2;
        this.contentEncoding = str3;
        this.accept = str4;
        this.acceptEncoding = str5;
        this.appId = str6;
        this.deviceId = str7;
        this.eventId = str8;
        this.logId = str9;
        this.url = embraceUrl;
        this.httpMethod = httpMethod;
        this.eTag = str10;
    }

    public final String component1() {
        return this.contentType;
    }

    public final EmbraceUrl component10() {
        return this.url;
    }

    public final HttpMethod component11() {
        return this.httpMethod;
    }

    public final String component12() {
        return this.eTag;
    }

    public final String component2() {
        return this.userAgent;
    }

    public final String component3() {
        return this.contentEncoding;
    }

    public final String component4() {
        return this.accept;
    }

    public final String component5() {
        return this.acceptEncoding;
    }

    public final String component6() {
        return this.appId;
    }

    public final String component7() {
        return this.deviceId;
    }

    public final String component8() {
        return this.eventId;
    }

    public final String component9() {
        return this.logId;
    }

    public final ApiRequest copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, EmbraceUrl embraceUrl, HttpMethod httpMethod, String str10) {
        zq3.h(str, "contentType");
        zq3.h(str2, "userAgent");
        zq3.h(str4, "accept");
        zq3.h(embraceUrl, "url");
        zq3.h(httpMethod, "httpMethod");
        return new ApiRequest(str, str2, str3, str4, str5, str6, str7, str8, str9, embraceUrl, httpMethod, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiRequest)) {
            return false;
        }
        ApiRequest apiRequest = (ApiRequest) obj;
        return zq3.c(this.contentType, apiRequest.contentType) && zq3.c(this.userAgent, apiRequest.userAgent) && zq3.c(this.contentEncoding, apiRequest.contentEncoding) && zq3.c(this.accept, apiRequest.accept) && zq3.c(this.acceptEncoding, apiRequest.acceptEncoding) && zq3.c(this.appId, apiRequest.appId) && zq3.c(this.deviceId, apiRequest.deviceId) && zq3.c(this.eventId, apiRequest.eventId) && zq3.c(this.logId, apiRequest.logId) && zq3.c(this.url, apiRequest.url) && zq3.c(this.httpMethod, apiRequest.httpMethod) && zq3.c(this.eTag, apiRequest.eTag);
    }

    public final String getAccept() {
        return this.accept;
    }

    public final String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getContentEncoding() {
        return this.contentEncoding;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getETag() {
        return this.eTag;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final Map<String, String> getHeaders() {
        Map<String, String> n = t.n(du8.a("Accept", this.accept), du8.a("User-Agent", this.userAgent), du8.a("Content-Type", this.contentType));
        String str = this.contentEncoding;
        if (str != null) {
            n.put("Content-Encoding", str);
        }
        String str2 = this.acceptEncoding;
        if (str2 != null) {
            n.put("Accept-Encoding", str2);
        }
        String str3 = this.appId;
        if (str3 != null) {
            n.put("X-EM-AID", str3);
        }
        String str4 = this.deviceId;
        if (str4 != null) {
            n.put("X-EM-DID", str4);
        }
        String str5 = this.eventId;
        if (str5 != null) {
            n.put("X-EM-SID", str5);
        }
        String str6 = this.logId;
        if (str6 != null) {
            n.put("X-EM-LID", str6);
        }
        String str7 = this.eTag;
        if (str7 != null) {
            n.put(Headers.GET_OBJECT_IF_NONE_MATCH, str7);
        }
        return n;
    }

    public final HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final EmbraceUrl getUrl() {
        return this.url;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        String str = this.contentType;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userAgent;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentEncoding;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.accept;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.acceptEncoding;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.appId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.deviceId;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.eventId;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.logId;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        EmbraceUrl embraceUrl = this.url;
        int hashCode10 = (hashCode9 + (embraceUrl != null ? embraceUrl.hashCode() : 0)) * 31;
        HttpMethod httpMethod = this.httpMethod;
        int hashCode11 = (hashCode10 + (httpMethod != null ? httpMethod.hashCode() : 0)) * 31;
        String str10 = this.eTag;
        return hashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean isSessionRequest() {
        return h.v(this.url.toString(), "sessions", false, 2, null);
    }

    public final EmbraceConnection toConnection() {
        try {
            EmbraceConnection openConnection = this.url.openConnection();
            for (Map.Entry<String, String> entry : getHeaders().entrySet()) {
                openConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            openConnection.setRequestMethod(this.httpMethod.name());
            if (this.httpMethod == HttpMethod.POST) {
                openConnection.setDoOutput(Boolean.TRUE);
            }
            return openConnection;
        } catch (IOException e) {
            String localizedMessage = e.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw new IllegalStateException(localizedMessage, e);
        }
    }

    public String toString() {
        return "ApiRequest(contentType=" + this.contentType + ", userAgent=" + this.userAgent + ", contentEncoding=" + this.contentEncoding + ", accept=" + this.accept + ", acceptEncoding=" + this.acceptEncoding + ", appId=" + this.appId + ", deviceId=" + this.deviceId + ", eventId=" + this.eventId + ", logId=" + this.logId + ", url=" + this.url + ", httpMethod=" + this.httpMethod + ", eTag=" + this.eTag + ")";
    }

    public /* synthetic */ ApiRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, EmbraceUrl embraceUrl, HttpMethod httpMethod, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Constants.APPLICATION_JSON : str, (i & 2) != 0 ? "Embrace/a/6.6.0" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Constants.APPLICATION_JSON : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str9, embraceUrl, (i & 1024) != 0 ? HttpMethod.POST : httpMethod, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str10);
    }
}
