package defpackage;

/* loaded from: classes3.dex */
public final class g8e {
    public byte[] a;
    private int b;
    private int c;
    private int d;

    public g8e(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    private final void p() {
        int i;
        int i2 = this.b;
        boolean z = false;
        if (i2 >= 0 && (i2 < (i = this.d) || (i2 == i && this.c == 0))) {
            z = true;
        }
        wad.f(z);
    }

    public final int a() {
        return ((this.d - this.b) * 8) - this.c;
    }

    public final int b() {
        wad.f(this.c == 0);
        return this.b;
    }

    public final int c() {
        return (this.b * 8) + this.c;
    }

    public final int d(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = i3 | ((bArr2[i6] & 255) >> (8 - i2));
        int i8 = 32 - i;
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        int i9 = ((-1) >>> i8) & i7;
        p();
        return i9;
    }

    public final void e() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        this.b++;
        p();
    }

    public final void f(int i, int i2) {
        int min = Math.min(8 - this.c, 14);
        int i3 = this.c;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.a;
        int i5 = this.b;
        byte b = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        bArr[i5] = b;
        int i6 = 14 - min;
        int i7 = i & 16383;
        bArr[i5] = (byte) (b | ((i7 >>> i6) << i4));
        int i8 = i5 + 1;
        while (i6 > 8) {
            i6 -= 8;
            this.a[i8] = (byte) (i7 >>> i6);
            i8++;
        }
        byte[] bArr2 = this.a;
        byte b2 = (byte) (bArr2[i8] & ((1 << r0) - 1));
        bArr2[i8] = b2;
        bArr2[i8] = (byte) (((i7 & ((1 << i6) - 1)) << (8 - i6)) | b2);
        m(14);
        p();
    }

    public final void g(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = 0;
        while (true) {
            i3 = i2 >> 3;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr2 = this.a;
            int i5 = this.b;
            int i6 = i5 + 1;
            this.b = i6;
            byte b = bArr2[i5];
            int i7 = this.c;
            byte b2 = (byte) (b << i7);
            bArr[i4] = b2;
            bArr[i4] = (byte) (((bArr2[i6] & 255) >> (8 - i7)) | b2);
            i4++;
        }
        int i8 = i2 & 7;
        if (i8 == 0) {
            return;
        }
        byte b3 = (byte) (bArr[i3] & (255 >> i8));
        bArr[i3] = b3;
        int i9 = this.c;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.a;
            int i10 = this.b;
            this.b = i10 + 1;
            b3 = (byte) (b3 | ((bArr3[i10] & 255) << i9));
            bArr[i3] = b3;
            i9 -= 8;
        }
        int i11 = i9 + i8;
        this.c = i11;
        byte[] bArr4 = this.a;
        int i12 = this.b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | b3);
        if (i11 == 8) {
            this.c = 0;
            this.b = i12 + 1;
        }
        p();
    }

    public final void h(byte[] bArr, int i, int i2) {
        wad.f(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i2);
        this.b += i2;
        p();
    }

    public final void i(b9e b9eVar) {
        j(b9eVar.m(), b9eVar.t());
        k(b9eVar.s() * 8);
    }

    public final void j(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final void k(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 * 8);
        p();
    }

    public final void l() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        p();
    }

    public final void m(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 * 8));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        p();
    }

    public final void n(int i) {
        wad.f(this.c == 0);
        this.b += i;
        p();
    }

    public final boolean o() {
        int i = this.a[this.b] & (128 >> this.c);
        l();
        return i != 0;
    }

    public g8e() {
        this.a = khe.f;
    }
}
