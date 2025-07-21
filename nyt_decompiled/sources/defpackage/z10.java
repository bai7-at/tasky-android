package defpackage;

/* loaded from: classes2.dex */
final class z10 extends hr5 {
    private final long a;
    private final as8 b;
    private final c42 c;

    z10(long j, as8 as8Var, c42 c42Var) {
        this.a = j;
        if (as8Var == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = as8Var;
        if (c42Var == null) {
            throw new NullPointerException("Null event");
        }
        this.c = c42Var;
    }

    @Override // defpackage.hr5
    public c42 b() {
        return this.c;
    }

    @Override // defpackage.hr5
    public long c() {
        return this.a;
    }

    @Override // defpackage.hr5
    public as8 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr5)) {
            return false;
        }
        hr5 hr5Var = (hr5) obj;
        return this.a == hr5Var.c() && this.b.equals(hr5Var.d()) && this.c.equals(hr5Var.b());
    }

    public int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
