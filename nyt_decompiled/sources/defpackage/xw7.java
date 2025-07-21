package defpackage;

import kotlin.collections.d;

/* loaded from: classes.dex */
public final class xw7 {
    private int a;
    private int[] b = new int[16];
    private ed9[] c = new ed9[16];

    private final int b(Object obj, int i) {
        int i2 = this.a - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.b[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else {
                if (i5 <= i) {
                    ed9 ed9Var = this.c[i4];
                    return obj == (ed9Var != null ? ed9Var.get() : null) ? i4 : c(i4, obj, i);
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    private final int c(int i, Object obj, int i2) {
        int i3 = i - 1;
        while (true) {
            if (-1 >= i3 || this.b[i3] != i2) {
                break;
            }
            ed9 ed9Var = this.c[i3];
            if ((ed9Var != null ? ed9Var.get() : null) == obj) {
                return i3;
            }
            i3--;
        }
        int i4 = this.a;
        for (int i5 = i + 1; i5 < i4; i5++) {
            if (this.b[i5] != i2) {
                return -(i5 + 1);
            }
            ed9 ed9Var2 = this.c[i5];
            if ((ed9Var2 != null ? ed9Var2.get() : null) == obj) {
                return i5;
            }
        }
        return -(this.a + 1);
    }

    public final boolean a(Object obj) {
        int i;
        int i2 = this.a;
        int c = u5.c(obj);
        if (i2 > 0) {
            i = b(obj, c);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i3 = -(i + 1);
        ed9[] ed9VarArr = this.c;
        int length = ed9VarArr.length;
        if (i2 == length) {
            int i4 = length * 2;
            ed9[] ed9VarArr2 = new ed9[i4];
            int[] iArr = new int[i4];
            int i5 = i3 + 1;
            d.k(ed9VarArr, ed9VarArr2, i5, i3, i2);
            d.o(this.c, ed9VarArr2, 0, 0, i3, 6, null);
            d.i(this.b, iArr, i5, i3, i2);
            d.n(this.b, iArr, 0, 0, i3, 6, null);
            this.c = ed9VarArr2;
            this.b = iArr;
        } else {
            int i6 = i3 + 1;
            d.k(ed9VarArr, ed9VarArr, i6, i3, i2);
            int[] iArr2 = this.b;
            d.i(iArr2, iArr2, i6, i3, i2);
        }
        this.c[i3] = new ed9(obj);
        this.b[i3] = c;
        this.a++;
        return true;
    }

    public final int[] d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final ed9[] f() {
        return this.c;
    }

    public final void g(int i) {
        this.a = i;
    }
}
