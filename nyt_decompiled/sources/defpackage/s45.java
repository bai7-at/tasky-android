package defpackage;

import android.net.NetworkRequest;

/* loaded from: classes.dex */
final class s45 {
    public static final s45 a = new s45();

    private s45() {
    }

    public final int[] a(NetworkRequest networkRequest) {
        int[] capabilities;
        zq3.h(networkRequest, "request");
        capabilities = networkRequest.getCapabilities();
        zq3.g(capabilities, "request.capabilities");
        return capabilities;
    }

    public final int[] b(NetworkRequest networkRequest) {
        int[] transportTypes;
        zq3.h(networkRequest, "request");
        transportTypes = networkRequest.getTransportTypes();
        zq3.g(transportTypes, "request.transportTypes");
        return transportTypes;
    }
}
