package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
final class z0 implements Runnable {
    final /* synthetic */ b a;

    z0(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        Lock lock2;
        lock = this.a.m;
        lock.lock();
        try {
            b.p(this.a);
        } finally {
            lock2 = this.a.m;
            lock2.unlock();
        }
    }
}
