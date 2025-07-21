package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public final class c4 extends g9 {
    public c4(r9 r9Var) {
        super(r9Var);
    }

    @Override // com.google.android.gms.measurement.internal.g9
    protected final boolean h() {
        return false;
    }

    public final boolean i() {
        d();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.zzau().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
