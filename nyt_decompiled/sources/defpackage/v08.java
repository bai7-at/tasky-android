package defpackage;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
final class v08 {
    static final v08 e = new v08(jn8.b, 0, 0, 0);
    private final int a;
    private final jn8 b;
    private final int c;
    private final int d;

    private v08(jn8 jn8Var, int i, int i2, int i3) {
        this.b = jn8Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    v08 a(int i) {
        jn8 jn8Var = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = b83.c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            jn8Var = jn8Var.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.c;
        v08 v08Var = new v08(jn8Var, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return v08Var.c == 2078 ? v08Var.b(i + 1) : v08Var;
    }

    v08 b(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new v08(this.b.b(i - i2, i2), this.a, 0, this.d);
    }

    int c() {
        return this.c;
    }

    int d() {
        return this.d;
    }

    int e() {
        return this.a;
    }

    boolean f(v08 v08Var) {
        int i;
        int i2 = this.d + (b83.c[this.a][v08Var.a] >> 16);
        int i3 = v08Var.c;
        if (i3 > 0 && ((i = this.c) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= v08Var.d;
    }

    v08 g(int i, int i2) {
        int i3 = this.d;
        jn8 jn8Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = b83.c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            jn8Var = jn8Var.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new v08(jn8Var.a(i2, i8), i, 0, i3 + i8);
    }

    v08 h(int i, int i2) {
        jn8 jn8Var = this.b;
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        return new v08(jn8Var.a(b83.e[i3][i], i4).a(i2, 5), this.a, 0, this.d + i4 + 5);
    }

    l80 i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (jn8 jn8Var = b(bArr.length).b; jn8Var != null; jn8Var = jn8Var.d()) {
            linkedList.addFirst(jn8Var);
        }
        l80 l80Var = new l80();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            ((jn8) it2.next()).c(l80Var, bArr);
        }
        return l80Var;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", b83.b[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
