package io.opentelemetry.sdk.trace;

import defpackage.by7;
import defpackage.bz6;
import defpackage.hv;
import defpackage.lm3;
import defpackage.v18;
import defpackage.xx7;
import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* loaded from: classes5.dex */
abstract class k implements by7 {
    k() {
    }

    static k i(d dVar, List list, List list2, hv hvVar, int i, int i2, int i3, v18 v18Var, String str, long j, boolean z) {
        return new b(dVar, list, list2, hvVar, i, i2, i3, v18Var, str, j, z);
    }

    abstract int A();

    @Override // defpackage.by7
    public hv a() {
        return h();
    }

    @Override // defpackage.by7
    public xx7 b() {
        return j().b();
    }

    @Override // defpackage.by7
    public long c() {
        return j().x();
    }

    @Override // defpackage.by7
    public long d() {
        return k();
    }

    @Override // defpackage.by7
    public List f() {
        return v();
    }

    @Override // defpackage.by7
    public xx7 g() {
        return j().v();
    }

    @Override // defpackage.by7
    public String getName() {
        return u();
    }

    @Override // defpackage.by7
    public v18 getStatus() {
        return x();
    }

    abstract hv h();

    abstract d j();

    abstract long k();

    public lm3 l() {
        return j().t();
    }

    public SpanKind m() {
        return j().u();
    }

    public List n() {
        return w();
    }

    public bz6 o() {
        return j().w();
    }

    public int p() {
        return y();
    }

    public int q() {
        return z();
    }

    public int r() {
        return A();
    }

    public boolean s() {
        return t();
    }

    abstract boolean t();

    public final String toString() {
        return "SpanData{spanContext=" + b() + ", parentSpanContext=" + g() + ", resource=" + o() + ", instrumentationScopeInfo=" + l() + ", name=" + getName() + ", kind=" + m() + ", startEpochNanos=" + c() + ", endEpochNanos=" + d() + ", attributes=" + a() + ", totalAttributeCount=" + p() + ", events=" + f() + ", totalRecordedEvents=" + q() + ", links=" + n() + ", totalRecordedLinks=" + r() + ", status=" + getStatus() + ", hasEnded=" + s() + "}";
    }

    abstract String u();

    abstract List v();

    abstract List w();

    abstract v18 x();

    abstract int y();

    abstract int z();
}
