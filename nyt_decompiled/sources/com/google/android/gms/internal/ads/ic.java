package com.google.android.gms.internal.ads;

import defpackage.eke;
import defpackage.j64;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class ic extends eke implements ScheduledFuture, j64 {
    private final ScheduledFuture b;

    public ic(j64 j64Var, ScheduledFuture scheduledFuture) {
        super(j64Var);
        this.b = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = d().cancel(z);
        if (cancel) {
            this.b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.b.getDelay(timeUnit);
    }
}
