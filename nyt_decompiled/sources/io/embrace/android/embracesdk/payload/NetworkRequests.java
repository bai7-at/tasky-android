package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkRequests {
    private final NetworkSessionV2 networkSessionV2;

    public NetworkRequests(@bt3(name = "v2") NetworkSessionV2 networkSessionV2) {
        this.networkSessionV2 = networkSessionV2;
    }

    public static /* synthetic */ NetworkRequests copy$default(NetworkRequests networkRequests, NetworkSessionV2 networkSessionV2, int i, Object obj) {
        if ((i & 1) != 0) {
            networkSessionV2 = networkRequests.networkSessionV2;
        }
        return networkRequests.copy(networkSessionV2);
    }

    public final NetworkSessionV2 component1() {
        return this.networkSessionV2;
    }

    public final NetworkRequests copy(@bt3(name = "v2") NetworkSessionV2 networkSessionV2) {
        return new NetworkRequests(networkSessionV2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NetworkRequests) && zq3.c(this.networkSessionV2, ((NetworkRequests) obj).networkSessionV2);
        }
        return true;
    }

    public final NetworkSessionV2 getNetworkSessionV2() {
        return this.networkSessionV2;
    }

    public int hashCode() {
        NetworkSessionV2 networkSessionV2 = this.networkSessionV2;
        if (networkSessionV2 != null) {
            return networkSessionV2.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NetworkRequests(networkSessionV2=" + this.networkSessionV2 + ")";
    }
}
