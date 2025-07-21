package io.embrace.android.embracesdk.arch.limits;

/* loaded from: classes5.dex */
public interface LimitStrategy {
    void resetDataCaptureLimits();

    boolean shouldCapture();
}
