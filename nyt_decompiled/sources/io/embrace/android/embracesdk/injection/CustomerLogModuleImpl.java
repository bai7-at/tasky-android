package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.event.EmbraceLogMessageService;
import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.internal.logs.CompositeLogService;
import io.embrace.android.embracesdk.internal.logs.EmbraceLogService;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.internal.logs.LogOrchestratorImpl;
import io.embrace.android.embracesdk.internal.logs.LogService;
import io.embrace.android.embracesdk.network.logging.EmbraceDomainCountLimiter;
import io.embrace.android.embracesdk.network.logging.EmbraceNetworkCaptureService;
import io.embrace.android.embracesdk.network.logging.EmbraceNetworkLoggingService;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureDataSource;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureDataSourceImpl;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureService;
import io.embrace.android.embracesdk.network.logging.NetworkLoggingService;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class CustomerLogModuleImpl implements CustomerLogModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "networkCaptureService", "getNetworkCaptureService()Lio/embrace/android/embracesdk/network/logging/NetworkCaptureService;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "networkCaptureDataSource", "getNetworkCaptureDataSource()Lio/embrace/android/embracesdk/network/logging/NetworkCaptureDataSource;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "embraceDomainCountLimiter", "getEmbraceDomainCountLimiter()Lio/embrace/android/embracesdk/network/logging/EmbraceDomainCountLimiter;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "networkLoggingService", "getNetworkLoggingService()Lio/embrace/android/embracesdk/network/logging/NetworkLoggingService;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "v1LogService", "getV1LogService()Lio/embrace/android/embracesdk/event/LogMessageService;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "v2LogService", "getV2LogService()Lio/embrace/android/embracesdk/internal/logs/LogService;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "logMessageService", "getLogMessageService()Lio/embrace/android/embracesdk/event/LogMessageService;", 0)), zt6.i(new PropertyReference1Impl(CustomerLogModuleImpl.class, "logOrchestrator", "getLogOrchestrator()Lio/embrace/android/embracesdk/internal/logs/LogOrchestrator;", 0))};
    private final hp6 embraceDomainCountLimiter$delegate;
    private final hp6 logMessageService$delegate;
    private final hp6 logOrchestrator$delegate;
    private final hp6 networkCaptureDataSource$delegate;
    private final hp6 networkCaptureService$delegate;
    private final hp6 networkLoggingService$delegate;
    private final hp6 v1LogService$delegate;
    private final hp6 v2LogService$delegate;

    public CustomerLogModuleImpl(final InitModule initModule, final CoreModule coreModule, final OpenTelemetryModule openTelemetryModule, final AndroidServicesModule androidServicesModule, final EssentialServiceModule essentialServiceModule, final DeliveryModule deliveryModule, final WorkerThreadModule workerThreadModule, final PayloadModule payloadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(deliveryModule, "deliveryModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(payloadModule, "payloadModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$networkCaptureService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceNetworkCaptureService mo865invoke() {
                return new EmbraceNetworkCaptureService(essentialServiceModule.getMetadataService(), essentialServiceModule.getSessionIdTracker(), androidServicesModule.getPreferencesService(), CustomerLogModuleImpl.this.getLogMessageService(), essentialServiceModule.getConfigService(), coreModule.getJsonSerializer(), initModule.getLogger());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.networkCaptureService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.networkCaptureDataSource$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$networkCaptureDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NetworkCaptureDataSourceImpl mo865invoke() {
                return new NetworkCaptureDataSourceImpl(EssentialServiceModule.this.getLogWriter(), initModule.getLogger());
            }
        });
        this.embraceDomainCountLimiter$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$embraceDomainCountLimiter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceDomainCountLimiter mo865invoke() {
                return new EmbraceDomainCountLimiter(EssentialServiceModule.this.getConfigService(), initModule.getLogger());
            }
        });
        this.networkLoggingService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$networkLoggingService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceNetworkLoggingService mo865invoke() {
                EmbraceDomainCountLimiter embraceDomainCountLimiter;
                embraceDomainCountLimiter = CustomerLogModuleImpl.this.getEmbraceDomainCountLimiter();
                return new EmbraceNetworkLoggingService(embraceDomainCountLimiter, CustomerLogModuleImpl.this.getNetworkCaptureService(), openTelemetryModule.getSpanService());
            }
        });
        this.v1LogService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$v1LogService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceLogMessageService mo865invoke() {
                return new EmbraceLogMessageService(EssentialServiceModule.this.getMetadataService(), EssentialServiceModule.this.getSessionIdTracker(), deliveryModule.getDeliveryService(), EssentialServiceModule.this.getUserService(), EssentialServiceModule.this.getConfigService(), EssentialServiceModule.this.getSessionProperties(), initModule.getLogger(), initModule.getClock(), EssentialServiceModule.this.getGatingService(), EssentialServiceModule.this.getNetworkConnectivityService(), workerThreadModule.backgroundWorker(WorkerName.REMOTE_LOGGING));
            }
        });
        this.v2LogService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$v2LogService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceLogService mo865invoke() {
                return new EmbraceLogService(EssentialServiceModule.this.getLogWriter(), EssentialServiceModule.this.getConfigService(), coreModule.getAppFramework(), EssentialServiceModule.this.getSessionProperties(), workerThreadModule.backgroundWorker(WorkerName.REMOTE_LOGGING), initModule.getLogger(), initModule.getClock());
            }
        });
        this.logMessageService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$logMessageService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final CompositeLogService mo865invoke() {
                return new CompositeLogService(new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$logMessageService$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final LogMessageService mo865invoke() {
                        LogMessageService v1LogService;
                        v1LogService = CustomerLogModuleImpl.this.getV1LogService();
                        return v1LogService;
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$logMessageService$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final LogService mo865invoke() {
                        LogService v2LogService;
                        v2LogService = CustomerLogModuleImpl.this.getV2LogService();
                        return v2LogService;
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$logMessageService$2.3
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final NetworkCaptureDataSource mo865invoke() {
                        return CustomerLogModuleImpl.this.getNetworkCaptureDataSource();
                    }
                }, essentialServiceModule.getConfigService(), initModule.getLogger(), coreModule.getJsonSerializer());
            }
        });
        this.logOrchestrator$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.CustomerLogModuleImpl$logOrchestrator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LogOrchestratorImpl mo865invoke() {
                return new LogOrchestratorImpl(WorkerThreadModule.this.scheduledWorker(WorkerName.REMOTE_LOGGING), initModule.getClock(), openTelemetryModule.getLogSink(), deliveryModule.getDeliveryService(), payloadModule.getLogEnvelopeSource());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmbraceDomainCountLimiter getEmbraceDomainCountLimiter() {
        return (EmbraceDomainCountLimiter) this.embraceDomainCountLimiter$delegate.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogMessageService getV1LogService() {
        return (LogMessageService) this.v1LogService$delegate.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LogService getV2LogService() {
        return (LogService) this.v2LogService$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.CustomerLogModule
    public LogMessageService getLogMessageService() {
        return (LogMessageService) this.logMessageService$delegate.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.CustomerLogModule
    public LogOrchestrator getLogOrchestrator() {
        return (LogOrchestrator) this.logOrchestrator$delegate.getValue(this, $$delegatedProperties[7]);
    }

    @Override // io.embrace.android.embracesdk.injection.CustomerLogModule
    public NetworkCaptureDataSource getNetworkCaptureDataSource() {
        return (NetworkCaptureDataSource) this.networkCaptureDataSource$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.CustomerLogModule
    public NetworkCaptureService getNetworkCaptureService() {
        return (NetworkCaptureService) this.networkCaptureService$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.CustomerLogModule
    public NetworkLoggingService getNetworkLoggingService() {
        return (NetworkLoggingService) this.networkLoggingService$delegate.getValue(this, $$delegatedProperties[3]);
    }
}
