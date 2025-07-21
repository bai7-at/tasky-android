package com.google.android.gms.internal.ads;

import defpackage.j64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class pc extends ub {
    private j64 h;
    private ScheduledFuture i;

    private pc(j64 j64Var) {
        j64Var.getClass();
        this.h = j64Var;
    }

    static j64 E(j64 j64Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        pc pcVar = new pc(j64Var);
        oc ocVar = new oc(pcVar);
        pcVar.i = scheduledExecutorService.schedule(ocVar, j, timeUnit);
        j64Var.a(ocVar, zzgeb.INSTANCE);
        return pcVar;
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        j64 j64Var = this.h;
        ScheduledFuture scheduledFuture = this.i;
        if (j64Var == null) {
            return null;
        }
        String str = "inputFuture=[" + j64Var.toString() + "]";
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return str + ", remaining delay=[" + delay + " ms]";
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        t(this.h);
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }
}
