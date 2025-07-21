package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class s implements GoogleApiClient.ConnectionCallbacks {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ StatusPendingResult b;
    final /* synthetic */ zabe c;

    s(zabe zabeVar, AtomicReference atomicReference, StatusPendingResult statusPendingResult) {
        this.c = zabeVar;
        this.a = atomicReference;
        this.b = statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.c.zam((GoogleApiClient) Preconditions.checkNotNull((GoogleApiClient) this.a.get()), this.b, true);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
