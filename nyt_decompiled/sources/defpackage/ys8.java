package defpackage;

import java.util.Arrays;
import kotlin.collections.d;

/* loaded from: classes.dex */
public abstract class ys8 {
    public static final int f(int i, int i2) {
        return (i >> i2) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] g(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        d.o(objArr, objArr2, 0, 0, i, 6, null);
        d.k(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] h(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        d.o(objArr, objArr2, 0, 0, i, 6, null);
        d.k(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] i(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        d.o(objArr, objArr2, 0, 0, i, 6, null);
        d.k(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] j(Object[] objArr, int i, int i2, us8 us8Var) {
        Object[] objArr2 = new Object[objArr.length - 1];
        d.o(objArr, objArr2, 0, 0, i, 6, null);
        d.k(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = us8Var;
        d.k(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] k(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        zq3.g(copyOf, "copyOf(this, newSize)");
        d.k(copyOf, copyOf, i + 2, i + 1, objArr.length);
        d.k(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = obj;
        copyOf[i2 + 1] = obj2;
        return copyOf;
    }
}
