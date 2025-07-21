package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a3 {
    Object[] a = new Object[8];
    int b = 0;
    z2 c;

    private final void d(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
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
    }

    public final a3 a(Object obj, Object obj2) {
        d(this.b + 1);
        v2.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    public final a3 b(Map map) {
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            d(this.b + entrySet.size());
        }
        for (Map.Entry entry : entrySet) {
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzjc c() {
        z2 z2Var = this.c;
        if (z2Var != null) {
            throw z2Var.a();
        }
        zzjj o = zzjj.o(this.b, this.a, this);
        z2 z2Var2 = this.c;
        if (z2Var2 == null) {
            return o;
        }
        throw z2Var2.a();
    }
}
