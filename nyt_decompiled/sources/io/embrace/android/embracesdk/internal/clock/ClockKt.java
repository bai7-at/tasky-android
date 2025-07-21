package io.embrace.android.embracesdk.internal.clock;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class ClockKt {
    public static final long MAX_MS_CUTOFF = 95617584000000L;

    public static final long millisToNanos(long j) {
        return TimeUnit.MILLISECONDS.toNanos(j);
    }

    public static final long nanosToMillis(long j) {
        return TimeUnit.NANOSECONDS.toMillis(j);
    }

    public static final long normalizeTimestampAsMillis(long j) {
        return j < MAX_MS_CUTOFF ? j : nanosToMillis(j);
    }
}
