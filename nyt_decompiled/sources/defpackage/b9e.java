package defpackage;

import com.google.android.gms.internal.ads.zzgaf;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b9e {
    private static final char[] d = {'\r', '\n'};
    private static final char[] e = {'\n'};
    private static final zzgaf f = zzgaf.z(ege.a, ege.c, ege.f, ege.d, ege.e);
    private byte[] a;
    private int b;
    private int c;

    public b9e(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    private final char n(Charset charset, char[] cArr) {
        int o = o(charset);
        if (o != 0) {
            int i = o >> 16;
            for (char c : cArr) {
                char c2 = (char) i;
                if (c == c2) {
                    this.b += (char) o;
                    return c2;
                }
            }
        }
        return (char) 0;
    }

    private final int o(Charset charset) {
        byte a;
        char b;
        int i = 1;
        if (charset.equals(ege.c) || charset.equals(ege.a)) {
            if (this.c - this.b > 0) {
                a = (byte) nje.a(this.a[r2] & 255);
                return (nje.a(a) << 16) + i;
            }
        }
        if (charset.equals(ege.f) || charset.equals(ege.d)) {
            int i2 = this.c;
            int i3 = this.b;
            if (i2 - i3 >= 2) {
                byte[] bArr = this.a;
                b = nje.b(bArr[i3], bArr[i3 + 1]);
                a = (byte) b;
                i = 2;
                return (nje.a(a) << 16) + i;
            }
        }
        if (!charset.equals(ege.e)) {
            return 0;
        }
        int i4 = this.c;
        int i5 = this.b;
        if (i4 - i5 < 2) {
            return 0;
        }
        byte[] bArr2 = this.a;
        b = nje.b(bArr2[i5 + 1], bArr2[i5]);
        a = (byte) b;
        i = 2;
        return (nje.a(a) << 16) + i;
    }

    public final int A() {
        return B() | (B() << 21) | (B() << 14) | (B() << 7);
    }

    public final int B() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int C() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        int i4 = bArr[i2] & 255;
        this.b = i + 4;
        return (i3 << 8) | i4;
    }

    public final int D() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | (i3 << 16) | (i5 << 8);
    }

    public final int E() {
        int v = v();
        if (v >= 0) {
            return v;
        }
        throw new IllegalStateException("Top bit not zero: " + v);
    }

    public final int F() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final long G() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return ((bArr[r5] & 255) << 56) | ((j7 & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
    }

    public final long H() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final long I() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        int i4 = i + 3;
        this.b = i4;
        long j3 = bArr[i3];
        int i5 = i + 4;
        this.b = i5;
        long j4 = bArr[i4];
        int i6 = i + 5;
        this.b = i6;
        long j5 = bArr[i5];
        int i7 = i + 6;
        this.b = i7;
        long j6 = bArr[i6];
        this.b = i + 7;
        long j7 = bArr[i7];
        this.b = i + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long J() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        long j = bArr[i];
        int i3 = i + 2;
        this.b = i3;
        long j2 = bArr[i2];
        this.b = i + 3;
        long j3 = bArr[i3];
        this.b = i + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public final long K() {
        long I = I();
        if (I >= 0) {
            return I;
        }
        throw new IllegalStateException("Top bit not zero: " + I);
    }

    public final long L() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r7 - 1;
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i2 = 1; i2 < i; i2++) {
            if ((this.a[this.b + i2] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r2 & 63);
        }
        this.b += i;
        return j;
    }

    public final String M(char c) {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c && this.a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.a;
        int i3 = this.b;
        String a = khe.a(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
        return a;
    }

    public final String N(Charset charset) {
        wad.e(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.c - this.b == 0) {
            return null;
        }
        Charset charset2 = ege.a;
        if (!charset.equals(charset2)) {
            b();
        }
        int i = 1;
        if (!charset.equals(ege.c) && !charset.equals(charset2)) {
            i = 2;
            if (!charset.equals(ege.f) && !charset.equals(ege.e) && !charset.equals(ege.d)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(ege.c) || charset.equals(ege.a)) && khe.i(this.a[i2])) {
                break;
            }
            if (charset.equals(ege.f) || charset.equals(ege.d)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && khe.i(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(ege.e)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && khe.i(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        String a = a(i2 - this.b, charset);
        if (this.b != this.c && n(charset, d) == '\r') {
            n(charset, e);
        }
        return a;
    }

    public final String O(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a = khe.a(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a;
    }

    public final String a(int i, Charset charset) {
        byte[] bArr = this.a;
        int i2 = this.b;
        String str = new String(bArr, i2, i, charset);
        this.b = i2 + i;
        return str;
    }

    public final Charset b() {
        int i = this.c;
        int i2 = this.b;
        int i3 = i - i2;
        if (i3 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
                return ege.c;
            }
        }
        if (i3 < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.b = i2 + 2;
            return ege.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return ege.e;
    }

    public final short c() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final short d() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final void e(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public final void f(g8e g8eVar, int i) {
        g(g8eVar.a, 0, i);
        g8eVar.k(0);
    }

    public final void g(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final void h(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        i(bArr, i);
    }

    public final void i(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void j(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        wad.d(z);
        this.c = i;
    }

    public final void k(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        wad.d(z);
        this.b = i;
    }

    public final void l(int i) {
        k(this.b + i);
    }

    public final byte[] m() {
        return this.a;
    }

    public final char p(Charset charset) {
        wad.e(f.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (o(charset) >> 16);
    }

    public final int q() {
        return this.c - this.b;
    }

    public final int r() {
        return this.a.length;
    }

    public final int s() {
        return this.b;
    }

    public final int t() {
        return this.c;
    }

    public final int u() {
        return this.a[this.b] & 255;
    }

    public final int v() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return (bArr[i6] & 255) | (i3 << 24) | (i5 << 16) | (i7 << 8);
    }

    public final int w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        this.b = i + 3;
        return (bArr[i4] & 255) | ((i3 << 24) >> 8) | (i5 << 8);
    }

    public final int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.b = i6;
        int i7 = bArr[i4] & 255;
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | (i5 << 8) | i3 | (i7 << 16);
    }

    public final int y() {
        int x = x();
        if (x >= 0) {
            return x;
        }
        throw new IllegalStateException("Top bit not zero: " + x);
    }

    public final int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public b9e() {
        this.a = khe.f;
    }

    public b9e(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public b9e(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }
}
