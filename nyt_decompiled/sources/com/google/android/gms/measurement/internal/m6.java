package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class m6 implements Runnable {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ z6 b;

    m6(z6 z6Var, AtomicReference atomicReference) {
        this.b = z6Var;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            try {
                try {
                    this.a.set(Boolean.valueOf(this.b.a.y().A(this.b.a.A().r(), m3.L)));
                } finally {
                    this.a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
