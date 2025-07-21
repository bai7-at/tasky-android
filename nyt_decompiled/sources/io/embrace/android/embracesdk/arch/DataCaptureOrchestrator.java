package io.embrace.android.embracesdk.arch;

import defpackage.zq3;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.config.ConfigListener;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DataCaptureOrchestrator implements ConfigListener {
    private final List<DataSourceState<?>> dataSourceState;
    private final InternalEmbraceLogger logger;

    /* JADX WARN: Multi-variable type inference failed */
    public DataCaptureOrchestrator(List<? extends DataSourceState<?>> list, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(list, "dataSourceState");
        zq3.h(internalEmbraceLogger, "logger");
        this.dataSourceState = list;
        this.logger = internalEmbraceLogger;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigListener
    public void onConfigChange(ConfigService configService) {
        zq3.h(configService, "configService");
        Iterator<T> it2 = this.dataSourceState.iterator();
        while (it2.hasNext()) {
            try {
                ((DataSourceState) it2.next()).onConfigChange();
            } catch (Throwable th) {
                this.logger.log("Exception thrown starting data capture", InternalEmbraceLogger.Severity.ERROR, th, false);
            }
        }
    }

    public final void onSessionTypeChange(SessionType sessionType) {
        zq3.h(sessionType, "sessionType");
        Iterator<T> it2 = this.dataSourceState.iterator();
        while (it2.hasNext()) {
            try {
                ((DataSourceState) it2.next()).onSessionTypeChange(sessionType);
            } catch (Throwable th) {
                this.logger.log("Exception thrown starting data capture", InternalEmbraceLogger.Severity.ERROR, th, false);
            }
        }
    }
}
