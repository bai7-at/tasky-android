package io.embrace.android.embracesdk.gating;

import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.gating.v2.EnvelopeSanitizerFacade;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.EventMessage;
import io.embrace.android.embracesdk.payload.SessionMessage;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EmbraceGatingService implements GatingService {
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;

    public EmbraceGatingService(ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.configService = configService;
        this.logger = internalEmbraceLogger;
    }

    @Override // io.embrace.android.embracesdk.gating.GatingService
    public EventMessage gateEventMessage(EventMessage eventMessage) {
        zq3.h(eventMessage, "eventMessage");
        Set<String> sessionComponents = this.configService.getSessionBehavior().getSessionComponents();
        if (sessionComponents == null || !this.configService.getSessionBehavior().isGatingFeatureEnabled()) {
            return eventMessage;
        }
        this.logger.log("Session gating feature enabled. Attempting to sanitize the event message", InternalEmbraceLogger.Severity.DEBUG, null, true);
        return this.configService.getSessionBehavior().shouldSendFullMessage(eventMessage) ? eventMessage : new EventSanitizerFacade(eventMessage, sessionComponents).getSanitizedMessage();
    }

    @Override // io.embrace.android.embracesdk.gating.GatingService
    public Envelope<SessionPayload> gateSessionEnvelope(SessionMessage sessionMessage, Envelope<SessionPayload> envelope) {
        zq3.h(sessionMessage, "sessionMessage");
        zq3.h(envelope, "envelope");
        Set<String> sessionComponents = this.configService.getSessionBehavior().getSessionComponents();
        if (sessionComponents == null || !this.configService.getSessionBehavior().isGatingFeatureEnabled()) {
            return envelope;
        }
        List<String> errorLogIds = sessionMessage.getSession().getErrorLogIds();
        return (!(errorLogIds != null && (errorLogIds.isEmpty() ^ true) && this.configService.getSessionBehavior().shouldSendFullForErrorLog()) && sessionMessage.getSession().getCrashReportId() == null) ? new EnvelopeSanitizerFacade(envelope, sessionComponents).sanitize() : envelope;
    }

    @Override // io.embrace.android.embracesdk.gating.GatingService
    public SessionMessage gateSessionMessage(SessionMessage sessionMessage) {
        zq3.h(sessionMessage, "sessionMessage");
        Set<String> sessionComponents = this.configService.getSessionBehavior().getSessionComponents();
        if (sessionComponents == null || !this.configService.getSessionBehavior().isGatingFeatureEnabled()) {
            return sessionMessage;
        }
        this.logger.log("Session gating feature enabled. Attempting to sanitize the session message", InternalEmbraceLogger.Severity.DEBUG, null, true);
        List<String> errorLogIds = sessionMessage.getSession().getErrorLogIds();
        return (!(errorLogIds != null && (errorLogIds.isEmpty() ^ true) && this.configService.getSessionBehavior().shouldSendFullForErrorLog()) && sessionMessage.getSession().getCrashReportId() == null) ? new SessionSanitizerFacade(sessionMessage, sessionComponents).getSanitizedMessage() : sessionMessage;
    }
}
