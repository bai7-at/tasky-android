package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.capture.EmbracePerformanceInfoService;
import io.embrace.android.embracesdk.capture.PerformanceInfoService;
import io.embrace.android.embracesdk.event.EmbraceEventService;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class DataContainerModuleImpl implements DataContainerModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(DataContainerModuleImpl.class, "performanceInfoService", "getPerformanceInfoService()Lio/embrace/android/embracesdk/capture/PerformanceInfoService;", 0)), zt6.i(new PropertyReference1Impl(DataContainerModuleImpl.class, "eventService", "getEventService()Lio/embrace/android/embracesdk/event/EventService;", 0))};
    private final hp6 eventService$delegate;
    private final hp6 performanceInfoService$delegate;

    public DataContainerModuleImpl(final InitModule initModule, OpenTelemetryModule openTelemetryModule, final WorkerThreadModule workerThreadModule, final EssentialServiceModule essentialServiceModule, DataCaptureServiceModule dataCaptureServiceModule, final AnrModule anrModule, CustomerLogModule customerLogModule, final DeliveryModule deliveryModule, final NativeModule nativeModule, final long j) {
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(dataCaptureServiceModule, "dataCaptureServiceModule");
        zq3.h(anrModule, "anrModule");
        zq3.h(customerLogModule, "customerLogModule");
        zq3.h(deliveryModule, "deliveryModule");
        zq3.h(nativeModule, "nativeModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.DataContainerModuleImpl$performanceInfoService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbracePerformanceInfoService mo865invoke() {
                return new EmbracePerformanceInfoService(EssentialServiceModule.this.getMetadataService(), anrModule.getGoogleAnrTimestampRepository(), nativeModule.getNativeThreadSamplerService(), anrModule.getResponsivenessMonitorService(), initModule.getLogger());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.performanceInfoService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.eventService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataContainerModuleImpl$eventService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceEventService mo865invoke() {
                return new EmbraceEventService(j, deliveryModule.getDeliveryService(), essentialServiceModule.getConfigService(), essentialServiceModule.getMetadataService(), essentialServiceModule.getSessionIdTracker(), DataContainerModuleImpl.this.getPerformanceInfoService(), essentialServiceModule.getUserService(), essentialServiceModule.getSessionProperties(), initModule.getLogger(), workerThreadModule, initModule.getClock());
            }
        });
    }

    @Override // io.embrace.android.embracesdk.injection.DataContainerModule
    public EventService getEventService() {
        return (EventService) this.eventService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataContainerModule
    public PerformanceInfoService getPerformanceInfoService() {
        return (PerformanceInfoService) this.performanceInfoService$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
