package defpackage;

/* loaded from: classes3.dex */
public final class ru9 {
    private final long a;
    private final long b;
    private final long c;
    private long d = 0;
    private long e;
    private long f;
    private long g;
    private long h;

    protected ru9(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = f(j2, 0L, j4, j5, j6, j7);
    }

    protected static long f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
    }

    static /* bridge */ /* synthetic */ void g(ru9 ru9Var, long j, long j2) {
        ru9Var.e = j;
        ru9Var.g = j2;
        ru9Var.i();
    }

    static /* bridge */ /* synthetic */ void h(ru9 ru9Var, long j, long j2) {
        ru9Var.d = j;
        ru9Var.f = j2;
        ru9Var.i();
    }

    private final void i() {
        this.h = f(this.b, this.d, this.e, this.f, this.g, this.c);
    }
}
