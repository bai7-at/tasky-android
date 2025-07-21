package io.embrace.android.embracesdk.capture.memory;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class ComponentCallbackService implements ComponentCallbacks2, Closeable {
    private final Application application;
    private final InternalEmbraceLogger logger;
    private final MemoryService memoryService;

    public ComponentCallbackService(Application application, MemoryService memoryService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(application, "application");
        zq3.h(memoryService, "memoryService");
        zq3.h(internalEmbraceLogger, "logger");
        this.application = application;
        this.memoryService = memoryService;
        this.logger = internalEmbraceLogger;
        application.getApplicationContext().registerComponentCallbacks(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.application.getApplicationContext().unregisterComponentCallbacks(this);
        } catch (Exception e) {
            this.logger.log("Error when closing ComponentCallbackService", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        zq3.h(configuration, "configuration");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 10) {
            try {
                this.memoryService.onMemoryWarning();
            } catch (Exception e) {
                this.logger.log("Failed to handle onTrimMemory (low memory) event", InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }
}
