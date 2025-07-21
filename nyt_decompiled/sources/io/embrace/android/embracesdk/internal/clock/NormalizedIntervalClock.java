package io.embrace.android.embracesdk.internal.clock;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;

/* loaded from: classes5.dex */
public final class NormalizedIntervalClock implements Clock {
    private final long baseline;

    public NormalizedIntervalClock(SystemClock systemClock) {
        zq3.h(systemClock, "systemClock");
        this.baseline = systemClock.now() - android.os.SystemClock.elapsedRealtime();
    }

    @Override // io.embrace.android.embracesdk.internal.clock.Clock
    public long now() {
        return this.baseline + android.os.SystemClock.elapsedRealtime();
    }

    @Override // io.embrace.android.embracesdk.internal.clock.Clock
    public long nowInNanos() {
        return Clock.DefaultImpls.nowInNanos(this);
    }
}
