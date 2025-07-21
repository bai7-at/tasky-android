package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    zab(a aVar) {
        this.zaa = new WeakReference(aVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        a aVar = (a) this.zaa.get();
        if (aVar == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        aVar.c(runnable);
        return this;
    }
}
