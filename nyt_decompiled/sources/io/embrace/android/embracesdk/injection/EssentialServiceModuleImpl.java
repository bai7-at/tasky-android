package io.embrace.android.embracesdk.injection;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Debug;
import android.view.WindowManager;
import defpackage.c04;
import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.arch.destination.LogWriter;
import io.embrace.android.embracesdk.arch.destination.LogWriterImpl;
import io.embrace.android.embracesdk.capture.connectivity.EmbraceNetworkConnectivityService;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.capture.cpu.CpuInfoDelegate;
import io.embrace.android.embracesdk.capture.cpu.EmbraceCpuInfoDelegate;
import io.embrace.android.embracesdk.capture.metadata.AppEnvironment;
import io.embrace.android.embracesdk.capture.metadata.EmbraceMetadataService;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.orientation.NoOpOrientationService;
import io.embrace.android.embracesdk.capture.orientation.OrientationService;
import io.embrace.android.embracesdk.capture.user.EmbraceUserService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.api.ApiClient;
import io.embrace.android.embracesdk.comms.api.ApiClientImpl;
import io.embrace.android.embracesdk.comms.api.ApiService;
import io.embrace.android.embracesdk.comms.api.EmbraceApiUrlBuilder;
import io.embrace.android.embracesdk.comms.delivery.EmbracePendingApiCallsSender;
import io.embrace.android.embracesdk.comms.delivery.PendingApiCallsSender;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.EmbraceConfigService;
import io.embrace.android.embracesdk.config.LocalConfigParser;
import io.embrace.android.embracesdk.config.behavior.BehaviorThresholdCheck;
import io.embrace.android.embracesdk.config.behavior.SdkEndpointBehavior;
import io.embrace.android.embracesdk.config.local.LocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.gating.EmbraceGatingService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.AndroidResourcesService;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.DeviceArchitectureImpl;
import io.embrace.android.embracesdk.internal.SharedObjectLoader;
import io.embrace.android.embracesdk.internal.SystemInfo;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.EmbraceMemoryCleanerService;
import io.embrace.android.embracesdk.session.MemoryCleanerService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.id.SessionIdTrackerImpl;
import io.embrace.android.embracesdk.session.lifecycle.ActivityLifecycleTracker;
import io.embrace.android.embracesdk.session.lifecycle.EmbraceProcessStateService;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.ScheduledWorker;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class EssentialServiceModuleImpl implements EssentialServiceModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "memoryCleanerService", "getMemoryCleanerService()Lio/embrace/android/embracesdk/session/MemoryCleanerService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "orientationService", "getOrientationService()Lio/embrace/android/embracesdk/capture/orientation/OrientationService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "processStateService", "getProcessStateService()Lio/embrace/android/embracesdk/session/lifecycle/ProcessStateService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "activityLifecycleTracker", "getActivityLifecycleTracker()Lio/embrace/android/embracesdk/session/lifecycle/ActivityLifecycleTracker;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "configService", "getConfigService()Lio/embrace/android/embracesdk/config/ConfigService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "sharedObjectLoader", "getSharedObjectLoader()Lio/embrace/android/embracesdk/internal/SharedObjectLoader;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "cpuInfoDelegate", "getCpuInfoDelegate()Lio/embrace/android/embracesdk/capture/cpu/CpuInfoDelegate;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "deviceArchitecture", "getDeviceArchitecture()Lio/embrace/android/embracesdk/internal/DeviceArchitecture;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "hostedSdkVersionInfo", "getHostedSdkVersionInfo()Lio/embrace/android/embracesdk/capture/metadata/HostedSdkVersionInfo;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "metadataService", "getMetadataService()Lio/embrace/android/embracesdk/capture/metadata/MetadataService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "urlBuilder", "getUrlBuilder()Lio/embrace/android/embracesdk/comms/api/EmbraceApiUrlBuilder;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "gatingService", "getGatingService()Lio/embrace/android/embracesdk/gating/GatingService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "userService", "getUserService()Lio/embrace/android/embracesdk/capture/user/UserService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "networkConnectivityService", "getNetworkConnectivityService()Lio/embrace/android/embracesdk/capture/connectivity/NetworkConnectivityService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "pendingApiCallsSender", "getPendingApiCallsSender()Lio/embrace/android/embracesdk/comms/delivery/PendingApiCallsSender;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "apiService", "getApiService()Lio/embrace/android/embracesdk/comms/api/ApiService;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "apiClient", "getApiClient()Lio/embrace/android/embracesdk/comms/api/ApiClient;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "sessionIdTracker", "getSessionIdTracker()Lio/embrace/android/embracesdk/session/id/SessionIdTracker;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "sessionProperties", "getSessionProperties()Lio/embrace/android/embracesdk/session/properties/EmbraceSessionProperties;", 0)), zt6.i(new PropertyReference1Impl(EssentialServiceModuleImpl.class, "logWriter", "getLogWriter()Lio/embrace/android/embracesdk/arch/destination/LogWriter;", 0))};
    private final hp6 activityLifecycleTracker$delegate;
    private final hp6 apiClient$delegate;
    private final hp6 apiService$delegate;
    private final String appId;
    private final BackgroundWorker backgroundWorker;
    private final hp6 configService$delegate;
    private final qs2 configServiceProvider;
    private final hp6 cpuInfoDelegate$delegate;
    private final hp6 deviceArchitecture$delegate;
    private final hp6 gatingService$delegate;
    private final hp6 hostedSdkVersionInfo$delegate;
    private final c04 lazyAppVersionCode;
    private final c04 lazyAppVersionName;
    private final c04 lazyDeviceId;
    private final c04 lazyPackageInfo;
    private final LocalConfig localConfig;
    private final hp6 logWriter$delegate;
    private final hp6 memoryCleanerService$delegate;
    private final hp6 metadataService$delegate;
    private final hp6 networkConnectivityService$delegate;
    private final BackgroundWorker networkRequestWorker;
    private final hp6 orientationService$delegate;
    private final hp6 pendingApiCallsSender$delegate;
    private final ScheduledWorker pendingApiCallsWorker;
    private final hp6 processStateService$delegate;
    private final hp6 sessionIdTracker$delegate;
    private final hp6 sessionProperties$delegate;
    private final hp6 sharedObjectLoader$delegate;
    private final BehaviorThresholdCheck thresholdCheck;
    private final hp6 urlBuilder$delegate;
    private final hp6 userService$delegate;

    public EssentialServiceModuleImpl(final InitModule initModule, final OpenTelemetryModule openTelemetryModule, final CoreModule coreModule, WorkerThreadModule workerThreadModule, final SystemServiceModule systemServiceModule, final AndroidServicesModule androidServicesModule, final StorageModule storageModule, String str, final boolean z, final qs2 qs2Var, qs2 qs2Var2) {
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(workerThreadModule, "workerThreadModule");
        zq3.h(systemServiceModule, "systemServiceModule");
        zq3.h(androidServicesModule, "androidServicesModule");
        zq3.h(storageModule, "storageModule");
        zq3.h(qs2Var, "dataSourceModuleProvider");
        zq3.h(qs2Var2, "configServiceProvider");
        this.configServiceProvider = qs2Var2;
        try {
            Systrace.startSynchronous("local-config-init");
            AndroidResourcesService resources = coreModule.getResources();
            String packageName = coreModule.getContext().getPackageName();
            zq3.g(packageName, "coreModule.context.packageName");
            LocalConfig fromResources = LocalConfigParser.fromResources(resources, packageName, str, coreModule.getJsonSerializer(), initModule.getLogger());
            Systrace.endSynchronous();
            this.localConfig = fromResources;
            this.lazyPackageInfo = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$lazyPackageInfo$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final PackageInfo mo865invoke() {
                    return CoreModule.this.getPackageInfo();
                }
            });
            this.lazyAppVersionName = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$lazyAppVersionName$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    c04 c04Var;
                    try {
                        c04Var = EssentialServiceModuleImpl.this.lazyPackageInfo;
                        String str2 = ((PackageInfo) c04Var.getValue()).versionName.toString();
                        int length = str2.length() - 1;
                        int i = 0;
                        boolean z2 = false;
                        while (i <= length) {
                            boolean z3 = zq3.j(str2.charAt(!z2 ? i : length), 32) <= 0;
                            if (z2) {
                                if (!z3) {
                                    break;
                                }
                                length--;
                            } else if (z3) {
                                i++;
                            } else {
                                z2 = true;
                            }
                        }
                        return str2.subSequence(i, length + 1).toString();
                    } catch (Exception unused) {
                        return "UNKNOWN";
                    }
                }
            });
            this.lazyAppVersionCode = c.a(new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$lazyAppVersionCode$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    c04 c04Var;
                    try {
                        c04Var = EssentialServiceModuleImpl.this.lazyPackageInfo;
                        return String.valueOf(((PackageInfo) c04Var.getValue()).versionCode);
                    } catch (Exception unused) {
                        return "UNKNOWN";
                    }
                }
            });
            this.appId = fromResources.getAppId();
            final PreferencesService preferencesService = androidServicesModule.getPreferencesService();
            this.lazyDeviceId = c.a(new MutablePropertyReference0Impl(preferencesService) { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$lazyDeviceId$1
                @Override // defpackage.jv3
                public Object get() {
                    return ((PreferencesService) this.receiver).getDeviceIdentifier();
                }

                public void set(Object obj) {
                    ((PreferencesService) this.receiver).setDeviceIdentifier((String) obj);
                }
            });
            final PreferencesService preferencesService2 = androidServicesModule.getPreferencesService();
            this.thresholdCheck = new BehaviorThresholdCheck(new MutablePropertyReference0Impl(preferencesService2) { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$thresholdCheck$1
                @Override // defpackage.jv3
                public Object get() {
                    return ((PreferencesService) this.receiver).getDeviceIdentifier();
                }

                public void set(Object obj) {
                    ((PreferencesService) this.receiver).setDeviceIdentifier((String) obj);
                }
            });
            WorkerName workerName = WorkerName.BACKGROUND_REGISTRATION;
            this.backgroundWorker = workerThreadModule.backgroundWorker(workerName);
            this.networkRequestWorker = workerThreadModule.backgroundWorker(WorkerName.NETWORK_REQUEST);
            this.pendingApiCallsWorker = workerThreadModule.scheduledWorker(workerName);
            qs2 qs2Var3 = new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$memoryCleanerService$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceMemoryCleanerService mo865invoke() {
                    return new EmbraceMemoryCleanerService(InitModule.this.getLogger());
                }
            };
            LoadType loadType = LoadType.LAZY;
            this.memoryCleanerService$delegate = new SingletonDelegate(loadType, qs2Var3);
            this.orientationService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$orientationService$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final NoOpOrientationService mo865invoke() {
                    return new NoOpOrientationService();
                }
            });
            this.processStateService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$processStateService$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceProcessStateService mo865invoke() {
                    try {
                        Systrace.startSynchronous("process-state-service-init");
                        return new EmbraceProcessStateService(InitModule.this.getClock(), InitModule.this.getLogger());
                    } finally {
                    }
                }
            });
            this.activityLifecycleTracker$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$activityLifecycleTracker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final ActivityLifecycleTracker mo865invoke() {
                    return new ActivityLifecycleTracker(coreModule.getApplication(), EssentialServiceModuleImpl.this.getOrientationService(), initModule.getLogger());
                }
            });
            this.configService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$configService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final ConfigService mo865invoke() {
                    qs2 qs2Var4;
                    LocalConfig localConfig;
                    BackgroundWorker backgroundWorker;
                    BehaviorThresholdCheck behaviorThresholdCheck;
                    try {
                        Systrace.startSynchronous("config-service-init");
                        qs2Var4 = EssentialServiceModuleImpl.this.configServiceProvider;
                        ConfigService configService = (ConfigService) qs2Var4.mo865invoke();
                        if (configService == null) {
                            localConfig = EssentialServiceModuleImpl.this.localConfig;
                            ApiService apiService = EssentialServiceModuleImpl.this.getApiService();
                            PreferencesService preferencesService3 = androidServicesModule.getPreferencesService();
                            Clock clock = initModule.getClock();
                            InternalEmbraceLogger logger = initModule.getLogger();
                            backgroundWorker = EssentialServiceModuleImpl.this.backgroundWorker;
                            boolean isDebug = coreModule.isDebug();
                            behaviorThresholdCheck = EssentialServiceModuleImpl.this.thresholdCheck;
                            configService = new EmbraceConfigService(localConfig, apiService, preferencesService3, clock, logger, backgroundWorker, isDebug, behaviorThresholdCheck);
                        }
                        return configService;
                    } finally {
                    }
                }
            });
            this.sharedObjectLoader$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$sharedObjectLoader$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final SharedObjectLoader mo865invoke() {
                    return new SharedObjectLoader(InitModule.this.getLogger());
                }
            });
            this.cpuInfoDelegate$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$cpuInfoDelegate$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceCpuInfoDelegate mo865invoke() {
                    return new EmbraceCpuInfoDelegate(EssentialServiceModuleImpl.this.getSharedObjectLoader(), initModule.getLogger());
                }
            });
            this.deviceArchitecture$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$deviceArchitecture$2
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final DeviceArchitectureImpl mo865invoke() {
                    return new DeviceArchitectureImpl();
                }
            });
            this.hostedSdkVersionInfo$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$hostedSdkVersionInfo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final HostedSdkVersionInfo mo865invoke() {
                    return new HostedSdkVersionInfo(AndroidServicesModule.this.getPreferencesService(), coreModule.getAppFramework());
                }
            });
            this.metadataService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$metadataService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceMetadataService mo865invoke() {
                    BackgroundWorker backgroundWorker;
                    c04 c04Var;
                    c04 c04Var2;
                    try {
                        Systrace.startSynchronous("metadata-service-init");
                        EmbraceMetadataService.Companion companion = EmbraceMetadataService.Companion;
                        Context context = coreModule.getContext();
                        ApplicationInfo applicationInfo = coreModule.getContext().getApplicationInfo();
                        zq3.g(applicationInfo, "coreModule.context.applicationInfo");
                        AppEnvironment.Environment environment = new AppEnvironment(applicationInfo).getEnvironment();
                        SystemInfo systemInfo = initModule.getSystemInfo();
                        BuildInfo buildInfo = coreModule.getBuildInfo();
                        ConfigService configService = EssentialServiceModuleImpl.this.getConfigService();
                        Embrace.AppFramework appFramework = coreModule.getAppFramework();
                        PreferencesService preferencesService3 = androidServicesModule.getPreferencesService();
                        ProcessStateService processStateService = EssentialServiceModuleImpl.this.getProcessStateService();
                        backgroundWorker = EssentialServiceModuleImpl.this.backgroundWorker;
                        StorageStatsManager storageManager = systemServiceModule.getStorageManager();
                        WindowManager windowManager = systemServiceModule.getWindowManager();
                        Clock clock = initModule.getClock();
                        CpuInfoDelegate cpuInfoDelegate = EssentialServiceModuleImpl.this.getCpuInfoDelegate();
                        DeviceArchitecture deviceArchitecture = EssentialServiceModuleImpl.this.getDeviceArchitecture();
                        c04Var = EssentialServiceModuleImpl.this.lazyAppVersionName;
                        c04Var2 = EssentialServiceModuleImpl.this.lazyAppVersionCode;
                        return companion.ofContext(context, environment, systemInfo, buildInfo, configService, appFramework, preferencesService3, processStateService, backgroundWorker, storageManager, windowManager, clock, cpuInfoDelegate, deviceArchitecture, c04Var, c04Var2, EssentialServiceModuleImpl.this.getHostedSdkVersionInfo(), initModule.getLogger());
                    } finally {
                    }
                }
            });
            this.urlBuilder$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$urlBuilder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceApiUrlBuilder mo865invoke() {
                    BehaviorThresholdCheck behaviorThresholdCheck;
                    LocalConfig localConfig;
                    String str2;
                    String data;
                    String str3;
                    String str4;
                    c04 c04Var;
                    c04 c04Var2;
                    String str5;
                    try {
                        Systrace.startSynchronous("url-builder-init");
                        behaviorThresholdCheck = EssentialServiceModuleImpl.this.thresholdCheck;
                        localConfig = EssentialServiceModuleImpl.this.localConfig;
                        final SdkLocalConfig sdkConfig = localConfig.getSdkConfig();
                        SdkEndpointBehavior sdkEndpointBehavior = new SdkEndpointBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig) { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$urlBuilder$2$1$sdkEndpointBehavior$1
                            @Override // defpackage.jv3
                            public Object get() {
                                return ((SdkLocalConfig) this.receiver).getBaseUrls();
                            }
                        });
                        if (!coreModule.isDebug() || !z || (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger())) {
                            str2 = EssentialServiceModuleImpl.this.appId;
                            data = sdkEndpointBehavior.getData(str2);
                            String str6 = data;
                            str3 = EssentialServiceModuleImpl.this.appId;
                            String config = sdkEndpointBehavior.getConfig(str3);
                            str4 = EssentialServiceModuleImpl.this.appId;
                            c04Var = EssentialServiceModuleImpl.this.lazyDeviceId;
                            c04Var2 = EssentialServiceModuleImpl.this.lazyAppVersionName;
                            return new EmbraceApiUrlBuilder(str6, config, str4, c04Var, c04Var2);
                        }
                        str5 = EssentialServiceModuleImpl.this.appId;
                        data = sdkEndpointBehavior.getDataDev(str5);
                        String str62 = data;
                        str3 = EssentialServiceModuleImpl.this.appId;
                        String config2 = sdkEndpointBehavior.getConfig(str3);
                        str4 = EssentialServiceModuleImpl.this.appId;
                        c04Var = EssentialServiceModuleImpl.this.lazyDeviceId;
                        c04Var2 = EssentialServiceModuleImpl.this.lazyAppVersionName;
                        return new EmbraceApiUrlBuilder(str62, config2, str4, c04Var, c04Var2);
                    } finally {
                    }
                }
            });
            this.gatingService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$gatingService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceGatingService mo865invoke() {
                    return new EmbraceGatingService(EssentialServiceModuleImpl.this.getConfigService(), initModule.getLogger());
                }
            });
            this.userService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$userService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceUserService mo865invoke() {
                    try {
                        Systrace.startSynchronous("user-service-init");
                        return new EmbraceUserService(AndroidServicesModule.this.getPreferencesService(), initModule.getLogger());
                    } finally {
                    }
                }
            });
            this.networkConnectivityService$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$networkConnectivityService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceNetworkConnectivityService mo865invoke() {
                    BackgroundWorker backgroundWorker;
                    try {
                        Systrace.startSynchronous("network-connectivity-service-init");
                        Context context = coreModule.getContext();
                        Clock clock = initModule.getClock();
                        backgroundWorker = EssentialServiceModuleImpl.this.backgroundWorker;
                        return new EmbraceNetworkConnectivityService(context, clock, backgroundWorker, initModule.getLogger(), systemServiceModule.getConnectivityManager(), qs2Var);
                    } finally {
                    }
                }
            });
            this.pendingApiCallsSender$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$pendingApiCallsSender$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbracePendingApiCallsSender mo865invoke() {
                    ScheduledWorker scheduledWorker;
                    try {
                        Systrace.startSynchronous("pending-call-sender-init");
                        NetworkConnectivityService networkConnectivityService = EssentialServiceModuleImpl.this.getNetworkConnectivityService();
                        scheduledWorker = EssentialServiceModuleImpl.this.pendingApiCallsWorker;
                        return new EmbracePendingApiCallsSender(networkConnectivityService, scheduledWorker, storageModule.getDeliveryCacheManager(), initModule.getClock(), initModule.getLogger());
                    } finally {
                    }
                }
            });
            this.apiService$delegate = new SingletonDelegate(loadType, new EssentialServiceModuleImpl$apiService$2(this, coreModule, storageModule, initModule));
            this.apiClient$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$apiClient$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final ApiClientImpl mo865invoke() {
                    return new ApiClientImpl(InitModule.this.getLogger());
                }
            });
            this.sessionIdTracker$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$sessionIdTracker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final SessionIdTrackerImpl mo865invoke() {
                    return new SessionIdTrackerImpl(SystemServiceModule.this.getActivityManager(), initModule.getLogger());
                }
            });
            this.sessionProperties$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$sessionProperties$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final EmbraceSessionProperties mo865invoke() {
                    try {
                        Systrace.startSynchronous("session-properties-init");
                        return new EmbraceSessionProperties(androidServicesModule.getPreferencesService(), EssentialServiceModuleImpl.this.getConfigService(), initModule.getLogger());
                    } finally {
                    }
                }
            });
            this.logWriter$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl$logWriter$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final LogWriterImpl mo865invoke() {
                    return new LogWriterImpl(openTelemetryModule.getLogger(), EssentialServiceModuleImpl.this.getSessionIdTracker(), EssentialServiceModuleImpl.this.getMetadataService());
                }
            });
        } finally {
        }
    }

    private static /* synthetic */ void getLazyAppVersionCode$annotations() {
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public ActivityLifecycleTracker getActivityLifecycleTracker() {
        return (ActivityLifecycleTracker) this.activityLifecycleTracker$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public ApiClient getApiClient() {
        return (ApiClient) this.apiClient$delegate.getValue(this, $$delegatedProperties[16]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public ApiService getApiService() {
        return (ApiService) this.apiService$delegate.getValue(this, $$delegatedProperties[15]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public ConfigService getConfigService() {
        return (ConfigService) this.configService$delegate.getValue(this, $$delegatedProperties[4]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public CpuInfoDelegate getCpuInfoDelegate() {
        return (CpuInfoDelegate) this.cpuInfoDelegate$delegate.getValue(this, $$delegatedProperties[6]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public DeviceArchitecture getDeviceArchitecture() {
        return (DeviceArchitecture) this.deviceArchitecture$delegate.getValue(this, $$delegatedProperties[7]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public GatingService getGatingService() {
        return (GatingService) this.gatingService$delegate.getValue(this, $$delegatedProperties[11]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public HostedSdkVersionInfo getHostedSdkVersionInfo() {
        return (HostedSdkVersionInfo) this.hostedSdkVersionInfo$delegate.getValue(this, $$delegatedProperties[8]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public LogWriter getLogWriter() {
        return (LogWriter) this.logWriter$delegate.getValue(this, $$delegatedProperties[19]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public MemoryCleanerService getMemoryCleanerService() {
        return (MemoryCleanerService) this.memoryCleanerService$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public MetadataService getMetadataService() {
        return (MetadataService) this.metadataService$delegate.getValue(this, $$delegatedProperties[9]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public NetworkConnectivityService getNetworkConnectivityService() {
        return (NetworkConnectivityService) this.networkConnectivityService$delegate.getValue(this, $$delegatedProperties[13]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public OrientationService getOrientationService() {
        return (OrientationService) this.orientationService$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public PendingApiCallsSender getPendingApiCallsSender() {
        return (PendingApiCallsSender) this.pendingApiCallsSender$delegate.getValue(this, $$delegatedProperties[14]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public ProcessStateService getProcessStateService() {
        return (ProcessStateService) this.processStateService$delegate.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public SessionIdTracker getSessionIdTracker() {
        return (SessionIdTracker) this.sessionIdTracker$delegate.getValue(this, $$delegatedProperties[17]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public EmbraceSessionProperties getSessionProperties() {
        return (EmbraceSessionProperties) this.sessionProperties$delegate.getValue(this, $$delegatedProperties[18]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public SharedObjectLoader getSharedObjectLoader() {
        return (SharedObjectLoader) this.sharedObjectLoader$delegate.getValue(this, $$delegatedProperties[5]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public EmbraceApiUrlBuilder getUrlBuilder() {
        return (EmbraceApiUrlBuilder) this.urlBuilder$delegate.getValue(this, $$delegatedProperties[10]);
    }

    @Override // io.embrace.android.embracesdk.injection.EssentialServiceModule
    public UserService getUserService() {
        return (UserService) this.userService$delegate.getValue(this, $$delegatedProperties[12]);
    }

    public /* synthetic */ EssentialServiceModuleImpl(InitModule initModule, OpenTelemetryModule openTelemetryModule, CoreModule coreModule, WorkerThreadModule workerThreadModule, SystemServiceModule systemServiceModule, AndroidServicesModule androidServicesModule, StorageModule storageModule, String str, boolean z, qs2 qs2Var, qs2 qs2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(initModule, openTelemetryModule, coreModule, workerThreadModule, systemServiceModule, androidServicesModule, storageModule, str, z, qs2Var, (i & 1024) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.injection.EssentialServiceModuleImpl.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var2);
    }
}
