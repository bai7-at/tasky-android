package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.arch.DataCaptureOrchestrator;
import io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import io.embrace.android.embracesdk.session.caching.PeriodicBackgroundActivityCacher;
import io.embrace.android.embracesdk.session.caching.PeriodicSessionCacher;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.message.PayloadFactory;
import io.embrace.android.embracesdk.session.message.PayloadFactoryImpl;
import io.embrace.android.embracesdk.session.message.V1PayloadMessageCollator;
import io.embrace.android.embracesdk.session.message.V2PayloadMessageCollator;
import io.embrace.android.embracesdk.session.orchestrator.OrchestratorBoundaryDelegate;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionPropertiesService;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class SessionModuleImpl implements SessionModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "v1PayloadMessageCollator", "getV1PayloadMessageCollator()Lio/embrace/android/embracesdk/session/message/V1PayloadMessageCollator;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "v2PayloadMessageCollator", "getV2PayloadMessageCollator()Lio/embrace/android/embracesdk/session/message/V2PayloadMessageCollator;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "sessionPropertiesService", "getSessionPropertiesService()Lio/embrace/android/embracesdk/session/properties/SessionPropertiesService;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "ndkService", "getNdkService()Lio/embrace/android/embracesdk/ndk/NdkService;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "periodicSessionCacher", "getPeriodicSessionCacher()Lio/embrace/android/embracesdk/session/caching/PeriodicSessionCacher;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "periodicBackgroundActivityCacher", "getPeriodicBackgroundActivityCacher()Lio/embrace/android/embracesdk/session/caching/PeriodicBackgroundActivityCacher;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "payloadFactory", "getPayloadFactory()Lio/embrace/android/embracesdk/session/message/PayloadFactory;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "boundaryDelegate", "getBoundaryDelegate()Lio/embrace/android/embracesdk/session/orchestrator/OrchestratorBoundaryDelegate;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "dataCaptureOrchestrator", "getDataCaptureOrchestrator()Lio/embrace/android/embracesdk/arch/DataCaptureOrchestrator;", 0)), zt6.i(new PropertyReference1Impl(SessionModuleImpl.class, "sessionOrchestrator", "getSessionOrchestrator()Lio/embrace/android/embracesdk/session/orchestrator/SessionOrchestrator;", 0))};
    private final hp6 boundaryDelegate$delegate;
    private final hp6 dataCaptureOrchestrator$delegate;
    private final hp6 ndkService$delegate;
    private final hp6 payloadFactory$delegate;
    private final hp6 periodicBackgroundActivityCacher$delegate;
    private final hp6 periodicSessionCacher$delegate;
    private final hp6 sessionOrchestrator$delegate;
    private final hp6 sessionPropertiesService$delegate;
    private final hp6 v1PayloadMessageCollator$delegate;
    private final hp6 v2PayloadMessageCollator$delegate;

    public SessionModuleImpl(final InitModule initModule, final OpenTelemetryModule openTelemetryModule, final AndroidServicesModule androidServicesModule, final EssentialServiceModule essentialServiceModule, final NativeModule nativeModule, final DataContainerModule dataContainerModule, final DeliveryModule deliveryModule, final DataCaptureServiceModule dataCaptureServiceModule, final CustomerLogModule customerLogModule, final SdkObservabilityModule sdkObservabilityModule, final WorkerThreadModule workerThreadModule, final DataSourceModule dataSourceModule, final PayloadModule payloadModule, final AnrModule anrModule) {
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(nativeModule, "nativeModule");
        zq3.h(dataContainerModule, "dataContainerModule");
        zq3.h(deliveryModule, "deliveryModule");
        zq3.h(dataCaptureServiceModule, "dataCaptureServiceModule");
        zq3.h(customerLogModule, "customerLogModule");
        zq3.h(sdkObservabilityModule, "sdkObservabilityModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(dataSourceModule, "dataSourceModule");
        zq3.h(payloadModule, "payloadModule");
        zq3.h(anrModule, "anrModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$v1PayloadMessageCollator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final V1PayloadMessageCollator mo865invoke() {
                return new V1PayloadMessageCollator(essentialServiceModule.getGatingService(), essentialServiceModule.getConfigService(), essentialServiceModule.getMetadataService(), dataContainerModule.getEventService(), customerLogModule.getLogMessageService(), sdkObservabilityModule.getInternalErrorService(), dataContainerModule.getPerformanceInfoService(), dataCaptureServiceModule.getWebviewService(), dataCaptureServiceModule.getThermalStatusService(), nativeModule.getNativeThreadSamplerService(), dataCaptureServiceModule.getBreadcrumbService(), essentialServiceModule.getUserService(), androidServicesModule.getPreferencesService(), openTelemetryModule.getSpanRepository(), openTelemetryModule.getSpanSink(), openTelemetryModule.getCurrentSessionSpan(), SessionModuleImpl.this.getSessionPropertiesService(), dataCaptureServiceModule.getStartupService(), anrModule.getAnrOtelMapper(), initModule.getLogger());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.v1PayloadMessageCollator$delegate = new SingletonDelegate(loadType, qs2Var);
        this.v2PayloadMessageCollator$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$v2PayloadMessageCollator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final V2PayloadMessageCollator mo865invoke() {
                return new V2PayloadMessageCollator(essentialServiceModule.getGatingService(), SessionModuleImpl.this.getV1PayloadMessageCollator(), payloadModule.getSessionEnvelopeSource(), initModule.getLogger());
            }
        });
        this.sessionPropertiesService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$sessionPropertiesService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceSessionPropertiesService mo865invoke() {
                return new EmbraceSessionPropertiesService(NativeModule.this.getNdkService(), essentialServiceModule.getSessionProperties(), new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$sessionPropertiesService$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final SessionPropertiesDataSource mo865invoke() {
                        return dataSourceModule.getSessionPropertiesDataSource().getDataSource();
                    }
                });
            }
        });
        this.ndkService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$ndkService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NdkService mo865invoke() {
                if (EssentialServiceModule.this.getConfigService().getAutoDataCaptureBehavior().isNdkEnabled()) {
                    return nativeModule.getNdkService();
                }
                return null;
            }
        });
        this.periodicSessionCacher$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$periodicSessionCacher$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PeriodicSessionCacher mo865invoke() {
                return new PeriodicSessionCacher(WorkerThreadModule.this.scheduledWorker(WorkerName.PERIODIC_CACHE), initModule.getLogger());
            }
        });
        this.periodicBackgroundActivityCacher$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$periodicBackgroundActivityCacher$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PeriodicBackgroundActivityCacher mo865invoke() {
                return new PeriodicBackgroundActivityCacher(InitModule.this.getClock(), workerThreadModule.scheduledWorker(WorkerName.PERIODIC_CACHE), InitModule.this.getLogger());
            }
        });
        this.payloadFactory$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$payloadFactory$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PayloadFactoryImpl mo865invoke() {
                return new PayloadFactoryImpl(SessionModuleImpl.this.getV1PayloadMessageCollator(), SessionModuleImpl.this.getV2PayloadMessageCollator(), essentialServiceModule.getConfigService(), initModule.getLogger());
            }
        });
        this.boundaryDelegate$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$boundaryDelegate$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final OrchestratorBoundaryDelegate mo865invoke() {
                NdkService ndkService;
                MemoryCleanerService memoryCleanerService = essentialServiceModule.getMemoryCleanerService();
                UserService userService = essentialServiceModule.getUserService();
                ndkService = SessionModuleImpl.this.getNdkService();
                return new OrchestratorBoundaryDelegate(memoryCleanerService, userService, ndkService, essentialServiceModule.getSessionProperties(), sdkObservabilityModule.getInternalErrorService(), essentialServiceModule.getNetworkConnectivityService());
            }
        });
        this.dataCaptureOrchestrator$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$dataCaptureOrchestrator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataCaptureOrchestrator mo865invoke() {
                DataCaptureOrchestrator dataCaptureOrchestrator = new DataCaptureOrchestrator(DataSourceModule.this.getDataSources(), initModule.getLogger());
                essentialServiceModule.getConfigService().addListener(dataCaptureOrchestrator);
                return dataCaptureOrchestrator;
            }
        });
        this.sessionOrchestrator$delegate = new SingletonDelegate(LoadType.EAGER, new qs2() { // from class: io.embrace.android.embracesdk.injection.SessionModuleImpl$sessionOrchestrator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionOrchestratorImpl mo865invoke() {
                OrchestratorBoundaryDelegate boundaryDelegate;
                ProcessStateService processStateService = essentialServiceModule.getProcessStateService();
                PayloadFactory payloadFactory = SessionModuleImpl.this.getPayloadFactory();
                Clock clock = initModule.getClock();
                ConfigService configService = essentialServiceModule.getConfigService();
                SessionIdTracker sessionIdTracker = essentialServiceModule.getSessionIdTracker();
                boundaryDelegate = SessionModuleImpl.this.getBoundaryDelegate();
                return new SessionOrchestratorImpl(processStateService, payloadFactory, clock, configService, sessionIdTracker, boundaryDelegate, deliveryModule.getDeliveryService(), SessionModuleImpl.this.getPeriodicSessionCacher(), SessionModuleImpl.this.getPeriodicBackgroundActivityCacher(), SessionModuleImpl.this.getDataCaptureOrchestrator(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrchestratorBoundaryDelegate getBoundaryDelegate() {
        return (OrchestratorBoundaryDelegate) this.boundaryDelegate$delegate.getValue(this, $$delegatedProperties[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NdkService getNdkService() {
        return (NdkService) this.ndkService$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public DataCaptureOrchestrator getDataCaptureOrchestrator() {
        return (DataCaptureOrchestrator) this.dataCaptureOrchestrator$delegate.getValue(this, $$delegatedProperties[8]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public PayloadFactory getPayloadFactory() {
        return (PayloadFactory) this.payloadFactory$delegate.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public PeriodicBackgroundActivityCacher getPeriodicBackgroundActivityCacher() {
        return (PeriodicBackgroundActivityCacher) this.periodicBackgroundActivityCacher$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public PeriodicSessionCacher getPeriodicSessionCacher() {
        return (PeriodicSessionCacher) this.periodicSessionCacher$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public SessionOrchestrator getSessionOrchestrator() {
        return (SessionOrchestrator) this.sessionOrchestrator$delegate.getValue(this, $$delegatedProperties[9]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public SessionPropertiesService getSessionPropertiesService() {
        return (SessionPropertiesService) this.sessionPropertiesService$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public V1PayloadMessageCollator getV1PayloadMessageCollator() {
        return (V1PayloadMessageCollator) this.v1PayloadMessageCollator$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.SessionModule
    public V2PayloadMessageCollator getV2PayloadMessageCollator() {
        return (V2PayloadMessageCollator) this.v2PayloadMessageCollator$delegate.getValue(this, $$delegatedProperties[1]);
    }
}
