package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.hv;
import defpackage.iv;
import defpackage.uo6;
import defpackage.ux7;
import defpackage.ww8;
import defpackage.xx7;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.EmbraceAttributeKey;
import io.embrace.android.embracesdk.arch.schema.FixedAttribute;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.payload.Span;
import io.embrace.android.embracesdk.internal.payload.SpanMapperKt;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EmbraceSpanImpl implements PersistableEmbraceSpan {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_ATTRIBUTE_COUNT = 50;
    public static final int MAX_ATTRIBUTE_KEY_LENGTH = 50;
    public static final int MAX_ATTRIBUTE_VALUE_LENGTH = 200;
    public static final int MAX_EVENT_COUNT = 10;
    public static final int MAX_NAME_LENGTH = 50;
    private final ConcurrentHashMap<String, String> attributes;
    private final AtomicInteger eventCount;
    private final ConcurrentLinkedQueue<EmbraceSpanEvent> events;
    private final yl0 openTelemetryClock;
    private final EmbraceSpan parent;
    private final Map<String, String> schemaAttributes;
    private final EmbraceSpanBuilder spanBuilder;
    private Long spanEndTimeMs;
    private final SpanRepository spanRepository;
    private Long spanStartTimeMs;
    private final AtomicReference<ux7> startedSpan;
    private Span.Status status;

    public static final class Companion {
        private Companion() {
        }

        public final boolean attributeValid$embrace_android_sdk_release(String str, String str2) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(str2, "value");
            return str.length() <= 50 && str2.length() <= 200;
        }

        public final EmbraceSpan setFixedAttribute$embrace_android_sdk_release(EmbraceSpan embraceSpan, FixedAttribute fixedAttribute) {
            zq3.h(embraceSpan, "$this$setFixedAttribute");
            zq3.h(fixedAttribute, "fixedAttribute");
            embraceSpan.addAttribute(fixedAttribute.getKey().getName(), fixedAttribute.getValue());
            return embraceSpan;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EmbraceSpanImpl(EmbraceSpanBuilder embraceSpanBuilder, yl0 yl0Var, SpanRepository spanRepository) {
        zq3.h(embraceSpanBuilder, "spanBuilder");
        zq3.h(yl0Var, "openTelemetryClock");
        zq3.h(spanRepository, "spanRepository");
        this.spanBuilder = embraceSpanBuilder;
        this.openTelemetryClock = yl0Var;
        this.spanRepository = spanRepository;
        this.startedSpan = new AtomicReference<>(null);
        this.status = Span.Status.UNSET;
        this.events = new ConcurrentLinkedQueue<>();
        List<FixedAttribute> fixedAttributes = embraceSpanBuilder.getFixedAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(fixedAttributes, 10)), 16));
        Iterator<T> it2 = fixedAttributes.iterator();
        while (it2.hasNext()) {
            Pair<String, String> embraceKeyValuePair = ((FixedAttribute) it2.next()).toEmbraceKeyValuePair();
            linkedHashMap.put(embraceKeyValuePair.c(), embraceKeyValuePair.d());
        }
        this.schemaAttributes = t.x(linkedHashMap);
        this.attributes = new ConcurrentHashMap<>();
        this.eventCount = new AtomicInteger(0);
        this.parent = this.spanBuilder.getParent();
    }

    private final Map<String, String> allAttributes() {
        return t.p(this.attributes, this.schemaAttributes);
    }

    private final boolean canSnapshot() {
        return (getSpanId() == null || this.spanStartTimeMs == null) ? false : true;
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean addAttribute(String str, String str2) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(str2, "value");
        if (this.attributes.size() >= 50 || !Companion.attributeValid$embrace_android_sdk_release(str, str2)) {
            return false;
        }
        synchronized (this.attributes) {
            if (this.attributes.size() >= 50 || !isRecording()) {
                ww8 ww8Var = ww8.a;
                return false;
            }
            this.attributes.put(str, str2);
            return true;
        }
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean addEvent(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return PersistableEmbraceSpan.DefaultImpls.addEvent(this, str);
    }

    @Override // io.embrace.android.embracesdk.spans.PersistableEmbraceSpan
    public String getAttribute(EmbraceAttributeKey embraceAttributeKey) {
        zq3.h(embraceAttributeKey, TransferTable.COLUMN_KEY);
        return allAttributes().get(embraceAttributeKey.getName());
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public EmbraceSpan getParent() {
        return this.parent;
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public String getSpanId() {
        xx7 b;
        ux7 ux7Var = this.startedSpan.get();
        if (ux7Var == null || (b = ux7Var.b()) == null) {
            return null;
        }
        return b.getSpanId();
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public String getTraceId() {
        xx7 b;
        ux7 ux7Var = this.startedSpan.get();
        if (ux7Var == null || (b = ux7Var.b()) == null) {
            return null;
        }
        return b.getTraceId();
    }

    @Override // io.embrace.android.embracesdk.spans.PersistableEmbraceSpan
    public boolean hasEmbraceAttribute(FixedAttribute fixedAttribute) {
        zq3.h(fixedAttribute, "fixedAttribute");
        return EmbraceExtensionsKt.hasFixedAttribute(allAttributes(), fixedAttribute);
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean isRecording() {
        ux7 ux7Var = this.startedSpan.get();
        return ux7Var != null && ux7Var.isRecording();
    }

    @Override // io.embrace.android.embracesdk.spans.PersistableEmbraceSpan
    public boolean removeCustomAttribute(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        return this.attributes.remove(str) != null;
    }

    @Override // io.embrace.android.embracesdk.spans.PersistableEmbraceSpan
    public Span snapshot() {
        if (!canSnapshot()) {
            return null;
        }
        String traceId = getTraceId();
        String spanId = getSpanId();
        EmbraceSpan parent = getParent();
        String spanId2 = parent != null ? parent.getSpanId() : null;
        String spanName = this.spanBuilder.getSpanName();
        Long l = this.spanStartTimeMs;
        Long valueOf = l != null ? Long.valueOf(ClockKt.millisToNanos(l.longValue())) : null;
        Long l2 = this.spanEndTimeMs;
        Long valueOf2 = l2 != null ? Long.valueOf(ClockKt.millisToNanos(l2.longValue())) : null;
        Span.Status status = this.status;
        ConcurrentLinkedQueue<EmbraceSpanEvent> concurrentLinkedQueue = this.events;
        ArrayList arrayList = new ArrayList(i.w(concurrentLinkedQueue, 10));
        Iterator<T> it2 = concurrentLinkedQueue.iterator();
        while (it2.hasNext()) {
            arrayList.add(SpanMapperKt.toNewPayload((EmbraceSpanEvent) it2.next()));
        }
        return new Span(traceId, spanId, spanId2, spanName, valueOf, valueOf2, status, arrayList, SpanMapperKt.toNewPayload(allAttributes()));
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean start() {
        return PersistableEmbraceSpan.DefaultImpls.start(this);
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean stop() {
        return PersistableEmbraceSpan.DefaultImpls.stop(this);
    }

    public final ux7 wrappedSpan$embrace_android_sdk_release() {
        return this.startedSpan.get();
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean addEvent(String str, Long l, Map<String, String> map) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        if (this.eventCount.get() >= 10) {
            return false;
        }
        EmbraceSpanEvent.Companion companion = EmbraceSpanEvent.Companion;
        if (!companion.inputsValid$embrace_android_sdk_release(str, map)) {
            return false;
        }
        EmbraceSpanEvent create = companion.create(str, l != null ? ClockKt.normalizeTimestampAsMillis(l.longValue()) : ClockKt.nanosToMillis(this.openTelemetryClock.now()), map);
        synchronized (this.eventCount) {
            if (this.eventCount.get() >= 10 || !isRecording()) {
                ww8 ww8Var = ww8.a;
                return false;
            }
            this.events.add(create);
            this.eventCount.incrementAndGet();
            return true;
        }
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean start(Long l) {
        boolean z;
        if (this.startedSpan.get() != null) {
            return false;
        }
        long longValue = l != null ? l.longValue() : ClockKt.nanosToMillis(this.openTelemetryClock.now());
        synchronized (this.startedSpan) {
            this.startedSpan.set(this.spanBuilder.startSpan(longValue));
            z = this.startedSpan.get() != null;
            ww8 ww8Var = ww8.a;
        }
        if (z) {
            this.spanStartTimeMs = Long.valueOf(longValue);
            SpanRepository spanRepository = this.spanRepository;
            if (spanRepository != null) {
                spanRepository.trackStartedSpan(this);
            }
        }
        return z;
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean stop(ErrorCode errorCode) {
        return PersistableEmbraceSpan.DefaultImpls.stop(this, errorCode);
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean stop(Long l) {
        return PersistableEmbraceSpan.DefaultImpls.stop(this, l);
    }

    @Override // io.embrace.android.embracesdk.spans.EmbraceSpan
    public boolean stop(ErrorCode errorCode, Long l) {
        Span.Status status;
        SpanRepository spanRepository;
        hv d;
        boolean z = false;
        if (!isRecording()) {
            return false;
        }
        long longValue = l != null ? l.longValue() : ClockKt.nanosToMillis(this.openTelemetryClock.now());
        synchronized (this.startedSpan) {
            try {
                ux7 ux7Var = this.startedSpan.get();
                if (ux7Var != null) {
                    for (Map.Entry<String, String> entry : allAttributes().entrySet()) {
                        ux7Var.j(entry.getKey(), entry.getValue());
                    }
                    for (EmbraceSpanEvent embraceSpanEvent : this.events) {
                        if (!embraceSpanEvent.getAttributes().isEmpty()) {
                            iv b = hv.b();
                            zq3.g(b, "Attributes.builder()");
                            d = EmbraceExtensionsKt.fromMap(b, embraceSpanEvent.getAttributes()).build();
                        } else {
                            d = hv.d();
                        }
                        ux7Var.g(embraceSpanEvent.getName(), d, embraceSpanEvent.getTimestampNanos(), TimeUnit.NANOSECONDS);
                    }
                    EmbraceExtensionsKt.endSpan(ux7Var, errorCode, Long.valueOf(longValue));
                    z = !isRecording();
                    ww8 ww8Var = ww8.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (errorCode != null) {
                status = Span.Status.ERROR;
            } else {
                status = Span.Status.OK;
            }
            this.status = status;
            this.spanEndTimeMs = Long.valueOf(longValue);
            String spanId = getSpanId();
            if (spanId != null && (spanRepository = this.spanRepository) != null) {
                spanRepository.trackedSpanStopped(spanId);
            }
        }
        return z;
    }
}
