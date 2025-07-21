package defpackage;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
final class x1a implements w1a {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private x1a(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static x1a c(long j, long j2, yw9 yw9Var, b9e b9eVar) {
        int B;
        b9eVar.l(10);
        int v = b9eVar.v();
        if (v <= 0) {
            return null;
        }
        int i = yw9Var.d;
        long H = khe.H(v, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int F = b9eVar.F();
        int F2 = b9eVar.F();
        int F3 = b9eVar.F();
        b9eVar.l(2);
        long j3 = j2 + yw9Var.c;
        long[] jArr = new long[F];
        long[] jArr2 = new long[F];
        int i2 = 0;
        long j4 = j2;
        while (i2 < F) {
            long j5 = j3;
            long j6 = H;
            jArr[i2] = (i2 * H) / F;
            jArr2[i2] = Math.max(j4, j5);
            if (F3 == 1) {
                B = b9eVar.B();
            } else if (F3 == 2) {
                B = b9eVar.F();
            } else if (F3 == 3) {
                B = b9eVar.D();
            } else {
                if (F3 != 4) {
                    return null;
                }
                B = b9eVar.E();
            }
            j4 += B * F2;
            i2++;
            j3 = j5;
            F = F;
            H = j6;
        }
        long j7 = H;
        if (j != -1 && j != j4) {
            ezd.f("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new x1a(jArr, jArr2, j7, j4);
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        long[] jArr = this.a;
        int r = khe.r(jArr, j, true, true);
        hx9 hx9Var = new hx9(jArr[r], this.b[r]);
        if (hx9Var.a < j) {
            long[] jArr2 = this.a;
            if (r != jArr2.length - 1) {
                int i = r + 1;
                return new ex9(hx9Var, new hx9(jArr2[i], this.b[i]));
            }
        }
        return new ex9(hx9Var, hx9Var);
    }

    @Override // defpackage.w1a
    public final long b(long j) {
        return this.a[khe.r(this.b, j, true, true)];
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.c;
    }

    @Override // defpackage.w1a
    public final long zzc() {
        return this.d;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
