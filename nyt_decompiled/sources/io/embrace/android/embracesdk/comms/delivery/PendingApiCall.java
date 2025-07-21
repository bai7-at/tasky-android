package io.embrace.android.embracesdk.comms.delivery;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.ApiRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class PendingApiCall {
    private final ApiRequest apiRequest;
    private final String cachedPayloadFilename;
    private final Long queueTime;

    public PendingApiCall(@bt3(name = "apiRequest") ApiRequest apiRequest, @bt3(name = "cachedPayload") String str, @bt3(name = "queueTime") Long l) {
        zq3.h(apiRequest, "apiRequest");
        zq3.h(str, "cachedPayloadFilename");
        this.apiRequest = apiRequest;
        this.cachedPayloadFilename = str;
        this.queueTime = l;
    }

    public static /* synthetic */ PendingApiCall copy$default(PendingApiCall pendingApiCall, ApiRequest apiRequest, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            apiRequest = pendingApiCall.apiRequest;
        }
        if ((i & 2) != 0) {
            str = pendingApiCall.cachedPayloadFilename;
        }
        if ((i & 4) != 0) {
            l = pendingApiCall.queueTime;
        }
        return pendingApiCall.copy(apiRequest, str, l);
    }

    public final ApiRequest component1() {
        return this.apiRequest;
    }

    public final String component2() {
        return this.cachedPayloadFilename;
    }

    public final Long component3() {
        return this.queueTime;
    }

    public final PendingApiCall copy(@bt3(name = "apiRequest") ApiRequest apiRequest, @bt3(name = "cachedPayload") String str, @bt3(name = "queueTime") Long l) {
        zq3.h(apiRequest, "apiRequest");
        zq3.h(str, "cachedPayloadFilename");
        return new PendingApiCall(apiRequest, str, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingApiCall)) {
            return false;
        }
        PendingApiCall pendingApiCall = (PendingApiCall) obj;
        return zq3.c(this.apiRequest, pendingApiCall.apiRequest) && zq3.c(this.cachedPayloadFilename, pendingApiCall.cachedPayloadFilename) && zq3.c(this.queueTime, pendingApiCall.queueTime);
    }

    public final ApiRequest getApiRequest() {
        return this.apiRequest;
    }

    public final String getCachedPayloadFilename() {
        return this.cachedPayloadFilename;
    }

    public final Long getQueueTime() {
        return this.queueTime;
    }

    public int hashCode() {
        ApiRequest apiRequest = this.apiRequest;
        int hashCode = (apiRequest != null ? apiRequest.hashCode() : 0) * 31;
        String str = this.cachedPayloadFilename;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Long l = this.queueTime;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "PendingApiCall(apiRequest=" + this.apiRequest + ", cachedPayloadFilename=" + this.cachedPayloadFilename + ", queueTime=" + this.queueTime + ")";
    }

    public /* synthetic */ PendingApiCall(ApiRequest apiRequest, String str, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, str, (i & 4) != 0 ? null : l);
    }
}
