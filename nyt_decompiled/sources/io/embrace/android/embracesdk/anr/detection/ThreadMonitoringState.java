package io.embrace.android.embracesdk.anr.detection;

import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.Clock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class ThreadMonitoringState {
    private volatile boolean anrInProgress;
    private final Clock clock;
    private volatile long lastMonitorThreadResponseMs;
    private volatile long lastSampleAttemptMs;
    private volatile long lastTargetThreadResponseMs;
    public final AtomicBoolean started;

    public ThreadMonitoringState(Clock clock) {
        zq3.h(clock, "clock");
        this.clock = clock;
        this.started = new AtomicBoolean(false);
        this.lastTargetThreadResponseMs = clock.now();
        this.lastMonitorThreadResponseMs = clock.now();
    }

    public final boolean getAnrInProgress() {
        return this.anrInProgress;
    }

    public final long getLastMonitorThreadResponseMs() {
        return this.lastMonitorThreadResponseMs;
    }

    public final long getLastSampleAttemptMs() {
        return this.lastSampleAttemptMs;
    }

    public final long getLastTargetThreadResponseMs() {
        return this.lastTargetThreadResponseMs;
    }

    public final void resetState() {
        this.anrInProgress = false;
        this.lastTargetThreadResponseMs = this.clock.now();
        this.lastMonitorThreadResponseMs = this.clock.now();
        this.lastSampleAttemptMs = 0L;
    }

    public final void setAnrInProgress(boolean z) {
        this.anrInProgress = z;
    }

    public final void setLastMonitorThreadResponseMs(long j) {
        this.lastMonitorThreadResponseMs = j;
    }

    public final void setLastSampleAttemptMs(long j) {
        this.lastSampleAttemptMs = j;
    }

    public final void setLastTargetThreadResponseMs(long j) {
        this.lastTargetThreadResponseMs = j;
    }
}
