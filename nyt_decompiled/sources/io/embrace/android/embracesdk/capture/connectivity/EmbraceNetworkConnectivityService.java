package io.embrace.android.embracesdk.capture.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.comms.delivery.NetworkStatus;
import io.embrace.android.embracesdk.injection.DataSourceModule;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.c;

/* loaded from: classes5.dex */
public final class EmbraceNetworkConnectivityService extends BroadcastReceiver implements NetworkConnectivityService {
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private final qs2 dataSourceModuleProvider;
    private final IntentFilter intentFilter;
    private final c04 ipAddress$delegate;
    private NetworkStatus lastNetworkStatus;
    private final InternalEmbraceLogger logger;
    private final List<NetworkConnectivityListener> networkConnectivityListeners;

    public EmbraceNetworkConnectivityService(Context context, Clock clock, BackgroundWorker backgroundWorker, InternalEmbraceLogger internalEmbraceLogger, ConnectivityManager connectivityManager, qs2 qs2Var) {
        zq3.h(context, "context");
        zq3.h(clock, "clock");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(qs2Var, "dataSourceModuleProvider");
        this.context = context;
        this.clock = clock;
        this.backgroundWorker = backgroundWorker;
        this.logger = internalEmbraceLogger;
        this.connectivityManager = connectivityManager;
        this.dataSourceModuleProvider = qs2Var;
        this.intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        this.networkConnectivityListeners = new ArrayList();
        this.ipAddress$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.capture.connectivity.EmbraceNetworkConnectivityService$ipAddress$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String calculateIpAddress;
                calculateIpAddress = EmbraceNetworkConnectivityService.this.calculateIpAddress();
                return calculateIpAddress;
            }
        });
        registerConnectivityActionReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateIpAddress() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                zq3.g(nextElement, "intf");
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    zq3.g(nextElement2, "inetAddress");
                    if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                        return nextElement2.getHostAddress();
                    }
                }
            }
        } catch (Exception unused) {
            this.logger.log("Cannot get IP Address", InternalEmbraceLogger.Severity.DEBUG, null, true);
        }
        return null;
    }

    private final boolean didNetworkStatusChange(NetworkStatus networkStatus) {
        NetworkStatus networkStatus2 = this.lastNetworkStatus;
        return networkStatus2 == null || networkStatus2 != networkStatus;
    }

    private final void handleNetworkStatus(boolean z, long j) {
        DataSourceState<NetworkStatusDataSource> networkStatusDataSource;
        NetworkStatusDataSource dataSource;
        try {
            NetworkStatus currentNetworkStatus = getCurrentNetworkStatus();
            if (didNetworkStatusChange(currentNetworkStatus)) {
                this.lastNetworkStatus = currentNetworkStatus;
                DataSourceModule dataSourceModule = (DataSourceModule) this.dataSourceModuleProvider.mo865invoke();
                if (dataSourceModule != null && (networkStatusDataSource = dataSourceModule.getNetworkStatusDataSource()) != null && (dataSource = networkStatusDataSource.getDataSource()) != null) {
                    dataSource.networkStatusChange(currentNetworkStatus, j);
                }
                if (z) {
                    this.logger.log("Network status changed to: " + currentNetworkStatus.name(), InternalEmbraceLogger.Severity.INFO, null, true);
                    notifyNetworkConnectivityListeners(currentNetworkStatus);
                }
            }
        } catch (Exception e) {
            this.logger.log("Failed to record network connectivity", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    static /* synthetic */ void handleNetworkStatus$default(EmbraceNetworkConnectivityService embraceNetworkConnectivityService, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = embraceNetworkConnectivityService.clock.now();
        }
        embraceNetworkConnectivityService.handleNetworkStatus(z, j);
    }

    private final void notifyNetworkConnectivityListeners(NetworkStatus networkStatus) {
        Iterator<NetworkConnectivityListener> it2 = this.networkConnectivityListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onNetworkConnectivityStatusChanged(networkStatus);
        }
    }

    private final void registerConnectivityActionReceiver() {
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.capture.connectivity.EmbraceNetworkConnectivityService$registerConnectivityActionReceiver$1
            @Override // java.lang.Runnable
            public final void run() {
                InternalEmbraceLogger internalEmbraceLogger;
                Context context;
                IntentFilter intentFilter;
                try {
                    context = EmbraceNetworkConnectivityService.this.context;
                    EmbraceNetworkConnectivityService embraceNetworkConnectivityService = EmbraceNetworkConnectivityService.this;
                    intentFilter = embraceNetworkConnectivityService.intentFilter;
                    context.registerReceiver(embraceNetworkConnectivityService, intentFilter);
                } catch (Exception e) {
                    internalEmbraceLogger = EmbraceNetworkConnectivityService.this.logger;
                    internalEmbraceLogger.log("Failed to register EmbraceNetworkConnectivityService broadcast receiver. Connectivity status will be unavailable.", InternalEmbraceLogger.Severity.DEBUG, e, true);
                }
            }
        }, 1, (Object) null);
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void addNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        zq3.h(networkConnectivityListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.networkConnectivityListeners.add(networkConnectivityListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.context.unregisterReceiver(this);
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public NetworkStatus getCurrentNetworkStatus() {
        try {
            ConnectivityManager connectivityManager = this.connectivityManager;
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return NetworkStatus.NOT_REACHABLE;
            }
            int type2 = activeNetworkInfo.getType();
            return type2 != 0 ? type2 != 1 ? NetworkStatus.UNKNOWN : NetworkStatus.WIFI : NetworkStatus.WAN;
        } catch (Exception e) {
            this.logger.log("Error while trying to get connectivity status.", InternalEmbraceLogger.Severity.ERROR, e, false);
            return NetworkStatus.UNKNOWN;
        }
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public String getIpAddress() {
        return (String) this.ipAddress$delegate.getValue();
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void networkStatusOnSessionStarted(long j) {
        handleNetworkStatus(false, j);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zq3.h(context, "context");
        zq3.h(intent, "intent");
        handleNetworkStatus$default(this, true, 0L, 2, null);
    }

    @Override // io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService
    public void removeNetworkConnectivityListener(NetworkConnectivityListener networkConnectivityListener) {
        zq3.h(networkConnectivityListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.networkConnectivityListeners.remove(networkConnectivityListener);
    }
}
