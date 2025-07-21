package io.embrace.android.embracesdk.worker;

import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;

/* loaded from: classes5.dex */
public enum TaskPriority {
    CRITICAL(0),
    HIGH(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT),
    NORMAL(30000),
    LOW(60000);

    private final long delayThresholdMs;

    TaskPriority(long j) {
        this.delayThresholdMs = j;
    }

    public final long getDelayThresholdMs() {
        return this.delayThresholdMs;
    }
}
