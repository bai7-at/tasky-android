package androidx.compose.runtime.snapshots;

import defpackage.bv3;
import defpackage.ln0;
import defpackage.qm3;
import defpackage.uo6;
import defpackage.uw7;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes.dex */
final class r implements List, bv3 {
    private final SnapshotStateList a;
    private final int b;
    private int c;
    private int d;

    public static final class a implements ListIterator, yu3 {
        final /* synthetic */ Ref$IntRef a;
        final /* synthetic */ r b;

        a(Ref$IntRef ref$IntRef, r rVar) {
            this.a = ref$IntRef;
            this.b = rVar;
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            uw7.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            uw7.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            uw7.f();
            throw new KotlinNothingValueException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a.element < this.b.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.a.element >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i = this.a.element + 1;
            uw7.g(i, this.b.size());
            this.a.element = i;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a.element + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.a.element;
            uw7.g(i, this.b.size());
            this.a.element = i - 1;
            return this.b.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.a.element;
        }
    }

    public r(SnapshotStateList snapshotStateList, int i, int i2) {
        this.a = snapshotStateList;
        this.b = i;
        this.c = snapshotStateList.f();
        this.d = i2 - i;
    }

    private final void f() {
        if (this.a.f() != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public int a() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        f();
        this.a.add(this.b + size(), obj);
        this.d = size() + 1;
        this.c = this.a.f();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        f();
        boolean addAll = this.a.addAll(i + this.b, collection);
        if (addAll) {
            this.d = size() + collection.size();
            this.c = this.a.f();
        }
        return addAll;
    }

    public Object c(int i) {
        f();
        Object remove = this.a.remove(this.b + i);
        this.d = size() - 1;
        this.c = this.a.f();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            f();
            SnapshotStateList snapshotStateList = this.a;
            int i = this.b;
            snapshotStateList.p(i, size() + i);
            this.d = 0;
            this.c = this.a.f();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it2 = collection2.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        f();
        uw7.g(i, size());
        return this.a.get(this.b + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        f();
        int i = this.b;
        Iterator it2 = uo6.u(i, size() + i).iterator();
        while (it2.hasNext()) {
            int c = ((qm3) it2).c();
            if (zq3.c(obj, this.a.get(c))) {
                return c - this.b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        f();
        int size = this.b + size();
        do {
            size--;
            if (size < this.b) {
                return -1;
            }
        } while (!zq3.c(obj, this.a.get(size)));
        return size - this.b;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return c(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                if (remove(it2.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        f();
        SnapshotStateList snapshotStateList = this.a;
        int i = this.b;
        int q = snapshotStateList.q(collection, i, size() + i);
        if (q > 0) {
            this.c = this.a.f();
            this.d = size() - q;
        }
        return q > 0;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        uw7.g(i, size());
        f();
        Object obj2 = this.a.set(i + this.b, obj);
        this.c = this.a.f();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw new IllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        f();
        SnapshotStateList snapshotStateList = this.a;
        int i3 = this.b;
        return new r(snapshotStateList, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        f();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new a(ref$IntRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ln0.b(this, objArr);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        f();
        this.a.add(this.b + i, obj);
        this.d = size() + 1;
        this.c = this.a.f();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
