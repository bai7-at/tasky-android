package io.opentelemetry.sdk.trace.samplers;

import defpackage.hv;

/* loaded from: classes5.dex */
final class a extends b {
    private final SamplingDecision d;
    private final hv e;

    a(SamplingDecision samplingDecision, hv hvVar) {
        if (samplingDecision == null) {
            throw new NullPointerException("Null decision");
        }
        this.d = samplingDecision;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.e = hvVar;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.b, defpackage.b87
    public hv a() {
        return this.e;
    }

    @Override // io.opentelemetry.sdk.trace.samplers.b, defpackage.b87
    public SamplingDecision c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.d.equals(bVar.c()) && this.e.equals(bVar.a());
    }

    public int hashCode() {
        return this.e.hashCode() ^ ((this.d.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "ImmutableSamplingResult{decision=" + this.d + ", attributes=" + this.e + "}";
    }
}
