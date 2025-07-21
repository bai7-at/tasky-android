package io.embrace.android.embracesdk.gating;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.EventMessage;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EventSanitizerFacade {
    private final Set<String> components;
    private final EventMessage eventMessage;

    public EventSanitizerFacade(EventMessage eventMessage, Set<String> set) {
        zq3.h(eventMessage, "eventMessage");
        zq3.h(set, "components");
        this.eventMessage = eventMessage;
        this.components = set;
    }

    public final EventMessage getSanitizedMessage() {
        EventMessage copy;
        copy = r3.copy((r20 & 1) != 0 ? r3.event : new EventSanitizer(this.eventMessage.getEvent(), this.components).sanitize(), (r20 & 2) != 0 ? r3.crash : null, (r20 & 4) != 0 ? r3.deviceInfo : null, (r20 & 8) != 0 ? r3.appInfo : null, (r20 & 16) != 0 ? r3.userInfo : new UserInfoSanitizer(this.eventMessage.getUserInfo(), this.components).sanitize(), (r20 & 32) != 0 ? r3.performanceInfo : new PerformanceInfoSanitizer(this.eventMessage.getPerformanceInfo(), this.components).sanitize(), (r20 & 64) != 0 ? r3.stacktraces : null, (r20 & 128) != 0 ? r3.version : 0, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? this.eventMessage.nativeCrash : null);
        return copy;
    }
}
