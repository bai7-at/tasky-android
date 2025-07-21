package io.embrace.android.embracesdk.internal;

import android.os.SystemClock;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;

/* loaded from: classes5.dex */
public final class OpenTelemetryClock implements yl0 {
    private final Clock embraceClock;

    public OpenTelemetryClock(Clock clock) {
        zq3.h(clock, "embraceClock");
        this.embraceClock = clock;
    }

    @Override // defpackage.yl0
    public long nanoTime() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // defpackage.yl0
    public long now() {
        return this.embraceClock.nowInNanos();
    }
}
