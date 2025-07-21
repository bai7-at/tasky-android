package com.datadog.android.core.internal.net.info;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import defpackage.be0;
import defpackage.pa1;
import defpackage.qs2;
import defpackage.v35;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes2.dex */
public final class CallbackNetworkInfoProvider extends ConnectivityManager.NetworkCallback implements v35 {
    public static final a e = new a(null);
    private final pa1 a;
    private final be0 b;
    private final InternalLogger c;
    private NetworkInfo d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ CallbackNetworkInfoProvider(pa1 pa1Var, be0 be0Var, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(pa1Var, (i & 2) != 0 ? be0.a.a() : be0Var, internalLogger);
    }

    private final NetworkInfo.Connectivity d(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) ? NetworkInfo.Connectivity.NETWORK_WIFI : networkCapabilities.hasTransport(3) ? NetworkInfo.Connectivity.NETWORK_ETHERNET : networkCapabilities.hasTransport(0) ? NetworkInfo.Connectivity.NETWORK_CELLULAR : networkCapabilities.hasTransport(2) ? NetworkInfo.Connectivity.NETWORK_BLUETOOTH : NetworkInfo.Connectivity.NETWORK_OTHER;
    }

    private final Long e(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.getLinkDownstreamBandwidthKbps() > 0) {
            return Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps());
        }
        return null;
    }

    private final Long f(NetworkCapabilities networkCapabilities) {
        if (this.b.getVersion() < 29 || networkCapabilities.getSignalStrength() == Integer.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(networkCapabilities.getSignalStrength());
    }

    private final Long g(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.getLinkUpstreamBandwidthKbps() > 0) {
            return Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps());
        }
        return null;
    }

    private final void h(NetworkInfo networkInfo) {
        this.d = networkInfo;
        this.a.a(networkInfo);
    }

    @Override // defpackage.v35
    public void a(Context context) {
        zq3.h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't register a Network Callback, the network information reported will be less accurate.";
                }
            }, null, false, null, 56, null);
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(this);
            Network activeNetwork = connectivityManager.getActiveNetwork();
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork == null || networkCapabilities == null) {
                return;
            }
            onCapabilitiesChanged(activeNetwork, networkCapabilities);
        } catch (SecurityException e2) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't register a Network Callback, the network information reported will be less accurate.";
                }
            }, e2, false, null, 48, null);
            h(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        } catch (Exception e3) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$3
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't register a Network Callback, the network information reported will be less accurate.";
                }
            }, e3, false, null, 48, null);
            h(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        }
    }

    @Override // defpackage.v35
    public void b(Context context) {
        zq3.h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't unregister the Network Callback";
                }
            }, null, false, null, 56, null);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e2) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't unregister the Network Callback";
                }
            }, e2, false, null, 48, null);
        } catch (RuntimeException e3) {
            InternalLogger.b.a(this.c, InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$3
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "We couldn't unregister the Network Callback";
                }
            }, e3, false, null, 48, null);
        }
    }

    @Override // defpackage.v35
    public NetworkInfo c() {
        return this.d;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        zq3.h(network, "network");
        zq3.h(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        h(new NetworkInfo(d(networkCapabilities), null, null, g(networkCapabilities), e(networkCapabilities), f(networkCapabilities), null, 70, null));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        zq3.h(network, "network");
        super.onLost(network);
        h(new NetworkInfo(NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
    }

    public CallbackNetworkInfoProvider(pa1 pa1Var, be0 be0Var, InternalLogger internalLogger) {
        zq3.h(pa1Var, "dataWriter");
        zq3.h(be0Var, "buildSdkVersionProvider");
        zq3.h(internalLogger, "internalLogger");
        this.a = pa1Var;
        this.b = be0Var;
        this.c = internalLogger;
        this.d = new NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }
}
