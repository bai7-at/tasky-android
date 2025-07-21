package com.google.android.gms.internal.icing;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class e1 {
    private static final e1 e = new e1(0, new int[0], new Object[0], false);
    private int[] b;
    private Object[] c;
    private int d = -1;
    private int a = 0;

    private e1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.b = iArr;
        this.c = objArr;
    }

    public static e1 a() {
        return e;
    }

    static e1 b(e1 e1Var, e1 e1Var2) {
        int i = e1Var.a;
        int i2 = e1Var2.a;
        int[] copyOf = Arrays.copyOf(e1Var.b, 0);
        System.arraycopy(e1Var2.b, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(e1Var.c, 0);
        System.arraycopy(e1Var2.c, 0, copyOf2, 0, 0);
        return new e1(0, copyOf, copyOf2, true);
    }

    public final int c() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        this.d = 0;
        return 0;
    }

    public final int d() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        this.d = 0;
        return 0;
    }

    final void e(StringBuilder sb, int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 506991;
    }
}
