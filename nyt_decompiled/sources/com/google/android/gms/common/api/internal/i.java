package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class i implements BaseGmsClient.ConnectionProgressReportCallbacks {
    private final WeakReference a;
    private final Api b;
    private final boolean c;

    public i(zaaw zaawVar, Api api, boolean z) {
        this.a = new WeakReference(zaawVar);
        this.b = api;
        this.c = z;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        zabi zabiVar;
        Lock lock;
        Lock lock2;
        boolean zaG;
        boolean zaH;
        Lock lock3;
        zaaw zaawVar = (zaaw) this.a.get();
        if (zaawVar == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        zabiVar = zaawVar.zaa;
        Preconditions.checkState(myLooper == zabiVar.zag.getLooper(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = zaawVar.zab;
        lock.lock();
        try {
            zaG = zaawVar.zaG(0);
            if (zaG) {
                if (!connectionResult.isSuccess()) {
                    zaawVar.zaE(connectionResult, this.b, this.c);
                }
                zaH = zaawVar.zaH();
                if (zaH) {
                    zaawVar.zaF();
                }
                lock3 = zaawVar.zab;
            } else {
                lock3 = zaawVar.zab;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zaawVar.zab;
            lock2.unlock();
            throw th;
        }
    }
}
