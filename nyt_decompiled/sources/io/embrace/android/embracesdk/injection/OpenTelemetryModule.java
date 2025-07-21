package io.embrace.android.embracesdk.injection;

import defpackage.gp8;
import defpackage.n94;
import io.embrace.android.embracesdk.internal.logs.LogSink;
import io.embrace.android.embracesdk.internal.spans.CurrentSessionSpan;
import io.embrace.android.embracesdk.internal.spans.EmbraceTracer;
import io.embrace.android.embracesdk.internal.spans.InternalTracer;
import io.embrace.android.embracesdk.internal.spans.SpanRepository;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.internal.spans.SpanSink;
import io.embrace.android.embracesdk.opentelemetry.OpenTelemetryConfiguration;

/* loaded from: classes5.dex */
public interface OpenTelemetryModule {
    CurrentSessionSpan getCurrentSessionSpan();

    EmbraceTracer getEmbraceTracer();

    InternalTracer getInternalTracer();

    LogSink getLogSink();

    n94 getLogger();

    OpenTelemetryConfiguration getOpenTelemetryConfiguration();

    SpanRepository getSpanRepository();

    SpanService getSpanService();

    SpanSink getSpanSink();

    gp8 getTracer();
}
