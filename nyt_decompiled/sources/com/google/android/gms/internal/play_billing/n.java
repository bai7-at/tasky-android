package com.google.android.gms.internal.play_billing;

/* loaded from: classes3.dex */
final class n extends o {
    private final byte[] e;
    private final int f;
    private int g;

    n(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.e = bArr;
        this.g = 0;
        this.f = i2;
    }

    public final void B(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.e, this.g, i2);
            this.g += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
        }
    }

    public final void C(String str) {
        int i = this.g;
        try {
            int y = o.y(str.length() * 3);
            int y2 = o.y(str.length());
            if (y2 != y) {
                r(l1.c(str));
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = l1.b(str, bArr, i2, this.f - i2);
                return;
            }
            int i3 = i + y2;
            this.g = i3;
            int b = l1.b(str, this.e, i3, this.f - i3);
            this.g = i;
            r((b - i) - y2);
            this.g = b;
        } catch (zzeu e) {
            this.g = i;
            b(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzbg(e2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final int d() {
        return this.f - this.g;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void e(byte b) {
        try {
            byte[] bArr = this.e;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void f(int i, boolean z) {
        r(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void g(int i, zzba zzbaVar) {
        r((i << 3) | 2);
        r(zzbaVar.e());
        zzbaVar.k(this);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void h(int i, int i2) {
        r((i << 3) | 5);
        i(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void i(int i) {
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
            throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void j(int i, long j) {
        r((i << 3) | 1);
        k(j);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void k(long j) {
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
            throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void l(int i, int i2) {
        r(i << 3);
        m(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void m(int i) {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void n(byte[] bArr, int i, int i2) {
        B(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void o(int i, String str) {
        r((i << 3) | 2);
        C(str);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void p(int i, int i2) {
        r((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void q(int i, int i2) {
        r(i << 3);
        r(i2);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void r(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }
        byte[] bArr2 = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void s(int i, long j) {
        r(i << 3);
        t(j);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final void t(long j) {
        boolean z;
        z = o.c;
        if (z && this.f - this.g >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.e;
                int i = this.g;
                this.g = i + 1;
                h1.s(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i2 = this.g;
            this.g = i2 + 1;
            h1.s(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zzbg(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }
        byte[] bArr4 = this.e;
        int i4 = this.g;
        this.g = i4 + 1;
        bArr4[i4] = (byte) j;
    }
}
