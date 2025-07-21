package defpackage;

import defpackage.ei7;

/* loaded from: classes2.dex */
public class tu0 implements ei7 {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public tu0(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = j - j2;
            this.f = d(j, j2, i);
        }
    }

    private long a(long j) {
        int i = this.c;
        long j2 = (((j * this.e) / 8000000) / i) * i;
        long j3 = this.d;
        if (j3 != -1) {
            j2 = Math.min(j2, j3 - i);
        }
        return this.b + Math.max(j2, 0L);
    }

    private static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    public long c(long j) {
        return d(j, this.b, this.e);
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        if (this.d == -1 && !this.g) {
            return new ei7.a(new gi7(0L, this.b));
        }
        long a = a(j);
        long c = c(a);
        gi7 gi7Var = new gi7(c, a);
        if (this.d != -1 && c < j) {
            int i = this.c;
            if (i + a < this.a) {
                long j2 = a + i;
                return new ei7.a(gi7Var, new gi7(c(j2), j2));
            }
        }
        return new ei7.a(gi7Var);
    }

    @Override // defpackage.ei7
    public boolean h() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.f;
    }
}
