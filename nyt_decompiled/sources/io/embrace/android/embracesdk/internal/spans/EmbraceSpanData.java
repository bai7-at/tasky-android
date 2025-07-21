package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.bt3;
import defpackage.du8;
import defpackage.dv;
import defpackage.et3;
import defpackage.uo6;
import defpackage.w32;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class EmbraceSpanData {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> attributes;
    private final long endTimeNanos;
    private final List<EmbraceSpanEvent> events;
    private final String name;
    private final String parentSpanId;
    private final String spanId;
    private final long startTimeNanos;
    private final StatusCode status;
    private final String traceId;

    public static final class Companion {
        private Companion() {
        }

        public final List<EmbraceSpanEvent> fromEventData(List<? extends w32> list) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (w32 w32Var : list) {
                    EmbraceSpanEvent.Companion companion = EmbraceSpanEvent.Companion;
                    String name = w32Var.getName();
                    zq3.g(name, "eventData.name");
                    long nanosToMillis = ClockKt.nanosToMillis(w32Var.e());
                    Set<Map.Entry> entrySet = w32Var.a().c().entrySet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(entrySet, 10)), 16));
                    for (Map.Entry entry : entrySet) {
                        Object key = entry.getKey();
                        zq3.g(key, "it.key");
                        Pair a = du8.a(((dv) key).getKey(), entry.getValue().toString());
                        linkedHashMap.put(a.c(), a.d());
                    }
                    EmbraceSpanEvent create = companion.create(name, nanosToMillis, linkedHashMap);
                    if (create != null) {
                        arrayList.add(create);
                    }
                }
            }
            return arrayList;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceSpanData(@bt3(name = "trace_id") String str, @bt3(name = "span_id") String str2, @bt3(name = "parent_span_id") String str3, @bt3(name = "name") String str4, @bt3(name = "start_time_unix_nano") long j, @bt3(name = "end_time_unix_nano") long j2, @bt3(name = "status") StatusCode statusCode, @bt3(name = "events") List<EmbraceSpanEvent> list, @bt3(name = "attributes") Map<String, String> map) {
        zq3.h(str, "traceId");
        zq3.h(str2, "spanId");
        zq3.h(str4, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(statusCode, "status");
        zq3.h(list, "events");
        zq3.h(map, "attributes");
        this.traceId = str;
        this.spanId = str2;
        this.parentSpanId = str3;
        this.name = str4;
        this.startTimeNanos = j;
        this.endTimeNanos = j2;
        this.status = statusCode;
        this.events = list;
        this.attributes = map;
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

    public final long component5() {
        return this.startTimeNanos;
    }

    public final long component6() {
        return this.endTimeNanos;
    }

    public final StatusCode component7() {
        return this.status;
    }

    public final List<EmbraceSpanEvent> component8() {
        return this.events;
    }

    public final Map<String, String> component9() {
        return this.attributes;
    }

    public final EmbraceSpanData copy(@bt3(name = "trace_id") String str, @bt3(name = "span_id") String str2, @bt3(name = "parent_span_id") String str3, @bt3(name = "name") String str4, @bt3(name = "start_time_unix_nano") long j, @bt3(name = "end_time_unix_nano") long j2, @bt3(name = "status") StatusCode statusCode, @bt3(name = "events") List<EmbraceSpanEvent> list, @bt3(name = "attributes") Map<String, String> map) {
        zq3.h(str, "traceId");
        zq3.h(str2, "spanId");
        zq3.h(str4, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(statusCode, "status");
        zq3.h(list, "events");
        zq3.h(map, "attributes");
        return new EmbraceSpanData(str, str2, str3, str4, j, j2, statusCode, list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbraceSpanData)) {
            return false;
        }
        EmbraceSpanData embraceSpanData = (EmbraceSpanData) obj;
        return zq3.c(this.traceId, embraceSpanData.traceId) && zq3.c(this.spanId, embraceSpanData.spanId) && zq3.c(this.parentSpanId, embraceSpanData.parentSpanId) && zq3.c(this.name, embraceSpanData.name) && this.startTimeNanos == embraceSpanData.startTimeNanos && this.endTimeNanos == embraceSpanData.endTimeNanos && zq3.c(this.status, embraceSpanData.status) && zq3.c(this.events, embraceSpanData.events) && zq3.c(this.attributes, embraceSpanData.attributes);
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final long getEndTimeNanos() {
        return this.endTimeNanos;
    }

    public final List<EmbraceSpanEvent> getEvents() {
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

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final StatusCode getStatus() {
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
        int hashCode4 = (((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.startTimeNanos)) * 31) + Long.hashCode(this.endTimeNanos)) * 31;
        StatusCode statusCode = this.status;
        int hashCode5 = (hashCode4 + (statusCode != null ? statusCode.hashCode() : 0)) * 31;
        List<EmbraceSpanEvent> list = this.events;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.attributes;
        return hashCode6 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "EmbraceSpanData(traceId=" + this.traceId + ", spanId=" + this.spanId + ", parentSpanId=" + this.parentSpanId + ", name=" + this.name + ", startTimeNanos=" + this.startTimeNanos + ", endTimeNanos=" + this.endTimeNanos + ", status=" + this.status + ", events=" + this.events + ", attributes=" + this.attributes + ")";
    }

    public /* synthetic */ EmbraceSpanData(String str, String str2, String str3, String str4, long j, long j2, StatusCode statusCode, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, j, j2, (i & 64) != 0 ? StatusCode.UNSET : statusCode, (i & 128) != 0 ? i.l() : list, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? t.i() : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EmbraceSpanData(defpackage.by7 r15) {
        /*
            r14 = this;
            java.lang.String r0 = "spanData"
            defpackage.zq3.h(r15, r0)
            xx7 r0 = r15.b()
            java.lang.String r1 = "spanData.spanContext"
            defpackage.zq3.g(r0, r1)
            java.lang.String r3 = r0.getTraceId()
            java.lang.String r0 = "spanData.spanContext.traceId"
            defpackage.zq3.g(r3, r0)
            xx7 r0 = r15.b()
            defpackage.zq3.g(r0, r1)
            java.lang.String r4 = r0.getSpanId()
            java.lang.String r0 = "spanData.spanContext.spanId"
            defpackage.zq3.g(r4, r0)
            java.lang.String r5 = r15.e()
            java.lang.String r6 = r15.getName()
            java.lang.String r0 = "spanData.name"
            defpackage.zq3.g(r6, r0)
            long r7 = r15.c()
            long r9 = r15.d()
            v18 r0 = r15.getStatus()
            java.lang.String r1 = "spanData.status"
            defpackage.zq3.g(r0, r1)
            io.opentelemetry.api.trace.StatusCode r11 = r0.getStatusCode()
            java.lang.String r0 = "spanData.status.statusCode"
            defpackage.zq3.g(r11, r0)
            io.embrace.android.embracesdk.internal.spans.EmbraceSpanData$Companion r0 = io.embrace.android.embracesdk.internal.spans.EmbraceSpanData.Companion
            java.util.List r1 = r15.f()
            java.util.List r12 = r0.fromEventData(r1)
            hv r15 = r15.a()
            java.util.Map r15 = r15.c()
            java.util.Set r15 = r15.entrySet()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r0 = 10
            int r0 = kotlin.collections.i.w(r15, r0)
            int r0 = kotlin.collections.t.e(r0)
            r1 = 16
            int r0 = defpackage.uo6.d(r0, r1)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L7f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lb2
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r2 = "it.key"
            defpackage.zq3.g(r1, r2)
            dv r1 = (defpackage.dv) r1
            java.lang.String r1 = r1.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = r0.toString()
            kotlin.Pair r0 = defpackage.du8.a(r1, r0)
            java.lang.Object r1 = r0.c()
            java.lang.Object r0 = r0.d()
            r13.put(r1, r0)
            goto L7f
        Lb2:
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.internal.spans.EmbraceSpanData.<init>(by7):void");
    }
}
