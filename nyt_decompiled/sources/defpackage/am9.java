package defpackage;

import defpackage.ei7;
import defpackage.vw4;

/* loaded from: classes2.dex */
final class am9 implements hi7 {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private am9(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public static am9 a(long j, long j2, vw4.a aVar, yo5 yo5Var) {
        int L;
        int i = aVar.g;
        int i2 = aVar.d;
        int q = yo5Var.q();
        if ((q & 1) != 1 || (L = yo5Var.L()) == 0) {
            return null;
        }
        long Q0 = z19.Q0(L, i * 1000000, i2);
        if ((q & 6) != 6) {
            return new am9(j2, aVar.c, Q0);
        }
        long J = yo5Var.J();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = yo5Var.H();
        }
        if (j != -1) {
            long j3 = j2 + J;
            if (j != j3) {
                a84.j("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new am9(j2, aVar.c, Q0, J, jArr);
    }

    private long c(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.hi7
    public long b(long j) {
        long j2 = j - this.a;
        if (!h() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = (long[]) ur.i(this.f);
        double d = (j2 * 256.0d) / this.d;
        int i = z19.i(jArr, (long) d, true, true);
        long c = c(i);
        long j3 = jArr[i];
        int i2 = i + 1;
        long c2 = c(i2);
        return c + Math.round((j3 == (i == 99 ? 256L : jArr[i2]) ? 0.0d : (d - j3) / (r0 - j3)) * (c2 - c));
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        if (!h()) {
            return new ei7.a(new gi7(0L, this.a + this.b));
        }
        long r = z19.r(j, 0L, this.c);
        double d = (r * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                double d3 = ((long[]) ur.i(this.f))[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : r3[i + 1]) - d3));
            }
        }
        return new ei7.a(new gi7(r, this.a + z19.r(Math.round((d2 / 256.0d) * this.d), this.b, this.d - 1)));
    }

    @Override // defpackage.hi7
    public long g() {
        return this.e;
    }

    @Override // defpackage.ei7
    public boolean h() {
        return this.f != null;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.c;
    }

    private am9(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }
}
