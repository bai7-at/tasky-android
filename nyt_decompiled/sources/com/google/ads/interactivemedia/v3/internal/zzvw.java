package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzvw {
    public static zzvr zza(ExecutorService executorService) {
        if (executorService instanceof zzvr) {
            return (zzvr) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzvv((ScheduledExecutorService) executorService) : new zzvs(executorService);
    }

    public static Executor zzb() {
        return zzus.INSTANCE;
    }
}
