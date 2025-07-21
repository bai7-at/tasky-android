package defpackage;

/* loaded from: classes3.dex */
final class e9a {
    private boolean c;
    private boolean d;
    private boolean e;
    private final pfe a = new pfe(0);
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;
    private final b9e b = new b9e();

    e9a(int i) {
    }

    private final int e(ov9 ov9Var) {
        byte[] bArr = khe.f;
        int length = bArr.length;
        this.b.i(bArr, 0);
        this.c = true;
        ov9Var.zzj();
        return 0;
    }

    public final int a(ov9 ov9Var, cx9 cx9Var, int i) {
        if (i <= 0) {
            e(ov9Var);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.e) {
            long zzd = ov9Var.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j2 = zzd - min;
            if (ov9Var.zzf() == j2) {
                this.b.h(min);
                ov9Var.zzj();
                ((bv9) ov9Var).d(this.b.m(), 0, min, false);
                b9e b9eVar = this.b;
                int s = b9eVar.s();
                int t = b9eVar.t();
                int i2 = t - 188;
                while (true) {
                    if (i2 < s) {
                        break;
                    }
                    byte[] m = b9eVar.m();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < s || i5 >= t || m[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long b = o9a.b(b9eVar, i2, i);
                                if (b != -9223372036854775807L) {
                                    j = b;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.g = j;
                this.e = true;
                return 0;
            }
            cx9Var.a = j2;
        } else {
            if (this.g == -9223372036854775807L) {
                e(ov9Var);
                return 0;
            }
            if (this.d) {
                long j3 = this.f;
                if (j3 == -9223372036854775807L) {
                    e(ov9Var);
                    return 0;
                }
                pfe pfeVar = this.a;
                this.h = pfeVar.c(this.g) - pfeVar.b(j3);
                e(ov9Var);
                return 0;
            }
            int min2 = (int) Math.min(112800L, ov9Var.zzd());
            if (ov9Var.zzf() == 0) {
                this.b.h(min2);
                ov9Var.zzj();
                ((bv9) ov9Var).d(this.b.m(), 0, min2, false);
                b9e b9eVar2 = this.b;
                int s2 = b9eVar2.s();
                int t2 = b9eVar2.t();
                while (true) {
                    if (s2 >= t2) {
                        break;
                    }
                    if (b9eVar2.m()[s2] == 71) {
                        long b2 = o9a.b(b9eVar2, s2, i);
                        if (b2 != -9223372036854775807L) {
                            j = b2;
                            break;
                        }
                    }
                    s2++;
                }
                this.f = j;
                this.d = true;
                return 0;
            }
            cx9Var.a = 0L;
        }
        return 1;
    }

    public final long b() {
        return this.h;
    }

    public final pfe c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }
}
