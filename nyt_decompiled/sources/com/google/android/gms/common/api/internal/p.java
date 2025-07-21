package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.no9;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class p implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    final /* synthetic */ zaaw a;

    /* synthetic */ p(zaaw zaawVar, zaas zaasVar) {
        this.a = zaawVar;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        ClientSettings clientSettings;
        no9 no9Var;
        clientSettings = this.a.zar;
        no9Var = this.a.zak;
        ((no9) Preconditions.checkNotNull(no9Var)).a(new o(this.a));
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        boolean zaI;
        Lock lock3;
        lock = this.a.zab;
        lock.lock();
        try {
            zaI = this.a.zaI(connectionResult);
            if (zaI) {
                this.a.zaA();
                this.a.zaF();
            } else {
                this.a.zaD(connectionResult);
            }
            lock3 = this.a.zab;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.a.zab;
            lock2.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
