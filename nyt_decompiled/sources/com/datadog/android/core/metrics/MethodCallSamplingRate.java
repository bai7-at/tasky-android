package com.datadog.android.core.metrics;

/* loaded from: classes2.dex */
public enum MethodCallSamplingRate {
    ALL(100.0f),
    HIGH(10.0f),
    MEDIUM(1.0f),
    LOW(0.1f),
    REDUCED(0.01f),
    RARE(0.001f);

    private final float rate;

    MethodCallSamplingRate(float f) {
        this.rate = f;
    }

    public final float getRate() {
        return this.rate;
    }
}
