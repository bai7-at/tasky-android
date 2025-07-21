package defpackage;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.Charset;
import java.util.Arrays;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final class yo5 {
    private static final char[] d = {'\r', '\n'};
    private static final char[] e = {'\n'};
    private static final ImmutableSet f = ImmutableSet.C(zj0.a, zj0.c, zj0.f, zj0.d, zj0.e);
    private byte[] a;
    private int b;
    private int c;

    public yo5() {
        this.a = z19.f;
    }

    private void W(Charset charset) {
        if (m(charset, d) == '\r') {
            m(charset, e);
        }
    }

    private int d(Charset charset) {
        int i;
        if (charset.equals(zj0.c) || charset.equals(zj0.a)) {
            i = 1;
        } else {
            if (!charset.equals(zj0.f) && !charset.equals(zj0.e) && !charset.equals(zj0.d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.b;
        while (true) {
            int i3 = this.c;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(zj0.c) || charset.equals(zj0.a)) && z19.x0(this.a[i2])) {
                return i2;
            }
            if (charset.equals(zj0.f) || charset.equals(zj0.d)) {
                byte[] bArr = this.a;
                if (bArr[i2] == 0 && z19.x0(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(zj0.e)) {
                byte[] bArr2 = this.a;
                if (bArr2[i2 + 1] == 0 && z19.x0(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    private int i(Charset charset) {
        byte a;
        char c;
        int i = 1;
        if ((charset.equals(zj0.c) || charset.equals(zj0.a)) && a() >= 1) {
            a = (byte) wj0.a(px8.b(this.a[this.b]));
        } else {
            if ((charset.equals(zj0.f) || charset.equals(zj0.d)) && a() >= 2) {
                byte[] bArr = this.a;
                int i2 = this.b;
                c = wj0.c(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(zj0.e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.a;
                int i3 = this.b;
                c = wj0.c(bArr2[i3 + 1], bArr2[i3]);
            }
            a = (byte) c;
            i = 2;
        }
        return (wj0.a(a) << 16) + i;
    }

    private char m(Charset charset, char[] cArr) {
        int i = i(charset);
        if (i == 0) {
            return (char) 0;
        }
        char c = (char) (i >> 16);
        if (!wj0.b(cArr, c)) {
            return (char) 0;
        }
        this.b += i & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        return c;
    }

    public long A() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String F = z19.F(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return F;
    }

    public short D() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String E(int i) {
        return F(i, zj0.c);
    }

    public String F(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int G() {
        return H() | (H() << 21) | (H() << 14) | (H() << 7);
    }

    public int H() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int I() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.b = i + 4;
        return i4;
    }

    public long J() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int K() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int L() {
        int q = q();
        if (q >= 0) {
            return q;
        }
        throw new IllegalStateException("Top bit not zero: " + q);
    }

    public long M() {
        long A = A();
        if (A >= 0) {
            return A;
        }
        throw new IllegalStateException("Top bit not zero: " + A);
    }

    public int N() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long O() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.a;
            int i = this.b;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.b = i + 3;
                return zj0.c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.a;
        int i2 = this.b;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.b = i2 + 2;
            return zj0.d;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.b = i2 + 2;
        return zj0.e;
    }

    public void Q(int i) {
        S(b() < i ? new byte[i] : this.a, i);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void T(int i) {
        ur.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void U(int i) {
        ur.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void V(int i) {
        U(this.b + i);
    }

    public int a() {
        return this.c - this.b;
    }

    public int b() {
        return this.a.length;
    }

    public void c(int i) {
        if (i > b()) {
            this.a = Arrays.copyOf(this.a, i);
        }
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public char h(Charset charset) {
        ur.b(f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.a[this.b] & 255;
    }

    public void k(xo5 xo5Var, int i) {
        l(xo5Var.a, 0, i);
        xo5Var.p(0);
    }

    public void l(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public String n(char c) {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != c) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String F = z19.F(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return F;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public int r() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public String s() {
        return t(zj0.c);
    }

    public String t(Charset charset) {
        ur.b(f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(zj0.a)) {
            P();
        }
        String F = F(d(charset) - this.b, charset);
        if (this.b == this.c) {
            return F;
        }
        W(charset);
        return F;
    }

    public int u() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long v() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public short w() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long x() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int y() {
        int u = u();
        if (u >= 0) {
            return u;
        }
        throw new IllegalStateException("Top bit not zero: " + u);
    }

    public int z() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public yo5(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public yo5(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public yo5(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }
}
