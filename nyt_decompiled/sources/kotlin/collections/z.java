package kotlin.collections;

import defpackage.yu3;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
class z extends kotlin.collections.a {
    private final List b;

    public static final class a implements ListIterator, yu3 {
        private final ListIterator a;

        a(int i) {
            int V;
            List list = z.this.b;
            V = q.V(z.this, i);
            this.a = list.listIterator(V);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            int U;
            U = q.U(z.this, this.a.previousIndex());
            return U;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            int U;
            U = q.U(z.this, this.a.nextIndex());
            return U;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(List list) {
        zq3.h(list, "delegate");
        this.b = list;
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b.size();
    }

    @Override // kotlin.collections.a, java.util.List
    public Object get(int i) {
        int T;
        List list = this.b;
        T = q.T(this, i);
        return list.get(T);
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator(int i) {
        return new a(i);
    }
}
