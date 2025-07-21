package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes2.dex */
final class t0 implements GoogleApiClient.OnConnectionFailedListener {
    public final int a;
    public final GoogleApiClient b;
    public final GoogleApiClient.OnConnectionFailedListener c;
    final /* synthetic */ zak d;

    public t0(zak zakVar, int i, GoogleApiClient googleApiClient, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.d = zakVar;
        this.a = i;
        this.b = googleApiClient;
        this.c = onConnectionFailedListener;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.d.zah(connectionResult, this.a);
    }
}
