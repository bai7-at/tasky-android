package defpackage;

/* loaded from: classes2.dex */
public final class z81 implements x81 {
    private final rk0 a;
    private final long b;

    public z81(rk0 rk0Var, long j) {
        this.a = rk0Var;
        this.b = j;
    }

    @Override // defpackage.x81
    public long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // defpackage.x81
    public long c(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // defpackage.x81
    public long d(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.x81
    public long e(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.x81
    public to6 f(long j) {
        return new to6(null, this.a.c[(int) j], r7.b[r8]);
    }

    @Override // defpackage.x81
    public long g(long j, long j2) {
        return this.a.a(j + this.b);
    }

    @Override // defpackage.x81
    public long h(long j) {
        return this.a.a;
    }

    @Override // defpackage.x81
    public boolean i() {
        return true;
    }

    @Override // defpackage.x81
    public long j() {
        return 0L;
    }

    @Override // defpackage.x81
    public long k(long j, long j2) {
        return this.a.a;
    }
}
