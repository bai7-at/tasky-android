package kotlinx.coroutines;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes5.dex */
public final class EventLoop_commonKt {
    private static final long MAX_DELAY_NS = 4611686018427387903L;
    private static final long MAX_MS = 9223372036854L;
    private static final long MS_TO_NS = 1000000;
    private static final int SCHEDULE_COMPLETED = 1;
    private static final int SCHEDULE_DISPOSED = 2;
    private static final int SCHEDULE_OK = 0;
    private static final Symbol DISPOSED_TASK = new Symbol("REMOVED_TASK");
    private static final Symbol CLOSED_EMPTY = new Symbol("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j) {
        return j / MS_TO_NS;
    }

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= MAX_MS) {
            return Long.MAX_VALUE;
        }
        return MS_TO_NS * j;
    }
}
