package io.embrace.android.embracesdk.internal.clock;

import io.embrace.android.embracesdk.internal.clock.Clock;

/* loaded from: classes5.dex */
public final class SystemClock implements Clock {
    @Override // io.embrace.android.embracesdk.internal.clock.Clock
    public long now() {
        return System.currentTimeMillis();
    }

    @Override // io.embrace.android.embracesdk.internal.clock.Clock
    public long nowInNanos() {
        return Clock.DefaultImpls.nowInNanos(this);
    }
}
