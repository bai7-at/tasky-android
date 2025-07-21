package zendesk.core;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import com.zendesk.logger.Logger;
import defpackage.mn0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class ZendeskNetworkInfoProvider implements NetworkInfoProvider, NetworkAware {
    private static final String LOG_TAG = "ZendeskNetworkInfoProvider";
    private final ConnectivityManager connectivityManager;
    private final Context context;
    private ConnectivityManager.NetworkCallback networkCallback;
    private final BroadcastReceiver broadcastReceiver = new NetworkAvailabilityBroadcastReceiver();
    private final Map<Integer, WeakReference<NetworkAware>> listeners = new HashMap();
    private final Map<Integer, WeakReference<RetryAction>> retryActions = new HashMap();
    private CurrentState currentState = null;
    private boolean isBroadcastReceiverRegistered = false;

    private enum CurrentState {
        CONNECTED,
        DISCONNECTED
    }

    class NetworkAvailabilityBroadcastReceiver extends BroadcastReceiver {
        private static final String LOG_TAG = "NetAvailabilityReceiver";

        NetworkAvailabilityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                Logger.i(LOG_TAG, "onReceive: intent was null or getAction() was mismatched", new Object[0]);
            } else if (intent.getBooleanExtra("noConnectivity", false)) {
                ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
            } else {
                ZendeskNetworkInfoProvider.this.onNetworkAvailable();
            }
        }
    }

    ZendeskNetworkInfoProvider(Context context, ConnectivityManager connectivityManager) {
        this.context = context;
        this.connectivityManager = connectivityManager;
    }

    private static boolean isConnectedOrConnecting(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    private void registerForNetworkCallbacks() {
        Logger.b(LOG_TAG, "Adding Lollipop network callbacks...", new Object[0]);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                handler.post(new Runnable() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkAvailable();
                    }
                });
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                handler.post(new Runnable() { // from class: zendesk.core.ZendeskNetworkInfoProvider.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ZendeskNetworkInfoProvider.this.onNetworkUnavailable();
                    }
                });
            }
        };
        this.connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), this.networkCallback);
    }

    @TargetApi(21)
    private void unregisterForNetworkCallbacks() {
        if (this.isBroadcastReceiverRegistered) {
            this.context.unregisterReceiver(this.broadcastReceiver);
            this.isBroadcastReceiverRegistered = false;
        }
        ConnectivityManager.NetworkCallback networkCallback = this.networkCallback;
        if (networkCallback != null) {
            this.connectivityManager.unregisterNetworkCallback(networkCallback);
            this.networkCallback = null;
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void addNetworkAwareListener(Integer num, NetworkAware networkAware) {
        if (num == null || networkAware == null) {
            return;
        }
        this.listeners.put(num, new WeakReference<>(networkAware));
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void addRetryAction(Integer num, RetryAction retryAction) {
        if (num == null || retryAction == null) {
            return;
        }
        this.retryActions.put(num, new WeakReference<>(retryAction));
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void clearNetworkAwareListeners() {
        this.listeners.clear();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void clearRetryActions() {
        this.retryActions.clear();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public boolean isNetworkAvailable() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkAvailable() {
        CurrentState currentState = CurrentState.CONNECTED;
        if (currentState == this.currentState || !isConnectedOrConnecting(this.connectivityManager)) {
            return;
        }
        this.currentState = currentState;
        Map c = mn0.c(this.listeners);
        Map c2 = mn0.c(this.retryActions);
        for (WeakReference weakReference : c.values()) {
            if (weakReference.get() != null) {
                ((NetworkAware) weakReference.get()).onNetworkAvailable();
            }
        }
        for (WeakReference weakReference2 : c2.values()) {
            if (weakReference2.get() != null) {
                ((RetryAction) weakReference2.get()).onRetry();
            }
        }
        this.retryActions.clear();
    }

    @Override // zendesk.core.NetworkAware
    public void onNetworkUnavailable() {
        CurrentState currentState = CurrentState.DISCONNECTED;
        if (currentState == this.currentState || isConnectedOrConnecting(this.connectivityManager)) {
            return;
        }
        this.currentState = currentState;
        for (WeakReference weakReference : mn0.c(this.listeners).values()) {
            if (weakReference.get() != null) {
                ((NetworkAware) weakReference.get()).onNetworkUnavailable();
            }
        }
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void register() {
        registerForNetworkCallbacks();
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void removeNetworkAwareListener(Integer num) {
        this.listeners.remove(num);
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void removeRetryAction(Integer num) {
        this.retryActions.remove(num);
    }

    @Override // zendesk.core.NetworkInfoProvider
    public void unregister() {
        unregisterForNetworkCallbacks();
    }
}
