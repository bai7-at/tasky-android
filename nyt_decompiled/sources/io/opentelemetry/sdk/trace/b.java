package io.opentelemetry.sdk.trace;

import defpackage.hv;
import defpackage.v18;
import java.util.List;

/* loaded from: classes5.dex */
final class b extends k {
    private final d a;
    private final List b;
    private final List c;
    private final hv d;
    private final int e;
    private final int f;
    private final int g;
    private final v18 h;
    private final String i;
    private final long j;
    private final boolean k;

    b(d dVar, List list, List list2, hv hvVar, int i, int i2, int i3, v18 v18Var, String str, long j, boolean z) {
        if (dVar == null) {
            throw new NullPointerException("Null delegate");
        }
        this.a = dVar;
        if (list == null) {
            throw new NullPointerException("Null resolvedLinks");
        }
        this.b = list;
        if (list2 == null) {
            throw new NullPointerException("Null resolvedEvents");
        }
        this.c = list2;
        if (hvVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.d = hvVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        if (v18Var == null) {
            throw new NullPointerException("Null status");
        }
        this.h = v18Var;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.i = str;
        this.j = j;
        this.k = z;
    }

    @Override // io.opentelemetry.sdk.trace.k
    int A() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a.equals(kVar.j()) && this.b.equals(kVar.w()) && this.c.equals(kVar.v()) && this.d.equals(kVar.h()) && this.e == kVar.y() && this.f == kVar.z() && this.g == kVar.A() && this.h.equals(kVar.x()) && this.i.equals(kVar.u()) && this.j == kVar.k() && this.k == kVar.t();
    }

    @Override // io.opentelemetry.sdk.trace.k
    hv h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        long j = this.j;
        return (this.k ? 1231 : 1237) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    @Override // io.opentelemetry.sdk.trace.k
    d j() {
        return this.a;
    }

    @Override // io.opentelemetry.sdk.trace.k
    long k() {
        return this.j;
    }

    @Override // io.opentelemetry.sdk.trace.k
    boolean t() {
        return this.k;
    }

    @Override // io.opentelemetry.sdk.trace.k
    String u() {
        return this.i;
    }

    @Override // io.opentelemetry.sdk.trace.k
    List v() {
        return this.c;
    }

    @Override // io.opentelemetry.sdk.trace.k
    List w() {
        return this.b;
    }

    @Override // io.opentelemetry.sdk.trace.k
    v18 x() {
        return this.h;
    }

    @Override // io.opentelemetry.sdk.trace.k
    int y() {
        return this.e;
    }

    @Override // io.opentelemetry.sdk.trace.k
    int z() {
        return this.f;
    }
}
