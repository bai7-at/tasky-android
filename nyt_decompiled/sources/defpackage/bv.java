package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes5.dex */
abstract class bv extends AbstractQueue {
    protected final AtomicReferenceArray a;
    protected final int b;

    public bv(int i) {
        int a = x06.a(i);
        this.b = a - 1;
        this.a = new AtomicReferenceArray(a);
    }

    protected final int a(long j) {
        return this.b & ((int) j);
    }

    protected final int c(long j, int i) {
        return ((int) j) & i;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == 0 && isEmpty()) {
                return;
            }
        }
    }

    protected final Object e(int i) {
        return f(this.a, i);
    }

    protected final Object f(AtomicReferenceArray atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    protected final void g(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
