package io.embrace.android.embracesdk.session;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class EmbraceMemoryCleanerService implements MemoryCleanerService {
    private final CopyOnWriteArrayList<MemoryCleanerListener> listeners;
    private final InternalEmbraceLogger logger;

    public EmbraceMemoryCleanerService(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
        this.listeners = new CopyOnWriteArrayList<>();
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerService
    public void addListener(MemoryCleanerListener memoryCleanerListener) {
        zq3.h(memoryCleanerListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.addIfAbsent(memoryCleanerListener);
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerService
    public void cleanServicesCollections(InternalErrorService internalErrorService) {
        zq3.h(internalErrorService, "internalErrorService");
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((MemoryCleanerListener) it2.next()).cleanCollections();
            } catch (Exception e) {
                this.logger.log("Failed to clean collections on service listener", InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
        internalErrorService.resetExceptionErrorObject();
    }

    public final CopyOnWriteArrayList<MemoryCleanerListener> getListeners() {
        return this.listeners;
    }
}
