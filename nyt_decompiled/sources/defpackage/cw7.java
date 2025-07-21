package defpackage;

/* loaded from: classes.dex */
abstract class cw7 {
    public static final void a(int[] iArr, jn3 jn3Var) {
        if (!f(iArr)) {
            jn3Var.g(h(iArr), i(iArr), d(iArr) - h(iArr));
            return;
        }
        if (g(iArr)) {
            jn3Var.g(h(iArr), i(iArr), c(iArr));
        } else if (j(iArr)) {
            jn3Var.g(h(iArr), i(iArr) + 1, c(iArr));
        } else {
            jn3Var.g(h(iArr) + 1, i(iArr), c(iArr));
        }
    }

    public static int[] b(int[] iArr) {
        return iArr;
    }

    public static final int c(int[] iArr) {
        return Math.min(d(iArr) - h(iArr), e(iArr) - i(iArr));
    }

    public static final int d(int[] iArr) {
        return iArr[2];
    }

    public static final int e(int[] iArr) {
        return iArr[3];
    }

    private static final boolean f(int[] iArr) {
        return e(iArr) - i(iArr) != d(iArr) - h(iArr);
    }

    public static final boolean g(int[] iArr) {
        return iArr[4] != 0;
    }

    public static final int h(int[] iArr) {
        return iArr[0];
    }

    public static final int i(int[] iArr) {
        return iArr[1];
    }

    private static final boolean j(int[] iArr) {
        return e(iArr) - i(iArr) > d(iArr) - h(iArr);
    }
}
