package com.datadog.android.core.configuration;

/* loaded from: classes2.dex */
public enum BatchSize {
    SMALL(3000),
    MEDIUM(10000),
    LARGE(35000);

    private final long windowDurationMs;

    BatchSize(long j) {
        this.windowDurationMs = j;
    }

    public final long getWindowDurationMs$dd_sdk_android_core_release() {
        return this.windowDurationMs;
    }
}
