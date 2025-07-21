package io.embrace.android.embracesdk.injection;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.arch.datasource.DataSource;
import io.embrace.android.embracesdk.arch.datasource.DataSourceState;
import io.embrace.android.embracesdk.capture.aei.AeiDataSource;
import io.embrace.android.embracesdk.capture.aei.AeiDataSourceImpl;
import io.embrace.android.embracesdk.capture.connectivity.NetworkStatusDataSource;
import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbDataSource;
import io.embrace.android.embracesdk.capture.crumbs.PushNotificationDataSource;
import io.embrace.android.embracesdk.capture.crumbs.TapDataSource;
import io.embrace.android.embracesdk.capture.crumbs.ViewDataSource;
import io.embrace.android.embracesdk.capture.crumbs.WebViewUrlDataSource;
import io.embrace.android.embracesdk.capture.memory.MemoryWarningDataSource;
import io.embrace.android.embracesdk.capture.powersave.LowPowerDataSource;
import io.embrace.android.embracesdk.capture.session.SessionPropertiesDataSource;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.utils.BuildVersionChecker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class DataSourceModuleImpl implements DataSourceModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "breadcrumbDataSource", "getBreadcrumbDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "tapDataSource", "getTapDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "pushNotificationDataSource", "getPushNotificationDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "viewDataSource", "getViewDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "webViewUrlDataSource", "getWebViewUrlDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "sessionPropertiesDataSource", "getSessionPropertiesDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "memoryWarningDataSource", "getMemoryWarningDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "applicationExitInfoDataSource", "getApplicationExitInfoDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "aeiService", "getAeiService()Lio/embrace/android/embracesdk/capture/aei/AeiDataSourceImpl;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "lowPowerDataSource", "getLowPowerDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0)), zt6.i(new PropertyReference1Impl(DataSourceModuleImpl.class, "networkStatusDataSource", "getNetworkStatusDataSource()Lio/embrace/android/embracesdk/arch/datasource/DataSourceState;", 0))};
    private final hp6 aeiService$delegate;
    private final DataSourceDelegate applicationExitInfoDataSource$delegate;
    private final DataSourceDelegate breadcrumbDataSource$delegate;
    private final ConfigService configService;
    private final DataSourceDelegate lowPowerDataSource$delegate;
    private final DataSourceDelegate memoryWarningDataSource$delegate;
    private final DataSourceDelegate networkStatusDataSource$delegate;
    private final DataSourceDelegate pushNotificationDataSource$delegate;
    private final DataSourceDelegate sessionPropertiesDataSource$delegate;
    private final DataSourceDelegate tapDataSource$delegate;
    private final List<DataSourceState<?>> values;
    private final DataSourceDelegate viewDataSource$delegate;
    private final DataSourceDelegate webViewUrlDataSource$delegate;

    public DataSourceModuleImpl(final InitModule initModule, CoreModule coreModule, final OpenTelemetryModule openTelemetryModule, final EssentialServiceModule essentialServiceModule, final SystemServiceModule systemServiceModule, final AndroidServicesModule androidServicesModule, final WorkerThreadModule workerThreadModule) {
        zq3.h(initModule, "initModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(openTelemetryModule, "otelModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(systemServiceModule, "systemServiceModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        this.values = new ArrayList();
        this.breadcrumbDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$breadcrumbDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<BreadcrumbDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$breadcrumbDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final BreadcrumbDataSource mo865invoke() {
                        return new BreadcrumbDataSource(EssentialServiceModule.this.getConfigService().getBreadcrumbBehavior(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, null, null, null, 14, null);
            }
        });
        this.tapDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$tapDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<TapDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$tapDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final TapDataSource mo865invoke() {
                        return new TapDataSource(EssentialServiceModule.this.getConfigService().getBreadcrumbBehavior(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, null, null, null, 14, null);
            }
        });
        this.pushNotificationDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$pushNotificationDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<PushNotificationDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$pushNotificationDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final PushNotificationDataSource mo865invoke() {
                        return new PushNotificationDataSource(EssentialServiceModule.this.getConfigService().getBreadcrumbBehavior(), initModule.getClock(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, null, null, null, 14, null);
            }
        });
        this.viewDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$viewDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<ViewDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$viewDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final ViewDataSource mo865invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return new ViewDataSource(configService.getBreadcrumbBehavior(), initModule.getClock(), openTelemetryModule.getSpanService(), initModule.getLogger());
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$viewDataSource$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        return Boolean.valueOf(invoke());
                    }

                    public final boolean invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return configService.getBreadcrumbBehavior().isActivityBreadcrumbCaptureEnabled();
                    }
                }, null, null, 12, null);
            }
        });
        this.webViewUrlDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$webViewUrlDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<WebViewUrlDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$webViewUrlDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final WebViewUrlDataSource mo865invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return new WebViewUrlDataSource(configService.getBreadcrumbBehavior(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$webViewUrlDataSource$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        return Boolean.valueOf(invoke());
                    }

                    public final boolean invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return configService.getBreadcrumbBehavior().isWebViewBreadcrumbCaptureEnabled();
                    }
                }, null, null, 12, null);
            }
        });
        this.sessionPropertiesDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$sessionPropertiesDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<SessionPropertiesDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$sessionPropertiesDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final SessionPropertiesDataSource mo865invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return new SessionPropertiesDataSource(configService.getSessionBehavior(), openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, null, null, null, 14, null);
            }
        });
        this.memoryWarningDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$memoryWarningDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<MemoryWarningDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$memoryWarningDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final MemoryWarningDataSource mo865invoke() {
                        return new MemoryWarningDataSource(openTelemetryModule.getCurrentSessionSpan(), initModule.getLogger());
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$memoryWarningDataSource$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        return Boolean.valueOf(invoke());
                    }

                    public final boolean invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return configService.getAutoDataCaptureBehavior().isMemoryServiceEnabled();
                    }
                }, null, null, 12, null);
            }
        });
        this.applicationExitInfoDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$applicationExitInfoDataSource$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<AeiDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$applicationExitInfoDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final AeiDataSource mo865invoke() {
                        AeiDataSourceImpl aeiService;
                        aeiService = DataSourceModuleImpl.this.getAeiService();
                        return aeiService;
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$applicationExitInfoDataSource$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        return Boolean.valueOf(invoke());
                    }

                    public final boolean invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return configService.isAppExitInfoCaptureEnabled();
                    }
                }, null, null, 12, null);
            }
        });
        this.aeiService$delegate = new SingletonDelegate(LoadType.LAZY, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$aeiService$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AeiDataSourceImpl mo865invoke() {
                if (!BuildVersionChecker.INSTANCE.isAtLeast(30)) {
                    return null;
                }
                return new AeiDataSourceImpl(WorkerThreadModule.this.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION), essentialServiceModule.getConfigService().getAppExitInfoBehavior(), systemServiceModule.getActivityManager(), androidServicesModule.getPreferencesService(), essentialServiceModule.getMetadataService(), essentialServiceModule.getSessionIdTracker(), essentialServiceModule.getUserService(), essentialServiceModule.getLogWriter(), initModule.getLogger(), null, 512, null);
            }
        });
        this.lowPowerDataSource$delegate = dataSourceState(new DataSourceModuleImpl$lowPowerDataSource$2(this, coreModule, workerThreadModule, initModule, systemServiceModule, openTelemetryModule));
        this.networkStatusDataSource$delegate = dataSourceState(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$networkStatusDataSource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final DataSourceState<NetworkStatusDataSource> mo865invoke() {
                return new DataSourceState<>(new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$networkStatusDataSource$2.1
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public final NetworkStatusDataSource mo865invoke() {
                        return new NetworkStatusDataSource(openTelemetryModule.getSpanService(), initModule.getLogger());
                    }
                }, new qs2() { // from class: io.embrace.android.embracesdk.injection.DataSourceModuleImpl$networkStatusDataSource$2.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        return Boolean.valueOf(invoke());
                    }

                    public final boolean invoke() {
                        ConfigService configService;
                        configService = DataSourceModuleImpl.this.configService;
                        return configService.getAutoDataCaptureBehavior().isNetworkConnectivityServiceEnabled();
                    }
                }, null, null, 12, null);
            }
        });
        this.configService = essentialServiceModule.getConfigService();
    }

    private final <T extends DataSource<?>> DataSourceDelegate<T> dataSourceState(qs2 qs2Var) {
        return new DataSourceDelegate<>(qs2Var, this.values);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AeiDataSourceImpl getAeiService() {
        return (AeiDataSourceImpl) this.aeiService$delegate.getValue(this, $$delegatedProperties[8]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<AeiDataSource> getApplicationExitInfoDataSource() {
        return this.applicationExitInfoDataSource$delegate.getValue((Object) this, $$delegatedProperties[7]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<BreadcrumbDataSource> getBreadcrumbDataSource() {
        return this.breadcrumbDataSource$delegate.getValue((Object) this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public List<DataSourceState<?>> getDataSources() {
        return this.values;
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<LowPowerDataSource> getLowPowerDataSource() {
        return this.lowPowerDataSource$delegate.getValue((Object) this, $$delegatedProperties[9]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<MemoryWarningDataSource> getMemoryWarningDataSource() {
        return this.memoryWarningDataSource$delegate.getValue((Object) this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<NetworkStatusDataSource> getNetworkStatusDataSource() {
        return this.networkStatusDataSource$delegate.getValue((Object) this, $$delegatedProperties[10]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<PushNotificationDataSource> getPushNotificationDataSource() {
        return this.pushNotificationDataSource$delegate.getValue((Object) this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<SessionPropertiesDataSource> getSessionPropertiesDataSource() {
        return this.sessionPropertiesDataSource$delegate.getValue((Object) this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<TapDataSource> getTapDataSource() {
        return this.tapDataSource$delegate.getValue((Object) this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<ViewDataSource> getViewDataSource() {
        return this.viewDataSource$delegate.getValue((Object) this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.DataSourceModule
    public DataSourceState<WebViewUrlDataSource> getWebViewUrlDataSource() {
        return this.webViewUrlDataSource$delegate.getValue((Object) this, $$delegatedProperties[4]);
    }
}
