package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class q implements Runnable {
    final /* synthetic */ zaaw a;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        zabi zabiVar;
        Lock lock3;
        lock = this.a.zab;
        lock.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    lock3 = this.a.zab;
                } else {
                    a();
                    lock3 = this.a.zab;
                }
            } catch (RuntimeException e) {
                zabiVar = this.a.zaa;
                zabiVar.zam(e);
                lock3 = this.a.zab;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = this.a.zab;
            lock2.unlock();
            throw th;
        }
    }
}
