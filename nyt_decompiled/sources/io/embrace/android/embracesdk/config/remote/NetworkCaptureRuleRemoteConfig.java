package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkCaptureRuleRemoteConfig {
    private final Long duration;
    private final long expiresIn;
    private final String id;
    private final int maxCount;
    private final long maxSize;
    private final String method;
    private final Set<Integer> statusCodes;
    private final String urlRegex;

    public NetworkCaptureRuleRemoteConfig(@bt3(name = "id") String str, @bt3(name = "duration") Long l, @bt3(name = "method") String str2, @bt3(name = "url") String str3, @bt3(name = "expires_in") long j, @bt3(name = "max_size") long j2, @bt3(name = "max_count") int i, @bt3(name = "status_codes") Set<Integer> set) {
        zq3.h(str, "id");
        zq3.h(str2, "method");
        zq3.h(str3, "urlRegex");
        zq3.h(set, "statusCodes");
        this.id = str;
        this.duration = l;
        this.method = str2;
        this.urlRegex = str3;
        this.expiresIn = j;
        this.maxSize = j2;
        this.maxCount = i;
        this.statusCodes = set;
    }

    public final String component1() {
        return this.id;
    }

    public final Long component2() {
        return this.duration;
    }

    public final String component3() {
        return this.method;
    }

    public final String component4() {
        return this.urlRegex;
    }

    public final long component5() {
        return this.expiresIn;
    }

    public final long component6() {
        return this.maxSize;
    }

    public final int component7() {
        return this.maxCount;
    }

    public final Set<Integer> component8() {
        return this.statusCodes;
    }

    public final NetworkCaptureRuleRemoteConfig copy(@bt3(name = "id") String str, @bt3(name = "duration") Long l, @bt3(name = "method") String str2, @bt3(name = "url") String str3, @bt3(name = "expires_in") long j, @bt3(name = "max_size") long j2, @bt3(name = "max_count") int i, @bt3(name = "status_codes") Set<Integer> set) {
        zq3.h(str, "id");
        zq3.h(str2, "method");
        zq3.h(str3, "urlRegex");
        zq3.h(set, "statusCodes");
        return new NetworkCaptureRuleRemoteConfig(str, l, str2, str3, j, j2, i, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCaptureRuleRemoteConfig)) {
            return false;
        }
        NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig = (NetworkCaptureRuleRemoteConfig) obj;
        return zq3.c(this.id, networkCaptureRuleRemoteConfig.id) && zq3.c(this.duration, networkCaptureRuleRemoteConfig.duration) && zq3.c(this.method, networkCaptureRuleRemoteConfig.method) && zq3.c(this.urlRegex, networkCaptureRuleRemoteConfig.urlRegex) && this.expiresIn == networkCaptureRuleRemoteConfig.expiresIn && this.maxSize == networkCaptureRuleRemoteConfig.maxSize && this.maxCount == networkCaptureRuleRemoteConfig.maxCount && zq3.c(this.statusCodes, networkCaptureRuleRemoteConfig.statusCodes);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getId() {
        return this.id;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final String getMethod() {
        return this.method;
    }

    public final Set<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    public final String getUrlRegex() {
        return this.urlRegex;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.duration;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.method;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.urlRegex;
        int hashCode4 = (((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.expiresIn)) * 31) + Long.hashCode(this.maxSize)) * 31) + Integer.hashCode(this.maxCount)) * 31;
        Set<Integer> set = this.statusCodes;
        return hashCode4 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "NetworkCaptureRuleRemoteConfig(id=" + this.id + ", duration=" + this.duration + ", method=" + this.method + ", urlRegex=" + this.urlRegex + ", expiresIn=" + this.expiresIn + ", maxSize=" + this.maxSize + ", maxCount=" + this.maxCount + ", statusCodes=" + this.statusCodes + ")";
    }

    public /* synthetic */ NetworkCaptureRuleRemoteConfig(String str, Long l, String str2, String str3, long j, long j2, int i, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l, str2, str3, (i2 & 16) != 0 ? 0L : j, (i2 & 32) != 0 ? 102400L : j2, (i2 & 64) != 0 ? 5 : i, (i2 & 128) != 0 ? b0.e() : set);
    }
}
