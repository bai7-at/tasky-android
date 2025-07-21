package kotlinx.coroutines.sync;

import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes5.dex */
public interface Semaphore {
    Object acquire(by0<? super ww8> by0Var);

    int getAvailablePermits();

    void release();

    boolean tryAcquire();
}
