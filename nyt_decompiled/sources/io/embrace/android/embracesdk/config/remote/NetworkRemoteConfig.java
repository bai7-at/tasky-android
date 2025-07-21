package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkRemoteConfig {
    private final Integer defaultCaptureLimit;
    private final Map<String, Integer> domainLimits;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkRemoteConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRemoteConfig copy$default(NetworkRemoteConfig networkRemoteConfig, Integer num, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            num = networkRemoteConfig.defaultCaptureLimit;
        }
        if ((i & 2) != 0) {
            map = networkRemoteConfig.domainLimits;
        }
        return networkRemoteConfig.copy(num, map);
    }

    public final Integer component1() {
        return this.defaultCaptureLimit;
    }

    public final Map<String, Integer> component2() {
        return this.domainLimits;
    }

    public final NetworkRemoteConfig copy(Integer num, @bt3(name = "domains") Map<String, Integer> map) {
        return new NetworkRemoteConfig(num, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkRemoteConfig)) {
            return false;
        }
        NetworkRemoteConfig networkRemoteConfig = (NetworkRemoteConfig) obj;
        return zq3.c(this.defaultCaptureLimit, networkRemoteConfig.defaultCaptureLimit) && zq3.c(this.domainLimits, networkRemoteConfig.domainLimits);
    }

    public final Integer getDefaultCaptureLimit() {
        return this.defaultCaptureLimit;
    }

    public final Map<String, Integer> getDomainLimits() {
        return this.domainLimits;
    }

    public int hashCode() {
        Integer num = this.defaultCaptureLimit;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Map<String, Integer> map = this.domainLimits;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "NetworkRemoteConfig(defaultCaptureLimit=" + this.defaultCaptureLimit + ", domainLimits=" + this.domainLimits + ")";
    }

    public NetworkRemoteConfig(Integer num, @bt3(name = "domains") Map<String, Integer> map) {
        this.defaultCaptureLimit = num;
        this.domainLimits = map;
    }

    public /* synthetic */ NetworkRemoteConfig(Integer num, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : map);
    }
}
