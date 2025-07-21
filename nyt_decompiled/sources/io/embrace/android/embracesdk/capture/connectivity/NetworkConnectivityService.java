package io.embrace.android.embracesdk.capture.connectivity;

import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;
import java.io.Closeable;

/* loaded from: classes5.dex */
public interface NetworkConnectivityService extends Closeable {
    void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener);

    NetworkStatus getCurrentNetworkStatus();

    String getIpAddress();

    void networkStatusOnSessionStarted(long j);

    void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener);
}
