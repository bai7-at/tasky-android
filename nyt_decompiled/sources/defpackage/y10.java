package defpackage;

/* loaded from: classes5.dex */
final class y10 extends ft4 {
    private final yl0 a;
    private final bz6 b;
    private final long c;
    private final t62 d;

    y10(yl0 yl0Var, bz6 bz6Var, long j, t62 t62Var) {
        if (yl0Var == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = yl0Var;
        if (bz6Var == null) {
            throw new NullPointerException("Null resource");
        }
        this.b = bz6Var;
        this.c = j;
        if (t62Var == null) {
            throw new NullPointerException("Null exemplarFilter");
        }
        this.d = t62Var;
    }

    @Override // defpackage.ft4
    public yl0 b() {
        return this.a;
    }

    @Override // defpackage.ft4
    t62 c() {
        return this.d;
    }

    @Override // defpackage.ft4
    public bz6 d() {
        return this.b;
    }

    @Override // defpackage.ft4
    public long e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ft4)) {
            return false;
        }
        ft4 ft4Var = (ft4) obj;
        return this.a.equals(ft4Var.b()) && this.b.equals(ft4Var.d()) && this.c == ft4Var.e() && this.d.equals(ft4Var.c());
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return this.d.hashCode() ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        return "MeterProviderSharedState{clock=" + this.a + ", resource=" + this.b + ", startEpochNanos=" + this.c + ", exemplarFilter=" + this.d + "}";
    }
}
