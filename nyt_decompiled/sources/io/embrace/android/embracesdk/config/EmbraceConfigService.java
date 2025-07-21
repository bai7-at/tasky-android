package io.embrace.android.embracesdk.config;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.comms.api.ApiService;
import io.embrace.android.embracesdk.config.behavior.AnrBehavior;
import io.embrace.android.embracesdk.config.behavior.AppExitInfoBehavior;
import io.embrace.android.embracesdk.config.behavior.AutoDataCaptureBehavior;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import io.embrace.android.embracesdk.config.behavior.BehaviorThresholdCheck;
import io.embrace.android.embracesdk.config.behavior.BreadcrumbBehavior;
import io.embrace.android.embracesdk.config.behavior.DataCaptureEventBehavior;
import io.embrace.android.embracesdk.config.behavior.LogMessageBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.config.behavior.NetworkSpanForwardingBehavior;
import io.embrace.android.embracesdk.config.behavior.OTelBehavior;
import io.embrace.android.embracesdk.config.behavior.SdkEndpointBehavior;
import io.embrace.android.embracesdk.config.behavior.SdkModeBehavior;
import io.embrace.android.embracesdk.config.behavior.SessionBehavior;
import io.embrace.android.embracesdk.config.behavior.StartupBehavior;
import io.embrace.android.embracesdk.config.behavior.WebViewVitalsBehavior;
import io.embrace.android.embracesdk.config.local.LocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.config.remote.AnrRemoteConfig;
import io.embrace.android.embracesdk.config.remote.BackgroundActivityRemoteConfig;
import io.embrace.android.embracesdk.config.remote.LogRemoteConfig;
import io.embrace.android.embracesdk.config.remote.NetworkSpanForwardingRemoteConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.PropertyReference0Impl;

/* loaded from: classes5.dex */
public final class EmbraceConfigService implements ConfigService, ProcessStateListener {
    private static final long CONFIG_TTL = 3600000;
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_RETRY_WAIT_TIME = 20;
    private static final long MAX_ALLOWED_RETRY_WAIT_TIME = 300;
    private final AnrBehavior anrBehavior;
    private final ApiService apiService;
    private final AppExitInfoBehavior appExitInfoBehavior;
    private final AutoDataCaptureBehavior autoDataCaptureBehavior;
    private final BackgroundActivityBehavior backgroundActivityBehavior;
    private final BackgroundWorker backgroundWorker;
    private final BreadcrumbBehavior breadcrumbBehavior;
    private final Clock clock;
    private volatile RemoteConfig configProp;
    private volatile double configRetrySafeWindow;
    private final DataCaptureEventBehavior dataCaptureEventBehavior;
    private volatile long lastRefreshConfigAttempt;
    private volatile long lastUpdated;
    private final Set<ConfigListener> listeners;
    private final LocalConfig localConfig;
    private final Object lock;
    private final LogMessageBehavior logMessageBehavior;
    private final InternalEmbraceLogger logger;
    private final NetworkBehavior networkBehavior;
    private final NetworkSpanForwardingBehavior networkSpanForwardingBehavior;
    private final OTelBehavior oTelBehavior;
    private final PreferencesService preferencesService;
    private final qs2 remoteSupplier;
    private final SdkEndpointBehavior sdkEndpointBehavior;
    private final SdkModeBehavior sdkModeBehavior;
    private final SessionBehavior sessionBehavior;
    private final StartupBehavior startupBehavior;
    private final BehaviorThresholdCheck thresholdCheck;
    private final WebViewVitalsBehavior webViewVitalsBehavior;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceConfigService(LocalConfig localConfig, ApiService apiService, PreferencesService preferencesService, Clock clock, InternalEmbraceLogger internalEmbraceLogger, BackgroundWorker backgroundWorker, boolean z) {
        this(localConfig, apiService, preferencesService, clock, internalEmbraceLogger, backgroundWorker, z, null, 128, null);
    }

    private final void attemptConfigRefresh() {
        if (configRequiresRefresh() && configRetryIsSafe()) {
            synchronized (this.lock) {
                try {
                    if (configRequiresRefresh() && configRetryIsSafe()) {
                        this.lastRefreshConfigAttempt = this.clock.now();
                        refreshConfig();
                    }
                    ww8 ww8Var = ww8.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean configRequiresRefresh() {
        return this.clock.now() - this.lastUpdated > 3600000;
    }

    private final boolean configRetryIsSafe() {
        return ((double) this.clock.now()) > ((double) this.lastRefreshConfigAttempt) + (this.configRetrySafeWindow * ((double) NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteConfig getConfig() {
        attemptConfigRefresh();
        return this.configProp;
    }

    private final void notifyListeners() {
        Iterator it2 = i.X0(this.listeners).iterator();
        while (it2.hasNext()) {
            try {
                ((ConfigListener) it2.next()).onConfigChange(this);
            } catch (Exception e) {
                this.logger.log("Failed to notify ConfigListener", InternalEmbraceLogger.Severity.DEBUG, e, true);
            }
        }
    }

    private final void performInitialConfigLoad() {
        BackgroundWorker backgroundWorker = this.backgroundWorker;
        final EmbraceConfigService$performInitialConfigLoad$1 embraceConfigService$performInitialConfigLoad$1 = new EmbraceConfigService$performInitialConfigLoad$1(this);
        BackgroundWorker.submit$default(backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$sam$java_lang_Runnable$0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zq3.g(qs2.this.mo865invoke(), "invoke(...)");
            }
        }, 1, (Object) null);
    }

    private final void persistConfig() {
        this.preferencesService.setSdkDisabled(getSdkModeBehavior().isSdkDisabled());
        this.preferencesService.setBackgroundActivityEnabled(getBackgroundActivityBehavior().isEnabled());
    }

    private final void refreshConfig() {
        final RemoteConfig remoteConfig = this.configProp;
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$refreshConfig$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean configRequiresRefresh;
                double d;
                InternalEmbraceLogger internalEmbraceLogger;
                double d2;
                Clock clock;
                ApiService apiService;
                Clock clock2;
                configRequiresRefresh = EmbraceConfigService.this.configRequiresRefresh();
                if (configRequiresRefresh) {
                    try {
                        EmbraceConfigService embraceConfigService = EmbraceConfigService.this;
                        clock = embraceConfigService.clock;
                        embraceConfigService.lastRefreshConfigAttempt = clock.now();
                        apiService = EmbraceConfigService.this.apiService;
                        RemoteConfig config = apiService.getConfig();
                        if (config != null) {
                            EmbraceConfigService.this.updateConfig(remoteConfig, config);
                            EmbraceConfigService embraceConfigService2 = EmbraceConfigService.this;
                            clock2 = embraceConfigService2.clock;
                            embraceConfigService2.setLastUpdated(clock2.now());
                        }
                        EmbraceConfigService.this.configRetrySafeWindow = 20L;
                    } catch (Exception unused) {
                        EmbraceConfigService embraceConfigService3 = EmbraceConfigService.this;
                        d = embraceConfigService3.configRetrySafeWindow;
                        embraceConfigService3.configRetrySafeWindow = Math.min(300L, d * 2);
                        internalEmbraceLogger = EmbraceConfigService.this.logger;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to load SDK config from the server. Trying again in ");
                        d2 = EmbraceConfigService.this.configRetrySafeWindow;
                        sb.append(d2);
                        sb.append(" seconds.");
                        internalEmbraceLogger.log(sb.toString(), InternalEmbraceLogger.Severity.WARNING, null, false);
                    }
                }
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfig(RemoteConfig remoteConfig, RemoteConfig remoteConfig2) {
        if (zq3.c(remoteConfig2, remoteConfig)) {
            return;
        }
        this.configProp = remoteConfig2;
        persistConfig();
        notifyListeners();
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public void addListener(ConfigListener configListener) {
        zq3.h(configListener, "configListener");
        this.listeners.add(configListener);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.logger.log("Shutting down EmbraceConfigService", InternalEmbraceLogger.Severity.DEBUG, null, true);
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public AnrBehavior getAnrBehavior() {
        return this.anrBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public AppExitInfoBehavior getAppExitInfoBehavior() {
        return this.appExitInfoBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public AutoDataCaptureBehavior getAutoDataCaptureBehavior() {
        return this.autoDataCaptureBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public BackgroundActivityBehavior getBackgroundActivityBehavior() {
        return this.backgroundActivityBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public BreadcrumbBehavior getBreadcrumbBehavior() {
        return this.breadcrumbBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public DataCaptureEventBehavior getDataCaptureEventBehavior() {
        return this.dataCaptureEventBehavior;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public LogMessageBehavior getLogMessageBehavior() {
        return this.logMessageBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public NetworkBehavior getNetworkBehavior() {
        return this.networkBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public NetworkSpanForwardingBehavior getNetworkSpanForwardingBehavior() {
        return this.networkSpanForwardingBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public OTelBehavior getOTelBehavior() {
        return this.oTelBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public SdkEndpointBehavior getSdkEndpointBehavior() {
        return this.sdkEndpointBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public SdkModeBehavior getSdkModeBehavior() {
        return this.sdkModeBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public SessionBehavior getSessionBehavior() {
        return this.sessionBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public StartupBehavior getStartupBehavior() {
        return this.startupBehavior;
    }

    public final BehaviorThresholdCheck getThresholdCheck$embrace_android_sdk_release() {
        return this.thresholdCheck;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public WebViewVitalsBehavior getWebViewVitalsBehavior() {
        return this.webViewVitalsBehavior;
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public boolean hasValidRemoteConfig() {
        return !configRequiresRefresh();
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public boolean isAppExitInfoCaptureEnabled() {
        return getAppExitInfoBehavior().isEnabled();
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public boolean isBackgroundActivityCaptureEnabled() {
        return this.preferencesService.getBackgroundActivityEnabled();
    }

    @Override // io.embrace.android.embracesdk.config.ConfigService
    public boolean isSdkDisabled() {
        return this.preferencesService.getSdkDisabled();
    }

    public final void loadConfigFromCache() {
        RemoteConfig remoteConfig = this.apiService.getCachedConfig().getRemoteConfig();
        if (remoteConfig != null) {
            updateConfig(this.configProp, remoteConfig);
        }
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(long j) {
        ProcessStateListener.DefaultImpls.onBackground(this, j);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(boolean z, long j) {
        getConfig();
        Embrace embrace = Embrace.getInstance();
        zq3.g(embrace, "Embrace.getInstance()");
        if (embrace.isStarted() && isSdkDisabled()) {
            this.logger.log("Embrace SDK disabled by config", InternalEmbraceLogger.Severity.INFO, null, true);
            Embrace embrace2 = Embrace.getInstance();
            zq3.g(embrace2, "Embrace.getInstance()");
            embrace2.getInternalInterface().stopSdk();
        }
    }

    public final void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public EmbraceConfigService(final LocalConfig localConfig, ApiService apiService, PreferencesService preferencesService, Clock clock, InternalEmbraceLogger internalEmbraceLogger, BackgroundWorker backgroundWorker, boolean z, BehaviorThresholdCheck behaviorThresholdCheck) {
        zq3.h(localConfig, "localConfig");
        zq3.h(apiService, "apiService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(clock, "clock");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        this.localConfig = localConfig;
        this.apiService = apiService;
        this.preferencesService = preferencesService;
        this.clock = clock;
        this.logger = internalEmbraceLogger;
        this.backgroundWorker = backgroundWorker;
        this.thresholdCheck = behaviorThresholdCheck;
        this.listeners = new CopyOnWriteArraySet();
        this.lock = new Object();
        this.configProp = new RemoteConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
        this.configRetrySafeWindow = DEFAULT_RETRY_WAIT_TIME;
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$remoteSupplier$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final RemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config;
            }
        };
        this.remoteSupplier = qs2Var;
        final SdkLocalConfig sdkConfig = localConfig.getSdkConfig();
        this.backgroundActivityBehavior = new BackgroundActivityBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$backgroundActivityBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getBackgroundActivityConfig();
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$backgroundActivityBehavior$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final BackgroundActivityRemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config.getBackgroundActivityConfig();
            }
        });
        this.autoDataCaptureBehavior = new AutoDataCaptureBehavior(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$autoDataCaptureBehavior$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LocalConfig mo865invoke() {
                LocalConfig localConfig2;
                localConfig2 = EmbraceConfigService.this.localConfig;
                return localConfig2;
            }
        }, qs2Var);
        this.breadcrumbBehavior = new BreadcrumbBehavior(behaviorThresholdCheck, new PropertyReference0Impl(localConfig) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$breadcrumbBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((LocalConfig) this.receiver).getSdkConfig();
            }
        }, qs2Var);
        this.logMessageBehavior = new LogMessageBehavior(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$logMessageBehavior$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LogRemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config.getLogConfig();
            }
        });
        final SdkLocalConfig sdkConfig2 = localConfig.getSdkConfig();
        this.anrBehavior = new AnrBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig2) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$anrBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getAnr();
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$anrBehavior$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final AnrRemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config.getAnrConfig();
            }
        });
        final SdkLocalConfig sdkConfig3 = localConfig.getSdkConfig();
        this.sessionBehavior = new SessionBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig3) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$sessionBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getSessionConfig();
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$sessionBehavior$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final RemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config;
            }
        });
        this.networkBehavior = new NetworkBehavior(behaviorThresholdCheck, new PropertyReference0Impl(localConfig) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$networkBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((LocalConfig) this.receiver).getSdkConfig();
            }
        }, qs2Var);
        final SdkLocalConfig sdkConfig4 = localConfig.getSdkConfig();
        this.startupBehavior = new StartupBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig4) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$startupBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getStartupMoment();
            }
        });
        this.dataCaptureEventBehavior = new DataCaptureEventBehavior(behaviorThresholdCheck, qs2Var);
        this.sdkModeBehavior = new SdkModeBehavior(z, behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$sdkModeBehavior$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final LocalConfig mo865invoke() {
                LocalConfig localConfig2;
                localConfig2 = EmbraceConfigService.this.localConfig;
                return localConfig2;
            }
        }, qs2Var);
        final SdkLocalConfig sdkConfig5 = localConfig.getSdkConfig();
        this.sdkEndpointBehavior = new SdkEndpointBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig5) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$sdkEndpointBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getBaseUrls();
            }
        });
        final SdkLocalConfig sdkConfig6 = localConfig.getSdkConfig();
        this.appExitInfoBehavior = new AppExitInfoBehavior(behaviorThresholdCheck, new PropertyReference0Impl(sdkConfig6) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$appExitInfoBehavior$1
            @Override // defpackage.jv3
            public Object get() {
                return ((SdkLocalConfig) this.receiver).getAppExitInfoConfig();
            }
        }, qs2Var);
        this.networkSpanForwardingBehavior = new NetworkSpanForwardingBehavior(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService$networkSpanForwardingBehavior$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final NetworkSpanForwardingRemoteConfig mo865invoke() {
                RemoteConfig config;
                config = EmbraceConfigService.this.getConfig();
                return config.getNetworkSpanForwardingRemoteConfig();
            }
        });
        this.webViewVitalsBehavior = new WebViewVitalsBehavior(behaviorThresholdCheck, qs2Var);
        this.oTelBehavior = new OTelBehavior(behaviorThresholdCheck, qs2Var);
        performInitialConfigLoad();
        attemptConfigRefresh();
    }

    public /* synthetic */ EmbraceConfigService(LocalConfig localConfig, ApiService apiService, PreferencesService preferencesService, Clock clock, InternalEmbraceLogger internalEmbraceLogger, BackgroundWorker backgroundWorker, boolean z, BehaviorThresholdCheck behaviorThresholdCheck, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(localConfig, apiService, preferencesService, clock, internalEmbraceLogger, backgroundWorker, z, (i & 128) != 0 ? new BehaviorThresholdCheck(new MutablePropertyReference0Impl(preferencesService) { // from class: io.embrace.android.embracesdk.config.EmbraceConfigService.1
            @Override // defpackage.jv3
            public Object get() {
                return ((PreferencesService) this.receiver).getDeviceIdentifier();
            }

            public void set(Object obj) {
                ((PreferencesService) this.receiver).setDeviceIdentifier((String) obj);
            }
        }) : behaviorThresholdCheck);
    }
}
