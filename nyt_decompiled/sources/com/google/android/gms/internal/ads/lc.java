package com.google.android.gms.internal.ads;

import defpackage.kke;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class lc {
    public static kke a(ExecutorService executorService) {
        if (executorService instanceof kke) {
            return (kke) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new kc((ScheduledExecutorService) executorService) : new hc(executorService);
    }

    public static Executor b() {
        return zzgeb.INSTANCE;
    }

    static Executor c(Executor executor, eb ebVar) {
        executor.getClass();
        return executor == zzgeb.INSTANCE ? executor : new gc(executor, ebVar);
    }
}
