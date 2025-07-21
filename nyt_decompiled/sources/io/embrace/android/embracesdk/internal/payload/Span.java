package io.embrace.android.embracesdk.internal.payload;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Span {
    private final List<Attribute> attributes;
    private final Long endTimeUnixNano;
    private final List<SpanEvent> events;
    private final String name;
    private final String parentSpanId;
    private final String spanId;
    private final Long startTimeUnixNano;
    private final Status status;
    private final String traceId;

    public enum Status {
        UNSET("Unset"),
        ERROR("Error"),
        OK("Ok");

        private final String value;

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public Span() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.traceId;
    }

    public final String component2() {
        return this.spanId;
    }

    public final String component3() {
        return this.parentSpanId;
    }

    public final String component4() {
        return this.name;
    }

    public final Long component5() {
        return this.startTimeUnixNano;
    }

    public final Long component6() {
        return this.endTimeUnixNano;
    }

    public final Status component7() {
        return this.status;
    }

    public final List<SpanEvent> component8() {
        return this.events;
    }

    public final List<Attribute> component9() {
        return this.attributes;
    }

    public final Span copy(@bt3(name = "trace_id") String str, @bt3(name = "span_id") String str2, @bt3(name = "parent_span_id") String str3, @bt3(name = "name") String str4, @bt3(name = "start_time_unix_nano") Long l, @bt3(name = "end_time_unix_nano") Long l2, @bt3(name = "status") Status status, @bt3(name = "events") List<SpanEvent> list, @bt3(name = "attributes") List<Attribute> list2) {
        return new Span(str, str2, str3, str4, l, l2, status, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Span)) {
            return false;
        }
        Span span = (Span) obj;
        return zq3.c(this.traceId, span.traceId) && zq3.c(this.spanId, span.spanId) && zq3.c(this.parentSpanId, span.parentSpanId) && zq3.c(this.name, span.name) && zq3.c(this.startTimeUnixNano, span.startTimeUnixNano) && zq3.c(this.endTimeUnixNano, span.endTimeUnixNano) && zq3.c(this.status, span.status) && zq3.c(this.events, span.events) && zq3.c(this.attributes, span.attributes);
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final Long getEndTimeUnixNano() {
        return this.endTimeUnixNano;
    }

    public final List<SpanEvent> getEvents() {
        return this.events;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParentSpanId() {
        return this.parentSpanId;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final Long getStartTimeUnixNano() {
        return this.startTimeUnixNano;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        String str = this.traceId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.spanId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.parentSpanId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Long l = this.startTimeUnixNano;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.endTimeUnixNano;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Status status = this.status;
        int hashCode7 = (hashCode6 + (status != null ? status.hashCode() : 0)) * 31;
        List<SpanEvent> list = this.events;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        List<Attribute> list2 = this.attributes;
        return hashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "Span(traceId=" + this.traceId + ", spanId=" + this.spanId + ", parentSpanId=" + this.parentSpanId + ", name=" + this.name + ", startTimeUnixNano=" + this.startTimeUnixNano + ", endTimeUnixNano=" + this.endTimeUnixNano + ", status=" + this.status + ", events=" + this.events + ", attributes=" + this.attributes + ")";
    }

    public Span(@bt3(name = "trace_id") String str, @bt3(name = "span_id") String str2, @bt3(name = "parent_span_id") String str3, @bt3(name = "name") String str4, @bt3(name = "start_time_unix_nano") Long l, @bt3(name = "end_time_unix_nano") Long l2, @bt3(name = "status") Status status, @bt3(name = "events") List<SpanEvent> list, @bt3(name = "attributes") List<Attribute> list2) {
        this.traceId = str;
        this.spanId = str2;
        this.parentSpanId = str3;
        this.name = str4;
        this.startTimeUnixNano = l;
        this.endTimeUnixNano = l2;
        this.status = status;
        this.events = list;
        this.attributes = list2;
    }

    public /* synthetic */ Span(String str, String str2, String str3, String str4, Long l, Long l2, Status status, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : status, (i & 128) != 0 ? null : list, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : list2);
    }
}
