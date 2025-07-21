package defpackage;

import defpackage.ei7;

/* loaded from: classes2.dex */
final class zc9 implements ei7 {
    private final xc9 a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public zc9(xc9 xc9Var, int i, long j, long j2) {
        this.a = xc9Var;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / xc9Var.e;
        this.d = j3;
        this.e = a(j3);
    }

    private long a(long j) {
        return z19.Q0(j * this.b, 1000000L, this.a.c);
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        long r = z19.r((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long j2 = this.c + (this.a.e * r);
        long a = a(r);
        gi7 gi7Var = new gi7(a, j2);
        if (a >= j || r == this.d - 1) {
            return new ei7.a(gi7Var);
        }
        long j3 = r + 1;
        return new ei7.a(gi7Var, new gi7(a(j3), this.c + (this.a.e * j3)));
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.e;
    }
}
