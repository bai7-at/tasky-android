package io.embrace.android.embracesdk.injection;

import io.embrace.android.embracesdk.comms.api.ApiResponseCache;
import io.embrace.android.embracesdk.comms.delivery.CacheService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager;
import io.embrace.android.embracesdk.storage.StorageService;

/* loaded from: classes5.dex */
public interface StorageModule {
    ApiResponseCache getCache();

    CacheService getCacheService();

    DeliveryCacheManager getDeliveryCacheManager();

    StorageService getStorageService();
}
