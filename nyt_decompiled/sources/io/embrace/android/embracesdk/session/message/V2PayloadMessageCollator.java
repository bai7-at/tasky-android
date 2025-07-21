package io.embrace.android.embracesdk.session.message;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.envelope.session.SessionEnvelopeSource;
import io.embrace.android.embracesdk.gating.GatingService;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.SessionPayload;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.message.FinalEnvelopeParams;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;

/* loaded from: classes5.dex */
public final class V2PayloadMessageCollator implements PayloadMessageCollator {
    private final GatingService gatingService;
    private final InternalEmbraceLogger logger;
    private final SessionEnvelopeSource sessionEnvelopeSource;
    private final V1PayloadMessageCollator v1Collator;

    public V2PayloadMessageCollator(GatingService gatingService, V1PayloadMessageCollator v1PayloadMessageCollator, SessionEnvelopeSource sessionEnvelopeSource, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(gatingService, "gatingService");
        zq3.h(v1PayloadMessageCollator, "v1Collator");
        zq3.h(sessionEnvelopeSource, "sessionEnvelopeSource");
        zq3.h(internalEmbraceLogger, "logger");
        this.gatingService = gatingService;
        this.v1Collator = v1PayloadMessageCollator;
        this.sessionEnvelopeSource = sessionEnvelopeSource;
        this.logger = internalEmbraceLogger;
    }

    private final SessionMessage convertToV2Payload(SessionMessage sessionMessage, SessionSnapshotType sessionSnapshotType) {
        SessionMessage copy;
        Envelope<SessionPayload> gateSessionEnvelope = this.gatingService.gateSessionEnvelope(sessionMessage, this.sessionEnvelopeSource.getEnvelope(sessionSnapshotType));
        copy = sessionMessage.copy((r30 & 1) != 0 ? sessionMessage.session : null, (r30 & 2) != 0 ? sessionMessage.userInfo : null, (r30 & 4) != 0 ? sessionMessage.appInfo : null, (r30 & 8) != 0 ? sessionMessage.deviceInfo : null, (r30 & 16) != 0 ? sessionMessage.performanceInfo : null, (r30 & 32) != 0 ? sessionMessage.breadcrumbs : null, (r30 & 64) != 0 ? sessionMessage.spans : null, (r30 & 128) != 0 ? sessionMessage.spanSnapshots : null, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? sessionMessage.version : null, (r30 & 512) != 0 ? sessionMessage.resource : gateSessionEnvelope.getResource(), (r30 & 1024) != 0 ? sessionMessage.metadata : gateSessionEnvelope.getMetadata(), (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? sessionMessage.newVersion : gateSessionEnvelope.getVersion(), (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? sessionMessage.f87type : gateSessionEnvelope.getType(), (r30 & 8192) != 0 ? sessionMessage.data : gateSessionEnvelope.getData());
        return copy;
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public SessionMessage buildFinalBackgroundActivityMessage(FinalEnvelopeParams.BackgroundActivityParams backgroundActivityParams) {
        zq3.h(backgroundActivityParams, "params");
        FinalEnvelopeParams.BackgroundActivityParams backgroundActivityParams2 = new FinalEnvelopeParams.BackgroundActivityParams(backgroundActivityParams.getInitial(), backgroundActivityParams.getEndTime(), backgroundActivityParams.getLifeEventType(), backgroundActivityParams.getEndType(), this.logger, false, backgroundActivityParams.getCrashId());
        return convertToV2Payload(this.v1Collator.buildFinalBackgroundActivityMessage(backgroundActivityParams2), backgroundActivityParams2.getEndType());
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public SessionMessage buildFinalSessionMessage(FinalEnvelopeParams.SessionParams sessionParams) {
        zq3.h(sessionParams, "params");
        FinalEnvelopeParams.SessionParams sessionParams2 = new FinalEnvelopeParams.SessionParams(sessionParams.getInitial(), sessionParams.getEndTime(), sessionParams.getLifeEventType(), sessionParams.getEndType(), this.logger, false, sessionParams.getCrashId());
        return convertToV2Payload(this.v1Collator.buildFinalSessionMessage(sessionParams2), sessionParams2.getEndType());
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadMessageCollator
    public Session buildInitialSession(InitialEnvelopeParams initialEnvelopeParams) {
        zq3.h(initialEnvelopeParams, "params");
        return this.v1Collator.buildInitialSession(initialEnvelopeParams);
    }
}
