package com.google.common.collect;

import com.amazonaws.services.s3.internal.Constants;
import com.google.common.base.Predicates;
import defpackage.b16;
import defpackage.i16;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class f {

    static class a extends AbstractCollection {
        final Collection a;
        final i16 b;

        a(Collection collection, i16 i16Var) {
            this.a = collection;
            this.b = i16Var;
        }

        a a(i16 i16Var) {
            return new a(this.a, Predicates.b(this.b, i16Var));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            b16.d(this.b.apply(obj));
            return this.a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                b16.d(this.b.apply(it2.next()));
            }
            return this.a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            j.h(this.a, this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (f.d(this.a, obj)) {
                return this.b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return f.a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !j.a(this.a, this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return Iterators.i(this.a.iterator(), this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it2 = this.a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (this.b.apply(next) && collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it2 = this.a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                Object next = it2.next();
                if (this.b.apply(next) && !collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it2 = this.a.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (this.b.apply(it2.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return k.i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return k.i(iterator()).toArray(objArr);
        }
    }

    static boolean a(Collection collection, Collection collection2) {
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!collection.contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static Collection b(Collection collection, i16 i16Var) {
        return collection instanceof a ? ((a) collection).a(i16Var) : new a((Collection) b16.k(collection), (i16) b16.k(i16Var));
    }

    static StringBuilder c(int i) {
        e.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, Constants.GB));
    }

    static boolean d(Collection collection, Object obj) {
        b16.k(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
