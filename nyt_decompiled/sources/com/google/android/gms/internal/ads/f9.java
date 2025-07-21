package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class f9 extends g9 {
    Object[] a;
    int b = 0;
    boolean c;

    f9(int i) {
        this.a = new Object[i];
    }

    private final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, g9.b(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final f9 c(Object obj) {
        obj.getClass();
        f(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final g9 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(this.b + collection.size());
            if (collection instanceof zzfzv) {
                this.b = ((zzfzv) collection).a(this.a, this.b);
                return this;
            }
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            a(it2.next());
        }
        return this;
    }

    final void e(Object[] objArr, int i) {
        fa.b(objArr, 2);
        f(this.b + 2);
        System.arraycopy(objArr, 0, this.a, this.b, 2);
        this.b += 2;
    }
}
