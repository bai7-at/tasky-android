package com.google.android.gms.internal.pal;

import defpackage.gu9;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class o extends p {
    private final byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    /* synthetic */ o(byte[] bArr, int i, int i2, boolean z, gu9 gu9Var) {
        super(null);
        this.j = Integer.MAX_VALUE;
        this.e = bArr;
        this.f = i2;
        this.h = 0;
    }

    private final void v() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j;
        if (i <= i2) {
            this.g = 0;
            return;
        }
        int i3 = i - i2;
        this.g = i3;
        this.f = i - i3;
    }

    @Override // com.google.android.gms.internal.pal.p
    public final int a() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.pal.p
    public final int b(int i) {
        if (i < 0) {
            throw zzadi.f();
        }
        int i2 = i + this.h;
        if (i2 < 0) {
            throw zzadi.g();
        }
        int i3 = this.j;
        if (i2 > i3) {
            throw zzadi.i();
        }
        this.j = i2;
        v();
        return i3;
    }

    @Override // com.google.android.gms.internal.pal.p
    public final int c() {
        if (i()) {
            this.i = 0;
            return 0;
        }
        int q = q();
        this.i = q;
        if ((q >>> 3) != 0) {
            return q;
        }
        throw zzadi.c();
    }

    @Override // com.google.android.gms.internal.pal.p
    public final zzaby d() {
        int q = q();
        if (q > 0) {
            int i = this.f;
            int i2 = this.h;
            if (q <= i - i2) {
                zzaby v = zzaby.v(this.e, i2, q);
                this.h += q;
                return v;
            }
        }
        if (q == 0) {
            return zzaby.a;
        }
        if (q > 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (q <= i3 - i4) {
                int i5 = q + i4;
                this.h = i5;
                return zzaby.x(Arrays.copyOfRange(this.e, i4, i5));
            }
        }
        if (q <= 0) {
            throw zzadi.f();
        }
        throw zzadi.i();
    }

    @Override // com.google.android.gms.internal.pal.p
    public final String e() {
        int q = q();
        if (q > 0) {
            int i = this.f;
            int i2 = this.h;
            if (q <= i - i2) {
                String str = new String(this.e, i2, q, f0.b);
                this.h += q;
                return str;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q < 0) {
            throw zzadi.f();
        }
        throw zzadi.i();
    }

    @Override // com.google.android.gms.internal.pal.p
    public final String f() {
        int q = q();
        if (q > 0) {
            int i = this.f;
            int i2 = this.h;
            if (q <= i - i2) {
                String d = t1.d(this.e, i2, q);
                this.h += q;
                return d;
            }
        }
        if (q == 0) {
            return "";
        }
        if (q <= 0) {
            throw zzadi.f();
        }
        throw zzadi.i();
    }

    @Override // com.google.android.gms.internal.pal.p
    public final void g(int i) {
        if (this.i != i) {
            throw zzadi.b();
        }
    }

    @Override // com.google.android.gms.internal.pal.p
    public final void h(int i) {
        this.j = i;
        v();
    }

    @Override // com.google.android.gms.internal.pal.p
    public final boolean i() {
        return this.h == this.f;
    }

    @Override // com.google.android.gms.internal.pal.p
    public final boolean j() {
        return s() != 0;
    }

    @Override // com.google.android.gms.internal.pal.p
    public final boolean k(int i) {
        int c;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f - this.h < 10) {
                while (i3 < 10) {
                    if (o() < 0) {
                        i3++;
                    }
                }
                throw zzadi.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.e;
                int i4 = this.h;
                this.h = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzadi.e();
            return true;
        }
        if (i2 == 1) {
            u(8);
            return true;
        }
        if (i2 == 2) {
            u(q());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzadi.a();
            }
            u(4);
            return true;
        }
        do {
            c = c();
            if (c == 0) {
                break;
            }
        } while (k(c));
        g(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte o() {
        int i = this.h;
        if (i == this.f) {
            throw zzadi.i();
        }
        byte[] bArr = this.e;
        this.h = i + 1;
        return bArr[i];
    }

    public final int p() {
        int i = this.h;
        if (this.f - i < 4) {
            throw zzadi.i();
        }
        byte[] bArr = this.e;
        this.h = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final int q() {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        if (i3 != i2) {
            byte[] bArr = this.e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
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
                this.h = i5;
                return i;
            }
        }
        return (int) t();
    }

    public final long r() {
        int i = this.h;
        if (this.f - i < 8) {
            throw zzadi.i();
        }
        byte[] bArr = this.e;
        this.h = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final long s() {
        long j;
        long j2;
        int i = this.h;
        int i2 = this.f;
        if (i2 != i) {
            byte[] bArr = this.e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                            long j4 = i9 ^ (bArr[i8] << 28);
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
                this.h = i4;
                return j;
            }
        }
        return t();
    }

    final long t() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((o() & 128) == 0) {
                return j;
            }
        }
        throw zzadi.e();
    }

    public final void u(int i) {
        if (i >= 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzadi.i();
        }
        throw zzadi.f();
    }
}
