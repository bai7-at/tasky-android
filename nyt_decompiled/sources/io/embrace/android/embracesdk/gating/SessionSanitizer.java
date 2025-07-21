package io.embrace.android.embracesdk.gating;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.Orientation;
import io.embrace.android.embracesdk.payload.Session;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes5.dex */
public final class SessionSanitizer implements Sanitizable<Session> {
    private final Set<String> enabledComponents;
    private final Session session;

    public SessionSanitizer(Session session, Set<String> set) {
        zq3.h(session, "session");
        zq3.h(set, "enabledComponents");
        this.session = session;
        this.enabledComponents = set;
    }

    private final boolean shouldSendInfoLog() {
        return this.enabledComponents.contains(SessionGatingKeys.LOGS_INFO);
    }

    private final boolean shouldSendMoment() {
        return this.enabledComponents.contains(SessionGatingKeys.SESSION_MOMENTS);
    }

    private final boolean shouldSendSessionProperties() {
        return this.enabledComponents.contains(SessionGatingKeys.SESSION_PROPERTIES);
    }

    private final boolean shouldSendStartupMoment() {
        return this.enabledComponents.contains(SessionGatingKeys.STARTUP_MOMENT);
    }

    private final boolean shouldSendTrackedOrientations() {
        return this.enabledComponents.contains(SessionGatingKeys.SESSION_ORIENTATIONS);
    }

    private final boolean shouldSendUserTerminations() {
        return this.enabledComponents.contains(SessionGatingKeys.SESSION_USER_TERMINATION);
    }

    private final boolean shouldSendWarnLog() {
        return this.enabledComponents.contains(SessionGatingKeys.LOGS_WARN);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public Session sanitize() {
        Session copy;
        Map<String, String> properties = !shouldSendSessionProperties() ? null : this.session.getProperties();
        List<Orientation> orientations = !shouldSendTrackedOrientations() ? null : this.session.getOrientations();
        Long terminationTime = !shouldSendUserTerminations() ? null : this.session.getTerminationTime();
        Boolean isReceivedTermination = !shouldSendUserTerminations() ? null : this.session.isReceivedTermination();
        List<String> infoLogIds = !shouldSendInfoLog() ? null : this.session.getInfoLogIds();
        Integer infoLogsAttemptedToSend = !shouldSendInfoLog() ? null : this.session.getInfoLogsAttemptedToSend();
        copy = r3.copy((r51 & 1) != 0 ? r3.sessionId : null, (r51 & 2) != 0 ? r3.startTime : 0L, (r51 & 4) != 0 ? r3.number : 0, (r51 & 8) != 0 ? r3.messageType : null, (r51 & 16) != 0 ? r3.appState : null, (r51 & 32) != 0 ? r3.isColdStart : false, (r51 & 64) != 0 ? r3.endTime : null, (r51 & 128) != 0 ? r3.lastHeartbeatTime : null, (r51 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r3.terminationTime : terminationTime, (r51 & 512) != 0 ? r3.isEndedCleanly : null, (r51 & 1024) != 0 ? r3.isReceivedTermination : isReceivedTermination, (r51 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r3.eventIds : !shouldSendMoment() ? null : this.session.getEventIds(), (r51 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r3.infoLogIds : infoLogIds, (r51 & 8192) != 0 ? r3.warningLogIds : !shouldSendWarnLog() ? null : this.session.getWarningLogIds(), (r51 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r3.errorLogIds : null, (r51 & 32768) != 0 ? r3.networkLogIds : null, (r51 & 65536) != 0 ? r3.infoLogsAttemptedToSend : infoLogsAttemptedToSend, (r51 & 131072) != 0 ? r3.warnLogsAttemptedToSend : !shouldSendWarnLog() ? null : this.session.getWarnLogsAttemptedToSend(), (r51 & 262144) != 0 ? r3.errorLogsAttemptedToSend : null, (r51 & 524288) != 0 ? r3.exceptionError : null, (r51 & Constants.MB) != 0 ? r3.crashReportId : null, (r51 & 2097152) != 0 ? r3.endType : null, (r51 & 4194304) != 0 ? r3.startType : null, (r51 & 8388608) != 0 ? r3.orientations : orientations, (r51 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? r3.properties : properties, (r51 & 33554432) != 0 ? r3.startupDuration : !shouldSendStartupMoment() ? null : this.session.getStartupDuration(), (r51 & 67108864) != 0 ? r3.startupThreshold : shouldSendStartupMoment() ? this.session.getStartupThreshold() : null, (r51 & 134217728) != 0 ? r3.sdkStartupDuration : null, (r51 & 268435456) != 0 ? r3.unhandledExceptions : null, (r51 & 536870912) != 0 ? r3.betaFeatures : null, (r51 & 1073741824) != 0 ? r3.symbols : null, (r51 & RecyclerView.UNDEFINED_DURATION) != 0 ? this.session.webViewInfo : null);
        return copy;
    }
}
