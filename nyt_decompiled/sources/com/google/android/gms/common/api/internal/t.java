package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
final class t implements GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ StatusPendingResult a;

    t(zabe zabeVar, StatusPendingResult statusPendingResult) {
        this.a = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.a.setResult(new Status(8));
    }
}
