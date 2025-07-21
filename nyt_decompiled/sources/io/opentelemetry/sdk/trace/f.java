package io.opentelemetry.sdk.trace;

import defpackage.ai3;
import defpackage.ap8;
import defpackage.b87;
import defpackage.dv;
import defpackage.gy7;
import defpackage.hv;
import defpackage.hx0;
import defpackage.lm3;
import defpackage.ux7;
import defpackage.vx7;
import defpackage.xx7;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.sdk.internal.AttributesMap;
import io.opentelemetry.sdk.trace.samplers.SamplingDecision;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

/* loaded from: classes5.dex */
final class f implements vx7 {
    private final String a;
    private final lm3 b;
    private final l c;
    private final gy7 d;
    private hx0 e;
    private AttributesMap g;
    private List h;
    private SpanKind f = SpanKind.INTERNAL;
    private int i = 0;
    private long j = 0;

    f(String str, lm3 lm3Var, l lVar, gy7 gy7Var) {
        this.a = str;
        this.b = lm3Var;
        this.c = lVar;
        this.d = gy7Var;
    }

    private AttributesMap f() {
        AttributesMap attributesMap = this.g;
        if (attributesMap != null) {
            return attributesMap;
        }
        AttributesMap a = AttributesMap.a(this.d.d(), this.d.c());
        this.g = a;
        return a;
    }

    static boolean g(SamplingDecision samplingDecision) {
        return SamplingDecision.RECORD_ONLY.equals(samplingDecision) || SamplingDecision.RECORD_AND_SAMPLE.equals(samplingDecision);
    }

    static boolean h(SamplingDecision samplingDecision) {
        return SamplingDecision.RECORD_AND_SAMPLE.equals(samplingDecision);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(dv dvVar, Object obj) {
        f().m(dvVar, obj);
    }

    @Override // defpackage.vx7
    public ux7 a() {
        hx0 hx0Var = this.e;
        if (hx0Var == null) {
            hx0Var = hx0.current();
        }
        ux7 i = ux7.i(hx0Var);
        xx7 b = i.b();
        c c = this.c.c();
        String generateSpanId = c.generateSpanId();
        String generateTraceId = !b.c() ? c.generateTraceId() : b.getTraceId();
        List list = this.h;
        List emptyList = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.h = null;
        hv hvVar = this.g;
        if (hvVar == null) {
            hvVar = hv.d();
        }
        b87 shouldSample = this.c.e().shouldSample(hx0Var, generateTraceId, this.a, this.f, hvVar, emptyList);
        SamplingDecision c2 = shouldSample.c();
        xx7 a = ai3.a(generateTraceId, generateSpanId, h(c2) ? ap8.c() : ap8.a(), shouldSample.b(b.f()), false, this.c.h());
        if (!g(c2)) {
            return ux7.f(a);
        }
        hv a2 = shouldSample.a();
        if (!a2.isEmpty()) {
            a2.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.trace.e
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    f.this.i((dv) obj, obj2);
                }
            });
        }
        AttributesMap attributesMap = this.g;
        this.g = null;
        return d.A(a, this.a, this.b, this.f, i, hx0Var, this.d, this.c.a(), this.c.b(), this.c.d(), attributesMap, list, this.i, this.j);
    }

    @Override // defpackage.vx7
    public vx7 b() {
        this.e = hx0.root();
        return this;
    }

    @Override // defpackage.vx7
    public vx7 c(long j, TimeUnit timeUnit) {
        if (j >= 0 && timeUnit != null) {
            this.j = timeUnit.toNanos(j);
        }
        return this;
    }

    @Override // defpackage.vx7
    public vx7 d(hx0 hx0Var) {
        if (hx0Var == null) {
            return this;
        }
        this.e = hx0Var;
        return this;
    }
}
