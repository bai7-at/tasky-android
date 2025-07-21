package io.embrace.android.embracesdk.arch.limits;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public final class UpToLimitStrategy implements LimitStrategy {
    private int count;
    private final qs2 limitProvider;
    private Object lock;
    private final InternalEmbraceLogger logger;

    public UpToLimitStrategy(InternalEmbraceLogger internalEmbraceLogger, qs2 qs2Var) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(qs2Var, "limitProvider");
        this.logger = internalEmbraceLogger;
        this.limitProvider = qs2Var;
        this.lock = new Object();
    }

    @Override // io.embrace.android.embracesdk.arch.limits.LimitStrategy
    public void resetDataCaptureLimits() {
        synchronized (this.lock) {
            this.count = 0;
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // io.embrace.android.embracesdk.arch.limits.LimitStrategy
    public boolean shouldCapture() {
        synchronized (this.lock) {
            if (this.count >= ((Number) this.limitProvider.mo865invoke()).intValue()) {
                this.logger.log("Data capture limit reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
                return false;
            }
            this.count++;
            return true;
        }
    }
}
