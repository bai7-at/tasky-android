package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import defpackage.d0f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class fh extends gh {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* synthetic */ fh(InputStream inputStream, int i, d0f d0fVar) {
        super(null);
        this.m = Integer.MAX_VALUE;
        byte[] bArr = ai.d;
        this.f = inputStream;
        this.g = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private final List D(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, ProgressEvent.PART_FAILED_EVENT_CODE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzhag.j();
                }
                this.l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void E() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    private final void F(int i) {
        if (G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.l) - this.j) {
            throw zzhag.j();
        }
        throw zzhag.i();
    }

    private final boolean G(int i) {
        int i2 = this.j;
        int i3 = i2 + i;
        int i4 = this.h;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.l;
        if (i > (Integer.MAX_VALUE - i5) - i2 || i5 + i2 + i > this.m) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.g;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            i5 = this.l + i2;
            this.l = i5;
            i4 = this.h - i2;
            this.h = i4;
            this.j = 0;
        }
        try {
            int read = this.f.read(this.g, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
            if (read == 0 || read < -1 || read > 4096) {
                throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.h += read;
            E();
            if (this.h >= i) {
                return true;
            }
            return G(i);
        } catch (zzhag e) {
            e.k();
            throw e;
        }
    }

    private final byte[] H(int i, boolean z) {
        byte[] I = I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> D = D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    private final byte[] I(int i) {
        if (i == 0) {
            return ai.d;
        }
        if (i < 0) {
            throw zzhag.f();
        }
        int i2 = this.l;
        int i3 = this.j;
        int i4 = i2 + i3 + i;
        if ((-2147483647) + i4 > 0) {
            throw zzhag.i();
        }
        int i5 = this.m;
        if (i4 > i5) {
            C((i5 - i2) - i3);
            throw zzhag.j();
        }
        int i6 = this.h - i3;
        int i7 = i - i6;
        if (i7 >= 4096) {
            try {
                if (i7 > this.f.available()) {
                    return null;
                }
            } catch (zzhag e) {
                e.k();
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, this.j, bArr, 0, i6);
        this.l += this.h;
        this.j = 0;
        this.h = 0;
        while (i6 < i) {
            try {
                int read = this.f.read(bArr, i6, i - i6);
                if (read == -1) {
                    throw zzhag.j();
                }
                this.l += read;
                i6 += read;
            } catch (zzhag e2) {
                e2.k();
                throw e2;
            }
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String A() {
        byte[] H;
        int L = L();
        int i = this.j;
        int i2 = this.h;
        if (L <= i2 - i && L > 0) {
            H = this.g;
            this.j = i + L;
        } else {
            if (L == 0) {
                return "";
            }
            i = 0;
            if (L <= i2) {
                F(L);
                H = this.g;
                this.j = L;
            } else {
                H = H(L, false);
            }
        }
        return qj.h(H, i, L);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void B(int i) {
        if (this.k != i) {
            throw zzhag.b();
        }
    }

    public final void C(int i) {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzhag.f();
        }
        int i5 = this.l;
        int i6 = i5 + i3;
        int i7 = this.m;
        if (i6 + i > i7) {
            C((i7 - i5) - i3);
            throw zzhag.j();
        }
        this.l = i6;
        this.h = 0;
        this.j = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                try {
                    long skip = this.f.skip(j);
                    if (skip < 0 || skip > j) {
                        throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i4 += (int) skip;
                    }
                } catch (zzhag e) {
                    e.k();
                    throw e;
                }
            } catch (Throwable th) {
                this.l += i4;
                E();
                throw th;
            }
        }
        this.l += i4;
        E();
        if (i4 >= i) {
            return;
        }
        int i8 = this.h;
        int i9 = i8 - this.j;
        this.j = i8;
        F(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.h;
            if (i10 <= i11) {
                this.j = i10;
                return;
            } else {
                i9 += i11;
                this.j = i11;
                F(1);
            }
        }
    }

    public final byte J() {
        if (this.j == this.h) {
            F(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
    }

    public final int K() {
        int i = this.j;
        if (this.h - i < 4) {
            F(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int L() {
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
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
                this.j = i5;
                return i;
            }
        }
        return (int) O();
    }

    public final long M() {
        int i = this.j;
        if (this.h - i < 8) {
            F(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        long j = bArr[i];
        long j2 = bArr[i + 2];
        long j3 = bArr[i + 3];
        long j4 = bArr[i + 4];
        long j5 = bArr[i + 5];
        return ((bArr[i + 7] & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40);
    }

    public final long N() {
        long j;
        long j2;
        int i = this.j;
        int i2 = this.h;
        if (i2 != i) {
            byte[] bArr = this.g;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.j = i3;
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
                this.j = i4;
                return j;
            }
        }
        return O();
    }

    final long O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((J() & 128) == 0) {
                return j;
            }
        }
        throw zzhag.e();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final void a(int i) {
        this.m = i;
        E();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean b() {
        return this.j == this.h && !G(1);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean c() {
        return N() != 0;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.h - this.j < 10) {
                while (i3 < 10) {
                    if (J() < 0) {
                        i3++;
                    }
                }
                throw zzhag.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.g;
                int i4 = this.j;
                this.j = i4 + 1;
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
            C(L());
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
        return Double.longBitsToDouble(M());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final float j() {
        return Float.intBitsToFloat(K());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int k() {
        return this.l + this.j;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int l(int i) {
        if (i < 0) {
            throw zzhag.f();
        }
        int i2 = this.l + this.j;
        int i3 = this.m;
        int i4 = i + i2;
        if (i4 > i3) {
            throw zzhag.j();
        }
        this.m = i4;
        E();
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int m() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int n() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int o() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int p() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int q() {
        return gh.e(L());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int r() {
        if (b()) {
            this.k = 0;
            return 0;
        }
        int L = L();
        this.k = L;
        if ((L >>> 3) != 0) {
            return L;
        }
        throw zzhag.c();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final int s() {
        return L();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long t() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long u() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long v() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long w() {
        return gh.f(N());
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final long x() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final zzgyl y() {
        int L = L();
        int i = this.h;
        int i2 = this.j;
        if (L <= i - i2 && L > 0) {
            zzgyl D = zzgyl.D(this.g, i2, L);
            this.j += L;
            return D;
        }
        if (L == 0) {
            return zzgyl.a;
        }
        byte[] I = I(L);
        if (I != null) {
            return zzgyl.D(I, 0, I.length);
        }
        int i3 = this.j;
        int i4 = this.h;
        int i5 = i4 - i3;
        this.l += i4;
        this.j = 0;
        this.h = 0;
        List<byte[]> D2 = D(L - i5);
        byte[] bArr = new byte[L];
        System.arraycopy(this.g, i3, bArr, 0, i5);
        for (byte[] bArr2 : D2) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return new zzgyh(bArr);
    }

    @Override // com.google.android.gms.internal.ads.gh
    public final String z() {
        int L = L();
        if (L > 0) {
            int i = this.h;
            int i2 = this.j;
            if (L <= i - i2) {
                String str = new String(this.g, i2, L, ai.b);
                this.j += L;
                return str;
            }
        }
        if (L == 0) {
            return "";
        }
        if (L > this.h) {
            return new String(H(L, false), ai.b);
        }
        F(L);
        String str2 = new String(this.g, this.j, L, ai.b);
        this.j += L;
        return str2;
    }
}
