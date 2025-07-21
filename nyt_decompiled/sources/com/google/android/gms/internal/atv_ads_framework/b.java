package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b {
    Object[] a = new Object[8];
    int b = 0;
    a c;

    private final void d(int i) {
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
    }

    public final b a(Object obj, Object obj2) {
        d(this.b + 1);
        f.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b b(Iterable iterable) {
        d(this.b + iterable.size());
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzae c() {
        a aVar = this.c;
        if (aVar != null) {
            throw aVar.a();
        }
        zzal i = zzal.i(this.b, this.a, this);
        a aVar2 = this.c;
        if (aVar2 == null) {
            return i;
        }
        throw aVar2.a();
    }
}
