package com.datadog.android.core.configuration;

import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;

/* loaded from: classes2.dex */
public enum UploadFrequency {
    FREQUENT(500),
    AVERAGE(2000),
    RARE(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);

    private final long baseStepMs;

    UploadFrequency(long j) {
        this.baseStepMs = j;
    }

    public final long getBaseStepMs$dd_sdk_android_core_release() {
        return this.baseStepMs;
    }
}
