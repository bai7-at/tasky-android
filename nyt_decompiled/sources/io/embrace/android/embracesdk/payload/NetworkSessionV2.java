package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkSessionV2 {
    private final Map<String, DomainCount> requestCounts;
    private final List<NetworkCallV2> requests;

    @et3(generateAdapter = true)
    public static final class DomainCount {
        private final int captureLimit;
        private final int requestCount;

        public DomainCount(int i, int i2) {
            this.requestCount = i;
            this.captureLimit = i2;
        }

        public static /* synthetic */ DomainCount copy$default(DomainCount domainCount, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = domainCount.requestCount;
            }
            if ((i3 & 2) != 0) {
                i2 = domainCount.captureLimit;
            }
            return domainCount.copy(i, i2);
        }

        public final int component1() {
            return this.requestCount;
        }

        public final int component2() {
            return this.captureLimit;
        }

        public final DomainCount copy(int i, int i2) {
            return new DomainCount(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DomainCount)) {
                return false;
            }
            DomainCount domainCount = (DomainCount) obj;
            return this.requestCount == domainCount.requestCount && this.captureLimit == domainCount.captureLimit;
        }

        public final int getCaptureLimit() {
            return this.captureLimit;
        }

        public final int getRequestCount() {
            return this.requestCount;
        }

        public int hashCode() {
            return (Integer.hashCode(this.requestCount) * 31) + Integer.hashCode(this.captureLimit);
        }

        public String toString() {
            return "DomainCount(requestCount=" + this.requestCount + ", captureLimit=" + this.captureLimit + ")";
        }
    }

    public NetworkSessionV2(@bt3(name = "r") List<NetworkCallV2> list, @bt3(name = "c") Map<String, DomainCount> map) {
        zq3.h(list, "requests");
        zq3.h(map, "requestCounts");
        this.requests = list;
        this.requestCounts = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkSessionV2 copy$default(NetworkSessionV2 networkSessionV2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = networkSessionV2.requests;
        }
        if ((i & 2) != 0) {
            map = networkSessionV2.requestCounts;
        }
        return networkSessionV2.copy(list, map);
    }

    public final List<NetworkCallV2> component1() {
        return this.requests;
    }

    public final Map<String, DomainCount> component2() {
        return this.requestCounts;
    }

    public final NetworkSessionV2 copy(@bt3(name = "r") List<NetworkCallV2> list, @bt3(name = "c") Map<String, DomainCount> map) {
        zq3.h(list, "requests");
        zq3.h(map, "requestCounts");
        return new NetworkSessionV2(list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkSessionV2)) {
            return false;
        }
        NetworkSessionV2 networkSessionV2 = (NetworkSessionV2) obj;
        return zq3.c(this.requests, networkSessionV2.requests) && zq3.c(this.requestCounts, networkSessionV2.requestCounts);
    }

    public final Map<String, DomainCount> getRequestCounts() {
        return this.requestCounts;
    }

    public final List<NetworkCallV2> getRequests() {
        return this.requests;
    }

    public int hashCode() {
        List<NetworkCallV2> list = this.requests;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Map<String, DomainCount> map = this.requestCounts;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "NetworkSessionV2(requests=" + this.requests + ", requestCounts=" + this.requestCounts + ")";
    }
}
