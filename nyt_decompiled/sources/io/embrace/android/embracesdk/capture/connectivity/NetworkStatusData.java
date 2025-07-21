package io.embrace.android.embracesdk.capture.connectivity;

import defpackage.zq3;
import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;

/* loaded from: classes5.dex */
public final class NetworkStatusData {
    private final NetworkStatus networkStatus;
    private final long timestamp;

    public NetworkStatusData(NetworkStatus networkStatus, long j) {
        zq3.h(networkStatus, "networkStatus");
        this.networkStatus = networkStatus;
        this.timestamp = j;
    }

    public static /* synthetic */ NetworkStatusData copy$default(NetworkStatusData networkStatusData, NetworkStatus networkStatus, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            networkStatus = networkStatusData.networkStatus;
        }
        if ((i & 2) != 0) {
            j = networkStatusData.timestamp;
        }
        return networkStatusData.copy(networkStatus, j);
    }

    public final NetworkStatus component1() {
        return this.networkStatus;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final NetworkStatusData copy(NetworkStatus networkStatus, long j) {
        zq3.h(networkStatus, "networkStatus");
        return new NetworkStatusData(networkStatus, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkStatusData)) {
            return false;
        }
        NetworkStatusData networkStatusData = (NetworkStatusData) obj;
        return zq3.c(this.networkStatus, networkStatusData.networkStatus) && this.timestamp == networkStatusData.timestamp;
    }

    public final NetworkStatus getNetworkStatus() {
        return this.networkStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        NetworkStatus networkStatus = this.networkStatus;
        return ((networkStatus != null ? networkStatus.hashCode() : 0) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "NetworkStatusData(networkStatus=" + this.networkStatus + ", timestamp=" + this.timestamp + ")";
    }
}
