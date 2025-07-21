package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AppExitInfoData {
    private final String description;
    private final Integer importance;
    private final Long pss;
    private final Integer reason;
    private final Long rss;
    private final String sessionId;
    private final String sessionIdError;
    private final Integer status;
    private final Long timestamp;
    private final String trace;
    private final String traceStatus;

    public AppExitInfoData(@bt3(name = "sid") String str, @bt3(name = "side") String str2, @bt3(name = "im") Integer num, @bt3(name = "pss") Long l, @bt3(name = "rs") Integer num2, @bt3(name = "rss") Long l2, @bt3(name = "st") Integer num3, @bt3(name = "ts") Long l3, @bt3(name = "blob") String str3, @bt3(name = "ds") String str4, @bt3(name = "trs") String str5) {
        this.sessionId = str;
        this.sessionIdError = str2;
        this.importance = num;
        this.pss = l;
        this.reason = num2;
        this.rss = l2;
        this.status = num3;
        this.timestamp = l3;
        this.trace = str3;
        this.description = str4;
        this.traceStatus = str5;
    }

    public final String component1$embrace_android_sdk_release() {
        return this.sessionId;
    }

    public final String component10$embrace_android_sdk_release() {
        return this.description;
    }

    public final String component11$embrace_android_sdk_release() {
        return this.traceStatus;
    }

    public final String component2$embrace_android_sdk_release() {
        return this.sessionIdError;
    }

    public final Integer component3$embrace_android_sdk_release() {
        return this.importance;
    }

    public final Long component4$embrace_android_sdk_release() {
        return this.pss;
    }

    public final Integer component5$embrace_android_sdk_release() {
        return this.reason;
    }

    public final Long component6$embrace_android_sdk_release() {
        return this.rss;
    }

    public final Integer component7$embrace_android_sdk_release() {
        return this.status;
    }

    public final Long component8$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final String component9$embrace_android_sdk_release() {
        return this.trace;
    }

    public final AppExitInfoData copy(@bt3(name = "sid") String str, @bt3(name = "side") String str2, @bt3(name = "im") Integer num, @bt3(name = "pss") Long l, @bt3(name = "rs") Integer num2, @bt3(name = "rss") Long l2, @bt3(name = "st") Integer num3, @bt3(name = "ts") Long l3, @bt3(name = "blob") String str3, @bt3(name = "ds") String str4, @bt3(name = "trs") String str5) {
        return new AppExitInfoData(str, str2, num, l, num2, l2, num3, l3, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppExitInfoData)) {
            return false;
        }
        AppExitInfoData appExitInfoData = (AppExitInfoData) obj;
        return zq3.c(this.sessionId, appExitInfoData.sessionId) && zq3.c(this.sessionIdError, appExitInfoData.sessionIdError) && zq3.c(this.importance, appExitInfoData.importance) && zq3.c(this.pss, appExitInfoData.pss) && zq3.c(this.reason, appExitInfoData.reason) && zq3.c(this.rss, appExitInfoData.rss) && zq3.c(this.status, appExitInfoData.status) && zq3.c(this.timestamp, appExitInfoData.timestamp) && zq3.c(this.trace, appExitInfoData.trace) && zq3.c(this.description, appExitInfoData.description) && zq3.c(this.traceStatus, appExitInfoData.traceStatus);
    }

    public final String getDescription$embrace_android_sdk_release() {
        return this.description;
    }

    public final Integer getImportance$embrace_android_sdk_release() {
        return this.importance;
    }

    public final Long getPss$embrace_android_sdk_release() {
        return this.pss;
    }

    public final Integer getReason$embrace_android_sdk_release() {
        return this.reason;
    }

    public final Long getRss$embrace_android_sdk_release() {
        return this.rss;
    }

    public final String getSessionId$embrace_android_sdk_release() {
        return this.sessionId;
    }

    public final String getSessionIdError$embrace_android_sdk_release() {
        return this.sessionIdError;
    }

    public final Integer getStatus$embrace_android_sdk_release() {
        return this.status;
    }

    public final Long getTimestamp$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final String getTrace$embrace_android_sdk_release() {
        return this.trace;
    }

    public final String getTraceStatus$embrace_android_sdk_release() {
        return this.traceStatus;
    }

    public int hashCode() {
        String str = this.sessionId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sessionIdError;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.importance;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.pss;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num2 = this.reason;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Long l2 = this.rss;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Integer num3 = this.status;
        int hashCode7 = (hashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Long l3 = this.timestamp;
        int hashCode8 = (hashCode7 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str3 = this.trace;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.traceStatus;
        return hashCode10 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "AppExitInfoData(sessionId=" + this.sessionId + ", sessionIdError=" + this.sessionIdError + ", importance=" + this.importance + ", pss=" + this.pss + ", reason=" + this.reason + ", rss=" + this.rss + ", status=" + this.status + ", timestamp=" + this.timestamp + ", trace=" + this.trace + ", description=" + this.description + ", traceStatus=" + this.traceStatus + ")";
    }
}
