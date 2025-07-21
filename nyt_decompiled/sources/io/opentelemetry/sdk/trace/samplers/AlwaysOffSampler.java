package io.opentelemetry.sdk.trace.samplers;

import defpackage.b87;
import defpackage.hv;
import defpackage.hx0;
import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* loaded from: classes5.dex */
enum AlwaysOffSampler implements e {
    INSTANCE;

    @Override // io.opentelemetry.sdk.trace.samplers.e
    public String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // io.opentelemetry.sdk.trace.samplers.e
    public b87 shouldSample(hx0 hx0Var, String str, String str2, SpanKind spanKind, hv hvVar, List<Object> list) {
        return b.b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getDescription();
    }
}
