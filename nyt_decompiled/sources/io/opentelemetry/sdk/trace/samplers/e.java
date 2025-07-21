package io.opentelemetry.sdk.trace.samplers;

import defpackage.b87;
import defpackage.hv;
import defpackage.hx0;
import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* loaded from: classes5.dex */
public interface e {
    static d a(e eVar) {
        return new d(eVar);
    }

    static e b(e eVar) {
        return a(eVar).a();
    }

    static e c() {
        return AlwaysOnSampler.INSTANCE;
    }

    static e d() {
        return AlwaysOffSampler.INSTANCE;
    }

    String getDescription();

    b87 shouldSample(hx0 hx0Var, String str, String str2, SpanKind spanKind, hv hvVar, List list);
}
