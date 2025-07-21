package io.opentelemetry.sdk.trace.samplers;

import defpackage.b87;
import defpackage.hv;
import defpackage.hx0;
import defpackage.ux7;
import defpackage.xx7;
import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* loaded from: classes5.dex */
final class c implements e {
    private final e a;
    private final e b;
    private final e c;
    private final e d;
    private final e e;

    c(e eVar, e eVar2, e eVar3, e eVar4, e eVar5) {
        this.a = eVar;
        this.b = eVar2 == null ? e.c() : eVar2;
        this.c = eVar3 == null ? e.d() : eVar3;
        this.d = eVar4 == null ? e.c() : eVar4;
        this.e = eVar5 == null ? e.d() : eVar5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c.equals(cVar.c) && this.d.equals(cVar.d) && this.e.equals(cVar.e);
    }

    @Override // io.opentelemetry.sdk.trace.samplers.e
    public String getDescription() {
        return String.format("ParentBased{root:%s,remoteParentSampled:%s,remoteParentNotSampled:%s,localParentSampled:%s,localParentNotSampled:%s}", this.a.getDescription(), this.b.getDescription(), this.c.getDescription(), this.d.getDescription(), this.e.getDescription());
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // io.opentelemetry.sdk.trace.samplers.e
    public b87 shouldSample(hx0 hx0Var, String str, String str2, SpanKind spanKind, hv hvVar, List list) {
        xx7 b = ux7.i(hx0Var).b();
        return !b.c() ? this.a.shouldSample(hx0Var, str, str2, spanKind, hvVar, list) : b.d() ? b.b() ? this.b.shouldSample(hx0Var, str, str2, spanKind, hvVar, list) : this.c.shouldSample(hx0Var, str, str2, spanKind, hvVar, list) : b.b() ? this.d.shouldSample(hx0Var, str, str2, spanKind, hvVar, list) : this.e.shouldSample(hx0Var, str, str2, spanKind, hvVar, list);
    }

    public String toString() {
        return getDescription();
    }
}
