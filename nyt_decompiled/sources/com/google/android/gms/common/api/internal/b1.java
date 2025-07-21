package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class b1 implements zabz {
    final /* synthetic */ b a;

    /* synthetic */ b1(b bVar, zay zayVar) {
        this.a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            this.a.k = connectionResult;
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
            this.a.k = ConnectionResult.RESULT_SUCCESS;
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
        zabi zabiVar;
        Lock lock3;
        lock = this.a.m;
        lock.lock();
        try {
            b bVar = this.a;
            z2 = bVar.l;
            if (z2) {
                bVar.l = false;
                b.n(this.a, i, z);
                lock3 = this.a.m;
            } else {
                bVar.l = true;
                zabiVar = this.a.d;
                zabiVar.onConnectionSuspended(i);
                lock3 = this.a.m;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.a.m;
            lock2.unlock();
            throw th;
        }
    }
}
