package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class ui1 {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final byte[] d;

    public ui1(CharSequence charSequence, int i, int i2) {
        this.a = charSequence;
        this.c = i;
        this.b = i2;
        byte[] bArr = new byte[i * i2];
        this.d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i) {
        g(this.b - 1, 0, i, 1);
        g(this.b - 1, 1, i, 2);
        g(this.b - 1, 2, i, 3);
        g(0, this.c - 2, i, 4);
        g(0, this.c - 1, i, 5);
        g(1, this.c - 1, i, 6);
        g(2, this.c - 1, i, 7);
        g(3, this.c - 1, i, 8);
    }

    private void b(int i) {
        g(this.b - 3, 0, i, 1);
        g(this.b - 2, 0, i, 2);
        g(this.b - 1, 0, i, 3);
        g(0, this.c - 4, i, 4);
        g(0, this.c - 3, i, 5);
        g(0, this.c - 2, i, 6);
        g(0, this.c - 1, i, 7);
        g(1, this.c - 1, i, 8);
    }

    private void c(int i) {
        g(this.b - 3, 0, i, 1);
        g(this.b - 2, 0, i, 2);
        g(this.b - 1, 0, i, 3);
        g(0, this.c - 2, i, 4);
        g(0, this.c - 1, i, 5);
        g(1, this.c - 1, i, 6);
        g(2, this.c - 1, i, 7);
        g(3, this.c - 1, i, 8);
    }

    private void d(int i) {
        g(this.b - 1, 0, i, 1);
        g(this.b - 1, this.c - 1, i, 2);
        g(0, this.c - 3, i, 3);
        g(0, this.c - 2, i, 4);
        g(0, this.c - 1, i, 5);
        g(1, this.c - 3, i, 6);
        g(1, this.c - 2, i, 7);
        g(1, this.c - 1, i, 8);
    }

    private boolean f(int i, int i2) {
        return this.d[(i2 * this.c) + i] >= 0;
    }

    private void g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        i(i2, i, (this.a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void i(int i, int i2, boolean z) {
        this.d[(i2 * this.c) + i] = z ? (byte) 1 : (byte) 0;
    }

    private void j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        g(i4, i6, i3, 2);
        int i7 = i - 1;
        g(i7, i5, i3, 3);
        g(i7, i6, i3, 4);
        g(i7, i2, i3, 5);
        g(i, i5, i3, 6);
        g(i, i6, i3, 7);
        g(i, i2, i3, 8);
    }

    public final boolean e(int i, int i2) {
        return this.d[(i2 * this.c) + i] == 1;
    }

    public final void h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.b && i3 == 0) {
                a(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 4 != 0) {
                b(i4);
                i4++;
            }
            if (i5 == this.b - 2 && i3 == 0 && this.c % 8 == 4) {
                c(i4);
                i4++;
            }
            if (i5 == this.b + 4 && i3 == 2 && this.c % 8 == 0) {
                d(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.b && i3 >= 0 && !f(i3, i5)) {
                    j(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.c && !f(i9, i8)) {
                    j(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.c)) {
                break;
            }
        }
        if (f(i2 - 1, i - 1)) {
            return;
        }
        i(this.c - 1, this.b - 1, true);
        i(this.c - 2, this.b - 2, true);
    }
}
