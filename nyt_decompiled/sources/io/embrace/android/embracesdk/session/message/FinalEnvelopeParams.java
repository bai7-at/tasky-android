package io.embrace.android.embracesdk.session.message;

import defpackage.zq3;
import io.embrace.android.embracesdk.event.EventService;
import io.embrace.android.embracesdk.internal.StartupEventInfo;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class FinalEnvelopeParams {
    private final boolean captureSpans;
    private final String crashId;
    private final long endTime;
    private final SessionSnapshotType endType;
    private final Session initial;
    private final boolean isCacheAttempt;
    private final Session.LifeEventType lifeEventType;
    private final InternalEmbraceLogger logger;

    public static final class BackgroundActivityParams extends FinalEnvelopeParams {
        private final Long endTimeVal;
        private final Boolean receivedTermination;
        private final Long terminationTime;

        public /* synthetic */ BackgroundActivityParams(Session session, long j, Session.LifeEventType lifeEventType, SessionSnapshotType sessionSnapshotType, InternalEmbraceLogger internalEmbraceLogger, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(session, j, lifeEventType, sessionSnapshotType, internalEmbraceLogger, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str);
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Long getEndTimeVal() {
            return this.endTimeVal;
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Boolean getReceivedTermination() {
            return this.receivedTermination;
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public StartupEventInfo getStartupEventInfo(EventService eventService) {
            zq3.h(eventService, "eventService");
            return null;
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Long getTerminationTime() {
            return this.terminationTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BackgroundActivityParams(Session session, long j, Session.LifeEventType lifeEventType, SessionSnapshotType sessionSnapshotType, InternalEmbraceLogger internalEmbraceLogger, boolean z, String str) {
            super(session, j, lifeEventType, str, sessionSnapshotType, lifeEventType == null, z, internalEmbraceLogger, null);
            zq3.h(session, "initial");
            zq3.h(sessionSnapshotType, "endType");
            zq3.h(internalEmbraceLogger, "logger");
        }
    }

    public static final class SessionParams extends FinalEnvelopeParams {
        private final Long endTimeVal;
        private final Boolean receivedTermination;
        private final Long terminationTime;

        public /* synthetic */ SessionParams(Session session, long j, Session.LifeEventType lifeEventType, SessionSnapshotType sessionSnapshotType, InternalEmbraceLogger internalEmbraceLogger, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(session, j, lifeEventType, sessionSnapshotType, internalEmbraceLogger, (i & 32) != 0 ? true : z, (i & 64) != 0 ? null : str);
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Long getEndTimeVal() {
            return this.endTimeVal;
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Boolean getReceivedTermination() {
            return this.receivedTermination;
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public StartupEventInfo getStartupEventInfo(EventService eventService) {
            zq3.h(eventService, "eventService");
            if (!getInitial().isColdStart()) {
                return null;
            }
            InternalEmbraceLogger logger = getLogger();
            try {
                return eventService.getStartupMomentInfo();
            } catch (Throwable th) {
                logger.log("Exception thrown capturing data", InternalEmbraceLogger.Severity.ERROR, th, false);
                return null;
            }
        }

        @Override // io.embrace.android.embracesdk.session.message.FinalEnvelopeParams
        public Long getTerminationTime() {
            return this.terminationTime;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionParams(Session session, long j, Session.LifeEventType lifeEventType, SessionSnapshotType sessionSnapshotType, InternalEmbraceLogger internalEmbraceLogger, boolean z, String str) {
            super(session, j, lifeEventType, str, sessionSnapshotType, sessionSnapshotType == SessionSnapshotType.PERIODIC_CACHE, z, internalEmbraceLogger, null);
            zq3.h(session, "initial");
            zq3.h(sessionSnapshotType, "endType");
            zq3.h(internalEmbraceLogger, "logger");
            this.terminationTime = sessionSnapshotType.getForceQuit() ? Long.valueOf(j) : null;
            this.receivedTermination = sessionSnapshotType.getForceQuit() ? Boolean.TRUE : null;
            this.endTimeVal = sessionSnapshotType.getForceQuit() ? null : Long.valueOf(j);
        }
    }

    private FinalEnvelopeParams(Session session, long j, Session.LifeEventType lifeEventType, String str, SessionSnapshotType sessionSnapshotType, boolean z, boolean z2, InternalEmbraceLogger internalEmbraceLogger) {
        this.initial = session;
        this.endTime = j;
        this.lifeEventType = lifeEventType;
        this.endType = sessionSnapshotType;
        this.isCacheAttempt = z;
        this.captureSpans = z2;
        this.logger = internalEmbraceLogger;
        this.crashId = (str == null || str.length() == 0) ? null : str;
    }

    public final boolean getCaptureSpans() {
        return this.captureSpans;
    }

    public final String getCrashId() {
        return this.crashId;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public abstract Long getEndTimeVal();

    public final SessionSnapshotType getEndType() {
        return this.endType;
    }

    public final Session getInitial() {
        return this.initial;
    }

    public final Session.LifeEventType getLifeEventType() {
        return this.lifeEventType;
    }

    public final InternalEmbraceLogger getLogger() {
        return this.logger;
    }

    public abstract Boolean getReceivedTermination();

    public abstract StartupEventInfo getStartupEventInfo(EventService eventService);

    public abstract Long getTerminationTime();

    public final boolean isCacheAttempt() {
        return this.isCacheAttempt;
    }

    public /* synthetic */ FinalEnvelopeParams(Session session, long j, Session.LifeEventType lifeEventType, String str, SessionSnapshotType sessionSnapshotType, boolean z, boolean z2, InternalEmbraceLogger internalEmbraceLogger, DefaultConstructorMarker defaultConstructorMarker) {
        this(session, j, lifeEventType, str, sessionSnapshotType, z, z2, internalEmbraceLogger);
    }
}
