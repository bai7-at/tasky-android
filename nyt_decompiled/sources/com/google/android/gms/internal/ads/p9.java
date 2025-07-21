package com.google.android.gms.internal.ads;

import defpackage.yie;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class p9 extends yie {
    private static final Object b = new Object();
    private Object a;

    p9(Object obj) {
        this.a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        Object obj2 = b;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.a = obj2;
        return obj;
    }
}
