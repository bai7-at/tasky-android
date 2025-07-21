package io.embrace.android.embracesdk.payload;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.EventType;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Event {
    private final transient List<String> activeEventIds;
    public final String appState;
    private final Map<String, Object> customProperties;
    public final Long duration;
    public final String eventId;
    private final String exceptionMessage;
    private final String exceptionName;
    public final Integer framework;
    public final Long lateThreshold;
    public final String logExceptionType;
    public final String messageId;
    public final String name;
    public final Boolean screenshotTaken;
    public final String sessionId;
    private final Map<String, String> sessionProperties;
    public final Long timestamp;

    /* renamed from: type, reason: collision with root package name */
    public final EventType f83type;

    public Event(@bt3(name = "n") String str, @bt3(name = "li") String str2, @bt3(name = "id") String str3, @bt3(name = "si") String str4, @bt3(name = "t") EventType eventType, @bt3(name = "ts") Long l, @bt3(name = "th") Long l2, @bt3(name = "sc") Boolean bool, @bt3(name = "du") Long l3, @bt3(name = "st") String str5, @bt3(name = "pr") Map<String, ? extends Object> map, @bt3(name = "sp") Map<String, String> map2, List<String> list, @bt3(name = "et") String str6, @bt3(name = "en") String str7, @bt3(name = "em") String str8, @bt3(name = "f") Integer num) {
        zq3.h(str3, "eventId");
        zq3.h(eventType, TransferTable.COLUMN_TYPE);
        this.name = str;
        this.messageId = str2;
        this.eventId = str3;
        this.sessionId = str4;
        this.f83type = eventType;
        this.timestamp = l;
        this.lateThreshold = l2;
        this.screenshotTaken = bool;
        this.duration = l3;
        this.appState = str5;
        this.customProperties = map;
        this.sessionProperties = map2;
        this.activeEventIds = list;
        this.logExceptionType = str6;
        this.exceptionName = str7;
        this.exceptionMessage = str8;
        this.framework = num;
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.appState;
    }

    public final Map<String, Object> component11() {
        return this.customProperties;
    }

    public final Map<String, String> component12() {
        return this.sessionProperties;
    }

    public final List<String> component13() {
        return this.activeEventIds;
    }

    public final String component14() {
        return this.logExceptionType;
    }

    public final String component15() {
        return this.exceptionName;
    }

    public final String component16() {
        return this.exceptionMessage;
    }

    public final Integer component17() {
        return this.framework;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String component3() {
        return this.eventId;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final EventType component5() {
        return this.f83type;
    }

    public final Long component6() {
        return this.timestamp;
    }

    public final Long component7() {
        return this.lateThreshold;
    }

    public final Boolean component8() {
        return this.screenshotTaken;
    }

    public final Long component9() {
        return this.duration;
    }

    public final Event copy(@bt3(name = "n") String str, @bt3(name = "li") String str2, @bt3(name = "id") String str3, @bt3(name = "si") String str4, @bt3(name = "t") EventType eventType, @bt3(name = "ts") Long l, @bt3(name = "th") Long l2, @bt3(name = "sc") Boolean bool, @bt3(name = "du") Long l3, @bt3(name = "st") String str5, @bt3(name = "pr") Map<String, ? extends Object> map, @bt3(name = "sp") Map<String, String> map2, List<String> list, @bt3(name = "et") String str6, @bt3(name = "en") String str7, @bt3(name = "em") String str8, @bt3(name = "f") Integer num) {
        zq3.h(str3, "eventId");
        zq3.h(eventType, TransferTable.COLUMN_TYPE);
        return new Event(str, str2, str3, str4, eventType, l, l2, bool, l3, str5, map, map2, list, str6, str7, str8, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return zq3.c(this.name, event.name) && zq3.c(this.messageId, event.messageId) && zq3.c(this.eventId, event.eventId) && zq3.c(this.sessionId, event.sessionId) && zq3.c(this.f83type, event.f83type) && zq3.c(this.timestamp, event.timestamp) && zq3.c(this.lateThreshold, event.lateThreshold) && zq3.c(this.screenshotTaken, event.screenshotTaken) && zq3.c(this.duration, event.duration) && zq3.c(this.appState, event.appState) && zq3.c(this.customProperties, event.customProperties) && zq3.c(this.sessionProperties, event.sessionProperties) && zq3.c(this.activeEventIds, event.activeEventIds) && zq3.c(this.logExceptionType, event.logExceptionType) && zq3.c(this.exceptionName, event.exceptionName) && zq3.c(this.exceptionMessage, event.exceptionMessage) && zq3.c(this.framework, event.framework);
    }

    public final List<String> getActiveEventIds() {
        return this.activeEventIds;
    }

    public final Map<String, Object> getCustomProperties() {
        return this.customProperties;
    }

    public final String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public final String getExceptionName() {
        return this.exceptionName;
    }

    public final Map<String, String> getSessionProperties() {
        return this.sessionProperties;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.messageId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.eventId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sessionId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        EventType eventType = this.f83type;
        int hashCode5 = (hashCode4 + (eventType != null ? eventType.hashCode() : 0)) * 31;
        Long l = this.timestamp;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.lateThreshold;
        int hashCode7 = (hashCode6 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.screenshotTaken;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        Long l3 = this.duration;
        int hashCode9 = (hashCode8 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str5 = this.appState;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, Object> map = this.customProperties;
        int hashCode11 = (hashCode10 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.sessionProperties;
        int hashCode12 = (hashCode11 + (map2 != null ? map2.hashCode() : 0)) * 31;
        List<String> list = this.activeEventIds;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.logExceptionType;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.exceptionName;
        int hashCode15 = (hashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.exceptionMessage;
        int hashCode16 = (hashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Integer num = this.framework;
        return hashCode16 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "Event(name=" + this.name + ", messageId=" + this.messageId + ", eventId=" + this.eventId + ", sessionId=" + this.sessionId + ", type=" + this.f83type + ", timestamp=" + this.timestamp + ", lateThreshold=" + this.lateThreshold + ", screenshotTaken=" + this.screenshotTaken + ", duration=" + this.duration + ", appState=" + this.appState + ", customProperties=" + this.customProperties + ", sessionProperties=" + this.sessionProperties + ", activeEventIds=" + this.activeEventIds + ", logExceptionType=" + this.logExceptionType + ", exceptionName=" + this.exceptionName + ", exceptionMessage=" + this.exceptionMessage + ", framework=" + this.framework + ")";
    }

    public /* synthetic */ Event(String str, String str2, String str3, String str4, EventType eventType, Long l, Long l2, Boolean bool, Long l3, String str5, Map map, Map map2, List list, String str6, String str7, String str8, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, eventType, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? Boolean.FALSE : bool, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : l3, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : map, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : map2, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : list, (i & 8192) != 0 ? null : str6, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, (32768 & i) != 0 ? null : str8, (i & 65536) != 0 ? null : num);
    }
}
