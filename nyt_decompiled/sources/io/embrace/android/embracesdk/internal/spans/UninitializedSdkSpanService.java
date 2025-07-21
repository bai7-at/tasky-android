package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

@InternalApi
/* loaded from: classes5.dex */
public final class UninitializedSdkSpanService implements SpanService {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_BUFFERED_CALLS = 1000;
    private final ConcurrentLinkedQueue<BufferedRecordCompletedSpan> bufferedCalls = new ConcurrentLinkedQueue<>();
    private final AtomicInteger bufferedCallsCount = new AtomicInteger(0);
    private final AtomicReference<SpanService> realSpanService = new AtomicReference<>(null);

    public static final class BufferedRecordCompletedSpan {
        private final Map<String, String> attributes;
        private final long endTimeMs;
        private final ErrorCode errorCode;
        private final List<EmbraceSpanEvent> events;
        private final boolean internal;
        private final String name;
        private final EmbraceSpan parent;

        /* renamed from: private, reason: not valid java name */
        private final boolean f31private;
        private final long startTimeMs;

        /* renamed from: type, reason: collision with root package name */
        private final TelemetryType f81type;

        public BufferedRecordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
            zq3.h(map, "attributes");
            zq3.h(list, "events");
            this.name = str;
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.parent = embraceSpan;
            this.f81type = telemetryType;
            this.internal = z;
            this.f31private = z2;
            this.attributes = map;
            this.events = list;
            this.errorCode = errorCode;
        }

        public final String component1() {
            return this.name;
        }

        public final ErrorCode component10() {
            return this.errorCode;
        }

        public final long component2() {
            return this.startTimeMs;
        }

        public final long component3() {
            return this.endTimeMs;
        }

        public final EmbraceSpan component4() {
            return this.parent;
        }

        public final TelemetryType component5() {
            return this.f81type;
        }

        public final boolean component6() {
            return this.internal;
        }

        public final boolean component7() {
            return this.f31private;
        }

        public final Map<String, String> component8() {
            return this.attributes;
        }

        public final List<EmbraceSpanEvent> component9() {
            return this.events;
        }

        public final BufferedRecordCompletedSpan copy(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode) {
            zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
            zq3.h(map, "attributes");
            zq3.h(list, "events");
            return new BufferedRecordCompletedSpan(str, j, j2, embraceSpan, telemetryType, z, z2, map, list, errorCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BufferedRecordCompletedSpan)) {
                return false;
            }
            BufferedRecordCompletedSpan bufferedRecordCompletedSpan = (BufferedRecordCompletedSpan) obj;
            return zq3.c(this.name, bufferedRecordCompletedSpan.name) && this.startTimeMs == bufferedRecordCompletedSpan.startTimeMs && this.endTimeMs == bufferedRecordCompletedSpan.endTimeMs && zq3.c(this.parent, bufferedRecordCompletedSpan.parent) && zq3.c(this.f81type, bufferedRecordCompletedSpan.f81type) && this.internal == bufferedRecordCompletedSpan.internal && this.f31private == bufferedRecordCompletedSpan.f31private && zq3.c(this.attributes, bufferedRecordCompletedSpan.attributes) && zq3.c(this.events, bufferedRecordCompletedSpan.events) && zq3.c(this.errorCode, bufferedRecordCompletedSpan.errorCode);
        }

        public final Map<String, String> getAttributes() {
            return this.attributes;
        }

        public final long getEndTimeMs() {
            return this.endTimeMs;
        }

        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final List<EmbraceSpanEvent> getEvents() {
            return this.events;
        }

        public final boolean getInternal() {
            return this.internal;
        }

        public final String getName() {
            return this.name;
        }

        public final EmbraceSpan getParent() {
            return this.parent;
        }

        public final boolean getPrivate() {
            return this.f31private;
        }

        public final long getStartTimeMs() {
            return this.startTimeMs;
        }

        public final TelemetryType getType() {
            return this.f81type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.name;
            int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.startTimeMs)) * 31) + Long.hashCode(this.endTimeMs)) * 31;
            EmbraceSpan embraceSpan = this.parent;
            int hashCode2 = (hashCode + (embraceSpan != null ? embraceSpan.hashCode() : 0)) * 31;
            TelemetryType telemetryType = this.f81type;
            int hashCode3 = (hashCode2 + (telemetryType != null ? telemetryType.hashCode() : 0)) * 31;
            boolean z = this.internal;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z2 = this.f31private;
            int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
            Map<String, String> map = this.attributes;
            int hashCode4 = (i3 + (map != null ? map.hashCode() : 0)) * 31;
            List<EmbraceSpanEvent> list = this.events;
            int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
            ErrorCode errorCode = this.errorCode;
            return hashCode5 + (errorCode != null ? errorCode.hashCode() : 0);
        }

        public String toString() {
            return "BufferedRecordCompletedSpan(name=" + this.name + ", startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + ", parent=" + this.parent + ", type=" + this.f81type + ", internal=" + this.internal + ", private=" + this.f31private + ", attributes=" + this.attributes + ", events=" + this.events + ", errorCode=" + this.errorCode + ")";
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan createSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public EmbraceSpan getSpan(String str) {
        zq3.h(str, "spanId");
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public void initializeService(long j) {
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public boolean initialized() {
        return true;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        SpanService spanService = this.realSpanService.get();
        if (spanService != null) {
            return spanService.recordCompletedSpan(str, j, j2, embraceSpan, telemetryType, z, z2, map, list, errorCode);
        }
        if (this.bufferedCallsCount.getAndIncrement() >= 1000) {
            return false;
        }
        synchronized (this.bufferedCalls) {
            this.bufferedCalls.add(new BufferedRecordCompletedSpan(str, j, j2, embraceSpan, telemetryType, z, z2, map, list, errorCode));
        }
        return true;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        zq3.h(qs2Var, "code");
        return (T) qs2Var.mo865invoke();
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return SpanService.DefaultImpls.startSpan(this, str, embraceSpan, l, telemetryType, z, z2);
    }

    public final void triggerBufferedSpanRecording(SpanService spanService) {
        ConcurrentLinkedQueue<BufferedRecordCompletedSpan> concurrentLinkedQueue;
        zq3.h(spanService, "delegateSpanService");
        ConcurrentLinkedQueue<BufferedRecordCompletedSpan> concurrentLinkedQueue2 = this.bufferedCalls;
        synchronized (concurrentLinkedQueue2) {
            try {
                this.realSpanService.set(spanService);
                while (true) {
                    BufferedRecordCompletedSpan poll = this.bufferedCalls.poll();
                    if (poll != null) {
                        concurrentLinkedQueue = concurrentLinkedQueue2;
                        try {
                            SpanService.DefaultImpls.recordCompletedSpan$default(spanService, poll.getName(), poll.getStartTimeMs(), poll.getEndTimeMs(), poll.getParent(), poll.getType(), poll.getInternal(), false, poll.getAttributes(), poll.getEvents(), poll.getErrorCode(), 64, null);
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        concurrentLinkedQueue = concurrentLinkedQueue2;
                    }
                    if (this.bufferedCalls.isEmpty()) {
                        ww8 ww8Var = ww8.a;
                        return;
                    }
                    concurrentLinkedQueue2 = concurrentLinkedQueue;
                }
            } catch (Throwable th2) {
                th = th2;
                concurrentLinkedQueue = concurrentLinkedQueue2;
            }
        }
    }
}
