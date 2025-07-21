package io.embrace.android.embracesdk.internal.payload;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.AppTerminationCause;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.arch.schema.ErrorCodeAttribute;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.spans.EmbraceExtensionsKt;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanData;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.opentelemetry.api.trace.StatusCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class SpanMapperKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StatusCode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[StatusCode.UNSET.ordinal()] = 1;
            iArr[StatusCode.OK.ordinal()] = 2;
            iArr[StatusCode.ERROR.ordinal()] = 3;
            int[] iArr2 = new int[Span.Status.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Span.Status.UNSET.ordinal()] = 1;
            iArr2[Span.Status.OK.ordinal()] = 2;
            iArr2[Span.Status.ERROR.ordinal()] = 3;
        }
    }

    public static final EmbraceSpanData toFailedSpan(EmbraceSpanData embraceSpanData, long j) {
        EmbraceSpanData copy;
        zq3.h(embraceSpanData, "$this$toFailedSpan");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EmbraceExtensionsKt.setFixedAttribute(linkedHashMap, ErrorCodeAttribute.Failure.INSTANCE);
        if (EmbraceExtensionsKt.hasFixedAttribute(linkedHashMap, EmbType.Ux.Session.INSTANCE)) {
            EmbraceExtensionsKt.setFixedAttribute(linkedHashMap, AppTerminationCause.Crash.INSTANCE);
        }
        copy = embraceSpanData.copy((r24 & 1) != 0 ? embraceSpanData.traceId : null, (r24 & 2) != 0 ? embraceSpanData.spanId : null, (r24 & 4) != 0 ? embraceSpanData.parentSpanId : null, (r24 & 8) != 0 ? embraceSpanData.name : null, (r24 & 16) != 0 ? embraceSpanData.startTimeNanos : 0L, (r24 & 32) != 0 ? embraceSpanData.endTimeNanos : ClockKt.millisToNanos(j), (r24 & 64) != 0 ? embraceSpanData.status : StatusCode.ERROR, (r24 & 128) != 0 ? embraceSpanData.events : null, (r24 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? embraceSpanData.attributes : t.p(embraceSpanData.getAttributes(), linkedHashMap));
        return copy;
    }

    public static final Span toNewPayload(EmbraceSpanData embraceSpanData) {
        zq3.h(embraceSpanData, "$this$toNewPayload");
        String traceId = embraceSpanData.getTraceId();
        String spanId = embraceSpanData.getSpanId();
        String parentSpanId = embraceSpanData.getParentSpanId();
        String name = embraceSpanData.getName();
        Long valueOf = Long.valueOf(embraceSpanData.getStartTimeNanos());
        Long valueOf2 = Long.valueOf(embraceSpanData.getEndTimeNanos());
        int i = WhenMappings.$EnumSwitchMapping$0[embraceSpanData.getStatus().ordinal()];
        Span.Status status = i != 1 ? i != 2 ? i != 3 ? Span.Status.UNSET : Span.Status.ERROR : Span.Status.OK : Span.Status.UNSET;
        List<EmbraceSpanEvent> events = embraceSpanData.getEvents();
        ArrayList arrayList = new ArrayList(i.w(events, 10));
        Iterator<T> it2 = events.iterator();
        while (it2.hasNext()) {
            arrayList.add(toNewPayload((EmbraceSpanEvent) it2.next()));
        }
        return new Span(traceId, spanId, parentSpanId, name, valueOf, valueOf2, status, arrayList, toNewPayload(embraceSpanData.getAttributes()));
    }

    public static final EmbraceSpanEvent toOldPayload(SpanEvent spanEvent) {
        Map<String, String> i;
        zq3.h(spanEvent, "$this$toOldPayload");
        String name = spanEvent.getName();
        if (name == null) {
            name = "";
        }
        Long timeUnixNano = spanEvent.getTimeUnixNano();
        long longValue = timeUnixNano != null ? timeUnixNano.longValue() : 0L;
        List<Attribute> attributes = spanEvent.getAttributes();
        if (attributes == null || (i = toOldPayload(attributes)) == null) {
            i = t.i();
        }
        return new EmbraceSpanEvent(name, longValue, i);
    }

    public static final Map<String, String> toOldPayload(List<Attribute> list) {
        zq3.h(list, "$this$toOldPayload");
        List<Attribute> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list2, 10)), 16));
        for (Attribute attribute : list2) {
            String key = attribute.getKey();
            String str = "";
            if (key == null) {
                key = "";
            }
            String data = attribute.getData();
            if (data != null) {
                str = data;
            }
            Pair pair = new Pair(key, str);
            linkedHashMap.put(pair.c(), pair.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!h.d0((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static final Span toFailedSpan(Span span, long j) {
        Span copy;
        zq3.h(span, "$this$toFailedSpan");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EmbraceExtensionsKt.setFixedAttribute(linkedHashMap, ErrorCodeAttribute.Failure.INSTANCE);
        if (EmbraceExtensionsKt.hasFixedAttribute(linkedHashMap, EmbType.Ux.Session.INSTANCE)) {
            EmbraceExtensionsKt.setFixedAttribute(linkedHashMap, AppTerminationCause.Crash.INSTANCE);
        }
        Long valueOf = Long.valueOf(ClockKt.millisToNanos(j));
        Span.Status status = Span.Status.ERROR;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Attribute((String) entry.getKey(), (String) entry.getValue()));
        }
        List<Attribute> attributes = span.getAttributes();
        if (attributes == null) {
            attributes = i.l();
        }
        copy = span.copy((r20 & 1) != 0 ? span.traceId : null, (r20 & 2) != 0 ? span.spanId : null, (r20 & 4) != 0 ? span.parentSpanId : null, (r20 & 8) != 0 ? span.name : null, (r20 & 16) != 0 ? span.startTimeUnixNano : null, (r20 & 32) != 0 ? span.endTimeUnixNano : valueOf, (r20 & 64) != 0 ? span.status : status, (r20 & 128) != 0 ? span.events : null, (r20 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? span.attributes : i.F0(arrayList, attributes));
        return copy;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final io.embrace.android.embracesdk.internal.spans.EmbraceSpanData toOldPayload(io.embrace.android.embracesdk.internal.payload.Span r14) {
        /*
            java.lang.String r0 = "$this$toOldPayload"
            defpackage.zq3.h(r14, r0)
            java.lang.String r0 = r14.getTraceId()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lf
            r3 = r1
            goto L10
        Lf:
            r3 = r0
        L10:
            java.lang.String r0 = r14.getSpanId()
            if (r0 != 0) goto L18
            r4 = r1
            goto L19
        L18:
            r4 = r0
        L19:
            java.lang.String r0 = r14.getParentSpanId()
            if (r0 != 0) goto L23
            java.lang.String r0 = defpackage.fy7.b()
        L23:
            r5 = r0
            java.lang.String r0 = r14.getName()
            if (r0 != 0) goto L2c
            r6 = r1
            goto L2d
        L2c:
            r6 = r0
        L2d:
            java.lang.Long r0 = r14.getStartTimeUnixNano()
            r1 = 0
            if (r0 == 0) goto L3a
            long r7 = r0.longValue()
            goto L3b
        L3a:
            r7 = r1
        L3b:
            java.lang.Long r0 = r14.getEndTimeUnixNano()
            if (r0 == 0) goto L47
            long r0 = r0.longValue()
            r9 = r0
            goto L48
        L47:
            r9 = r1
        L48:
            io.embrace.android.embracesdk.internal.payload.Span$Status r0 = r14.getStatus()
            if (r0 != 0) goto L4f
            goto L60
        L4f:
            int[] r1 = io.embrace.android.embracesdk.internal.payload.SpanMapperKt.WhenMappings.$EnumSwitchMapping$1
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L6a
            r1 = 2
            if (r0 == r1) goto L67
            r1 = 3
            if (r0 == r1) goto L64
        L60:
            io.opentelemetry.api.trace.StatusCode r0 = io.opentelemetry.api.trace.StatusCode.UNSET
        L62:
            r11 = r0
            goto L6d
        L64:
            io.opentelemetry.api.trace.StatusCode r0 = io.opentelemetry.api.trace.StatusCode.ERROR
            goto L62
        L67:
            io.opentelemetry.api.trace.StatusCode r0 = io.opentelemetry.api.trace.StatusCode.OK
            goto L62
        L6a:
            io.opentelemetry.api.trace.StatusCode r0 = io.opentelemetry.api.trace.StatusCode.UNSET
            goto L62
        L6d:
            java.util.List r0 = r14.getEvents()
            if (r0 == 0) goto L9a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.i.w(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r0.next()
            io.embrace.android.embracesdk.internal.payload.SpanEvent r2 = (io.embrace.android.embracesdk.internal.payload.SpanEvent) r2
            io.embrace.android.embracesdk.spans.EmbraceSpanEvent r2 = toOldPayload(r2)
            r1.add(r2)
            goto L84
        L98:
            r12 = r1
            goto L9f
        L9a:
            java.util.List r0 = kotlin.collections.i.l()
            r12 = r0
        L9f:
            java.util.List r14 = r14.getAttributes()
            if (r14 == 0) goto Lae
            java.util.Map r14 = toOldPayload(r14)
            if (r14 != 0) goto Lac
            goto Lae
        Lac:
            r13 = r14
            goto Lb3
        Lae:
            java.util.Map r14 = kotlin.collections.t.i()
            goto Lac
        Lb3:
            io.embrace.android.embracesdk.internal.spans.EmbraceSpanData r14 = new io.embrace.android.embracesdk.internal.spans.EmbraceSpanData
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r9, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.internal.payload.SpanMapperKt.toOldPayload(io.embrace.android.embracesdk.internal.payload.Span):io.embrace.android.embracesdk.internal.spans.EmbraceSpanData");
    }

    public static final SpanEvent toNewPayload(EmbraceSpanEvent embraceSpanEvent) {
        zq3.h(embraceSpanEvent, "$this$toNewPayload");
        return new SpanEvent(embraceSpanEvent.getName(), Long.valueOf(embraceSpanEvent.getTimestampNanos()), toNewPayload(embraceSpanEvent.getAttributes()));
    }

    public static final List<Attribute> toNewPayload(Map<String, String> map) {
        zq3.h(map, "$this$toNewPayload");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Attribute(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
