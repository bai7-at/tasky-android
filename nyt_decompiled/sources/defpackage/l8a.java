package defpackage;

/* loaded from: classes3.dex */
final class l8a implements uu9 {
    private final pfe a;
    private final b9e b = new b9e();

    /* synthetic */ l8a(pfe pfeVar, k8a k8aVar) {
        this.a = pfeVar;
    }

    @Override // defpackage.uu9
    public final tu9 a(ov9 ov9Var, long j) {
        int h;
        long j2;
        long zzf = ov9Var.zzf();
        int min = (int) Math.min(20000L, ov9Var.zzd() - zzf);
        this.b.h(min);
        ((bv9) ov9Var).d(this.b.m(), 0, min, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            b9e b9eVar = this.b;
            if (b9eVar.q() < 4) {
                return j3 != -9223372036854775807L ? tu9.f(j3, zzf + i) : tu9.d;
            }
            if (m8a.h(b9eVar.m(), b9eVar.s()) != 442) {
                b9eVar.l(1);
            } else {
                b9eVar.l(4);
                long c = n8a.c(b9eVar);
                if (c != -9223372036854775807L) {
                    long b = this.a.b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return tu9.d(b, zzf);
                        }
                        j2 = i2;
                    } else {
                        if (100000 + b > j) {
                            j2 = b9eVar.s();
                            break;
                        }
                        i2 = b9eVar.s();
                        j3 = b;
                    }
                }
                int t = b9eVar.t();
                if (b9eVar.q() >= 10) {
                    b9eVar.l(9);
                    int B = b9eVar.B() & 7;
                    if (b9eVar.q() >= B) {
                        b9eVar.l(B);
                        if (b9eVar.q() >= 4) {
                            if (m8a.h(b9eVar.m(), b9eVar.s()) == 443) {
                                b9eVar.l(4);
                                int F = b9eVar.F();
                                if (b9eVar.q() < F) {
                                    b9eVar.k(t);
                                } else {
                                    b9eVar.l(F);
                                }
                            }
                            while (true) {
                                if (b9eVar.q() < 4 || (h = m8a.h(b9eVar.m(), b9eVar.s())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                b9eVar.l(4);
                                if (b9eVar.q() < 2) {
                                    b9eVar.k(t);
                                    break;
                                }
                                b9eVar.k(Math.min(b9eVar.t(), b9eVar.s() + b9eVar.F()));
                            }
                        } else {
                            b9eVar.k(t);
                        }
                    } else {
                        b9eVar.k(t);
                    }
                } else {
                    b9eVar.k(t);
                }
                i = b9eVar.s();
            }
        }
        return tu9.e(zzf + j2);
    }

    @Override // defpackage.uu9
    public final void zzb() {
        byte[] bArr = khe.f;
        int length = bArr.length;
        this.b.i(bArr, 0);
    }
}
