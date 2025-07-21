package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.comms.delivery.EmbraceDeliveryService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class DeliveryModuleImpl implements DeliveryModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(DeliveryModuleImpl.class, "deliveryService", "getDeliveryService()Lio/embrace/android/embracesdk/comms/delivery/DeliveryService;", 0))};
    private final hp6 deliveryService$delegate;

    public DeliveryModuleImpl(final InitModule initModule, final CoreModule coreModule, final WorkerThreadModule workerThreadModule, final StorageModule storageModule, final EssentialServiceModule essentialServiceModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(storageModule, "storageModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        this.deliveryService$delegate = new SingletonDelegate(LoadType.LAZY, new qs2() { // from class: io.embrace.android.embracesdk.injection.DeliveryModuleImpl$deliveryService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceDeliveryService mo865invoke() {
                return new EmbraceDeliveryService(StorageModule.this.getDeliveryCacheManager(), essentialServiceModule.getApiService(), workerThreadModule.backgroundWorker(WorkerName.DELIVERY_CACHE), coreModule.getJsonSerializer(), initModule.getLogger());
            }
        });
    }

    @Override // io.embrace.android.embracesdk.injection.DeliveryModule
    public DeliveryService getDeliveryService() {
        return (DeliveryService) this.deliveryService$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
