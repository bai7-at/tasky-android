package defpackage;

/* loaded from: classes3.dex */
public final class vx9 {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public vx9(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    public final int a() {
        return (this.c * 8) + this.d;
    }

    public final int b(int i) {
        int i2 = this.c;
        int i3 = 8 - this.d;
        int i4 = i2 + 1;
        byte[] bArr = this.a;
        int min = Math.min(i, i3);
        int i5 = ((bArr[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i5 |= (this.a[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i));
        c(i);
        return i6;
    }

    public final void c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.c + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            i4++;
            this.c = i4;
            i5 -= 8;
            this.d = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.b) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        wad.f(z);
    }

    public final boolean d() {
        int i = (this.a[this.c] & 255) >> this.d;
        c(1);
        return 1 == (i & 1);
    }
}
