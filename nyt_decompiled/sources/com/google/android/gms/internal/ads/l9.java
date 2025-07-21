package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l9 {
    Object[] a;
    int b;
    k9 c;

    public l9() {
        this(4);
    }

    private final void d(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, g9.b(length, i2));
        }
    }

    public final l9 a(Object obj, Object obj2) {
        d(this.b + 1);
        r8.b(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l9 b(Iterable iterable) {
        if (iterable instanceof Collection) {
            d(this.b + iterable.size());
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgad c() {
        k9 k9Var = this.c;
        if (k9Var != null) {
            throw k9Var.a();
        }
        zzgbp n = zzgbp.n(this.b, this.a, this);
        k9 k9Var2 = this.c;
        if (k9Var2 == null) {
            return n;
        }
        throw k9Var2.a();
    }

    l9(int i) {
        this.a = new Object[i + i];
        this.b = 0;
    }
}
