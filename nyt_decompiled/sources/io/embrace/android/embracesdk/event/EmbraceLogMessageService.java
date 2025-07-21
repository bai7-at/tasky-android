package io.embrace.android.embracesdk.event;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.LogExceptionType;
import io.embrace.android.embracesdk.capture.connectivity.NetworkConnectivityService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.CacheableValue;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.AppInfo;
import io.embrace.android.embracesdk.payload.DeviceInfo;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.NetworkCapturedCall;
import io.embrace.android.embracesdk.payload.NetworkEvent;
import io.embrace.android.embracesdk.payload.Stacktraces;
import io.embrace.android.embracesdk.payload.UserInfo;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.properties.EmbraceSessionProperties;
import io.embrace.android.embracesdk.worker.BackgroundWorker;
import io.embrace.android.embracesdk.worker.TaskPriority;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceLogMessageService implements LogMessageService {
    public static final Companion Companion = new Companion(null);
    private static final int LOG_MESSAGE_UNITY_MAXIMUM_ALLOWED_LENGTH = 16384;
    private final BackgroundWorker backgroundWorker;
    private final Clock clock;
    private final ConfigService configService;
    private final DeliveryService deliveryService;
    private final NavigableMap<Long, String> errorLogIds;
    private final CacheableValue<List<String>> errorLogIdsCache;
    private final GatingService gatingService;
    private final NavigableMap<Long, String> infoLogIds;
    private final CacheableValue<List<String>> infoLogIdsCache;
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final AtomicInteger logsErrorCount;
    private final AtomicInteger logsInfoCount;
    private final AtomicInteger logsWarnCount;
    private final MetadataService metadataService;
    private final NetworkConnectivityService networkConnectivityService;
    private final NavigableMap<Long, String> networkLogIds;
    private final CacheableValue<List<String>> networkLogIdsCache;
    private final SessionIdTracker sessionIdTracker;
    private final EmbraceSessionProperties sessionProperties;
    private final AtomicInteger unhandledExceptionCount;
    private final UserService userService;
    private final NavigableMap<Long, String> warningLogIds;
    private final CacheableValue<List<String>> warningLogIdsCache;

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ List getWrappedStackTrace$default(Companion companion, StackTraceElement[] stackTraceElementArr, int i, Object obj) {
            if ((i & 1) != 0) {
                Thread currentThread = Thread.currentThread();
                zq3.g(currentThread, "Thread.currentThread()");
                stackTraceElementArr = currentThread.getStackTrace();
                zq3.g(stackTraceElementArr, "Thread.currentThread().stackTrace");
            }
            return companion.getWrappedStackTrace(stackTraceElementArr);
        }

        public final List<String> getWrappedStackTrace(StackTraceElement[] stackTraceElementArr) {
            zq3.h(stackTraceElementArr, "stackTraceElements");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                String stackTraceElement2 = stackTraceElement.toString();
                zq3.g(stackTraceElement2, "element.toString()");
                arrayList.add(stackTraceElement2);
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EventType.INFO_LOG.ordinal()] = 1;
            iArr[EventType.WARNING_LOG.ordinal()] = 2;
        }
    }

    public EmbraceLogMessageService(MetadataService metadataService, SessionIdTracker sessionIdTracker, DeliveryService deliveryService, UserService userService, ConfigService configService, EmbraceSessionProperties embraceSessionProperties, InternalEmbraceLogger internalEmbraceLogger, Clock clock, BackgroundWorker backgroundWorker, GatingService gatingService, NetworkConnectivityService networkConnectivityService) {
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(userService, "userService");
        zq3.h(configService, "configService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(clock, "clock");
        zq3.h(backgroundWorker, "backgroundWorker");
        zq3.h(gatingService, "gatingService");
        zq3.h(networkConnectivityService, "networkConnectivityService");
        this.metadataService = metadataService;
        this.sessionIdTracker = sessionIdTracker;
        this.deliveryService = deliveryService;
        this.userService = userService;
        this.configService = configService;
        this.sessionProperties = embraceSessionProperties;
        this.logger = internalEmbraceLogger;
        this.clock = clock;
        this.backgroundWorker = backgroundWorker;
        this.gatingService = gatingService;
        this.networkConnectivityService = networkConnectivityService;
        this.lock = new Object();
        this.infoLogIds = new ConcurrentSkipListMap();
        this.warningLogIds = new ConcurrentSkipListMap();
        this.errorLogIds = new ConcurrentSkipListMap();
        this.networkLogIds = new ConcurrentSkipListMap();
        this.logsInfoCount = new AtomicInteger(0);
        this.logsErrorCount = new AtomicInteger(0);
        this.logsWarnCount = new AtomicInteger(0);
        this.unhandledExceptionCount = new AtomicInteger(0);
        this.infoLogIdsCache = new CacheableValue<>(new qs2() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$infoLogIdsCache$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = EmbraceLogMessageService.this.infoLogIds;
                return Integer.valueOf(navigableMap.size());
            }
        });
        this.warningLogIdsCache = new CacheableValue<>(new qs2() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$warningLogIdsCache$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = EmbraceLogMessageService.this.warningLogIds;
                return Integer.valueOf(navigableMap.size());
            }
        });
        this.errorLogIdsCache = new CacheableValue<>(new qs2() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$errorLogIdsCache$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = EmbraceLogMessageService.this.errorLogIds;
                return Integer.valueOf(navigableMap.size());
            }
        });
        this.networkLogIdsCache = new CacheableValue<>(new qs2() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$networkLogIdsCache$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Object mo865invoke() {
                NavigableMap navigableMap;
                navigableMap = EmbraceLogMessageService.this.networkLogIds;
                return Integer.valueOf(navigableMap.size());
            }
        });
    }

    private final List<String> findLogIds(final long j, final long j2, CacheableValue<List<String>> cacheableValue, final NavigableMap<Long, String> navigableMap) {
        return cacheableValue.value(new qs2() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$findLogIds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final List<String> mo865invoke() {
                return new ArrayList(navigableMap.subMap(Long.valueOf(j), Long.valueOf(j2)).values());
            }
        });
    }

    public static final List<String> getWrappedStackTrace(StackTraceElement[] stackTraceElementArr) {
        return Companion.getWrappedStackTrace(stackTraceElementArr);
    }

    private final String processLogMessage(String str, int i) {
        if (str.length() <= i) {
            return str;
        }
        int i2 = i >= 3 ? i - 3 : 125;
        this.logger.log("Truncating message to " + str.length() + " characters", InternalEmbraceLogger.Severity.WARNING, null, false);
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, i2);
        zq3.g(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }

    static /* synthetic */ String processLogMessage$default(EmbraceLogMessageService embraceLogMessageService, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = embraceLogMessageService.configService.getLogMessageBehavior().getLogMessageMaximumAllowedLength();
        }
        return embraceLogMessageService.processLogMessage(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String processUnityLogMessage(String str) {
        return processLogMessage(str, 16384);
    }

    public final boolean checkIfShouldGateLog(EventType eventType) {
        if (eventType != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
            if (i == 1) {
                return this.configService.getSessionBehavior().shouldGateInfoLog();
            }
            if (i == 2) {
                return this.configService.getSessionBehavior().shouldGateWarnLog();
            }
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.session.MemoryCleanerListener
    public void cleanCollections() {
        this.logsInfoCount.set(0);
        this.logsWarnCount.set(0);
        this.logsErrorCount.set(0);
        this.unhandledExceptionCount.set(0);
        this.infoLogIds.clear();
        this.warningLogIds.clear();
        this.errorLogIds.clear();
        this.networkLogIds.clear();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findErrorLogIds(long j, long j2) {
        return findLogIds(j, j2, this.errorLogIdsCache, this.errorLogIds);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findInfoLogIds(long j, long j2) {
        return findLogIds(j, j2, this.infoLogIdsCache, this.infoLogIds);
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public List<String> findNetworkLogIds(long j, long j2) {
        return findLogIds(j, j2, this.networkLogIdsCache, this.networkLogIds);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public List<String> findWarningLogIds(long j, long j2) {
        return findLogIds(j, j2, this.warningLogIdsCache, this.warningLogIds);
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getErrorLogsAttemptedToSend() {
        return this.logsErrorCount.get();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getInfoLogsAttemptedToSend() {
        return this.logsInfoCount.get();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getUnhandledExceptionsSent() {
        return this.unhandledExceptionCount.get();
    }

    @Override // io.embrace.android.embracesdk.internal.logs.BaseLogService
    public int getWarnLogsAttemptedToSend() {
        return this.logsWarnCount.get();
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public void log(final String str, final EventType eventType, final LogExceptionType logExceptionType, final Map<String, ? extends Object> map, StackTraceElement[] stackTraceElementArr, String str2, final Embrace.AppFramework appFramework, String str3, String str4, final String str5, final String str6) {
        zq3.h(str, "message");
        zq3.h(eventType, TransferTable.COLUMN_TYPE);
        zq3.h(logExceptionType, "logExceptionType");
        zq3.h(appFramework, "framework");
        final long now = this.clock.now();
        final Stacktraces stacktraces = new Stacktraces(stackTraceElementArr != null ? Companion.getWrappedStackTrace(stackTraceElementArr) : Companion.getWrappedStackTrace$default(Companion, null, 1, null), str2, appFramework, str3, str4);
        final UserInfo userInfo = this.userService.getUserInfo();
        BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$log$1
            @Override // java.lang.Runnable
            public final void run() {
                Object obj;
                ConfigService configService;
                InternalEmbraceLogger internalEmbraceLogger;
                AtomicInteger atomicInteger;
                NavigableMap navigableMap;
                ConfigService configService2;
                InternalEmbraceLogger internalEmbraceLogger2;
                NavigableMap navigableMap2;
                AtomicInteger atomicInteger2;
                NavigableMap navigableMap3;
                ConfigService configService3;
                InternalEmbraceLogger internalEmbraceLogger3;
                NavigableMap navigableMap4;
                String processLogMessage$default;
                AtomicInteger atomicInteger3;
                SessionIdTracker sessionIdTracker;
                Clock clock;
                MetadataService metadataService;
                EmbraceSessionProperties embraceSessionProperties;
                MetadataService metadataService2;
                MetadataService metadataService3;
                GatingService gatingService;
                DeliveryService deliveryService;
                InternalEmbraceLogger internalEmbraceLogger4;
                AtomicInteger atomicInteger4;
                AtomicInteger atomicInteger5;
                NavigableMap navigableMap5;
                ConfigService configService4;
                InternalEmbraceLogger internalEmbraceLogger5;
                NavigableMap navigableMap6;
                InternalEmbraceLogger internalEmbraceLogger6;
                obj = EmbraceLogMessageService.this.lock;
                synchronized (obj) {
                    configService = EmbraceLogMessageService.this.configService;
                    if (!configService.getDataCaptureEventBehavior().isLogMessageEnabled(str)) {
                        internalEmbraceLogger6 = EmbraceLogMessageService.this.logger;
                        internalEmbraceLogger6.log("Log message disabled. Ignoring log with message " + str, InternalEmbraceLogger.Severity.WARNING, null, false);
                        return;
                    }
                    String embUuid$default = Uuid.getEmbUuid$default(null, 1, null);
                    EventType eventType2 = eventType;
                    if (eventType2 == EventType.INFO_LOG) {
                        atomicInteger5 = EmbraceLogMessageService.this.logsInfoCount;
                        atomicInteger5.incrementAndGet();
                        navigableMap5 = EmbraceLogMessageService.this.infoLogIds;
                        int size = navigableMap5.size();
                        configService4 = EmbraceLogMessageService.this.configService;
                        if (size >= configService4.getLogMessageBehavior().getInfoLogLimit()) {
                            internalEmbraceLogger5 = EmbraceLogMessageService.this.logger;
                            internalEmbraceLogger5.log("Info Log limit has been reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
                            return;
                        } else {
                            navigableMap6 = EmbraceLogMessageService.this.infoLogIds;
                            navigableMap6.put(Long.valueOf(now), embUuid$default);
                        }
                    } else if (eventType2 == EventType.WARNING_LOG) {
                        atomicInteger2 = EmbraceLogMessageService.this.logsWarnCount;
                        atomicInteger2.incrementAndGet();
                        navigableMap3 = EmbraceLogMessageService.this.warningLogIds;
                        int size2 = navigableMap3.size();
                        configService3 = EmbraceLogMessageService.this.configService;
                        if (size2 >= configService3.getLogMessageBehavior().getWarnLogLimit()) {
                            internalEmbraceLogger3 = EmbraceLogMessageService.this.logger;
                            internalEmbraceLogger3.log("Warning Log limit has been reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
                            return;
                        } else {
                            navigableMap4 = EmbraceLogMessageService.this.warningLogIds;
                            navigableMap4.put(Long.valueOf(now), embUuid$default);
                        }
                    } else {
                        if (eventType2 != EventType.ERROR_LOG) {
                            internalEmbraceLogger = EmbraceLogMessageService.this.logger;
                            internalEmbraceLogger.log("Unknown log level " + eventType, InternalEmbraceLogger.Severity.WARNING, null, false);
                            return;
                        }
                        atomicInteger = EmbraceLogMessageService.this.logsErrorCount;
                        atomicInteger.incrementAndGet();
                        navigableMap = EmbraceLogMessageService.this.errorLogIds;
                        int size3 = navigableMap.size();
                        configService2 = EmbraceLogMessageService.this.configService;
                        if (size3 >= configService2.getLogMessageBehavior().getErrorLogLimit()) {
                            internalEmbraceLogger2 = EmbraceLogMessageService.this.logger;
                            internalEmbraceLogger2.log("Error Log limit has been reached.", InternalEmbraceLogger.Severity.WARNING, null, false);
                            return;
                        } else {
                            navigableMap2 = EmbraceLogMessageService.this.errorLogIds;
                            navigableMap2.put(Long.valueOf(now), embUuid$default);
                        }
                    }
                    Embrace.AppFramework appFramework2 = appFramework;
                    if (appFramework2 == Embrace.AppFramework.UNITY) {
                        processLogMessage$default = EmbraceLogMessageService.this.processUnityLogMessage(str);
                        if (logExceptionType == LogExceptionType.UNHANDLED) {
                            atomicInteger4 = EmbraceLogMessageService.this.unhandledExceptionCount;
                            atomicInteger4.incrementAndGet();
                        }
                    } else if (appFramework2 == Embrace.AppFramework.FLUTTER) {
                        processLogMessage$default = EmbraceLogMessageService.processLogMessage$default(EmbraceLogMessageService.this, str, 0, 2, null);
                        if (logExceptionType == LogExceptionType.UNHANDLED) {
                            atomicInteger3 = EmbraceLogMessageService.this.unhandledExceptionCount;
                            atomicInteger3.incrementAndGet();
                        }
                    } else {
                        processLogMessage$default = EmbraceLogMessageService.processLogMessage$default(EmbraceLogMessageService.this, str, 0, 2, null);
                    }
                    String str7 = processLogMessage$default;
                    sessionIdTracker = EmbraceLogMessageService.this.sessionIdTracker;
                    String activeSessionId = sessionIdTracker.getActiveSessionId();
                    String embUuid$default2 = Uuid.getEmbUuid$default(null, 1, null);
                    EventType eventType3 = eventType;
                    clock = EmbraceLogMessageService.this.clock;
                    Long valueOf = Long.valueOf(clock.now());
                    Boolean bool = Boolean.FALSE;
                    metadataService = EmbraceLogMessageService.this.metadataService;
                    String appState = metadataService.getAppState();
                    Map map2 = map;
                    embraceSessionProperties = EmbraceLogMessageService.this.sessionProperties;
                    Event event = new Event(str7, embUuid$default, embUuid$default2, activeSessionId, eventType3, valueOf, null, bool, null, appState, map2, embraceSessionProperties.get(), null, logExceptionType.getValue$embrace_android_sdk_release(), str5, str6, Integer.valueOf(appFramework.getValue()));
                    metadataService2 = EmbraceLogMessageService.this.metadataService;
                    DeviceInfo deviceInfo = metadataService2.getDeviceInfo();
                    metadataService3 = EmbraceLogMessageService.this.metadataService;
                    EventMessage eventMessage = new EventMessage(event, null, deviceInfo, metadataService3.getAppInfo(), userInfo, null, stacktraces, 13, null);
                    if (EmbraceLogMessageService.this.checkIfShouldGateLog(eventType)) {
                        internalEmbraceLogger4 = EmbraceLogMessageService.this.logger;
                        internalEmbraceLogger4.log(eventType + " was gated by config. The event wasnot sent.", InternalEmbraceLogger.Severity.DEBUG, null, true);
                        return;
                    }
                    gatingService = EmbraceLogMessageService.this.gatingService;
                    EventMessage gateEventMessage = gatingService.gateEventMessage(eventMessage);
                    deliveryService = EmbraceLogMessageService.this.deliveryService;
                    deliveryService.sendLog(gateEventMessage);
                    ww8 ww8Var = ww8.a;
                }
            }
        }, 1, (Object) null);
    }

    @Override // io.embrace.android.embracesdk.event.LogMessageService
    public void logNetwork(final NetworkCapturedCall networkCapturedCall) {
        final long now = this.clock.now();
        if (networkCapturedCall == null) {
            this.logger.log("NetworkCaptureCall is null, nothing to log", InternalEmbraceLogger.Severity.DEBUG, null, true);
            return;
        }
        try {
            BackgroundWorker.submit$default(this.backgroundWorker, (TaskPriority) null, new Runnable() { // from class: io.embrace.android.embracesdk.event.EmbraceLogMessageService$logNetwork$1
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    NavigableMap navigableMap;
                    SessionIdTracker sessionIdTracker;
                    MetadataService metadataService;
                    MetadataService metadataService2;
                    MetadataService metadataService3;
                    NetworkConnectivityService networkConnectivityService;
                    DeliveryService deliveryService;
                    obj = EmbraceLogMessageService.this.lock;
                    synchronized (obj) {
                        String embUuid$default = Uuid.getEmbUuid$default(null, 1, null);
                        navigableMap = EmbraceLogMessageService.this.networkLogIds;
                        navigableMap.put(Long.valueOf(now), embUuid$default);
                        sessionIdTracker = EmbraceLogMessageService.this.sessionIdTracker;
                        String activeSessionId = sessionIdTracker.getActiveSessionId();
                        metadataService = EmbraceLogMessageService.this.metadataService;
                        String appId = metadataService.getAppId();
                        metadataService2 = EmbraceLogMessageService.this.metadataService;
                        AppInfo appInfo = metadataService2.getAppInfo();
                        metadataService3 = EmbraceLogMessageService.this.metadataService;
                        String deviceId = metadataService3.getDeviceId();
                        NetworkCapturedCall networkCapturedCall2 = networkCapturedCall;
                        String timestamp = new Timestamp(now).toString();
                        zq3.g(timestamp, "Timestamp(networkEventTimestamp).toString()");
                        networkConnectivityService = EmbraceLogMessageService.this.networkConnectivityService;
                        NetworkEvent networkEvent = new NetworkEvent(appId, appInfo, deviceId, embUuid$default, networkCapturedCall2, timestamp, networkConnectivityService.getIpAddress(), activeSessionId);
                        deliveryService = EmbraceLogMessageService.this.deliveryService;
                        deliveryService.sendNetworkCall(networkEvent);
                        ww8 ww8Var = ww8.a;
                    }
                }
            }, 1, (Object) null);
        } catch (Exception e) {
            this.logger.log("Failed to log network call using Embrace SDK.", InternalEmbraceLogger.Severity.DEBUG, e, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbraceLogMessageService(MetadataService metadataService, SessionIdTracker sessionIdTracker, DeliveryService deliveryService, UserService userService, ConfigService configService, EmbraceSessionProperties embraceSessionProperties, InternalEmbraceLogger internalEmbraceLogger, Clock clock, GatingService gatingService, NetworkConnectivityService networkConnectivityService, BackgroundWorker backgroundWorker) {
        this(metadataService, sessionIdTracker, deliveryService, userService, configService, embraceSessionProperties, internalEmbraceLogger, clock, backgroundWorker, gatingService, networkConnectivityService);
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(userService, "userService");
        zq3.h(configService, "configService");
        zq3.h(embraceSessionProperties, "sessionProperties");
        zq3.h(internalEmbraceLogger, "logger");
        zq3.h(clock, "clock");
        zq3.h(gatingService, "sessionGatingService");
        zq3.h(networkConnectivityService, "networkConnectivityService");
        zq3.h(backgroundWorker, "backgroundWorker");
    }
}
