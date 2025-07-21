package defpackage;

/* loaded from: classes3.dex */
final class mx2 {
    private final lx2 a;
    private final int[] b;

    mx2(lx2 lx2Var, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = lx2Var;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    mx2 a(mx2 mx2Var) {
        if (!this.a.equals(mx2Var.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return mx2Var;
        }
        if (mx2Var.f()) {
            return this;
        }
        int[] iArr = this.b;
        int[] iArr2 = mx2Var.b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = lx2.a(iArr2[i - length], iArr[i]);
        }
        return new mx2(this.a, iArr3);
    }

    mx2[] b(mx2 mx2Var) {
        if (!this.a.equals(mx2Var.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (mx2Var.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        mx2 e = this.a.e();
        int f = this.a.f(mx2Var.c(mx2Var.e()));
        mx2 mx2Var2 = this;
        while (mx2Var2.e() >= mx2Var.e() && !mx2Var2.f()) {
            int e2 = mx2Var2.e() - mx2Var.e();
            int h = this.a.h(mx2Var2.c(mx2Var2.e()), f);
            mx2 h2 = mx2Var.h(e2, h);
            e = e.a(this.a.b(e2, h));
            mx2Var2 = mx2Var2.a(h2);
        }
        return new mx2[]{e, mx2Var2};
    }

    int c(int i) {
        return this.b[(r1.length - 1) - i];
    }

    int[] d() {
        return this.b;
    }

    int e() {
        return this.b.length - 1;
    }

    boolean f() {
        return this.b[0] == 0;
    }

    mx2 g(mx2 mx2Var) {
        if (!this.a.equals(mx2Var.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || mx2Var.f()) {
            return this.a.e();
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = mx2Var.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = lx2.a(iArr3[i4], this.a.h(i2, iArr2[i3]));
            }
        }
        return new mx2(this.a, iArr3);
    }

    mx2 h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.a.e();
        }
        int length = this.b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.a.h(this.b[i3], i2);
        }
        return new mx2(this.a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int e = e(); e >= 0; e--) {
            int c = c(e);
            if (c != 0) {
                if (c < 0) {
                    sb.append(" - ");
                    c = -c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (e == 0 || c != 1) {
                    int g = this.a.g(c);
                    if (g == 0) {
                        sb.append('1');
                    } else if (g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(g);
                    }
                }
                if (e != 0) {
                    if (e == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(e);
                    }
                }
            }
        }
        return sb.toString();
    }
}
