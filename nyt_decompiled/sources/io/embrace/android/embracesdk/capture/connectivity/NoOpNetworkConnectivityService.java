package io.embrace.android.embracesdk.capture.connectivity;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;

/* loaded from: classes5.dex */
public final class NoOpNetworkConnectivityService implements NetworkConnectivityService {
    private final String ipAddress;

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        zq3.h(networkConnectivityListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public NetworkStatus getCurrentNetworkStatus() {
        return NetworkStatus.UNKNOWN;
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public String getIpAddress() {
        return this.ipAddress;
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void networkStatusOnSessionStarted(long j) {
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        zq3.h(networkConnectivityListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }
}
