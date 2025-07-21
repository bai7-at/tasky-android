package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class gu3 implements ku3 {
    private char[] a = kj0.c.d();
    private int b;

    private final void e(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int g = g(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < j48.a().length) {
                byte b = j48.a()[charAt];
                if (b == 0) {
                    i3 = g + 1;
                    this.a[g] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = j48.b()[charAt];
                        zq3.e(str2);
                        int g2 = g(g, str2.length());
                        str2.getChars(0, str2.length(), this.a, g2);
                        i2 = g2 + str2.length();
                        this.b = i2;
                    } else {
                        char[] cArr = this.a;
                        cArr[g] = '\\';
                        cArr[g + 1] = (char) b;
                        i2 = g + 2;
                        this.b = i2;
                    }
                    i++;
                }
            } else {
                i3 = g + 1;
                this.a[g] = charAt;
            }
            i2 = i3;
            i++;
        }
        int g3 = g(i2, 1);
        this.a[g3] = '\"';
        this.b = g3 + 1;
    }

    private final void f(int i) {
        g(this.b, i);
    }

    private final int g(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.a;
        if (cArr.length <= i3) {
            char[] copyOf = Arrays.copyOf(cArr, uo6.d(i3, i * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        return i;
    }

    @Override // defpackage.ku3
    public void a(char c) {
        f(1);
        char[] cArr = this.a;
        int i = this.b;
        this.b = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.ku3
    public void b(String str) {
        zq3.h(str, "text");
        f(str.length() + 2);
        char[] cArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < j48.a().length && j48.a()[c] != 0) {
                e(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = '\"';
        this.b = i3 + 1;
    }

    @Override // defpackage.ku3
    public void c(long j) {
        d(String.valueOf(j));
    }

    @Override // defpackage.ku3
    public void d(String str) {
        zq3.h(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        f(length);
        str.getChars(0, str.length(), this.a, this.b);
        this.b += length;
    }

    public void h() {
        kj0.c.c(this.a);
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }
}
