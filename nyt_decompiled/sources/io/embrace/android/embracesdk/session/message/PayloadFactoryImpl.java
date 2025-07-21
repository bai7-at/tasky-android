package io.embrace.android.embracesdk.session.message;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.ConfigService;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.payload.Session;
import io.embrace.android.embracesdk.payload.SessionMessage;
import io.embrace.android.embracesdk.session.lifecycle.ProcessState;
import io.embrace.android.embracesdk.session.message.FinalEnvelopeParams;
import io.embrace.android.embracesdk.session.message.InitialEnvelopeParams;
import io.embrace.android.embracesdk.session.orchestrator.SessionSnapshotType;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class PayloadFactoryImpl implements PayloadFactory {
    private final ConfigService configService;
    private final InternalEmbraceLogger logger;
    private final V1PayloadMessageCollator v1payloadMessageCollator;
    private final V2PayloadMessageCollator v2payloadMessageCollator;

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
            int[] iArr3 = new int[ProcessState.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[processState.ordinal()] = 1;
            iArr3[processState2.ordinal()] = 2;
            int[] iArr4 = new int[ProcessState.values().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[processState.ordinal()] = 1;
            iArr4[processState2.ordinal()] = 2;
        }
    }

    public PayloadFactoryImpl(V1PayloadMessageCollator v1PayloadMessageCollator, V2PayloadMessageCollator v2PayloadMessageCollator, ConfigService configService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(v1PayloadMessageCollator, "v1payloadMessageCollator");
        zq3.h(v2PayloadMessageCollator, "v2payloadMessageCollator");
        zq3.h(configService, "configService");
        zq3.h(internalEmbraceLogger, "logger");
        this.v1payloadMessageCollator = v1PayloadMessageCollator;
        this.v2payloadMessageCollator = v2PayloadMessageCollator;
        this.configService = configService;
        this.logger = internalEmbraceLogger;
    }

    private final SessionMessage endBackgroundActivityWithCrash(Session session, long j, String str) {
        if (this.configService.isBackgroundActivityCaptureEnabled()) {
            return getCollator().buildFinalBackgroundActivityMessage(new FinalEnvelopeParams.BackgroundActivityParams(session, j, Session.LifeEventType.BKGND_STATE, SessionSnapshotType.JVM_CRASH, this.logger, false, str, 32, null));
        }
        return null;
    }

    private final SessionMessage endBackgroundActivityWithState(Session session, long j) {
        if (this.configService.isBackgroundActivityCaptureEnabled()) {
            return getCollator().buildFinalBackgroundActivityMessage(new FinalEnvelopeParams.BackgroundActivityParams(session, j - 1, Session.LifeEventType.BKGND_STATE, SessionSnapshotType.NORMAL_END, this.logger, false, null, 96, null));
        }
        return null;
    }

    private final SessionMessage endSessionWithCrash(Session session, long j, String str) {
        return getCollator().buildFinalSessionMessage(new FinalEnvelopeParams.SessionParams(session, j, Session.LifeEventType.STATE, SessionSnapshotType.JVM_CRASH, this.logger, false, str, 32, null));
    }

    private final SessionMessage endSessionWithState(Session session, long j) {
        return getCollator().buildFinalSessionMessage(new FinalEnvelopeParams.SessionParams(session, j, Session.LifeEventType.STATE, SessionSnapshotType.NORMAL_END, this.logger, false, null, 96, null));
    }

    private final PayloadMessageCollator getCollator() {
        return this.configService.getOTelBehavior().isDevEnabled() ? this.v2payloadMessageCollator : this.v1payloadMessageCollator;
    }

    private final SessionMessage snapshotBackgroundActivity(Session session, long j) {
        if (this.configService.isBackgroundActivityCaptureEnabled()) {
            return getCollator().buildFinalBackgroundActivityMessage(new FinalEnvelopeParams.BackgroundActivityParams(session, j, null, SessionSnapshotType.PERIODIC_CACHE, this.logger, false, null, 96, null));
        }
        return null;
    }

    private final SessionMessage snapshotSession(Session session, long j) {
        return getCollator().buildFinalSessionMessage(new FinalEnvelopeParams.SessionParams(session, j, Session.LifeEventType.STATE, SessionSnapshotType.PERIODIC_CACHE, this.logger, false, null, 96, null));
    }

    private final Session startBackgroundActivityWithState(long j, boolean z) {
        if (!this.configService.isBackgroundActivityCaptureEnabled()) {
            return null;
        }
        if (!z) {
            j++;
        }
        return getCollator().buildInitialSession(new InitialEnvelopeParams.BackgroundActivityParams(z, Session.LifeEventType.BKGND_STATE, j));
    }

    private final Session startSessionWithState(long j, boolean z) {
        return getCollator().buildInitialSession(new InitialEnvelopeParams.SessionParams(z, Session.LifeEventType.STATE, j));
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public SessionMessage endPayloadWithCrash(ProcessState processState, long j, Session session, String str) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(session, "initial");
        zq3.h(str, "crashId");
        int i = WhenMappings.$EnumSwitchMapping$2[processState.ordinal()];
        if (i == 1) {
            return endSessionWithCrash(session, j, str);
        }
        if (i == 2) {
            return endBackgroundActivityWithCrash(session, j, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public SessionMessage endPayloadWithState(ProcessState processState, long j, Session session) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(session, "initial");
        int i = WhenMappings.$EnumSwitchMapping$1[processState.ordinal()];
        if (i == 1) {
            return endSessionWithState(session, j);
        }
        if (i == 2) {
            return endBackgroundActivityWithState(session, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public SessionMessage endSessionWithManual(long j, Session session) {
        zq3.h(session, "initial");
        return getCollator().buildFinalSessionMessage(new FinalEnvelopeParams.SessionParams(session, j, Session.LifeEventType.MANUAL, SessionSnapshotType.NORMAL_END, this.logger, false, null, 96, null));
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public SessionMessage snapshotPayload(ProcessState processState, long j, Session session) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        zq3.h(session, "initial");
        int i = WhenMappings.$EnumSwitchMapping$3[processState.ordinal()];
        if (i == 1) {
            return snapshotSession(session, j);
        }
        if (i == 2) {
            return snapshotBackgroundActivity(session, j);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public Session startPayloadWithState(ProcessState processState, long j, boolean z) {
        zq3.h(processState, TransferTable.COLUMN_STATE);
        int i = WhenMappings.$EnumSwitchMapping$0[processState.ordinal()];
        if (i == 1) {
            return startSessionWithState(j, z);
        }
        if (i == 2) {
            return startBackgroundActivityWithState(j, z);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.embrace.android.embracesdk.session.message.PayloadFactory
    public Session startSessionWithManual(long j) {
        return getCollator().buildInitialSession(new InitialEnvelopeParams.SessionParams(false, Session.LifeEventType.MANUAL, j));
    }
}
