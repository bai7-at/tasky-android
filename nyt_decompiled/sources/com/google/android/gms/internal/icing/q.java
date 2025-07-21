package com.google.android.gms.internal.icing;

/* loaded from: classes3.dex */
final class q extends r {
    private final byte[] d;
    private final int e;
    private int f;

    q(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.d = bArr;
        this.f = 0;
        this.e = i2;
    }

    public final void D(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
        }
    }

    public final void E(String str) {
        int i = this.f;
        try {
            int A = r.A(str.length() * 3);
            int A2 = r.A(str.length());
            if (A2 != A) {
                r(n1.c(str));
                byte[] bArr = this.d;
                int i2 = this.f;
                this.f = n1.d(str, bArr, i2, this.e - i2);
                return;
            }
            int i3 = i + A2;
            this.f = i3;
            int d = n1.d(str, this.d, i3, this.e - i3);
            this.f = i;
            r((d - i) - A2);
            this.f = d;
        } catch (zzfq e) {
            this.f = i;
            d(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzcl(e2);
        }
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void g(int i, int i2) {
        r((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void h(int i, int i2) {
        r(i << 3);
        q(i2);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void i(int i, int i2) {
        r(i << 3);
        r(i2);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void j(int i, int i2) {
        r((i << 3) | 5);
        s(i2);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void k(int i, long j) {
        r(i << 3);
        t(j);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void l(int i, long j) {
        r((i << 3) | 1);
        u(j);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void m(int i, boolean z) {
        r(i << 3);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void n(int i, String str) {
        r((i << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void o(int i, zzcf zzcfVar) {
        r((i << 3) | 2);
        r(zzcfVar.e());
        zzcfVar.g(this);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void p(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void q(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void r(int i) {
        boolean z;
        z = r.c;
        if (z) {
            int i2 = h.a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr2 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void s(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void t(long j) {
        boolean z;
        z = r.c;
        if (z && this.e - this.f >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                k1.u(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            k1.u(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.d;
                int i3 = this.f;
                this.f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void u(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.f = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.f = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.f = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.f = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.f = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.f = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zzcl(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.icing.r
    public final void v(byte[] bArr, int i, int i2) {
        D(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.icing.r
    public final int w() {
        return this.e - this.f;
    }
}
