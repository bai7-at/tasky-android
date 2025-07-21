package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class oa implements Iterator {
    final Iterator a;

    oa(Iterator it2) {
        it2.getClass();
        this.a = it2;
    }

    abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
