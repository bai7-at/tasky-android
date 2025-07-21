package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.comms.api.ApiResponseCache;
import io.embrace.android.embracesdk.comms.delivery.CacheService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryCacheManager;
import io.embrace.android.embracesdk.comms.delivery.EmbraceCacheService;
import io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryCacheManager;
import io.embrace.android.embracesdk.storage.EmbraceStorageService;
import io.embrace.android.embracesdk.storage.StatFsAvailabilityChecker;
import io.embrace.android.embracesdk.storage.StorageService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class StorageModuleImpl implements StorageModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(StorageModuleImpl.class, "storageService", "getStorageService()Lio/embrace/android/embracesdk/storage/StorageService;", 0)), zt6.i(new PropertyReference1Impl(StorageModuleImpl.class, "cache", "getCache()Lio/embrace/android/embracesdk/comms/api/ApiResponseCache;", 0)), zt6.i(new PropertyReference1Impl(StorageModuleImpl.class, "cacheService", "getCacheService()Lio/embrace/android/embracesdk/comms/delivery/CacheService;", 0)), zt6.i(new PropertyReference1Impl(StorageModuleImpl.class, "deliveryCacheManager", "getDeliveryCacheManager()Lio/embrace/android/embracesdk/comms/delivery/DeliveryCacheManager;", 0))};
    private final hp6 cache$delegate;
    private final hp6 cacheService$delegate;
    private final hp6 deliveryCacheManager$delegate;
    private final hp6 storageService$delegate;

    public StorageModuleImpl(final InitModule initModule, final CoreModule coreModule, final WorkerThreadModule workerThreadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.StorageModuleImpl$storageService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceStorageService mo865invoke() {
                return new EmbraceStorageService(CoreModule.this.getContext(), initModule.getTelemetryService(), new StatFsAvailabilityChecker(CoreModule.this.getContext()));
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.storageService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.cache$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.StorageModuleImpl$cache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ApiResponseCache mo865invoke() {
                return new ApiResponseCache(coreModule.getJsonSerializer(), StorageModuleImpl.this.getStorageService(), initModule.getLogger());
            }
        });
        this.cacheService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.StorageModuleImpl$cacheService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceCacheService mo865invoke() {
                return new EmbraceCacheService(StorageModuleImpl.this.getStorageService(), coreModule.getJsonSerializer(), initModule.getLogger());
            }
        });
        this.deliveryCacheManager$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.StorageModuleImpl$deliveryCacheManager$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceDeliveryCacheManager mo865invoke() {
                return new EmbraceDeliveryCacheManager(StorageModuleImpl.this.getCacheService(), workerThreadModule.backgroundWorker(WorkerName.DELIVERY_CACHE), initModule.getLogger());
            }
        });
        workerThreadModule.scheduledWorker(WorkerName.BACKGROUND_REGISTRATION).schedule(new Runnable() { // from class: io.embrace.android.embracesdk.injection.StorageModuleImpl.1
            @Override // java.lang.Runnable
            public final void run() {
                StorageModuleImpl.this.getStorageService().logStorageTelemetry();
            }
        }, 1L, TimeUnit.MINUTES);
    }

    @Override // io.embrace.android.embracesdk.injection.StorageModule
    public ApiResponseCache getCache() {
        return (ApiResponseCache) this.cache$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.StorageModule
    public CacheService getCacheService() {
        return (CacheService) this.cacheService$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.StorageModule
    public DeliveryCacheManager getDeliveryCacheManager() {
        return (DeliveryCacheManager) this.deliveryCacheManager$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.StorageModule
    public StorageService getStorageService() {
        return (StorageService) this.storageService$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
