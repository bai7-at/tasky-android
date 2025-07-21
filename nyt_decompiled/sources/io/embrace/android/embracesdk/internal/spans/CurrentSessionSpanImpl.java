package io.embrace.android.embracesdk.internal.spans;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yl0;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.destination.SessionSpanWriter;
import io.embrace.android.embracesdk.arch.destination.SpanAttributeData;
import io.embrace.android.embracesdk.arch.destination.SpanEventData;
import io.embrace.android.embracesdk.arch.schema.AppTerminationCause;
import io.embrace.android.embracesdk.arch.schema.EmbType;
import io.embrace.android.embracesdk.internal.clock.ClockKt;
import io.embrace.android.embracesdk.internal.spans.EmbraceSpanFactory;
import io.embrace.android.embracesdk.internal.utils.Uuid;
import io.embrace.android.embracesdk.opentelemetry.EmbraceAttributeKeysKt;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.ErrorCode;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import io.embrace.android.embracesdk.telemetry.TelemetryService;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class CurrentSessionSpanImpl implements CurrentSessionSpan, SessionSpanWriter {
    private final qs2 embraceSpanFactorySupplier;
    private final yl0 openTelemetryClock;
    private final AtomicReference<PersistableEmbraceSpan> sessionSpan;
    private final SpanRepository spanRepository;
    private final SpanSink spanSink;
    private final TelemetryService telemetryService;
    private final AtomicInteger traceCount;

    public CurrentSessionSpanImpl(yl0 yl0Var, TelemetryService telemetryService, SpanRepository spanRepository, SpanSink spanSink, qs2 qs2Var) {
        zq3.h(yl0Var, "openTelemetryClock");
        zq3.h(telemetryService, "telemetryService");
        zq3.h(spanRepository, "spanRepository");
        zq3.h(spanSink, "spanSink");
        zq3.h(qs2Var, "embraceSpanFactorySupplier");
        this.openTelemetryClock = yl0Var;
        this.telemetryService = telemetryService;
        this.spanRepository = spanRepository;
        this.spanSink = spanSink;
        this.embraceSpanFactorySupplier = qs2Var;
        this.traceCount = new AtomicInteger(0);
        this.sessionSpan = new AtomicReference<>(null);
    }

    private final PersistableEmbraceSpan startSessionSpan(long j) {
        this.traceCount.set(0);
        PersistableEmbraceSpan create$default = EmbraceSpanFactory.DefaultImpls.create$default((EmbraceSpanFactory) this.embraceSpanFactorySupplier.mo865invoke(), "session", EmbType.Ux.Session.INSTANCE, true, false, null, 16, null);
        create$default.start(Long.valueOf(j));
        create$default.addAttribute(EmbraceAttributeKeysKt.getEmbSessionId().getName(), Uuid.getEmbUuid$default(null, 1, null));
        return create$default;
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SessionSpanWriter
    public boolean addCustomAttribute(SpanAttributeData spanAttributeData) {
        zq3.h(spanAttributeData, "attribute");
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        if (persistableEmbraceSpan == null) {
            return false;
        }
        return persistableEmbraceSpan.addAttribute(spanAttributeData.getKey(), spanAttributeData.getValue());
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SessionSpanWriter
    public <T> boolean addEvent(T t, ss2 ss2Var) {
        zq3.h(ss2Var, "mapper");
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        if (persistableEmbraceSpan == null) {
            return false;
        }
        SpanEventData spanEventData = (SpanEventData) ss2Var.invoke(t);
        return persistableEmbraceSpan.addEvent(EmbraceExtensionsKt.toEmbraceObjectName(spanEventData.getSchemaType().getFixedObjectName()), Long.valueOf(spanEventData.getSpanStartTimeMs()), spanEventData.getSchemaType().attributes());
    }

    @Override // io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan
    public boolean canStartNewSpan(EmbraceSpan embraceSpan, boolean z) {
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        if (persistableEmbraceSpan == null || !persistableEmbraceSpan.isRecording() || (embraceSpan != null && embraceSpan.getSpanId() == null)) {
            return false;
        }
        if (z) {
            return true;
        }
        if (this.traceCount.get() < 500) {
            synchronized (this.traceCount) {
                r1 = this.traceCount.getAndIncrement() < 500;
            }
        }
        return r1;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan
    public List<EmbraceSpanData> endSession(AppTerminationCause appTerminationCause) {
        List<EmbraceSpanData> flushSpans;
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        if (persistableEmbraceSpan == null) {
            return i.l();
        }
        synchronized (this.sessionSpan) {
            try {
                for (Map.Entry<String, String> entry : this.telemetryService.getAndClearTelemetryAttributes().entrySet()) {
                    persistableEmbraceSpan.addAttribute(entry.getKey(), entry.getValue());
                }
                if (appTerminationCause == null) {
                    persistableEmbraceSpan.stop();
                    this.spanRepository.clearCompletedSpans();
                    this.sessionSpan.set(startSessionSpan(ClockKt.nanosToMillis(this.openTelemetryClock.now())));
                } else {
                    long nanosToMillis = ClockKt.nanosToMillis(this.openTelemetryClock.now());
                    this.spanRepository.failActiveSpans(nanosToMillis);
                    EmbraceSpanImpl.Companion.setFixedAttribute$embrace_android_sdk_release(persistableEmbraceSpan, appTerminationCause);
                    persistableEmbraceSpan.stop(ErrorCode.FAILURE, Long.valueOf(nanosToMillis));
                }
                flushSpans = this.spanSink.flushSpans();
            } catch (Throwable th) {
                throw th;
            }
        }
        return flushSpans;
    }

    @Override // io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan
    public String getSessionId() {
        String attribute;
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        return (persistableEmbraceSpan == null || (attribute = persistableEmbraceSpan.getAttribute(EmbraceAttributeKeysKt.getEmbSessionId())) == null) ? "" : attribute;
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public void initializeService(long j) {
        synchronized (this.sessionSpan) {
            this.sessionSpan.set(startSessionSpan(j));
            ww8 ww8Var = ww8.a;
        }
    }

    @Override // io.embrace.android.embracesdk.internal.Initializable
    public boolean initialized() {
        return this.sessionSpan.get() != null;
    }

    @Override // io.embrace.android.embracesdk.arch.destination.SessionSpanWriter
    public boolean removeCustomAttribute(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        PersistableEmbraceSpan persistableEmbraceSpan = this.sessionSpan.get();
        if (persistableEmbraceSpan == null) {
            return false;
        }
        return persistableEmbraceSpan.removeCustomAttribute(str);
    }
}
