package defpackage;

import io.opentelemetry.sdk.metrics.internal.debug.a;

/* loaded from: classes5.dex */
final class a20 extends zu6 {
    private final fm3 a;
    private final d99 b;
    private final jv c;
    private final int d;
    private final a e;

    a20(fm3 fm3Var, d99 d99Var, jv jvVar, int i, a aVar) {
        if (fm3Var == null) {
            throw new NullPointerException("Null instrumentSelector");
        }
        this.a = fm3Var;
        if (d99Var == null) {
            throw new NullPointerException("Null view");
        }
        this.b = d99Var;
        if (jvVar == null) {
            throw new NullPointerException("Null viewAttributesProcessor");
        }
        this.c = jvVar;
        this.d = i;
        if (aVar == null) {
            throw new NullPointerException("Null viewSourceInfo");
        }
        this.e = aVar;
    }

    @Override // defpackage.zu6
    public int b() {
        return this.d;
    }

    @Override // defpackage.zu6
    public fm3 c() {
        return this.a;
    }

    @Override // defpackage.zu6
    public d99 d() {
        return this.b;
    }

    @Override // defpackage.zu6
    public jv e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zu6)) {
            return false;
        }
        zu6 zu6Var = (zu6) obj;
        return this.a.equals(zu6Var.c()) && this.b.equals(zu6Var.d()) && this.c.equals(zu6Var.e()) && this.d == zu6Var.b() && this.e.equals(zu6Var.f());
    }

    @Override // defpackage.zu6
    public a f() {
        return this.e;
    }

    public int hashCode() {
        return this.e.hashCode() ^ ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003);
    }
}
