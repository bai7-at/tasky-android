package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.uo6;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.InternalTracingApi;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes5.dex */
public final class InternalTracer implements InternalTracingApi {
    private final EmbraceTracer embraceTracer;
    private final SpanRepository spanRepository;

    private static final class Parent {
        private final boolean isValid;
        private final EmbraceSpan spanReference;

        public Parent(boolean z, EmbraceSpan embraceSpan) {
            this.isValid = z;
            this.spanReference = embraceSpan;
        }

        public static /* synthetic */ Parent copy$default(Parent parent, boolean z, EmbraceSpan embraceSpan, int i, Object obj) {
            if ((i & 1) != 0) {
                z = parent.isValid;
            }
            if ((i & 2) != 0) {
                embraceSpan = parent.spanReference;
            }
            return parent.copy(z, embraceSpan);
        }

        public final boolean component1() {
            return this.isValid;
        }

        public final EmbraceSpan component2() {
            return this.spanReference;
        }

        public final Parent copy(boolean z, EmbraceSpan embraceSpan) {
            return new Parent(z, embraceSpan);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            return this.isValid == parent.isValid && zq3.c(this.spanReference, parent.spanReference);
        }

        public final EmbraceSpan getSpanReference() {
            return this.spanReference;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.isValid;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            EmbraceSpan embraceSpan = this.spanReference;
            return i + (embraceSpan != null ? embraceSpan.hashCode() : 0);
        }

        public final boolean isValid() {
            return this.isValid;
        }

        public String toString() {
            return "Parent(isValid=" + this.isValid + ", spanReference=" + this.spanReference + ")";
        }
    }

    public InternalTracer(SpanRepository spanRepository, EmbraceTracer embraceTracer) {
        zq3.h(spanRepository, "spanRepository");
        zq3.h(embraceTracer, "embraceTracer");
        this.spanRepository = spanRepository;
        this.embraceTracer = embraceTracer;
    }

    private final EmbraceSpanEvent mapToEvent(Map<String, ? extends Object> map) {
        long sdkCurrentTimeMs;
        Object obj = map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        Object obj2 = map.get("timestampMs");
        if (!(obj2 instanceof Long)) {
            obj2 = null;
        }
        Long l = (Long) obj2;
        Object obj3 = map.get("timestampNanos");
        if (!(obj3 instanceof Long)) {
            obj3 = null;
        }
        Long l2 = (Long) obj3;
        Long valueOf = l2 != null ? Long.valueOf(ClockKt.nanosToMillis(l2.longValue())) : null;
        Object obj4 = map.get("attributes");
        if (l == null && map.get("timestampMs") != null) {
            return null;
        }
        if (l == null) {
            l = valueOf;
        }
        if (l != null) {
            sdkCurrentTimeMs = l.longValue();
        } else {
            if (map.get("timestampNanos") != null) {
                return null;
            }
            sdkCurrentTimeMs = this.embraceTracer.getSdkCurrentTimeMs();
        }
        if (!(obj instanceof String)) {
            return null;
        }
        if (!(obj4 != null ? obj4 instanceof Map : true)) {
            return null;
        }
        Map<?, ?> map2 = (Map) obj4;
        return EmbraceSpanEvent.Companion.create((String) obj, sdkCurrentTimeMs, map2 != null ? toStringMap(map2) : null);
    }

    private final Map<String, String> toStringMap(Map<?, ?> map) {
        Set<Map.Entry<?, ?>> entrySet = map.entrySet();
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(arrayList, 10)), 16));
        for (Map.Entry entry2 : arrayList) {
            Pair pair = new Pair(String.valueOf(entry2.getKey()), String.valueOf(entry2.getValue()));
            linkedHashMap.put(pair.c(), pair.d());
        }
        return linkedHashMap;
    }

    private final Parent validateParent(String str) {
        EmbraceSpan span = str != null ? this.spanRepository.getSpan(str) : null;
        return new Parent(str == null || span != null, span);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanAttribute(String str, String str2, String str3) {
        zq3.h(str, "spanId");
        zq3.h(str2, TransferTable.COLUMN_KEY);
        zq3.h(str3, "value");
        EmbraceSpan span = this.spanRepository.getSpan(str);
        if (span != null) {
            return span.addAttribute(str2, str3);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean addSpanEvent(String str, String str2, Long l, Map<String, String> map) {
        zq3.h(str, "spanId");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        EmbraceSpan span = this.spanRepository.getSpan(str);
        if (span != null) {
            return span.addEvent(str2, l != null ? Long.valueOf(ClockKt.normalizeTimestampAsMillis(l.longValue())) : null, map);
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean recordCompletedSpan(String str, long j, long j2, ErrorCode errorCode, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list) {
        ArrayList arrayList;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Parent validateParent = validateParent(str2);
        if (!validateParent.isValid()) {
            return false;
        }
        EmbraceTracer embraceTracer = this.embraceTracer;
        EmbraceSpan spanReference = validateParent.getSpanReference();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                EmbraceSpanEvent mapToEvent = mapToEvent((Map) it2.next());
                if (mapToEvent != null) {
                    arrayList2.add(mapToEvent);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return embraceTracer.recordCompletedSpan(str, j, j2, errorCode, spanReference, map, arrayList);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public <T> T recordSpan(String str, String str2, Map<String, String> map, List<? extends Map<String, ? extends Object>> list, qs2 qs2Var) {
        ArrayList arrayList;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(qs2Var, "code");
        Parent validateParent = validateParent(str2);
        if (!validateParent.isValid()) {
            return (T) qs2Var.mo865invoke();
        }
        EmbraceTracer embraceTracer = this.embraceTracer;
        EmbraceSpan spanReference = validateParent.getSpanReference();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                EmbraceSpanEvent mapToEvent = mapToEvent((Map) it2.next());
                if (mapToEvent != null) {
                    arrayList2.add(mapToEvent);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return (T) embraceTracer.recordSpan(str, spanReference, map, arrayList, qs2Var);
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public String startSpan(String str, String str2, Long l) {
        EmbraceSpan startSpan;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Parent validateParent = validateParent(str2);
        if (!validateParent.isValid() || (startSpan = this.embraceTracer.startSpan(str, validateParent.getSpanReference(), l)) == null) {
            return null;
        }
        return startSpan.getSpanId();
    }

    @Override // io.embrace.android.embracesdk.internal.InternalTracingApi
    public boolean stopSpan(String str, ErrorCode errorCode, Long l) {
        zq3.h(str, "spanId");
        EmbraceSpan span = this.spanRepository.getSpan(str);
        if (span != null) {
            return span.stop(errorCode, l);
        }
        return false;
    }
}
