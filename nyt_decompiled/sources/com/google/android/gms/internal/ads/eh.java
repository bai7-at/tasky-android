package com.google.android.gms.internal.ads;

import defpackage.c0f;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class eh extends gh {
    private final Iterable f;
    private final Iterator g;
    private ByteBuffer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private long n;
    private long o;
    private long p;

    /* synthetic */ eh(Iterable iterable, int i, boolean z, c0f c0fVar) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        this.m = 0;
        if (i != 0) {
            H();
            return;
        }
        this.h = ai.e;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
    }

    private final int D() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    private final void E() {
        if (!this.g.hasNext()) {
            throw zzhag.j();
        }
        H();
    }

    private final void F(byte[] bArr, int i, int i2) {
        if (i2 > D()) {
            if (i2 > 0) {
                throw zzhag.j();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.p - this.n == 0) {
                E();
            }
            int min = Math.min(i3, (int) (this.p - this.n));
            long j = min;
            mj.w(this.n, bArr, i2 - i3, j);
            i3 -= min;
            this.n += j;
        }
    }

    private final void G() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.i = i - i3;
    }

    private final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long m = mj.m(this.h);
        this.n += m;
        this.o += m;
        this.p += m;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String A() {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                String g = qj.g(this.h, (int) (j2 - this.o), K);
                this.n += j3;
                return g;
            }
        }
        if (K >= 0 && K <= D()) {
            byte[] bArr = new byte[K];
            F(bArr, 0, K);
            return qj.h(bArr, 0, K);
        }
        if (K == 0) {
            return "";
        }
        if (K <= 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void B(int i) {
        if (this.l != i) {
            throw zzhag.b();
        }
    }

    public final void C(int i) {
        if (i >= 0) {
            if (i <= ((this.i - this.m) - this.n) + this.o) {
                while (i > 0) {
                    if (this.p - this.n == 0) {
                        E();
                    }
                    int min = Math.min(i, (int) (this.p - this.n));
                    i -= min;
                    this.n += min;
                }
                return;
            }
        }
        if (i >= 0) {
            throw zzhag.j();
        }
        throw zzhag.f();
    }

    public final byte I() {
        if (this.p - this.n == 0) {
            E();
        }
        long j = this.n;
        this.n = 1 + j;
        return mj.i(j);
    }

    public final int J() {
        long j = this.p;
        long j2 = this.n;
        if (j - j2 < 4) {
            int I = I() & 255;
            int I2 = (I() & 255) << 8;
            return ((I() & 255) << 24) | I | I2 | ((I() & 255) << 16);
        }
        this.n = 4 + j2;
        int i = mj.i(j2) & 255;
        int i2 = (mj.i(1 + j2) & 255) << 8;
        return i | i2 | ((mj.i(2 + j2) & 255) << 16) | ((mj.i(j2 + 3) & 255) << 24);
    }

    public final int K() {
        int i;
        long j = this.n;
        if (this.p != j) {
            long j2 = j + 1;
            byte i2 = mj.i(j);
            if (i2 >= 0) {
                this.n++;
                return i2;
            }
            if (this.p - this.n >= 10) {
                long j3 = 2 + j;
                int i3 = (mj.i(j2) << 7) ^ i2;
                if (i3 < 0) {
                    i = i3 ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int i4 = (mj.i(j3) << 14) ^ i3;
                    if (i4 >= 0) {
                        i = i4 ^ 16256;
                    } else {
                        long j5 = 4 + j;
                        int i5 = i4 ^ (mj.i(j4) << 21);
                        if (i5 < 0) {
                            i = (-2080896) ^ i5;
                        } else {
                            j4 = 5 + j;
                            byte i6 = mj.i(j5);
                            int i7 = (i5 ^ (i6 << 28)) ^ 266354560;
                            if (i6 < 0) {
                                j5 = 6 + j;
                                if (mj.i(j4) < 0) {
                                    j4 = 7 + j;
                                    if (mj.i(j5) < 0) {
                                        j5 = 8 + j;
                                        if (mj.i(j4) < 0) {
                                            j4 = 9 + j;
                                            if (mj.i(j5) < 0) {
                                                long j6 = j + 10;
                                                if (mj.i(j4) >= 0) {
                                                    i = i7;
                                                    j3 = j6;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i7;
                            }
                            i = i7;
                        }
                        j3 = j5;
                    }
                    j3 = j4;
                }
                this.n = j3;
                return i;
            }
        }
        return (int) N();
    }

    public final long L() {
        long j = this.p;
        long j2 = this.n;
        if (j - j2 < 8) {
            return (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24) | ((I() & 255) << 32) | ((I() & 255) << 40) | ((I() & 255) << 48) | ((I() & 255) << 56);
        }
        this.n = 8 + j2;
        return (mj.i(j2) & 255) | ((mj.i(1 + j2) & 255) << 8) | ((mj.i(2 + j2) & 255) << 16) | ((mj.i(3 + j2) & 255) << 24) | ((mj.i(j2 + 4) & 255) << 32) | ((mj.i(j2 + 5) & 255) << 40) | ((mj.i(j2 + 6) & 255) << 48) | ((mj.i(j2 + 7) & 255) << 56);
    }

    public final long M() {
        long j;
        long j2;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte i = mj.i(j3);
            if (i >= 0) {
                this.n++;
                return i;
            }
            if (this.p - this.n >= 10) {
                long j5 = 2 + j3;
                int i2 = (mj.i(j4) << 7) ^ i;
                if (i2 < 0) {
                    j = i2 ^ (-128);
                } else {
                    long j6 = 3 + j3;
                    int i3 = (mj.i(j5) << 14) ^ i2;
                    if (i3 >= 0) {
                        j = i3 ^ 16256;
                    } else {
                        long j7 = 4 + j3;
                        int i4 = i3 ^ (mj.i(j6) << 21);
                        if (i4 < 0) {
                            j = (-2080896) ^ i4;
                            j5 = j7;
                        } else {
                            j6 = 5 + j3;
                            long i5 = (mj.i(j7) << 28) ^ i4;
                            if (i5 >= 0) {
                                j = 266354560 ^ i5;
                            } else {
                                long j8 = 6 + j3;
                                long i6 = i5 ^ (mj.i(j6) << 35);
                                if (i6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j9 = 7 + j3;
                                    long i7 = i6 ^ (mj.i(j8) << 42);
                                    if (i7 >= 0) {
                                        j = 4363953127296L ^ i7;
                                    } else {
                                        j8 = 8 + j3;
                                        i6 = i7 ^ (mj.i(j9) << 49);
                                        if (i6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            j9 = 9 + j3;
                                            long i8 = (i6 ^ (mj.i(j8) << 56)) ^ 71499008037633920L;
                                            if (i8 < 0) {
                                                long j10 = j3 + 10;
                                                if (mj.i(j9) >= 0) {
                                                    j = i8;
                                                    j5 = j10;
                                                }
                                            } else {
                                                j = i8;
                                            }
                                        }
                                    }
                                    j5 = j9;
                                }
                                j = j2 ^ i6;
                                j5 = j8;
                            }
                        }
                    }
                    j5 = j6;
                }
                this.n = j5;
                return j;
            }
        }
        return N();
    }

    final long N() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((I() & 128) == 0) {
                return j;
            }
        }
        throw zzhag.e();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void a(int i) {
        this.k = i;
        G();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean b() {
        return (((long) this.m) + this.n) - this.o == ((long) this.i);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (I() >= 0) {
                    return true;
                }
            }
            throw zzhag.e();
        }
        if (i2 == 1) {
            C(8);
            return true;
        }
        if (i2 == 2) {
            C(K());
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
        return Double.longBitsToDouble(L());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final float j() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int k() {
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int l(int i) {
        if (i < 0) {
            throw zzhag.f();
        }
        int k = i + k();
        int i2 = this.k;
        if (k > i2) {
            throw zzhag.j();
        }
        this.k = k;
        G();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int o() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int p() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int q() {
        return gh.e(K());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int r() {
        if (b()) {
            this.l = 0;
            return 0;
        }
        int K = K();
        this.l = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw zzhag.c();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int s() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long t() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long u() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long v() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long w() {
        return gh.f(M());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long x() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final zzgyl y() {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[K];
                mj.w(j2, bArr, 0L, j3);
                this.n += j3;
                return new zzgyh(bArr);
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            return new zzgyh(bArr2);
        }
        if (K == 0) {
            return zzgyl.a;
        }
        if (K < 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String z() {
        int K = K();
        if (K > 0) {
            long j = this.p;
            long j2 = this.n;
            long j3 = K;
            if (j3 <= j - j2) {
                byte[] bArr = new byte[K];
                mj.w(j2, bArr, 0L, j3);
                String str = new String(bArr, ai.b);
                this.n += j3;
                return str;
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            return new String(bArr2, ai.b);
        }
        if (K == 0) {
            return "";
        }
        if (K < 0) {
            throw zzhag.f();
        }
        throw zzhag.j();
    }
}
