package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class x {
    private final zabf a;

    protected x(zabf zabfVar) {
        this.a = zabfVar;
    }

    protected abstract void a();

    public final void b(zabi zabiVar) {
        Lock lock;
        Lock lock2;
        zabf zabfVar;
        Lock lock3;
        lock = zabiVar.zai;
        lock.lock();
        try {
            zabfVar = zabiVar.zan;
            if (zabfVar != this.a) {
                lock3 = zabiVar.zai;
            } else {
                a();
                lock3 = zabiVar.zai;
            }
            lock3.unlock();
        } catch (Throwable th) {
            lock2 = zabiVar.zai;
            lock2.unlock();
            throw th;
        }
    }
}
