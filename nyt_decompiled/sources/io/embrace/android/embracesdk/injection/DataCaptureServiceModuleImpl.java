package io.embrace.android.embracesdk.injection;

import android.os.PowerManager;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService;
import io.embrace.android.embracesdk.capture.crumbs.PushNotificationCaptureService;
import io.embrace.android.embracesdk.capture.memory.ComponentCallbackService;
import io.embrace.android.embracesdk.capture.memory.EmbraceMemoryService;
import io.embrace.android.embracesdk.capture.memory.MemoryService;
import io.embrace.android.embracesdk.capture.memory.NoOpMemoryService;
import io.embrace.android.embracesdk.capture.startup.AppStartupTraceEmitter;
import io.embrace.android.embracesdk.capture.startup.StartupService;
import io.embrace.android.embracesdk.capture.startup.StartupServiceImpl;
import io.embrace.android.embracesdk.capture.startup.StartupTracker;
import io.embrace.android.embracesdk.capture.thermalstate.EmbraceThermalStatusService;
import io.embrace.android.embracesdk.capture.thermalstate.NoOpThermalStatusService;
import io.embrace.android.embracesdk.capture.thermalstate.ThermalStatusService;
import io.embrace.android.embracesdk.capture.webview.EmbraceWebViewService;
import io.embrace.android.embracesdk.capture.webview.WebViewService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.utils.BuildVersionChecker;
import io.embrace.android.embracesdk.internal.utils.VersionChecker;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class DataCaptureServiceModuleImpl implements DataCaptureServiceModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "memoryService", "getMemoryService()Lio/embrace/android/embracesdk/capture/memory/MemoryService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "componentCallbackService", "getComponentCallbackService()Lio/embrace/android/embracesdk/capture/memory/ComponentCallbackService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "webviewService", "getWebviewService()Lio/embrace/android/embracesdk/capture/webview/WebViewService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "breadcrumbService", "getBreadcrumbService()Lio/embrace/android/embracesdk/capture/crumbs/BreadcrumbService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "pushNotificationService", "getPushNotificationService()Lio/embrace/android/embracesdk/capture/crumbs/PushNotificationCaptureService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "thermalStatusService", "getThermalStatusService()Lio/embrace/android/embracesdk/capture/thermalstate/ThermalStatusService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "startupService", "getStartupService()Lio/embrace/android/embracesdk/capture/startup/StartupService;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "appStartupTraceEmitter", "getAppStartupTraceEmitter()Lio/embrace/android/embracesdk/capture/startup/AppStartupTraceEmitter;", 0)), zt6.i(new PropertyReference1Impl(DataCaptureServiceModuleImpl.class, "startupTracker", "getStartupTracker()Lio/embrace/android/embracesdk/capture/startup/StartupTracker;", 0))};
    private final hp6 appStartupTraceEmitter$delegate;
    private final BackgroundWorker backgroundWorker;
    private final hp6 breadcrumbService$delegate;
    private final hp6 componentCallbackService$delegate;
    private final ConfigService configService;
    private final hp6 memoryService$delegate;
    private final qs2 powerManagerProvider;
    private final hp6 pushNotificationService$delegate;
    private final hp6 startupService$delegate;
    private final hp6 startupTracker$delegate;
    private final hp6 thermalStatusService$delegate;
    private final hp6 webviewService$delegate;

    public DataCaptureServiceModuleImpl(InitModule initModule, OpenTelemetryModule openTelemetryModule, CoreModule coreModule, SystemServiceModule systemServiceModule, EssentialServiceModule essentialServiceModule, WorkerThreadModule workerThreadModule, DataSourceModule dataSourceModule) {
        this(initModule, openTelemetryModule, coreModule, systemServiceModule, essentialServiceModule, workerThreadModule, null, dataSourceModule, 64, null);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public AppStartupTraceEmitter getAppStartupTraceEmitter() {
        return (AppStartupTraceEmitter) this.appStartupTraceEmitter$delegate.getValue(this, $$delegatedProperties[7]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public BreadcrumbService getBreadcrumbService() {
        return (BreadcrumbService) this.breadcrumbService$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public ComponentCallbackService getComponentCallbackService() {
        return (ComponentCallbackService) this.componentCallbackService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public MemoryService getMemoryService() {
        return (MemoryService) this.memoryService$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public PushNotificationCaptureService getPushNotificationService() {
        return (PushNotificationCaptureService) this.pushNotificationService$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public StartupService getStartupService() {
        return (StartupService) this.startupService$delegate.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public StartupTracker getStartupTracker() {
        return (StartupTracker) this.startupTracker$delegate.getValue(this, $$delegatedProperties[8]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public ThermalStatusService getThermalStatusService() {
        return (ThermalStatusService) this.thermalStatusService$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataCaptureServiceModule
    public WebViewService getWebviewService() {
        return (WebViewService) this.webviewService$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public DataCaptureServiceModuleImpl(final InitModule initModule, final OpenTelemetryModule openTelemetryModule, final CoreModule coreModule, final SystemServiceModule systemServiceModule, EssentialServiceModule essentialServiceModule, final WorkerThreadModule workerThreadModule, final VersionChecker versionChecker, final DataSourceModule dataSourceModule) {
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(systemServiceModule, "systemServiceModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(versionChecker, "versionChecker");
        zq3.h(dataSourceModule, "dataSourceModule");
        this.backgroundWorker = workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION);
        this.configService = essentialServiceModule.getConfigService();
        this.powerManagerProvider = new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$powerManagerProvider$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PowerManager mo865invoke() {
                try {
                    Systrace.startSynchronous("power-manager-load");
                    return SystemServiceModule.this.getPowerManager();
                } finally {
                }
            }
        };
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$memoryService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final MemoryService mo865invoke() {
                ConfigService configService;
                configService = DataCaptureServiceModuleImpl.this.configService;
                return configService.getAutoDataCaptureBehavior().isMemoryServiceEnabled() ? new EmbraceMemoryService(initModule.getClock(), new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$memoryService$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final DataSourceModule mo865invoke() {
                        return dataSourceModule;
                    }
                }) : new NoOpMemoryService();
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.memoryService$delegate = new SingletonDelegate(loadType, qs2Var);
        this.componentCallbackService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$componentCallbackService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ComponentCallbackService mo865invoke() {
                try {
                    Systrace.startSynchronous("component-callback-service-init");
                    return new ComponentCallbackService(coreModule.getApplication(), DataCaptureServiceModuleImpl.this.getMemoryService(), initModule.getLogger());
                } finally {
                }
            }
        });
        this.webviewService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$webviewService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceWebViewService mo865invoke() {
                ConfigService configService;
                configService = DataCaptureServiceModuleImpl.this.configService;
                return new EmbraceWebViewService(configService, coreModule.getJsonSerializer(), initModule.getLogger());
            }
        });
        this.breadcrumbService$delegate = new SingletonDelegate(loadType, new DataCaptureServiceModuleImpl$breadcrumbService$2(this, initModule, dataSourceModule));
        this.pushNotificationService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$pushNotificationService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final PushNotificationCaptureService mo865invoke() {
                return new PushNotificationCaptureService(DataCaptureServiceModuleImpl.this.getBreadcrumbService(), initModule.getLogger());
            }
        });
        this.thermalStatusService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$thermalStatusService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ThermalStatusService mo865invoke() {
                ConfigService configService;
                ThermalStatusService noOpThermalStatusService;
                qs2 qs2Var2;
                try {
                    Systrace.startSynchronous("thermal-service-init");
                    configService = DataCaptureServiceModuleImpl.this.configService;
                    if (configService.getAutoDataCaptureBehavior().isThermalStatusCaptureEnabled() && versionChecker.isAtLeast(29)) {
                        BackgroundWorker backgroundWorker = workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION);
                        Clock clock = initModule.getClock();
                        qs2Var2 = DataCaptureServiceModuleImpl.this.powerManagerProvider;
                        noOpThermalStatusService = new EmbraceThermalStatusService(backgroundWorker, clock, qs2Var2);
                    } else {
                        noOpThermalStatusService = new NoOpThermalStatusService();
                    }
                    return noOpThermalStatusService;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        Systrace.endSynchronous();
                    }
                }
            }
        });
        this.startupService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$startupService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final StartupServiceImpl mo865invoke() {
                return new StartupServiceImpl(OpenTelemetryModule.this.getSpanService(), workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION));
            }
        });
        this.appStartupTraceEmitter$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$appStartupTraceEmitter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AppStartupTraceEmitter mo865invoke() {
                return new AppStartupTraceEmitter(initModule.getOpenTelemetryClock(), new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$appStartupTraceEmitter$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final StartupService mo865invoke() {
                        return DataCaptureServiceModuleImpl.this.getStartupService();
                    }
                }, openTelemetryModule.getSpanService(), workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), versionChecker, initModule.getLogger());
            }
        });
        this.startupTracker$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataCaptureServiceModuleImpl$startupTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final StartupTracker mo865invoke() {
                return new StartupTracker(DataCaptureServiceModuleImpl.this.getAppStartupTraceEmitter(), initModule.getLogger(), versionChecker);
            }
        });
    }

    public /* synthetic */ DataCaptureServiceModuleImpl(InitModule initModule, OpenTelemetryModule openTelemetryModule, CoreModule coreModule, SystemServiceModule systemServiceModule, EssentialServiceModule essentialServiceModule, WorkerThreadModule workerThreadModule, VersionChecker versionChecker, DataSourceModule dataSourceModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(initModule, openTelemetryModule, coreModule, systemServiceModule, essentialServiceModule, workerThreadModule, (i & 64) != 0 ? BuildVersionChecker.INSTANCE : versionChecker, dataSourceModule);
    }
}
