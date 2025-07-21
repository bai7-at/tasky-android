package io.embrace.android.embracesdk.capture.crash;

import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.anr.AnrService;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.capture.user.UserService;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.crash.CrashFileMarker;
import io.embrace.android.embracesdk.internal.logs.LogOrchestrator;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.ndk.NdkService;
import io.embrace.android.embracesdk.payload.Crash;
import io.embrace.android.embracesdk.payload.Event;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.JsException;
import io.embrace.android.embracesdk.payload.extensions.CrashFactory;
import io.embrace.android.embracesdk.prefs.PreferencesService;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator;
import io.embrace.android.embracesdk.session.properties.SessionPropertiesService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceCrashService implements CrashService {
    private static final String CRASH_REPORT_EVENT_NAME = "_crash_report";
    public static final Companion Companion = new Companion(null);
    private final AnrService anrService;
    private final Clock clock;
    private final CrashFileMarker crashMarker;
    private final DeliveryService deliveryService;
    private final EventService eventService;
    private final GatingService gatingService;
    private JsException jsException;
    private final LogOrchestrator logOrchestrator;
    private final InternalEmbraceLogger logger;
    private boolean mainCrashHandled;
    private final MetadataService metadataService;
    private final NdkService ndkService;
    private final PreferencesService preferencesService;
    private final SessionIdTracker sessionIdTracker;
    private final SessionOrchestrator sessionOrchestrator;
    private final SessionPropertiesService sessionPropertiesService;
    private final UserService userService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceCrashService(LogOrchestrator logOrchestrator, SessionOrchestrator sessionOrchestrator, SessionPropertiesService sessionPropertiesService, MetadataService metadataService, SessionIdTracker sessionIdTracker, DeliveryService deliveryService, UserService userService, EventService eventService, AnrService anrService, NdkService ndkService, GatingService gatingService, PreferencesService preferencesService, CrashFileMarker crashFileMarker, Clock clock, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(logOrchestrator, "logOrchestrator");
        zq3.h(sessionOrchestrator, "sessionOrchestrator");
        zq3.h(sessionPropertiesService, "sessionPropertiesService");
        zq3.h(metadataService, "metadataService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(userService, "userService");
        zq3.h(eventService, "eventService");
        zq3.h(ndkService, "ndkService");
        zq3.h(gatingService, "gatingService");
        zq3.h(preferencesService, "preferencesService");
        zq3.h(crashFileMarker, "crashMarker");
        zq3.h(clock, "clock");
        zq3.h(internalEmbraceLogger, "logger");
        this.logOrchestrator = logOrchestrator;
        this.sessionOrchestrator = sessionOrchestrator;
        this.sessionPropertiesService = sessionPropertiesService;
        this.metadataService = metadataService;
        this.sessionIdTracker = sessionIdTracker;
        this.deliveryService = deliveryService;
        this.userService = userService;
        this.eventService = eventService;
        this.anrService = anrService;
        this.ndkService = ndkService;
        this.gatingService = gatingService;
        this.preferencesService = preferencesService;
        this.crashMarker = crashFileMarker;
        this.clock = clock;
        this.logger = internalEmbraceLogger;
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void handleCrash(Throwable th) {
        zq3.h(th, "exception");
        if (this.mainCrashHandled) {
            return;
        }
        this.mainCrashHandled = true;
        AnrService anrService = this.anrService;
        if (anrService != null) {
            anrService.forceAnrTrackingStopOnCrash();
        }
        String unityCrashId = this.ndkService.getUnityCrashId();
        int incrementAndGetCrashNumber = this.preferencesService.incrementAndGetCrashNumber();
        Crash ofThrowable = unityCrashId != null ? CrashFactory.INSTANCE.ofThrowable(this.logger, th, this.jsException, incrementAndGetCrashNumber, unityCrashId) : CrashFactory.ofThrowable$default(CrashFactory.INSTANCE, this.logger, th, this.jsException, incrementAndGetCrashNumber, null, 16, null);
        this.deliveryService.sendCrash(this.gatingService.gateEventMessage(new EventMessage(new Event(CRASH_REPORT_EVENT_NAME, null, Uuid.getEmbUuid$default(null, 1, null), this.sessionIdTracker.getActiveSessionId(), EventType.CRASH, Long.valueOf(this.clock.now()), null, Boolean.FALSE, null, this.metadataService.getAppState(), null, this.sessionPropertiesService.getProperties(), this.eventService.getActiveEventIds(), null, null, null, null), ofThrowable, this.metadataService.getDeviceInfo(), this.metadataService.getAppInfo(), this.userService.getUserInfo(), null, null, 13, null)), true);
        this.logOrchestrator.flush(true);
        this.sessionOrchestrator.endSessionWithCrash(ofThrowable.crashId);
        this.crashMarker.mark();
    }

    @Override // io.embrace.android.embracesdk.capture.crash.CrashService
    public void logUnhandledJsException(JsException jsException) {
        zq3.h(jsException, "exception");
        this.jsException = jsException;
    }
}
