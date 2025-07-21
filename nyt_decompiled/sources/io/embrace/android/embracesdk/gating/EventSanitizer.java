package io.embrace.android.embracesdk.gating;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import io.embrace.android.embracesdk.payload.Event;
import java.util.Set;
import okhttp3.internal.http2.Http2;

/* loaded from: classes5.dex */
public final class EventSanitizer implements Sanitizable<Event> {
    private final Set<String> enabledComponents;
    private final Event event;

    public EventSanitizer(Event event, Set<String> set) {
        zq3.h(event, "event");
        zq3.h(set, "enabledComponents");
        this.event = event;
        this.enabledComponents = set;
    }

    private final boolean isLogEvent() {
        EventType eventType = this.event.f83type;
        return eventType == EventType.ERROR_LOG || eventType == EventType.WARNING_LOG || eventType == EventType.INFO_LOG;
    }

    private final boolean shouldSendLogProperties() {
        return this.enabledComponents.contains(SessionGatingKeys.LOG_PROPERTIES);
    }

    private final boolean shouldSendSessionProperties() {
        return this.enabledComponents.contains(SessionGatingKeys.SESSION_PROPERTIES);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.embrace.android.embracesdk.gating.Sanitizable
    public Event sanitize() {
        Event copy;
        copy = r5.copy((r35 & 1) != 0 ? r5.name : null, (r35 & 2) != 0 ? r5.messageId : null, (r35 & 4) != 0 ? r5.eventId : null, (r35 & 8) != 0 ? r5.sessionId : null, (r35 & 16) != 0 ? r5.f83type : null, (r35 & 32) != 0 ? r5.timestamp : null, (r35 & 64) != 0 ? r5.lateThreshold : null, (r35 & 128) != 0 ? r5.screenshotTaken : null, (r35 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? r5.duration : null, (r35 & 512) != 0 ? r5.appState : null, (r35 & 1024) != 0 ? r5.customProperties : (!isLogEvent() || shouldSendLogProperties()) ? this.event.getCustomProperties() : null, (r35 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r5.sessionProperties : !shouldSendSessionProperties() ? null : this.event.getSessionProperties(), (r35 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? r5.activeEventIds : null, (r35 & 8192) != 0 ? r5.logExceptionType : null, (r35 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r5.exceptionName : null, (r35 & 32768) != 0 ? r5.exceptionMessage : null, (r35 & 65536) != 0 ? this.event.framework : null);
        return copy;
    }
}
