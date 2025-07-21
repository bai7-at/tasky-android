package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class q6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ z6 b;

    q6(z6 z6Var, AtomicReference atomicReference) {
        this.b = z6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                try {
                    this.a.set(Long.valueOf(this.b.a.y().n(this.b.a.A().r(), m3.N)));
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
