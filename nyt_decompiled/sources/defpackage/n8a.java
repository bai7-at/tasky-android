package defpackage;

/* loaded from: classes3.dex */
final class n8a {
    private boolean c;
    private boolean d;
    private boolean e;
    private final pfe a = new pfe(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final b9e b = new b9e();

    n8a() {
    }

    public static long c(b9e b9eVar) {
        int s = b9eVar.s();
        if (b9eVar.q() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b9eVar.g(bArr, 0, 9);
        b9eVar.k(s);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int f(ov9 ov9Var) {
        byte[] bArr = khe.f;
        int length = bArr.length;
        this.b.i(bArr, 0);
        this.c = true;
        ov9Var.zzj();
        return 0;
    }

    private static final int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int a(ov9 ov9Var, cx9 cx9Var) {
        long j = -9223372036854775807L;
        if (!this.e) {
            long zzd = ov9Var.zzd();
            int min = (int) Math.min(20000L, zzd);
            long j2 = zzd - min;
            if (ov9Var.zzf() != j2) {
                cx9Var.a = j2;
                return 1;
            }
            this.b.h(min);
            ov9Var.zzj();
            ((bv9) ov9Var).d(this.b.m(), 0, min, false);
            b9e b9eVar = this.b;
            int s = b9eVar.s();
            int t = b9eVar.t() - 4;
            while (true) {
                if (t < s) {
                    break;
                }
                if (g(b9eVar.m(), t) == 442) {
                    b9eVar.k(t + 4);
                    long c = c(b9eVar);
                    if (c != -9223372036854775807L) {
                        j = c;
                        break;
                    }
                }
                t--;
            }
            this.g = j;
            this.e = true;
        } else {
            if (this.g == -9223372036854775807L) {
                f(ov9Var);
                return 0;
            }
            if (this.d) {
                long j3 = this.f;
                if (j3 == -9223372036854775807L) {
                    f(ov9Var);
                    return 0;
                }
                pfe pfeVar = this.a;
                this.h = pfeVar.c(this.g) - pfeVar.b(j3);
                f(ov9Var);
                return 0;
            }
            int min2 = (int) Math.min(20000L, ov9Var.zzd());
            if (ov9Var.zzf() != 0) {
                cx9Var.a = 0L;
                return 1;
            }
            this.b.h(min2);
            ov9Var.zzj();
            ((bv9) ov9Var).d(this.b.m(), 0, min2, false);
            b9e b9eVar2 = this.b;
            int s2 = b9eVar2.s();
            int t2 = b9eVar2.t();
            while (true) {
                if (s2 >= t2 - 3) {
                    break;
                }
                if (g(b9eVar2.m(), s2) == 442) {
                    b9eVar2.k(s2 + 4);
                    long c2 = c(b9eVar2);
                    if (c2 != -9223372036854775807L) {
                        j = c2;
                        break;
                    }
                }
                s2++;
            }
            this.f = j;
            this.d = true;
        }
        return 0;
    }

    public final long b() {
        return this.h;
    }

    public final pfe d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }
}
