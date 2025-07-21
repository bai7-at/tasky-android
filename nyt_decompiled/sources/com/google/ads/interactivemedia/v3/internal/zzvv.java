package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzvv extends zzvs implements ScheduledExecutorService, zzvr {
    final ScheduledExecutorService zza;

    zzvv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzvz zzp = zzvz.zzp(runnable, null);
        return new zzvt(zzp, this.zza.schedule(zzp, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzvu zzvuVar = new zzvu(runnable);
        return new zzvt(zzvuVar, this.zza.scheduleAtFixedRate(zzvuVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzvu zzvuVar = new zzvu(runnable);
        return new zzvt(zzvuVar, this.zza.scheduleWithFixedDelay(zzvuVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzvz zzvzVar = new zzvz(callable);
        return new zzvt(zzvzVar, this.zza.schedule(zzvzVar, j, timeUnit));
    }
}
