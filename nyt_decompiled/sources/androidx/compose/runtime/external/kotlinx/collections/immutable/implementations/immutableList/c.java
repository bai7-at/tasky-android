package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.cs5;

/* loaded from: classes.dex */
public abstract class c {
    public static final int a(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final cs5 b() {
        return b.c.a();
    }

    public static final Object[] c(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final int d(int i) {
        return (i - 1) & (-32);
    }
}
