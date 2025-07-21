package defpackage;

import kotlin.collections.d;

/* loaded from: classes.dex */
final class yv2 {
    private int a;
    private char[] b;
    private int c;
    private int d;

    public yv2(char[] cArr, int i, int i2) {
        this.a = cArr.length;
        this.b = cArr;
        this.c = i;
        this.d = i2;
    }

    private final void b(int i, int i2) {
        int i3 = this.c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.b;
            d.g(cArr, cArr, this.d - i4, i2, i3);
            this.c = i;
            this.d -= i4;
            return;
        }
        if (i < i3 && i2 >= i3) {
            this.d = i2 + c();
            this.c = i;
            return;
        }
        int c = i + c();
        int c2 = i2 + c();
        int i5 = this.d;
        char[] cArr2 = this.b;
        d.g(cArr2, cArr2, this.c, i5, c);
        this.c += c - i5;
        this.d = c2;
    }

    private final int c() {
        return this.d - this.c;
    }

    private final void f(int i) {
        if (i <= c()) {
            return;
        }
        int c = i - c();
        int i2 = this.a;
        do {
            i2 *= 2;
        } while (i2 - this.a < c);
        char[] cArr = new char[i2];
        d.g(this.b, cArr, 0, 0, this.c);
        int i3 = this.a;
        int i4 = this.d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        d.g(this.b, cArr, i6, i4, i5 + i4);
        this.b = cArr;
        this.a = i2;
        this.d = i6;
    }

    public final void a(StringBuilder sb) {
        sb.append(this.b, 0, this.c);
        char[] cArr = this.b;
        int i = this.d;
        sb.append(cArr, i, this.a - i);
    }

    public final char d(int i) {
        int i2 = this.c;
        return i < i2 ? this.b[i] : this.b[(i - i2) + this.d];
    }

    public final int e() {
        return this.a - c();
    }

    public final void g(int i, int i2, String str) {
        f(str.length() - (i2 - i));
        b(i, i2);
        zv2.b(str, this.b, this.c);
        this.c += str.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        return sb.toString();
    }
}
