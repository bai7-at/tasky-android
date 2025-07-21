package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class a1 implements zabz {
    final /* synthetic */ b a;

    /* synthetic */ a1(b bVar, zaw zawVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            this.a.j = connectionResult;
            b.p(this.a);
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            b.o(this.a, bundle);
            this.a.j = ConnectionResult.RESULT_SUCCESS;
            b.p(this.a);
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i, boolean z) {
        Lock lock;
        Lock lock2;
        boolean z2;
        Lock lock3;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        zabi zabiVar;
        lock = this.a.m;
        lock.lock();
        try {
            b bVar = this.a;
            z2 = bVar.l;
            if (!z2) {
                connectionResult = bVar.k;
                if (connectionResult != null) {
                    connectionResult2 = bVar.k;
                    if (connectionResult2.isSuccess()) {
                        this.a.l = true;
                        zabiVar = this.a.e;
                        zabiVar.onConnectionSuspended(i);
                        lock3 = this.a.m;
                        lock3.unlock();
                    }
                }
            }
            this.a.l = false;
            b.n(this.a, i, z);
            lock3 = this.a.m;
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.a.m;
            lock2.unlock();
            throw th;
        }
    }
}
