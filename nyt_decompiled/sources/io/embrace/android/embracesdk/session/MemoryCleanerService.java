package io.embrace.android.embracesdk.session;

import io.embrace.android.embracesdk.logging.InternalErrorService;

/* loaded from: classes5.dex */
public interface MemoryCleanerService {
    void addListener(MemoryCleanerListener memoryCleanerListener);

    void cleanServicesCollections(InternalErrorService internalErrorService);
}
