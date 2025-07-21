package com.google.common.collect;

import defpackage.b16;
import java.util.Iterator;

/* loaded from: classes3.dex */
abstract class t implements Iterator {
    final Iterator a;

    t(Iterator it2) {
        this.a = (Iterator) b16.k(it2);
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
