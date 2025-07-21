package io.embrace.android.embracesdk.internal.clock;

import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public interface Clock {

    public static final class DefaultImpls {
        public static long nowInNanos(Clock clock) {
            return ClockKt.millisToNanos(clock.now());
        }
    }

    long now();

    long nowInNanos();
}
