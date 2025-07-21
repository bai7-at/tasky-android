package io.embrace.android.embracesdk.arch.datasource;

import defpackage.ss2;
import defpackage.zq3;
import io.embrace.android.embracesdk.arch.destination.StartSpanData;
import io.embrace.android.embracesdk.internal.spans.SpanService;
import io.embrace.android.embracesdk.spans.EmbraceSpan;
import io.embrace.android.embracesdk.spans.PersistableEmbraceSpan;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SpanDataSourceKt {
    public static final <T> EmbraceSpan startSpanCapture(SpanService spanService, T t, ss2 ss2Var) {
        zq3.h(spanService, "$this$startSpanCapture");
        zq3.h(ss2Var, "mapper");
        StartSpanData startSpanData = (StartSpanData) ss2Var.invoke(t);
        PersistableEmbraceSpan startSpan$default = SpanService.DefaultImpls.startSpan$default(spanService, startSpanData.getSchemaType().getFixedObjectName(), null, Long.valueOf(startSpanData.getSpanStartTimeMs()), startSpanData.getSchemaType().getTelemetryType(), false, false, 50, null);
        if (startSpan$default == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : startSpanData.getSchemaType().attributes().entrySet()) {
            startSpan$default.addAttribute(entry.getKey(), entry.getValue());
        }
        return startSpan$default;
    }
}
