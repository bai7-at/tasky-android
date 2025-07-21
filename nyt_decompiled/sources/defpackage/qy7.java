package defpackage;

/* loaded from: classes.dex */
public abstract class qy7 {
    private static final Object a = new Object();

    public static final Object c(py7 py7Var, int i) {
        Object obj;
        zq3.h(py7Var, "<this>");
        int a2 = rv0.a(py7Var.b, py7Var.d, i);
        if (a2 < 0 || (obj = py7Var.c[a2]) == a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(py7 py7Var) {
        int i = py7Var.d;
        int[] iArr = py7Var.b;
        Object[] objArr = py7Var.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        py7Var.a = false;
        py7Var.d = i2;
    }
}
