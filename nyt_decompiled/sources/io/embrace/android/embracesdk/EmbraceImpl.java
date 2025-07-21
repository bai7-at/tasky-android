package io.embrace.android.embracesdk;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import defpackage.c04;
import defpackage.ey7;
import defpackage.qs2;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerInstaller;
import io.embrace.android.embracesdk.anr.ndk.NativeThreadSamplerService;
import io.embrace.android.embracesdk.capture.crumbs.BreadcrumbService;
import io.embrace.android.embracesdk.capture.crumbs.PushNotificationCaptureService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.capture.webview.WebViewService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import io.embrace.android.embracesdk.event.EmbraceEventService;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.event.LogMessageService;
import io.embrace.android.embracesdk.injection.CoreModule;
import io.embrace.android.embracesdk.injection.CrashModule;
import io.embrace.android.embracesdk.injection.CustomerLogModule;
import io.embrace.android.embracesdk.injection.DataCaptureServiceModule;
import io.embrace.android.embracesdk.injection.DataContainerModule;
import io.embrace.android.embracesdk.injection.DeliveryModule;
import io.embrace.android.embracesdk.injection.EssentialServiceModule;
import io.embrace.android.embracesdk.injection.ModuleInitBootstrapper;
import io.embrace.android.embracesdk.injection.SdkObservabilityModule;
import io.embrace.android.embracesdk.injection.SessionModule;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import io.embrace.android.embracesdk.internal.IdGenerator;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.crash.LastRunCrashVerifier;
import io.embrace.android.embracesdk.internal.spans.EmbraceTracer;
import io.embrace.android.embracesdk.internal.utils.ThrowableUtilsKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.logging.InternalErrorService;
import io.embrace.android.embracesdk.logging.ReportingLoggerAction;
import io.embrace.android.embracesdk.ndk.NativeModule;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.network.EmbraceNetworkRequest;
import io.embrace.android.embracesdk.network.logging.NetworkCaptureService;
import io.embrace.android.embracesdk.network.logging.NetworkLoggingService;
import io.embrace.android.embracesdk.payload.PushNotificationBreadcrumb;
import io.embrace.android.embracesdk.payload.TapBreadcrumb;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.lifecycle.ActivityTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import io.embrace.android.embracesdk.telemetry.TelemetryService;
import io.embrace.android.embracesdk.utils.PropertyUtils;
import io.embrace.android.embracesdk.worker.WorkerName;
import io.embrace.android.embracesdk.worker.WorkerThreadModule;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import kotlin.Pair;

@SuppressLint({"EmbracePublicApiPackageRule"})
/* loaded from: classes5.dex */
final class EmbraceImpl {
    private static final Pattern appIdPattern = Pattern.compile("^[A-Za-z0-9]{5}$");
    private volatile ActivityTracker activityTracker;
    private volatile AnrService anrService;
    private volatile Embrace.AppFramework appFramework;
    private volatile Application application;
    private volatile BreadcrumbService breadcrumbService;
    private Object composeActivityListenerInstance;
    private volatile ConfigService configService;
    private LastRunCrashVerifier crashVerifier;
    private volatile String customAppId;
    private EmbraceInternalInterface embraceInternalInterface;
    private volatile EventService eventService;
    private final InternalEmbraceLogger internalEmbraceLogger;
    private volatile InternalErrorService internalErrorService;
    private InternalInterfaceModule internalInterfaceModule;
    private volatile LogMessageService logMessageService;
    private volatile MetadataService metadataService;
    private final ModuleInitBootstrapper moduleInitBootstrapper;
    private NativeThreadSamplerService nativeThreadSampler;
    private NativeThreadSamplerInstaller nativeThreadSamplerInstaller;
    private volatile NdkService ndkService;
    private volatile NetworkCaptureService networkCaptureService;
    private volatile NetworkLoggingService networkLoggingService;
    private volatile PreferencesService preferencesService;
    private volatile ProcessStateService processStateService;
    private PushNotificationCaptureService pushNotificationService;
    private final Clock sdkClock;
    private volatile SessionIdTracker sessionIdTracker;
    private volatile SessionOrchestrator sessionOrchestrator;
    private volatile SessionPropertiesService sessionPropertiesService;
    private final AtomicBoolean started;
    private volatile TelemetryService telemetryService;
    final EmbraceTracer tracer;
    private final c04 uninitializedSdkInternalInterface;
    private volatile UserService userService;
    private volatile WebViewService webViewService;

    /* renamed from: io.embrace.android.embracesdk.EmbraceImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework;

        static {
            int[] iArr = new int[Embrace.AppFramework.values().length];
            $SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework = iArr;
            try {
                iArr[Embrace.AppFramework.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework[Embrace.AppFramework.REACT_NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework[Embrace.AppFramework.UNITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework[Embrace.AppFramework.FLUTTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    EmbraceImpl(ModuleInitBootstrapper moduleInitBootstrapper) {
        this.started = new AtomicBoolean(false);
        this.moduleInitBootstrapper = moduleInitBootstrapper;
        this.sdkClock = moduleInitBootstrapper.getInitModule().getClock();
        this.internalEmbraceLogger = moduleInitBootstrapper.getInitModule().getLogger();
        this.tracer = moduleInitBootstrapper.getOpenTelemetryModule().getEmbraceTracer();
        this.uninitializedSdkInternalInterface = kotlin.c.a(new qs2() { // from class: io.embrace.android.embracesdk.c
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                EmbraceInternalInterface lambda$new$0;
                lambda$new$0 = EmbraceImpl.this.lambda$new$0();
                return lambda$new$0;
            }
        });
    }

    private boolean checkSdkStarted(String str, boolean z) {
        boolean isStarted = isStarted();
        if (!isStarted) {
            this.internalEmbraceLogger.logSDKNotInitialized(str);
        }
        if (this.telemetryService != null && z) {
            this.telemetryService.onPublicApiCalled(str);
        }
        return isStarted;
    }

    private boolean checkSdkStartedAndLogPublicApiUsage(String str) {
        return checkSdkStarted(str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ EmbraceInternalInterface lambda$new$0() {
        return new UninitializedSdkInternalInterfaceImpl(this.moduleInitBootstrapper.getOpenTelemetryModule().getInternalTracer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ConfigService lambda$start$1() {
        return null;
    }

    private void loadCrashVerifier(CrashModule crashModule, WorkerThreadModule workerThreadModule) {
        LastRunCrashVerifier lastRunCrashVerifier = crashModule.getLastRunCrashVerifier();
        this.crashVerifier = lastRunCrashVerifier;
        lastRunCrashVerifier.readAndCleanMarkerAsync(workerThreadModule.backgroundWorker(WorkerName.BACKGROUND_REGISTRATION));
    }

    private void logNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        if (this.configService.getNetworkBehavior().isUrlEnabled(embraceNetworkRequest.getUrl())) {
            this.networkLoggingService.logNetworkRequest(embraceNetworkRequest);
            onActivityReported();
        }
    }

    private Map<String, Object> normalizeProperties(Map<String, ?> map, InternalEmbraceLogger internalEmbraceLogger) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return null;
        }
        try {
            return PropertyUtils.sanitizeProperties(map, internalEmbraceLogger);
        } catch (Exception e) {
            this.internalEmbraceLogger.logError("Exception occurred while normalizing the properties.", e);
            return hashMap;
        }
    }

    private void onActivityReported() {
        SessionOrchestrator sessionOrchestrator = this.sessionOrchestrator;
        if (sessionOrchestrator != null) {
            sessionOrchestrator.reportBackgroundActivityStateChange();
        }
    }

    private void registerComposeActivityListener(CoreModule coreModule) {
        try {
            this.composeActivityListenerInstance = Class.forName("io.embrace.android.embracesdk.compose.ComposeActivityListener").newInstance();
            coreModule.getApplication().registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.composeActivityListenerInstance);
        } catch (Throwable th) {
            this.internalEmbraceLogger.logError("registerComposeActivityListener error", th);
        }
    }

    private void sampleCurrentThreadDuringAnrs() {
        NativeThreadSamplerInstaller nativeThreadSamplerInstaller;
        try {
            AnrService anrService = this.anrService;
            if (anrService == null || (nativeThreadSamplerInstaller = this.nativeThreadSamplerInstaller) == null) {
                this.internalEmbraceLogger.logWarning("nativeThreadSamplerInstaller not started, cannot sample current thread");
            } else {
                nativeThreadSamplerInstaller.monitorCurrentThread(this.nativeThreadSampler, this.configService, anrService);
            }
        } catch (Exception e) {
            this.internalEmbraceLogger.logError("Failed to sample current thread during ANRs", e);
        }
    }

    private void startImpl(Context context, boolean z, Embrace.AppFramework appFramework, qs2 qs2Var) {
        if (this.application != null) {
            this.internalEmbraceLogger.logWarning("Embrace SDK has already been initialized");
            return;
        }
        if (ApkToolsConfig.IS_SDK_DISABLED) {
            this.internalEmbraceLogger.logInfo("SDK disabled through ApkToolsConfig");
            stop();
            return;
        }
        long now = this.sdkClock.now();
        this.internalEmbraceLogger.logInfo("Starting SDK for framework " + appFramework.name());
        this.moduleInitBootstrapper.init(context, z, appFramework, now, this.customAppId, qs2Var);
        Systrace.startSynchronous("post-services-setup");
        this.telemetryService = this.moduleInitBootstrapper.getInitModule().getTelemetryService();
        CoreModule coreModule = this.moduleInitBootstrapper.getCoreModule();
        this.application = coreModule.getApplication();
        this.appFramework = coreModule.getAppFramework();
        this.preferencesService = this.moduleInitBootstrapper.getAndroidServicesModule().getPreferencesService();
        EssentialServiceModule essentialServiceModule = this.moduleInitBootstrapper.getEssentialServiceModule();
        if (essentialServiceModule.getConfigService().isSdkDisabled()) {
            this.internalEmbraceLogger.logInfo("Interrupting SDK start because it is disabled");
            stop();
            return;
        }
        if (essentialServiceModule.getConfigService().getAutoDataCaptureBehavior().isComposeOnClickEnabled()) {
            registerComposeActivityListener(coreModule);
        }
        this.processStateService = essentialServiceModule.getProcessStateService();
        this.metadataService = essentialServiceModule.getMetadataService();
        this.sessionIdTracker = essentialServiceModule.getSessionIdTracker();
        this.configService = essentialServiceModule.getConfigService();
        this.activityTracker = essentialServiceModule.getActivityLifecycleTracker();
        this.userService = essentialServiceModule.getUserService();
        DataCaptureServiceModule dataCaptureServiceModule = this.moduleInitBootstrapper.getDataCaptureServiceModule();
        this.webViewService = dataCaptureServiceModule.getWebviewService();
        this.breadcrumbService = dataCaptureServiceModule.getBreadcrumbService();
        this.pushNotificationService = dataCaptureServiceModule.getPushNotificationService();
        this.anrService = this.moduleInitBootstrapper.getAnrModule().getAnrService();
        SdkObservabilityModule sdkObservabilityModule = this.moduleInitBootstrapper.getSdkObservabilityModule();
        this.internalErrorService = sdkObservabilityModule.getInternalErrorService();
        sdkObservabilityModule.getInternalErrorService().setConfigService(this.configService);
        DeliveryModule deliveryModule = this.moduleInitBootstrapper.getDeliveryModule();
        CustomerLogModule customerLogModule = this.moduleInitBootstrapper.getCustomerLogModule();
        this.logMessageService = customerLogModule.getLogMessageService();
        this.networkCaptureService = customerLogModule.getNetworkCaptureService();
        this.networkLoggingService = customerLogModule.getNetworkLoggingService();
        NativeModule nativeModule = this.moduleInitBootstrapper.getNativeModule();
        this.ndkService = nativeModule.getNdkService();
        this.nativeThreadSampler = nativeModule.getNativeThreadSamplerService();
        this.nativeThreadSamplerInstaller = nativeModule.getNativeThreadSamplerInstaller();
        DataContainerModule dataContainerModule = this.moduleInitBootstrapper.getDataContainerModule();
        this.eventService = dataContainerModule.getEventService();
        SessionModule sessionModule = this.moduleInitBootstrapper.getSessionModule();
        this.sessionOrchestrator = sessionModule.getSessionOrchestrator();
        this.sessionPropertiesService = sessionModule.getSessionPropertiesService();
        final CrashModule crashModule = this.moduleInitBootstrapper.getCrashModule();
        Systrace.startSynchronous("send-cached-sessions");
        DeliveryService deliveryService = deliveryModule.getDeliveryService();
        Objects.requireNonNull(crashModule);
        deliveryService.sendCachedSessions(new qs2() { // from class: oz1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                return CrashModule.this.getNativeCrashService();
            }
        }, essentialServiceModule.getSessionIdTracker());
        Systrace.endSynchronous();
        loadCrashVerifier(crashModule, this.moduleInitBootstrapper.getWorkerThreadModule());
        InternalInterfaceModuleImpl internalInterfaceModuleImpl = new InternalInterfaceModuleImpl(this.moduleInitBootstrapper.getInitModule(), this.moduleInitBootstrapper.getOpenTelemetryModule(), coreModule, essentialServiceModule, this, crashModule);
        this.internalInterfaceModule = internalInterfaceModuleImpl;
        this.embraceInternalInterface = internalInterfaceModuleImpl.getEmbraceInternalInterface();
        int i = AnonymousClass1.$SwitchMap$io$embrace$android$embracesdk$Embrace$AppFramework[appFramework.ordinal()];
        if (i == 2) {
            this.internalInterfaceModule.getReactNativeInternalInterface();
        } else if (i == 3) {
            this.internalInterfaceModule.getUnityInternalInterface();
        } else if (i == 4) {
            this.internalInterfaceModule.getFlutterInternalInterface();
        }
        this.internalEmbraceLogger.logInfo("Embrace SDK started. App ID: " + essentialServiceModule.getConfigService().getSdkModeBehavior().getAppId() + " Version: " + BuildConfig.VERSION_NAME);
        long now2 = this.sdkClock.now();
        this.started.set(true);
        Systrace.endSynchronous();
        Systrace.startSynchronous("startup-tracking");
        dataCaptureServiceModule.getStartupService().setSdkStartupInfo(now, now2);
        Systrace.endSynchronous();
        if (!essentialServiceModule.getProcessStateService().isInBackground()) {
            dataContainerModule.getEventService().sendStartupMoment();
        }
        this.moduleInitBootstrapper.waitForAsyncInit();
    }

    private void unregisterComposeActivityListener(Application application) {
        try {
            application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) this.composeActivityListenerInstance);
        } catch (Throwable th) {
            this.internalEmbraceLogger.logError("Instantiation error for ComposeActivityListener", th);
        }
    }

    void addBreadcrumb(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("add_breadcrumb")) {
            this.breadcrumbService.logCustom(str, this.sdkClock.now());
            onActivityReported();
        }
    }

    boolean addSessionProperty(String str, String str2, boolean z) {
        if (checkSdkStartedAndLogPublicApiUsage("add_session_property")) {
            return this.sessionPropertiesService.addProperty(str, str2, z);
        }
        return false;
    }

    public void addSpanExporter(ey7 ey7Var) {
        this.moduleInitBootstrapper.getOpenTelemetryModule().getOpenTelemetryConfiguration().addSpanExporter(ey7Var);
    }

    void addUserPersona(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("add_user_persona")) {
            this.userService.addUserPersona(str);
            this.ndkService.onUserInfoUpdate();
        }
    }

    void clearAllUserPersonas() {
        if (checkSdkStartedAndLogPublicApiUsage("clear_user_personas")) {
            this.userService.clearAllUserPersonas();
            this.ndkService.onUserInfoUpdate();
        }
    }

    void clearUserAsPayer() {
        if (checkSdkStartedAndLogPublicApiUsage("clear_user_as_payer")) {
            this.userService.clearUserAsPayer();
            this.ndkService.onUserInfoUpdate();
        }
    }

    void clearUserEmail() {
        if (checkSdkStartedAndLogPublicApiUsage("clear_user_email")) {
            this.userService.clearUserEmail();
            this.ndkService.onUserInfoUpdate();
        }
    }

    void clearUserIdentifier() {
        if (checkSdkStartedAndLogPublicApiUsage("clear_user_identifier")) {
            this.userService.clearUserIdentifier();
        }
    }

    void clearUserPersona(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("clear_user_persona")) {
            this.userService.clearUserPersona(str);
            this.ndkService.onUserInfoUpdate();
        }
    }

    void clearUsername() {
        if (checkSdkStartedAndLogPublicApiUsage("clear_username")) {
            this.userService.clearUsername();
            this.ndkService.onUserInfoUpdate();
        }
    }

    void endAppStartup(Map<String, Object> map) {
        endMoment(EmbraceEventService.STARTUP_EVENT_NAME, null, map);
    }

    void endMoment(String str, String str2, Map<String, Object> map) {
        if (checkSdkStartedAndLogPublicApiUsage("end_moment")) {
            this.eventService.endEvent(str, str2, normalizeProperties(map, this.internalEmbraceLogger));
            onActivityReported();
        }
    }

    void endSession(boolean z) {
        if (checkSdkStartedAndLogPublicApiUsage("end_session")) {
            this.sessionOrchestrator.endSessionWithManual(z);
        }
    }

    boolean endView(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("end_view")) {
            return this.breadcrumbService.endView(str);
        }
        return false;
    }

    String generateW3cTraceparent() {
        return IdGenerator.generateW3CTraceparent();
    }

    ActivityTracker getActivityLifecycleTracker() {
        return this.activityTracker;
    }

    ProcessStateService getActivityService() {
        return this.processStateService;
    }

    Application getApplication() {
        return this.application;
    }

    String getCurrentSessionId() {
        SessionIdTracker sessionIdTracker = this.sessionIdTracker;
        if (sessionIdTracker == null || !checkSdkStarted("get_current_session_id", false)) {
            return null;
        }
        String activeSessionId = sessionIdTracker.getActiveSessionId();
        if (activeSessionId != null) {
            return activeSessionId;
        }
        this.internalEmbraceLogger.logInfo("Session ID is null");
        return null;
    }

    String getDeviceId() {
        return checkSdkStartedAndLogPublicApiUsage("get_device_id") ? this.preferencesService.getDeviceIdentifier() : "";
    }

    EmbraceInternalInterface getEmbraceInternalInterface() {
        EmbraceInternalInterface embraceInternalInterface;
        return (!isStarted() || (embraceInternalInterface = this.embraceInternalInterface) == null) ? (EmbraceInternalInterface) this.uninitializedSdkInternalInterface.getValue() : embraceInternalInterface;
    }

    FlutterInternalInterface getFlutterInternalInterface() {
        InternalInterfaceModule internalInterfaceModule = this.internalInterfaceModule;
        if (internalInterfaceModule != null) {
            return internalInterfaceModule.getFlutterInternalInterface();
        }
        return null;
    }

    InternalErrorService getInternalErrorService() {
        return this.internalErrorService;
    }

    Embrace.LastRunEndState getLastRunEndState() {
        LastRunCrashVerifier lastRunCrashVerifier;
        return (!isStarted() || (lastRunCrashVerifier = this.crashVerifier) == null) ? Embrace.LastRunEndState.INVALID : lastRunCrashVerifier.didLastRunCrash() ? Embrace.LastRunEndState.CRASH : Embrace.LastRunEndState.CLEAN_EXIT;
    }

    MetadataService getMetadataService() {
        return this.metadataService;
    }

    ReactNativeInternalInterface getReactNativeInternalInterface() {
        InternalInterfaceModule internalInterfaceModule = this.internalInterfaceModule;
        if (internalInterfaceModule != null) {
            return internalInterfaceModule.getReactNativeInternalInterface();
        }
        return null;
    }

    Map<String, String> getSessionProperties() {
        if (checkSdkStartedAndLogPublicApiUsage("get_session_properties")) {
            return this.sessionPropertiesService.getProperties();
        }
        return null;
    }

    String getTraceIdHeader() {
        return (this.configService == null || !checkSdkStarted("get_trace_id_header", false)) ? NetworkBehavior.CONFIG_TRACE_ID_HEADER_DEFAULT_VALUE : this.configService.getNetworkBehavior().getTraceIdHeader();
    }

    UnityInternalInterface getUnityInternalInterface() {
        InternalInterfaceModule internalInterfaceModule = this.internalInterfaceModule;
        if (internalInterfaceModule != null) {
            return internalInterfaceModule.getUnityInternalInterface();
        }
        return null;
    }

    void installUnityThreadSampler() {
        if (checkSdkStartedAndLogPublicApiUsage("install_unity_thread_sampler")) {
            sampleCurrentThreadDuringAnrs();
        }
    }

    boolean isStarted() {
        return this.started.get();
    }

    void logCustomStacktrace(StackTraceElement[] stackTraceElementArr, Severity severity, Map<String, ?> map, String str) {
        logMessage(EventType.Companion.fromSeverity(severity), str != null ? str : "", map, stackTraceElementArr, null, LogExceptionType.HANDLED, null, null, null, str);
    }

    void logException(Throwable th, Severity severity, Map<String, ?> map, String str) {
        String message = th.getMessage() != null ? th.getMessage() : "";
        logMessage(EventType.Companion.fromSeverity(severity), str != null ? str : message, map, ThrowableUtilsKt.getSafeStackTrace(th), null, LogExceptionType.HANDLED, null, null, th.getClass().getSimpleName(), message);
    }

    void logInternalError(String str, String str2) {
        if (!checkSdkStartedAndLogPublicApiUsage("log_internal_error") || str == null) {
            return;
        }
        if (str2 != null) {
            str = str + ": " + str2;
        }
        this.internalErrorService.handleInternalError(new ReportingLoggerAction.InternalError(str));
    }

    void logMessage(String str, Severity severity, Map<String, ?> map) {
        logMessage(EventType.Companion.fromSeverity(severity), str, map, null, null, LogExceptionType.NONE, null, null);
    }

    void logPushNotification(String str, String str2, String str3, String str4, Integer num, Integer num2, PushNotificationBreadcrumb.NotificationType notificationType) {
        if (checkSdkStartedAndLogPublicApiUsage("log_push_notification")) {
            this.pushNotificationService.logPushNotification(str, str2, str3, str4, num, num2.intValue(), notificationType);
            onActivityReported();
        }
    }

    void logRnAction(String str, long j, long j2, Map<String, Object> map, int i, String str2) {
        if (checkSdkStartedAndLogPublicApiUsage("log_react_native_action")) {
            this.breadcrumbService.logRnAction(str, j, j2, map, i, str2);
        }
    }

    void logRnView(String str) {
        if (this.appFramework != Embrace.AppFramework.REACT_NATIVE) {
            this.internalEmbraceLogger.logWarning("[Embrace] logRnView is only available on React Native");
        } else if (checkSdkStartedAndLogPublicApiUsage("log RN view")) {
            this.breadcrumbService.logView(str, this.sdkClock.now());
            onActivityReported();
        }
    }

    void logTap(Pair<Float, Float> pair, String str, TapBreadcrumb.TapBreadcrumbType tapBreadcrumbType) {
        if (checkSdkStartedAndLogPublicApiUsage("log_tap")) {
            this.breadcrumbService.logTap(pair, str, this.sdkClock.now(), tapBreadcrumbType);
            onActivityReported();
        }
    }

    void logWebView(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("log_web_view")) {
            this.breadcrumbService.logWebView(str, this.sdkClock.now());
            onActivityReported();
        }
    }

    void recordNetworkRequest(EmbraceNetworkRequest embraceNetworkRequest) {
        if (checkSdkStartedAndLogPublicApiUsage("record_network_request")) {
            logNetworkRequest(embraceNetworkRequest);
        }
    }

    boolean removeSessionProperty(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("remove_session_property")) {
            return this.sessionPropertiesService.removeProperty(str);
        }
        return false;
    }

    boolean setAppId(String str) {
        if (isStarted()) {
            this.internalEmbraceLogger.logError("You must set the custom app ID before the SDK is started.");
            return false;
        }
        if (str.isEmpty()) {
            this.internalEmbraceLogger.logError("App ID cannot be null or empty.");
            return false;
        }
        if (appIdPattern.matcher(str).find()) {
            this.customAppId = str;
            return true;
        }
        this.internalEmbraceLogger.logError("Invalid app ID. Must be a 5-character string with characters from the set [A-Za-z0-9], but it was \"" + str + "\".");
        return false;
    }

    void setProcessStartedByNotification() {
        if (isStarted()) {
            this.eventService.setProcessStartedByNotification();
        }
    }

    void setUserAsPayer() {
        if (checkSdkStartedAndLogPublicApiUsage("set_user_as_payer")) {
            this.userService.setUserAsPayer();
            this.ndkService.onUserInfoUpdate();
        }
    }

    void setUserEmail(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("set_user_email")) {
            this.userService.setUserEmail(str);
            this.ndkService.onUserInfoUpdate();
        }
    }

    void setUserIdentifier(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("set_user_identifier")) {
            this.userService.setUserIdentifier(str);
            this.ndkService.onUserInfoUpdate();
        }
    }

    void setUsername(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("set_username")) {
            this.userService.setUsername(str);
            this.ndkService.onUserInfoUpdate();
        }
    }

    boolean shouldCaptureNetworkCall(String str, String str2) {
        if (!isStarted() || this.networkCaptureService == null) {
            return false;
        }
        return !this.networkCaptureService.getNetworkCaptureRules(str, str2).isEmpty();
    }

    void start(Context context, boolean z, Embrace.AppFramework appFramework) {
        startInternal(context, z, appFramework, new qs2() { // from class: io.embrace.android.embracesdk.b
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                ConfigService lambda$start$1;
                lambda$start$1 = EmbraceImpl.lambda$start$1();
                return lambda$start$1;
            }
        });
    }

    void startInternal(Context context, boolean z, Embrace.AppFramework appFramework, qs2 qs2Var) {
        try {
            Systrace.startSynchronous("sdk-start");
            startImpl(context, z, appFramework, qs2Var);
            Systrace.endSynchronous();
        } catch (Throwable th) {
            this.internalEmbraceLogger.logError("Error occurred while initializing the Embrace SDK. Instrumentation may be disabled.", th, true);
        }
    }

    void startMoment(String str, String str2, Map<String, Object> map) {
        if (checkSdkStartedAndLogPublicApiUsage("start_moment")) {
            this.eventService.startEvent(str, str2, normalizeProperties(map, this.internalEmbraceLogger));
            onActivityReported();
        }
    }

    boolean startView(String str) {
        if (checkSdkStartedAndLogPublicApiUsage("start_view")) {
            return this.breadcrumbService.startView(str);
        }
        return false;
    }

    void stop() {
        if (this.started.compareAndSet(true, false)) {
            this.internalEmbraceLogger.logInfo("Shutting down Embrace SDK.");
            try {
                if (this.composeActivityListenerInstance != null && this.application != null) {
                    unregisterComposeActivityListener(this.application);
                }
                this.application = null;
                this.moduleInitBootstrapper.stopServices();
            } catch (Exception e) {
                this.internalEmbraceLogger.logError("Error while shutting down Embrace SDK", e);
            }
        }
    }

    void trackWebViewPerformance(String str, String str2) {
        if (isStarted() && this.configService.getWebViewVitalsBehavior().isWebViewVitalsEnabled()) {
            this.webViewService.collectWebData(str, str2);
        }
    }

    void logInternalError(Throwable th) {
        if (checkSdkStartedAndLogPublicApiUsage("log_internal_error")) {
            this.internalErrorService.handleInternalError(th);
        }
    }

    void logMessage(EventType eventType, String str, Map<String, ?> map, StackTraceElement[] stackTraceElementArr, String str2, LogExceptionType logExceptionType, String str3, String str4) {
        logMessage(eventType, str, map, stackTraceElementArr, str2, logExceptionType, str3, str4, null, null);
    }

    void logMessage(EventType eventType, String str, Map<String, ?> map, StackTraceElement[] stackTraceElementArr, String str2, LogExceptionType logExceptionType, String str3, String str4, String str5, String str6) {
        if (checkSdkStartedAndLogPublicApiUsage("log_message")) {
            try {
                this.logMessageService.log(str, eventType, logExceptionType, normalizeProperties(map, this.internalEmbraceLogger), stackTraceElementArr, str2, this.appFramework, str3, str4, str5, str6);
                onActivityReported();
            } catch (Exception e) {
                this.internalEmbraceLogger.logDebug("Failed to log message using Embrace SDK.", e);
            }
        }
    }

    EmbraceImpl() {
        this(new ModuleInitBootstrapper());
    }
}
