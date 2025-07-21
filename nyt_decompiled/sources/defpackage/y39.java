package defpackage;

import defpackage.ei7;
import defpackage.vw4;

/* loaded from: classes2.dex */
final class y39 implements hi7 {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private y39(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static y39 a(long j, long j2, vw4.a aVar, yo5 yo5Var) {
        int H;
        yo5Var.V(10);
        int q = yo5Var.q();
        if (q <= 0) {
            return null;
        }
        int i = aVar.d;
        long Q0 = z19.Q0(q, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int N = yo5Var.N();
        int N2 = yo5Var.N();
        int N3 = yo5Var.N();
        yo5Var.V(2);
        long j3 = j2 + aVar.c;
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        int i2 = 0;
        long j4 = j2;
        while (i2 < N) {
            int i3 = N2;
            long j5 = j3;
            jArr[i2] = (i2 * Q0) / N;
            jArr2[i2] = Math.max(j4, j5);
            if (N3 == 1) {
                H = yo5Var.H();
            } else if (N3 == 2) {
                H = yo5Var.N();
            } else if (N3 == 3) {
                H = yo5Var.K();
            } else {
                if (N3 != 4) {
                    return null;
                }
                H = yo5Var.L();
            }
            j4 += H * i3;
            i2++;
            jArr = jArr;
            N2 = i3;
            j3 = j5;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j4) {
            a84.j("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new y39(jArr3, jArr2, Q0, j4);
    }

    @Override // defpackage.hi7
    public long b(long j) {
        return this.a[z19.i(this.b, j, true, true)];
    }

    @Override // defpackage.ei7
    public ei7.a f(long j) {
        int i = z19.i(this.a, j, true, true);
        gi7 gi7Var = new gi7(this.a[i], this.b[i]);
        if (gi7Var.a >= j || i == this.a.length - 1) {
            return new ei7.a(gi7Var);
        }
        int i2 = i + 1;
        return new ei7.a(gi7Var, new gi7(this.a[i2], this.b[i2]));
    }

    @Override // defpackage.hi7
    public long g() {
        return this.d;
    }

    @Override // defpackage.ei7
    public boolean h() {
        return true;
    }

    @Override // defpackage.ei7
    public long i() {
        return this.c;
    }
}
