package io.embrace.android.embracesdk.gating;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.SessionMessage;
import java.util.Set;

/* loaded from: classes5.dex */
public final class SessionSanitizerFacade {
    private final Set<String> components;
    private final SessionMessage sessionMessage;

    public SessionSanitizerFacade(SessionMessage sessionMessage, Set<String> set) {
        zq3.h(sessionMessage, "sessionMessage");
        zq3.h(set, "components");
        this.sessionMessage = sessionMessage;
        this.components = set;
    }

    public final SessionMessage getSanitizedMessage() {
        SessionMessage copy;
        copy = r4.copy((r30 & 1) != 0 ? r4.session : new SessionSanitizer(this.sessionMessage.getSession(), this.components).sanitize(), (r30 & 2) != 0 ? r4.userInfo : new UserInfoSanitizer(this.sessionMessage.getUserInfo(), this.components).sanitize(), (r30 & 4) != 0 ? r4.appInfo : null, (r30 & 8) != 0 ? r4.deviceInfo : null, (r30 & 16) != 0 ? r4.performanceInfo : new PerformanceInfoSanitizer(this.sessionMessage.getPerformanceInfo(), this.components).sanitize(), (r30 & 32) != 0 ? r4.breadcrumbs : null, (r30 & 64) != 0 ? r4.spans : new SpanSanitizer(this.sessionMessage.getSpans(), this.components).sanitize(), (r30 & 128) != 0 ? r4.spanSnapshots : null, (r30 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r4.version : null, (r30 & 512) != 0 ? r4.resource : null, (r30 & 1024) != 0 ? r4.metadata : null, (r30 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r4.newVersion : null, (r30 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r4.f87type : null, (r30 & 8192) != 0 ? this.sessionMessage.data : null);
        return copy;
    }
}
