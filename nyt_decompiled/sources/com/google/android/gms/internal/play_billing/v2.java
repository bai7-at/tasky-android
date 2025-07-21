package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v2 {
    Object[] a = new Object[8];
    int b = 0;
    u2 c;

    public final v2 a(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.a = Arrays.copyOf(objArr, i3);
        }
        r2.a(obj, obj2);
        Object[] objArr2 = this.a;
        int i4 = this.b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.b = i4 + 1;
        return this;
    }

    public final zzx b() {
        u2 u2Var = this.c;
        if (u2Var != null) {
            throw u2Var.a();
        }
        zzaf i = zzaf.i(this.b, this.a, this);
        u2 u2Var2 = this.c;
        if (u2Var2 == null) {
            return i;
        }
        throw u2Var2.a();
    }
}
