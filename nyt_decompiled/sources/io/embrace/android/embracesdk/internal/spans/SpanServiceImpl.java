package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.schema.TelemetryType;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.EmbraceSpanEvent;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes5.dex */
public final class SpanServiceImpl implements SpanService {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_NON_INTERNAL_SPANS_PER_SESSION = 500;
    private final CurrentSessionSpan currentSessionSpan;
    private final EmbraceSpanFactory embraceSpanFactory;
    private final AtomicBoolean initialized;
    private final SpanRepository spanRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SpanServiceImpl(SpanRepository spanRepository, EmbraceSpanFactory embraceSpanFactory, CurrentSessionSpan currentSessionSpan) {
        zq3.h(spanRepository, "spanRepository");
        zq3.h(embraceSpanFactory, "embraceSpanFactory");
        zq3.h(currentSessionSpan, "currentSessionSpan");
        this.spanRepository = spanRepository;
        this.embraceSpanFactory = embraceSpanFactory;
        this.currentSessionSpan = currentSessionSpan;
        this.initialized = new AtomicBoolean(false);
    }

    private final boolean inputsValid(String str, List<EmbraceSpanEvent> list, Map<String, String> map) {
        return !h.d0(str) && str.length() <= 50 && (list == null || list.size() <= 10) && (map == null || map.size() <= 50);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean inputsValid$default(SpanServiceImpl spanServiceImpl, String str, List list, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        return spanServiceImpl.inputsValid(str, list, map);
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan createSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        if (inputsValid$default(this, str, null, null, 6, null) && this.currentSessionSpan.canStartNewSpan(embraceSpan, z)) {
            return this.embraceSpanFactory.create(str, telemetryType, z, z2, embraceSpan);
        }
        return null;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public EmbraceSpan getSpan(String str) {
        zq3.h(str, "spanId");
        return this.spanRepository.getSpan(str);
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public void initializeService(long j) {
        synchronized (this.initialized) {
            this.currentSessionSpan.initializeService(j);
            this.initialized.set(true);
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public boolean initialized() {
        return this.initialized.get();
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public boolean recordCompletedSpan(String str, long j, long j2, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, ErrorCode errorCode) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        if (j <= j2 && inputsValid(str, list, map) && this.currentSessionSpan.canStartNewSpan(embraceSpan, z)) {
            PersistableEmbraceSpan create = this.embraceSpanFactory.create(str, telemetryType, z, z2, embraceSpan);
            if (create.start(Long.valueOf(j))) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    create.addAttribute(entry.getKey(), entry.getValue());
                }
                for (EmbraceSpanEvent embraceSpanEvent : list) {
                    create.addEvent(embraceSpanEvent.getName(), Long.valueOf(ClockKt.nanosToMillis(embraceSpanEvent.getTimestampNanos())), embraceSpanEvent.getAttributes());
                }
                return create.stop(errorCode, Long.valueOf(j2));
            }
        }
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public <T> T recordSpan(String str, EmbraceSpan embraceSpan, TelemetryType telemetryType, boolean z, boolean z2, Map<String, String> map, List<EmbraceSpanEvent> list, qs2 qs2Var) {
        boolean start;
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        zq3.h(map, "attributes");
        zq3.h(list, "events");
        zq3.h(qs2Var, "code");
        PersistableEmbraceSpan createSpan = createSpan(str, embraceSpan, telemetryType, z, z2);
        if (createSpan != null) {
            try {
                start = createSpan.start();
            } catch (Throwable th) {
                if (createSpan != null) {
                    createSpan.stop(ErrorCode.FAILURE);
                }
                throw th;
            }
        } else {
            start = false;
        }
        if (start) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (createSpan != null) {
                    createSpan.addAttribute(entry.getKey(), entry.getValue());
                }
            }
            for (EmbraceSpanEvent embraceSpanEvent : list) {
                if (createSpan != null) {
                    createSpan.addEvent(embraceSpanEvent.getName(), Long.valueOf(ClockKt.nanosToMillis(embraceSpanEvent.getTimestampNanos())), embraceSpanEvent.getAttributes());
                }
            }
        }
        T t = (T) qs2Var.mo865invoke();
        if (createSpan != null) {
            createSpan.stop();
        }
        return t;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.SpanService
    public PersistableEmbraceSpan startSpan(String str, EmbraceSpan embraceSpan, Long l, TelemetryType telemetryType, boolean z, boolean z2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(telemetryType, TransferTable.COLUMN_TYPE);
        return SpanService.DefaultImpls.startSpan(this, str, embraceSpan, l, telemetryType, z, z2);
    }
}
