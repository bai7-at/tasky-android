package defpackage;

/* loaded from: classes3.dex */
public final class yw9 {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public final boolean a(int i) {
        boolean m;
        int i2;
        int i3;
        int i4;
        int i5;
        String[] strArr;
        int[] iArr;
        int l;
        int[] iArr2;
        int[] iArr3;
        int i6;
        int[] iArr4;
        int[] iArr5;
        int i7;
        int[] iArr6;
        m = zw9.m(i);
        if (!m || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i8 = i4 - 1;
        this.a = i2;
        strArr = zw9.a;
        this.b = strArr[3 - i3];
        iArr = zw9.b;
        int i9 = iArr[i5];
        this.d = i9;
        if (i2 == 2) {
            i9 /= 2;
            this.d = i9;
        } else if (i2 == 0) {
            i9 /= 4;
            this.d = i9;
        }
        int i10 = (i >>> 9) & 1;
        l = zw9.l(i2, i3);
        this.g = l;
        if (i3 == 3) {
            if (i2 == 3) {
                iArr6 = zw9.c;
                i7 = iArr6[i8];
            } else {
                iArr5 = zw9.d;
                i7 = iArr5[i8];
            }
            this.f = i7;
            this.c = (((i7 * 12) / i9) + i10) * 4;
        } else {
            if (i2 == 3) {
                if (i3 == 2) {
                    iArr4 = zw9.e;
                    i6 = iArr4[i8];
                } else {
                    iArr3 = zw9.f;
                    i6 = iArr3[i8];
                }
                this.f = i6;
                this.c = ((i6 * 144) / i9) + i10;
            } else {
                iArr2 = zw9.g;
                int i11 = iArr2[i8];
                this.f = i11;
                this.c = (((i3 == 1 ? 72 : 144) * i11) / i9) + i10;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
