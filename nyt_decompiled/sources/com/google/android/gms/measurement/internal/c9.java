package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.nytimes.android.abra.models.AbraPackageKt;

/* loaded from: classes3.dex */
final class c9 {
    private final Clock a;
    private long b;

    public c9(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.a = clock;
    }

    public final void a() {
        this.b = 0L;
    }

    public final void b() {
        this.b = this.a.elapsedRealtime();
    }

    public final boolean c(long j) {
        return this.b == 0 || this.a.elapsedRealtime() - this.b >= AbraPackageKt.MS_IN_HOUR;
    }
}
