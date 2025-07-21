package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkCallV2 {
    private final long bytesReceived;
    private final long bytesSent;
    private final long duration;
    private final long endTime;
    private final String errorMessage;
    private final String errorType;
    private final String httpMethod;
    private final Integer responseCode;
    private final long startTime;
    private final String traceId;
    private final String url;
    private final String w3cTraceparent;

    public NetworkCallV2() {
        this(null, null, null, 0L, 0L, 0L, 0L, 0L, null, null, null, null, 4095, null);
    }

    public final String component1() {
        return this.url;
    }

    public final String component10() {
        return this.errorType;
    }

    public final String component11() {
        return this.errorMessage;
    }

    public final String component12() {
        return this.w3cTraceparent;
    }

    public final String component2() {
        return this.httpMethod;
    }

    public final Integer component3() {
        return this.responseCode;
    }

    public final long component4() {
        return this.bytesSent;
    }

    public final long component5() {
        return this.bytesReceived;
    }

    public final long component6() {
        return this.startTime;
    }

    public final long component7() {
        return this.endTime;
    }

    public final long component8() {
        return this.duration;
    }

    public final String component9() {
        return this.traceId;
    }

    public final NetworkCallV2 copy(@bt3(name = "url") String str, @bt3(name = "x") String str2, @bt3(name = "rc") Integer num, @bt3(name = "bo") long j, @bt3(name = "bi") long j2, @bt3(name = "st") long j3, @bt3(name = "et") long j4, @bt3(name = "dur") long j5, @bt3(name = "t") String str3, @bt3(name = "ed") String str4, @bt3(name = "de") String str5, @bt3(name = "w3c_traceparent") String str6) {
        return new NetworkCallV2(str, str2, num, j, j2, j3, j4, j5, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCallV2)) {
            return false;
        }
        NetworkCallV2 networkCallV2 = (NetworkCallV2) obj;
        return zq3.c(this.url, networkCallV2.url) && zq3.c(this.httpMethod, networkCallV2.httpMethod) && zq3.c(this.responseCode, networkCallV2.responseCode) && this.bytesSent == networkCallV2.bytesSent && this.bytesReceived == networkCallV2.bytesReceived && this.startTime == networkCallV2.startTime && this.endTime == networkCallV2.endTime && this.duration == networkCallV2.duration && zq3.c(this.traceId, networkCallV2.traceId) && zq3.c(this.errorType, networkCallV2.errorType) && zq3.c(this.errorMessage, networkCallV2.errorMessage) && zq3.c(this.w3cTraceparent, networkCallV2.w3cTraceparent);
    }

    public final long getBytesReceived() {
        return this.bytesReceived;
    }

    public final long getBytesSent() {
        return this.bytesSent;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getHttpMethod() {
        return this.httpMethod;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getW3cTraceparent() {
        return this.w3cTraceparent;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.httpMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.responseCode;
        int hashCode3 = (((((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Long.hashCode(this.bytesSent)) * 31) + Long.hashCode(this.bytesReceived)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.duration)) * 31;
        String str3 = this.traceId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.errorType;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.errorMessage;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.w3cTraceparent;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "NetworkCallV2(url=" + this.url + ", httpMethod=" + this.httpMethod + ", responseCode=" + this.responseCode + ", bytesSent=" + this.bytesSent + ", bytesReceived=" + this.bytesReceived + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", duration=" + this.duration + ", traceId=" + this.traceId + ", errorType=" + this.errorType + ", errorMessage=" + this.errorMessage + ", w3cTraceparent=" + this.w3cTraceparent + ")";
    }

    public NetworkCallV2(@bt3(name = "url") String str, @bt3(name = "x") String str2, @bt3(name = "rc") Integer num, @bt3(name = "bo") long j, @bt3(name = "bi") long j2, @bt3(name = "st") long j3, @bt3(name = "et") long j4, @bt3(name = "dur") long j5, @bt3(name = "t") String str3, @bt3(name = "ed") String str4, @bt3(name = "de") String str5, @bt3(name = "w3c_traceparent") String str6) {
        this.url = str;
        this.httpMethod = str2;
        this.responseCode = num;
        this.bytesSent = j;
        this.bytesReceived = j2;
        this.startTime = j3;
        this.endTime = j4;
        this.duration = j5;
        this.traceId = str3;
        this.errorType = str4;
        this.errorMessage = str5;
        this.w3cTraceparent = str6;
    }

    public /* synthetic */ NetworkCallV2(String str, String str2, Integer num, long j, long j2, long j3, long j4, long j5, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, (i & 32) != 0 ? 0L : j3, (i & 64) != 0 ? 0L : j4, (i & 128) == 0 ? j5 : 0L, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str6);
    }
}
