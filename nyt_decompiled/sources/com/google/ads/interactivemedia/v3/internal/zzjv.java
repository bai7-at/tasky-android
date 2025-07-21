package com.google.ads.interactivemedia.v3.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
final class zzjv extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzjw zza;

    zzjv(zzjw zzjwVar) {
        this.zza = zzjwVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzjw.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzjw.class) {
            this.zza.zza = null;
        }
    }
}
