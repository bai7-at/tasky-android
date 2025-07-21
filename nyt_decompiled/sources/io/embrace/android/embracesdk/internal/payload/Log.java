package io.embrace.android.embracesdk.internal.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Log {
    private final List<Attribute> attributes;
    private final String body;
    private final Integer severityNumber;
    private final String severityText;
    private final String spanId;
    private final Long timeUnixNano;
    private final String traceId;

    public Log() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Log copy$default(Log log, Long l, Integer num, String str, String str2, List list, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = log.timeUnixNano;
        }
        if ((i & 2) != 0) {
            num = log.severityNumber;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = log.severityText;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = log.body;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            list = log.attributes;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            str3 = log.traceId;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = log.spanId;
        }
        return log.copy(l, num2, str5, str6, list2, str7, str4);
    }

    public final Long component1() {
        return this.timeUnixNano;
    }

    public final Integer component2() {
        return this.severityNumber;
    }

    public final String component3() {
        return this.severityText;
    }

    public final String component4() {
        return this.body;
    }

    public final List<Attribute> component5() {
        return this.attributes;
    }

    public final String component6() {
        return this.traceId;
    }

    public final String component7() {
        return this.spanId;
    }

    public final Log copy(@bt3(name = "time_unix_nano") Long l, @bt3(name = "severity_number") Integer num, @bt3(name = "severity_text") String str, @bt3(name = "body") String str2, @bt3(name = "attributes") List<Attribute> list, @bt3(name = "trace_id") String str3, @bt3(name = "span_id") String str4) {
        return new Log(l, num, str, str2, list, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Log)) {
            return false;
        }
        Log log = (Log) obj;
        return zq3.c(this.timeUnixNano, log.timeUnixNano) && zq3.c(this.severityNumber, log.severityNumber) && zq3.c(this.severityText, log.severityText) && zq3.c(this.body, log.body) && zq3.c(this.attributes, log.attributes) && zq3.c(this.traceId, log.traceId) && zq3.c(this.spanId, log.spanId);
    }

    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    public final String getBody() {
        return this.body;
    }

    public final Integer getSeverityNumber() {
        return this.severityNumber;
    }

    public final String getSeverityText() {
        return this.severityText;
    }

    public final String getSpanId() {
        return this.spanId;
    }

    public final Long getTimeUnixNano() {
        return this.timeUnixNano;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        Long l = this.timeUnixNano;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Integer num = this.severityNumber;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.severityText;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.body;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Attribute> list = this.attributes;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.traceId;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.spanId;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Log(timeUnixNano=" + this.timeUnixNano + ", severityNumber=" + this.severityNumber + ", severityText=" + this.severityText + ", body=" + this.body + ", attributes=" + this.attributes + ", traceId=" + this.traceId + ", spanId=" + this.spanId + ")";
    }

    public Log(@bt3(name = "time_unix_nano") Long l, @bt3(name = "severity_number") Integer num, @bt3(name = "severity_text") String str, @bt3(name = "body") String str2, @bt3(name = "attributes") List<Attribute> list, @bt3(name = "trace_id") String str3, @bt3(name = "span_id") String str4) {
        this.timeUnixNano = l;
        this.severityNumber = num;
        this.severityText = str;
        this.body = str2;
        this.attributes = list;
        this.traceId = str3;
        this.spanId = str4;
    }

    public /* synthetic */ Log(Long l, Integer num, String str, String str2, List list, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
