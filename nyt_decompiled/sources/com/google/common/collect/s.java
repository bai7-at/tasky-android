package com.google.common.collect;

import com.google.common.base.Predicates;
import com.google.common.collect.f;
import defpackage.b16;
import defpackage.gx8;
import defpackage.i16;
import defpackage.vx4;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class s {

    class a extends e {
        final /* synthetic */ Set a;
        final /* synthetic */ Set b;

        /* renamed from: com.google.common.collect.s$a$a, reason: collision with other inner class name */
        class C0210a extends AbstractIterator {
            final Iterator c;

            C0210a() {
                this.c = a.this.a.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Object b() {
                while (this.c.hasNext()) {
                    Object next = this.c.next();
                    if (a.this.b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.a = set;
            this.b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public gx8 iterator() {
            return new C0210a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.a.contains(obj) && this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return this.a.containsAll(collection) && this.b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.b, this.a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator it2 = this.a.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (this.b.contains(it2.next())) {
                    i++;
                }
            }
            return i;
        }
    }

    private static class b extends f.a implements Set {
        b(Set set, i16 i16Var) {
            super(set, i16Var);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return s.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return s.d(this);
        }
    }

    private static class c extends b implements SortedSet {
        c(SortedSet sortedSet, i16 i16Var) {
            super(sortedSet, i16Var);
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return ((SortedSet) this.a).comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return Iterators.j(this.a.iterator(), this.b);
        }

        @Override // java.util.SortedSet
        public SortedSet headSet(Object obj) {
            return new c(((SortedSet) this.a).headSet(obj), this.b);
        }

        @Override // java.util.SortedSet
        public Object last() {
            SortedSet sortedSet = (SortedSet) this.a;
            while (true) {
                Object last = sortedSet.last();
                if (this.b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet subSet(Object obj, Object obj2) {
            return new c(((SortedSet) this.a).subSet(obj, obj2), this.b);
        }

        @Override // java.util.SortedSet
        public SortedSet tailSet(Object obj) {
            return new c(((SortedSet) this.a).tailSet(obj), this.b);
        }
    }

    static abstract class d extends AbstractSet {
        d() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            return s.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            return super.retainAll((Collection) b16.k(collection));
        }
    }

    public static abstract class e extends AbstractSet {
        /* synthetic */ e(r rVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        private e() {
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Set b(Set set, i16 i16Var) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, i16Var);
        }
        if (!(set instanceof b)) {
            return new b((Set) b16.k(set), (i16) b16.k(i16Var));
        }
        b bVar = (b) set;
        return new b((Set) bVar.a, Predicates.b(bVar.b, i16Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SortedSet c(SortedSet sortedSet, i16 i16Var) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) b16.k(sortedSet), (i16) b16.k(i16Var));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.a, Predicates.b(bVar.b, i16Var));
    }

    static int d(Set set) {
        Iterator it2 = set.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static e e(Set set, Set set2) {
        b16.l(set, "set1");
        b16.l(set2, "set2");
        return new a(set, set2);
    }

    public static HashSet f() {
        return new HashSet();
    }

    public static HashSet g(int i) {
        return new HashSet(Maps.a(i));
    }

    public static Set h() {
        return Collections.newSetFromMap(Maps.g());
    }

    static boolean i(Set set, Collection collection) {
        b16.k(collection);
        if (collection instanceof vx4) {
            collection = ((vx4) collection).w0();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : Iterators.p(set.iterator(), collection);
    }

    static boolean j(Set set, Iterator it2) {
        boolean z = false;
        while (it2.hasNext()) {
            z |= set.remove(it2.next());
        }
        return z;
    }
}
