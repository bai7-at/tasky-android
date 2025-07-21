package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
abstract class ih extends lh {
    final byte[] e;
    final int f;
    int g;
    int h;

    ih(int i) {
        super(null);
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.e = bArr;
        this.f = bArr.length;
    }

    final void C(byte b) {
        int i = this.g;
        this.g = i + 1;
        this.e[i] = b;
        this.h++;
    }

    final void D(int i) {
        int i2 = this.g;
        int i3 = i2 + 1;
        this.g = i3;
        byte[] bArr = this.e;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.g = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        this.g = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.g = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.h += 4;
    }

    final void E(long j) {
        int i = this.g;
        int i2 = i + 1;
        this.g = i2;
        byte[] bArr = this.e;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.g = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.g = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.g = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
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
        this.h += 8;
    }

    final void F(int i) {
        boolean z;
        z = lh.c;
        if (!z) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.e;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) ((i | 128) & 255);
                this.h++;
                i >>>= 7;
            }
            byte[] bArr2 = this.e;
            int i3 = this.g;
            this.g = i3 + 1;
            bArr2[i3] = (byte) i;
            this.h++;
            return;
        }
        long j = this.g;
        while ((i & (-128)) != 0) {
            byte[] bArr3 = this.e;
            int i4 = this.g;
            this.g = i4 + 1;
            mj.y(bArr3, i4, (byte) ((i | 128) & 255));
            i >>>= 7;
        }
        byte[] bArr4 = this.e;
        int i5 = this.g;
        this.g = i5 + 1;
        mj.y(bArr4, i5, (byte) i);
        this.h += (int) (this.g - j);
    }

    final void G(long j) {
        boolean z;
        z = lh.c;
        if (z) {
            long j2 = this.g;
            while (true) {
                int i = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    mj.y(bArr, i2, (byte) i);
                    this.h += (int) (this.g - j2);
                    return;
                }
                byte[] bArr2 = this.e;
                int i3 = this.g;
                this.g = i3 + 1;
                mj.y(bArr2, i3, (byte) ((i | 128) & 255));
                j >>>= 7;
            }
        } else {
            while (true) {
                int i4 = (int) j;
                if ((j & (-128)) == 0) {
                    byte[] bArr3 = this.e;
                    int i5 = this.g;
                    this.g = i5 + 1;
                    bArr3[i5] = (byte) i4;
                    this.h++;
                    return;
                }
                byte[] bArr4 = this.e;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr4[i6] = (byte) ((i4 | 128) & 255);
                this.h++;
                j >>>= 7;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final int k() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
