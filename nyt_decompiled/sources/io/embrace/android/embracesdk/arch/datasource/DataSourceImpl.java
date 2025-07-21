package io.embrace.android.embracesdk.arch.datasource;

import defpackage.qs2;
import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.limits.LimitStrategy;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;

/* loaded from: classes5.dex */
public abstract class DataSourceImpl<T> implements DataSource<T> {
    private final T destination;
    private final LimitStrategy limitStrategy;
    private final InternalEmbraceLogger logger;

    public DataSourceImpl(T t, InternalEmbraceLogger internalEmbraceLogger, LimitStrategy limitStrategy) {
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(limitStrategy, "limitStrategy");
        this.destination = t;
        this.logger = internalEmbraceLogger;
        this.limitStrategy = limitStrategy;
    }

    public static /* synthetic */ boolean captureDataImpl$default(DataSourceImpl dataSourceImpl, qs2 qs2Var, ss2 ss2Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureDataImpl");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return dataSourceImpl.captureDataImpl(qs2Var, ss2Var, z);
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSource
    public boolean alterSessionSpan(qs2 qs2Var, ss2 ss2Var) {
        zq3.h(qs2Var, "inputValidation");
        zq3.h(ss2Var, "captureAction");
        return captureDataImpl(qs2Var, ss2Var, true);
    }

    protected final boolean captureDataImpl(qs2 qs2Var, ss2 ss2Var, boolean z) {
        zq3.h(qs2Var, "inputValidation");
        zq3.h(ss2Var, "captureAction");
        if (z) {
            try {
                if (!this.limitStrategy.shouldCapture()) {
                    this.logger.log("Data capture limit reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
                    return false;
                }
            } catch (Throwable th) {
                this.logger.log("Error capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
                return false;
            }
        }
        if (((Boolean) qs2Var.mo865invoke()).booleanValue()) {
            ss2Var.invoke(this.destination);
            return true;
        }
        this.logger.log("Input validation failed.", InternalEmbraceLogger.Severity.WARNING, null, false);
        return false;
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSource
    public void disableDataCapture() {
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSource
    public void enableDataCapture() {
    }

    @Override // io.embrace.android.embracesdk.arch.datasource.DataSource
    public void resetDataCaptureLimits() {
        this.limitStrategy.resetDataCaptureLimits();
    }
}
