package io.embrace.android.embracesdk.arch.limits;

/* loaded from: classes5.dex */
public final class NoopLimitStrategy implements LimitStrategy {
    public static final NoopLimitStrategy INSTANCE = new NoopLimitStrategy();

    private NoopLimitStrategy() {
    }

    @Override // io.embrace.android.embracesdk.arch.limits.LimitStrategy
    public void resetDataCaptureLimits() {
    }

    @Override // io.embrace.android.embracesdk.arch.limits.LimitStrategy
    public boolean shouldCapture() {
        return true;
    }
}
