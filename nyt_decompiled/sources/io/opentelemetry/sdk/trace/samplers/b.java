package io.opentelemetry.sdk.trace.samplers;

import defpackage.b87;
import defpackage.hv;

/* loaded from: classes5.dex */
abstract class b implements b87 {
    static final b87 a = d(SamplingDecision.RECORD_AND_SAMPLE);
    static final b87 b = d(SamplingDecision.DROP);
    static final b87 c = d(SamplingDecision.RECORD_ONLY);

    b() {
    }

    private static b87 d(SamplingDecision samplingDecision) {
        return new a(samplingDecision, hv.d());
    }

    @Override // defpackage.b87
    public abstract hv a();

    @Override // defpackage.b87
    public abstract SamplingDecision c();
}
