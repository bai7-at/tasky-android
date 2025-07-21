package com.google.android.gms.internal.ads;

import defpackage.b0f;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class dh extends gh {
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l;

    /* synthetic */ dh(byte[] bArr, int i, int i2, boolean z, b0f b0fVar) {
        super(null);
        this.l = Integer.MAX_VALUE;
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    private final void D() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String A() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                String h = qj.h(this.f, i2, G);
                this.i += G;
                return h;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void B(int i) {
        if (this.k != i) {
            throw zzhag.b();
        }
    }

    public final void C(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzhag.j();
        }
        throw zzhag.f();
    }

    public final byte E() {
        int i = this.i;
        if (i == this.g) {
            throw zzhag.j();
        }
        byte[] bArr = this.f;
        this.i = i + 1;
        return bArr[i];
    }

    public final int F() {
        int i = this.i;
        if (this.g - i < 4) {
            throw zzhag.j();
        }
        byte[] bArr = this.f;
        this.i = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int G() {
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.i = i5;
                return i;
            }
        }
        return (int) J();
    }

    public final long H() {
        int i = this.i;
        if (this.g - i < 8) {
            throw zzhag.j();
        }
        byte[] bArr = this.f;
        this.i = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        long j5 = bArr[i + 5];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40);
    }

    public final long I() {
        long j;
        long j2;
        int i = this.i;
        int i2 = this.g;
        if (i2 != i) {
            byte[] bArr = this.f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            long j3 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j3;
                        } else {
                            i6 = i + 5;
                            long j4 = (bArr[i8] << 28) ^ i9;
                            if (j4 >= 0) {
                                j = j4 ^ 266354560;
                            } else {
                                i4 = i + 6;
                                long j5 = (bArr[i6] << 35) ^ j4;
                                if (j5 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    int i10 = i + 7;
                                    long j6 = j5 ^ (bArr[i4] << 42);
                                    if (j6 >= 0) {
                                        j = j6 ^ 4363953127296L;
                                    } else {
                                        i4 = i + 8;
                                        j5 = j6 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i + 9;
                                            long j7 = (j5 ^ (bArr[i4] << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i4 = i + 10;
                                                if (bArr[i10] >= 0) {
                                                    j = j7;
                                                }
                                            } else {
                                                j = j7;
                                            }
                                        }
                                    }
                                    i4 = i10;
                                }
                                j = j5 ^ j2;
                            }
                        }
                    }
                    i4 = i6;
                }
                this.i = i4;
                return j;
            }
        }
        return J();
    }

    final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((E() & 128) == 0) {
                return j;
            }
        }
        throw zzhag.e();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void a(int i) {
        this.l = i;
        D();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean b() {
        return this.i == this.g;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean c() {
        return I() != 0;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.g - this.i < 10) {
                while (i3 < 10) {
                    if (E() < 0) {
                        i3++;
                    }
                }
                throw zzhag.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f;
                int i4 = this.i;
                this.i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzhag.e();
            return true;
        }
        if (i2 == 1) {
            C(8);
            return true;
        }
        if (i2 == 2) {
            C(G());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzhag.a();
            }
            C(4);
            return true;
        }
        do {
            r = r();
            if (r == 0) {
                break;
            }
        } while (d(r));
        B(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final double i() {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final float j() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int k() {
        return this.i - this.j;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int l(int i) {
        if (i < 0) {
            throw zzhag.f();
        }
        int i2 = i + (this.i - this.j);
        if (i2 < 0) {
            throw zzhag.g();
        }
        int i3 = this.l;
        if (i2 > i3) {
            throw zzhag.j();
        }
        this.l = i2;
        D();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int m() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int n() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int o() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int p() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int q() {
        return gh.e(G());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int r() {
        if (b()) {
            this.k = 0;
            return 0;
        }
        int G = G();
        this.k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw zzhag.c();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int s() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long t() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long u() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long v() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long w() {
        return gh.f(I());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long x() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final zzgyl y() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                zzgyl D = zzgyl.D(this.f, i2, G);
                this.i += G;
                return D;
            }
        }
        if (G == 0) {
            return zzgyl.a;
        }
        if (G > 0) {
            int i3 = this.g;
            int i4 = this.i;
            if (G <= i3 - i4) {
                int i5 = G + i4;
                this.i = i5;
                return new zzgyh(Arrays.copyOfRange(this.f, i4, i5));
            }
        }
        if (G <= 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String z() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                String str = new String(this.f, i2, G, ai.b);
                this.i += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }
}
