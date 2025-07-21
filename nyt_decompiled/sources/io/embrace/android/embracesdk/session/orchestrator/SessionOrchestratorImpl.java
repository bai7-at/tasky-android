package io.embrace.android.embracesdk.session.orchestrator;

import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.DataCaptureOrchestrator;
import io.embrace.android.embracesdk.arch.SessionType;
import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.destination.SpanAttributeData;
import io.embrace.android.embracesdk.comms.delivery.DeliveryService;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.internal.Systrace;
import io.embrace.android.embracesdk.internal.clock.Clock;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.caching.PeriodicBackgroundActivityCacher;
import io.embrace.android.embracesdk.session.caching.PeriodicSessionCacher;
import io.embrace.android.embracesdk.session.id.SessionIdTracker;
import io.embrace.android.embracesdk.session.lifecycle.ProcessState;
import io.embrace.android.embracesdk.session.lifecycle.ProcessStateService;
import io.embrace.android.embracesdk.session.message.PayloadFactory;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class SessionOrchestratorImpl implements SessionOrchestrator {
    private Session activeSession;
    private final OrchestratorBoundaryDelegate boundaryDelegate;
    private final Clock clock;
    private final ConfigService configService;
    private final DataCaptureOrchestrator dataCaptureOrchestrator;
    private final DeliveryService deliveryService;
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final PayloadFactory payloadFactory;
    private final PeriodicBackgroundActivityCacher periodicBackgroundActivityCacher;
    private final PeriodicSessionCacher periodicSessionCacher;
    private final SessionIdTracker sessionIdTracker;
    private final SessionSpanWriter sessionSpanWriter;
    private ProcessState state;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[ProcessState.values().length];
            $EnumSwitchMapping$0 = iArr;
            ProcessState processState = ProcessState.FOREGROUND;
            iArr[processState.ordinal()] = 1;
            ProcessState processState2 = ProcessState.BACKGROUND;
            iArr[processState2.ordinal()] = 2;
            int[] iArr2 = new int[ProcessState.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[processState.ordinal()] = 1;
            iArr2[processState2.ordinal()] = 2;
            int[] iArr3 = new int[TransitionType.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[TransitionType.CRASH.ordinal()] = 1;
            int[] iArr4 = new int[ProcessState.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[processState.ordinal()] = 1;
            iArr4[processState2.ordinal()] = 2;
        }
    }

    public SessionOrchestratorImpl(ProcessStateService processStateService, PayloadFactory payloadFactory, Clock clock, ConfigService configService, SessionIdTracker sessionIdTracker, OrchestratorBoundaryDelegate orchestratorBoundaryDelegate, DeliveryService deliveryService, PeriodicSessionCacher periodicSessionCacher, PeriodicBackgroundActivityCacher periodicBackgroundActivityCacher, DataCaptureOrchestrator dataCaptureOrchestrator, SessionSpanWriter sessionSpanWriter, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(processStateService, "processStateService");
        zq3.h(payloadFactory, "payloadFactory");
        zq3.h(clock, "clock");
        zq3.h(configService, "configService");
        zq3.h(sessionIdTracker, "sessionIdTracker");
        zq3.h(orchestratorBoundaryDelegate, "boundaryDelegate");
        zq3.h(deliveryService, "deliveryService");
        zq3.h(periodicSessionCacher, "periodicSessionCacher");
        zq3.h(periodicBackgroundActivityCacher, "periodicBackgroundActivityCacher");
        zq3.h(dataCaptureOrchestrator, "dataCaptureOrchestrator");
        zq3.h(sessionSpanWriter, "sessionSpanWriter");
        zq3.h(internalEmbraceLogger, "logger");
        this.payloadFactory = payloadFactory;
        this.clock = clock;
        this.configService = configService;
        this.sessionIdTracker = sessionIdTracker;
        this.boundaryDelegate = orchestratorBoundaryDelegate;
        this.deliveryService = deliveryService;
        this.periodicSessionCacher = periodicSessionCacher;
        this.periodicBackgroundActivityCacher = periodicBackgroundActivityCacher;
        this.dataCaptureOrchestrator = dataCaptureOrchestrator;
        this.sessionSpanWriter = sessionSpanWriter;
        this.logger = internalEmbraceLogger;
        this.lock = new Object();
        this.state = processStateService.isInBackground() ? ProcessState.BACKGROUND : ProcessState.FOREGROUND;
        processStateService.addListener(this);
        try {
            Systrace.startSynchronous("start-first-session");
            createInitialSession();
            ww8 ww8Var = ww8.a;
        } finally {
        }
    }

    private final void createInitialSession() {
        final long now = this.clock.now();
        transitionState$default(this, TransitionType.INITIAL, now, null, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$createInitialSession$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Session mo865invoke() {
                PayloadFactory payloadFactory;
                ProcessState processState;
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                processState = SessionOrchestratorImpl.this.state;
                return payloadFactory.startPayloadWithState(processState, now, true);
            }
        }, null, false, null, 116, null);
    }

    private final void initiatePeriodicCaching(ProcessState processState, Session session) {
        int i = WhenMappings.$EnumSwitchMapping$3[processState.ordinal()];
        if (i == 1) {
            scheduleSessionSave(processState, session);
        } else {
            if (i != 2) {
                return;
            }
            scheduleBackgroundActivitySave(processState, session);
        }
    }

    private final void logSessionStateChange(String str, long j, boolean z, String str2, InternalEmbraceLogger internalEmbraceLogger) {
        internalEmbraceLogger.log("New session created: ID=" + str + ", timestamp=" + j + ", type=" + (z ? Session.APPLICATION_STATE_BACKGROUND : "session") + ", state_change=" + str2, InternalEmbraceLogger.Severity.DEBUG, null, true);
    }

    private final void populateSessionSpanEndAttrs(Session.LifeEventType lifeEventType, String str) {
        String obj;
        SessionSpanWriter sessionSpanWriter = this.sessionSpanWriter;
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbCleanExit().getName(), String.valueOf(true)));
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbTerminated().getName(), String.valueOf(false)));
        if (str != null) {
            sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbCrashId().getName(), str));
        }
        if (lifeEventType == null || (obj = lifeEventType.toString()) == null) {
            return;
        }
        Locale locale = Locale.US;
        zq3.g(locale, "Locale.US");
        String lowerCase = obj.toLowerCase(locale);
        zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (lowerCase != null) {
            sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbSessionEndType().getName(), lowerCase));
        }
    }

    private final void populateSessionSpanStartAttrs(Session session) {
        String obj;
        SessionSpanWriter sessionSpanWriter = this.sessionSpanWriter;
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbColdStart().getName(), String.valueOf(session.isColdStart())));
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbSessionNumber().getName(), String.valueOf(session.getNumber())));
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbState().getName(), session.getAppState()));
        sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbCleanExit().getName(), String.valueOf(false)));
        Session.LifeEventType startType = session.getStartType();
        if (startType == null || (obj = startType.toString()) == null) {
            return;
        }
        Locale locale = Locale.US;
        zq3.g(locale, "Locale.US");
        String lowerCase = obj.toLowerCase(locale);
        zq3.g(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (lowerCase != null) {
            sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbSessionStartType().getName(), lowerCase));
        }
    }

    private final void processEndMessage(SessionMessage sessionMessage, TransitionType transitionType) {
        if (sessionMessage != null) {
            this.deliveryService.sendSession(sessionMessage, WhenMappings.$EnumSwitchMapping$2[transitionType.ordinal()] != 1 ? SessionSnapshotType.NORMAL_END : SessionSnapshotType.JVM_CRASH);
        }
    }

    private final void scheduleBackgroundActivitySave(final ProcessState processState, final Session session) {
        updatePeriodicCacheAttrs();
        this.periodicBackgroundActivityCacher.scheduleSave(new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$scheduleBackgroundActivitySave$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionMessage mo865invoke() {
                Object obj;
                PayloadFactory payloadFactory;
                Clock clock;
                SessionMessage snapshotPayload;
                DeliveryService deliveryService;
                obj = SessionOrchestratorImpl.this.lock;
                synchronized (obj) {
                    SessionOrchestratorImpl.this.updatePeriodicCacheAttrs();
                    payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                    ProcessState processState2 = processState;
                    clock = SessionOrchestratorImpl.this.clock;
                    snapshotPayload = payloadFactory.snapshotPayload(processState2, clock.now(), session);
                    if (snapshotPayload != null) {
                        deliveryService = SessionOrchestratorImpl.this.deliveryService;
                        deliveryService.sendSession(snapshotPayload, SessionSnapshotType.PERIODIC_CACHE);
                    } else {
                        snapshotPayload = null;
                    }
                }
                return snapshotPayload;
            }
        });
    }

    private final void scheduleSessionSave(final ProcessState processState, final Session session) {
        updatePeriodicCacheAttrs();
        this.periodicSessionCacher.start(new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$scheduleSessionSave$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionMessage mo865invoke() {
                Object obj;
                PayloadFactory payloadFactory;
                Clock clock;
                SessionMessage snapshotPayload;
                DeliveryService deliveryService;
                obj = SessionOrchestratorImpl.this.lock;
                synchronized (obj) {
                    SessionOrchestratorImpl.this.updatePeriodicCacheAttrs();
                    payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                    ProcessState processState2 = processState;
                    clock = SessionOrchestratorImpl.this.clock;
                    snapshotPayload = payloadFactory.snapshotPayload(processState2, clock.now(), session);
                    if (snapshotPayload != null) {
                        deliveryService = SessionOrchestratorImpl.this.deliveryService;
                        deliveryService.sendSession(snapshotPayload, SessionSnapshotType.PERIODIC_CACHE);
                    } else {
                        snapshotPayload = null;
                    }
                }
                return snapshotPayload;
            }
        });
    }

    private final void transitionState(TransitionType transitionType, long j, ss2 ss2Var, qs2 qs2Var, qs2 qs2Var2, boolean z, String str) {
        SessionType sessionType;
        if (((Boolean) qs2Var2.mo865invoke()).booleanValue()) {
            return;
        }
        synchronized (this.lock) {
            try {
                if (((Boolean) qs2Var2.mo865invoke()).booleanValue()) {
                    return;
                }
                ProcessState endState = transitionType.endState(this.state);
                boolean z2 = endState == ProcessState.FOREGROUND;
                int i = WhenMappings.$EnumSwitchMapping$0[endState.ordinal()];
                if (i == 1) {
                    this.periodicBackgroundActivityCacher.stop();
                } else if (i == 2) {
                    this.periodicSessionCacher.stop();
                }
                Session session = this.activeSession;
                if (session != null) {
                    populateSessionSpanEndAttrs(transitionType.lifeEventType(this.state), str);
                    processEndMessage(ss2Var != null ? (SessionMessage) ss2Var.invoke(session) : null, transitionType);
                }
                this.boundaryDelegate.prepareForNewSession(z);
                Session session2 = qs2Var != null ? (Session) qs2Var.mo865invoke() : null;
                this.activeSession = session2;
                String sessionId = session2 != null ? session2.getSessionId() : null;
                this.sessionIdTracker.setActiveSessionId(sessionId, z2);
                if (session2 != null) {
                    populateSessionSpanStartAttrs(session2);
                }
                if (transitionType != TransitionType.CRASH && session2 != null) {
                    initiatePeriodicCaching(endState, session2);
                }
                this.state = endState;
                int i2 = WhenMappings.$EnumSwitchMapping$1[endState.ordinal()];
                if (i2 == 1) {
                    sessionType = SessionType.FOREGROUND;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sessionType = SessionType.BACKGROUND;
                }
                this.dataCaptureOrchestrator.onSessionTypeChange(sessionType);
                logSessionStateChange(sessionId, j, !z2, transitionType.name(), this.logger);
                this.boundaryDelegate.onSessionStarted(j);
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void transitionState$default(SessionOrchestratorImpl sessionOrchestratorImpl, TransitionType transitionType, long j, ss2 ss2Var, qs2 qs2Var, qs2 qs2Var2, boolean z, String str, int i, Object obj) {
        sessionOrchestratorImpl.transitionState(transitionType, j, (i & 4) != 0 ? null : ss2Var, (i & 8) != 0 ? null : qs2Var, (i & 16) != 0 ? new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$transitionState$1
            public final boolean invoke() {
                return false;
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }
        } : qs2Var2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePeriodicCacheAttrs() {
        this.sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbHeartbeatTimeUnixNano().getName(), String.valueOf(ClockKt.millisToNanos(this.clock.now()))));
        this.sessionSpanWriter.addCustomAttribute(new SpanAttributeData(EmbraceAttributeKeysKt.getEmbTerminated().getName(), String.valueOf(true)));
    }

    @Override // io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator
    public void endSessionWithCrash(final String str) {
        zq3.h(str, "crashId");
        final long now = this.clock.now();
        transitionState$default(this, TransitionType.CRASH, now, new ss2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$endSessionWithCrash$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SessionMessage invoke(Session session) {
                PayloadFactory payloadFactory;
                ProcessState processState;
                zq3.h(session, "initial");
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                processState = SessionOrchestratorImpl.this.state;
                return payloadFactory.endPayloadWithCrash(processState, now, session, str);
            }
        }, null, null, false, str, 56, null);
    }

    @Override // io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator
    public void endSessionWithManual(boolean z) {
        final long now = this.clock.now();
        transitionState$default(this, TransitionType.END_MANUAL, now, new ss2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$endSessionWithManual$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SessionMessage invoke(Session session) {
                PayloadFactory payloadFactory;
                zq3.h(session, "initial");
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.endSessionWithManual(now, session);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$endSessionWithManual$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Session mo865invoke() {
                PayloadFactory payloadFactory;
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.startSessionWithManual(now);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$endSessionWithManual$3
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
                Clock clock;
                Session session;
                ProcessState processState;
                InternalEmbraceLogger internalEmbraceLogger;
                configService = SessionOrchestratorImpl.this.configService;
                clock = SessionOrchestratorImpl.this.clock;
                session = SessionOrchestratorImpl.this.activeSession;
                processState = SessionOrchestratorImpl.this.state;
                internalEmbraceLogger = SessionOrchestratorImpl.this.logger;
                return OrchestratorTerminationConditionsKt.shouldEndManualSession(configService, clock, session, processState, internalEmbraceLogger);
            }
        }, z, null, 64, null);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onBackground(final long j) {
        transitionState$default(this, TransitionType.ON_BACKGROUND, j, new ss2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onBackground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SessionMessage invoke(Session session) {
                PayloadFactory payloadFactory;
                zq3.h(session, "initial");
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.endPayloadWithState(ProcessState.FOREGROUND, j, session);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onBackground$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Session mo865invoke() {
                PayloadFactory payloadFactory;
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.startPayloadWithState(ProcessState.BACKGROUND, j, false);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onBackground$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                ProcessState processState;
                InternalEmbraceLogger internalEmbraceLogger;
                processState = SessionOrchestratorImpl.this.state;
                internalEmbraceLogger = SessionOrchestratorImpl.this.logger;
                return OrchestratorTerminationConditionsKt.shouldRunOnBackground(processState, internalEmbraceLogger);
            }
        }, false, null, 96, null);
    }

    @Override // io.embrace.android.embracesdk.session.lifecycle.ProcessStateListener
    public void onForeground(final boolean z, final long j) {
        transitionState$default(this, TransitionType.ON_FOREGROUND, j, new ss2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onForeground$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public final SessionMessage invoke(Session session) {
                PayloadFactory payloadFactory;
                zq3.h(session, "initial");
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.endPayloadWithState(ProcessState.BACKGROUND, j, session);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onForeground$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Session mo865invoke() {
                PayloadFactory payloadFactory;
                payloadFactory = SessionOrchestratorImpl.this.payloadFactory;
                return payloadFactory.startPayloadWithState(ProcessState.FOREGROUND, j, z);
            }
        }, new qs2() { // from class: io.embrace.android.embracesdk.session.orchestrator.SessionOrchestratorImpl$onForeground$3
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                return Boolean.valueOf(invoke());
            }

            public final boolean invoke() {
                ProcessState processState;
                InternalEmbraceLogger internalEmbraceLogger;
                processState = SessionOrchestratorImpl.this.state;
                internalEmbraceLogger = SessionOrchestratorImpl.this.logger;
                return OrchestratorTerminationConditionsKt.shouldRunOnForeground(processState, internalEmbraceLogger);
            }
        }, false, null, 96, null);
    }

    @Override // io.embrace.android.embracesdk.session.orchestrator.SessionOrchestrator
    public void reportBackgroundActivityStateChange() {
        Session session;
        ProcessState processState = this.state;
        ProcessState processState2 = ProcessState.BACKGROUND;
        if (processState != processState2 || (session = this.activeSession) == null) {
            return;
        }
        scheduleBackgroundActivitySave(processState2, session);
    }
}
