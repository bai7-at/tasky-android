package com.google.android.gms.internal.ads;

import defpackage.kke;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class kc extends hc implements ScheduledExecutorService, kke {
    final ScheduledExecutorService b;

    kc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.b;
        qc D = qc.D(runnable, null);
        return new ic(D, scheduledExecutorService.schedule(D, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jc jcVar = new jc(runnable);
        return new ic(jcVar, this.b.scheduleAtFixedRate(jcVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        jc jcVar = new jc(runnable);
        return new ic(jcVar, this.b.scheduleWithFixedDelay(jcVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        qc qcVar = new qc(callable);
        return new ic(qcVar, this.b.schedule(qcVar, j, timeUnit));
    }
}
