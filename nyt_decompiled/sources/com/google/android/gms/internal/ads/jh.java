package com.google.android.gms.internal.ads;

import defpackage.w1f;

/* loaded from: classes3.dex */
final class jh extends lh {
    private final byte[] e;
    private final int f;
    private int g;

    jh(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.e = bArr;
        this.g = 0;
        this.f = i2;
    }

    public final void C(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.e, this.g, i2);
            this.g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
        }
    }

    public final void D(String str) {
        int i = this.g;
        try {
            int B = lh.B(str.length() * 3);
            int B2 = lh.B(str.length());
            if (B2 != B) {
                v(qj.e(str));
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = qj.d(str, bArr, i2, this.f - i2);
                return;
            }
            int i3 = i + B2;
            this.g = i3;
            int d = qj.d(str, this.e, i3, this.f - i3);
            this.g = i;
            v((d - i) - B2);
            this.g = d;
        } catch (zzhdd e) {
            this.g = i;
            e(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgyx(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh, defpackage.yze
    public final void a(byte[] bArr, int i, int i2) {
        C(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void h(byte b) {
        try {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void i(int i, boolean z) {
        v(i << 3);
        h(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void j(int i, zzgyl zzgylVar) {
        v((i << 3) | 2);
        v(zzgylVar.g());
        zzgylVar.w(this);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final int k() {
        return this.f - this.g;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void l(int i, int i2) {
        v((i << 3) | 5);
        m(i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void m(int i) {
        try {
            byte[] bArr = this.e;
            int i2 = this.g;
            int i3 = i2 + 1;
            this.g = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.g = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.g = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.g = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void n(int i, long j) {
        v((i << 3) | 1);
        o(j);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void o(long j) {
        try {
            byte[] bArr = this.e;
            int i = this.g;
            int i2 = i + 1;
            this.g = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.g = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.g = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.g = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.g = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.g = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.g = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.g = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void p(int i, int i2) {
        v(i << 3);
        q(i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void q(int i) {
        if (i >= 0) {
            v(i);
        } else {
            x(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    final void r(int i, w1f w1fVar, bj bjVar) {
        v((i << 3) | 2);
        v(((rg) w1fVar).d(bjVar));
        bjVar.e(w1fVar, this.a);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void s(int i, String str) {
        v((i << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void t(int i, int i2) {
        v((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void u(int i, int i2) {
        v(i << 3);
        v(i2);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void v(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }
        byte[] bArr2 = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void w(int i, long j) {
        v(i << 3);
        x(j);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void x(long j) {
        boolean z;
        z = lh.c;
        if (!z || this.f - this.g < 10) {
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzgyx(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr2 = this.e;
            int i2 = this.g;
            this.g = i2 + 1;
            bArr2[i2] = (byte) j;
            return;
        }
        while (true) {
            int i3 = (int) j;
            if ((j & (-128)) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.g;
                this.g = i4 + 1;
                mj.y(bArr3, i4, (byte) i3);
                return;
            }
            byte[] bArr4 = this.e;
            int i5 = this.g;
            this.g = i5 + 1;
            mj.y(bArr4, i5, (byte) ((i3 | 128) & 255));
            j >>>= 7;
        }
    }
}
