package kotlin.collections.builders;

import defpackage.bv3;
import defpackage.n1;
import defpackage.t54;
import defpackage.yu3;
import defpackage.zq3;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ListBuilder<E> extends n1 implements List<E>, RandomAccess, Serializable, bv3 {
    private static final a a = new a(null);
    private static final ListBuilder b;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    public static final class BuilderSubList<E> extends n1 implements List<E>, RandomAccess, Serializable, bv3 {
        private E[] backing;
        private int length;
        private final int offset;
        private final BuilderSubList<E> parent;
        private final ListBuilder<E> root;

        private static final class a implements ListIterator, yu3 {
            private final BuilderSubList a;
            private int b;
            private int c;
            private int d;

            public a(BuilderSubList builderSubList, int i) {
                zq3.h(builderSubList, "list");
                this.a = builderSubList;
                this.b = i;
                this.c = -1;
                this.d = ((AbstractList) builderSubList).modCount;
            }

            private final void c() {
                if (((AbstractList) this.a.root).modCount != this.d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                c();
                BuilderSubList builderSubList = this.a;
                int i = this.b;
                this.b = i + 1;
                builderSubList.add(i, obj);
                this.c = -1;
                this.d = ((AbstractList) this.a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.b < this.a.length;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                c();
                if (this.b >= this.a.length) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                this.c = i;
                return this.a.backing[this.a.offset + this.c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                c();
                int i = this.b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                return this.a.backing[this.a.offset + this.c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                c();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.a.remove(i);
                this.b = this.c;
                this.c = -1;
                this.d = ((AbstractList) this.a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.a.set(i, obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BuilderSubList(Object[] objArr, int i, int i2, BuilderSubList builderSubList, ListBuilder listBuilder) {
            zq3.h(objArr, "backing");
            zq3.h(listBuilder, "root");
            this.backing = objArr;
            this.offset = i;
            this.length = i2;
            this.parent = builderSubList;
            this.root = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final int A(int i, int i2, Collection collection, boolean z) {
            BuilderSubList<E> builderSubList = this.parent;
            int A = builderSubList != null ? builderSubList.A(i, i2, collection, z) : this.root.H(i, i2, collection, z);
            if (A > 0) {
                x();
            }
            this.length -= A;
            return A;
        }

        private final void p(int i, Collection collection, int i2) {
            x();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.p(i, collection, i2);
            } else {
                this.root.v(i, collection, i2);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length += i2;
        }

        private final void q(int i, Object obj) {
            x();
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.q(i, obj);
            } else {
                this.root.w(i, obj);
            }
            this.backing = (E[]) ((ListBuilder) this.root).backing;
            this.length++;
        }

        private final void t() {
            if (((AbstractList) this.root).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void u() {
            if (w()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean v(List list) {
            boolean h;
            h = t54.h(this.backing, this.offset, this.length, list);
            return h;
        }

        private final boolean w() {
            return ((ListBuilder) this.root).isReadOnly;
        }

        private final Object writeReplace() {
            if (w()) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        private final void x() {
            ((AbstractList) this).modCount++;
        }

        private final Object y(int i) {
            x();
            BuilderSubList<E> builderSubList = this.parent;
            this.length--;
            return builderSubList != null ? builderSubList.y(i) : this.root.E(i);
        }

        private final void z(int i, int i2) {
            if (i2 > 0) {
                x();
            }
            BuilderSubList<E> builderSubList = this.parent;
            if (builderSubList != null) {
                builderSubList.z(i, i2);
            } else {
                this.root.F(i, i2);
            }
            this.length -= i2;
        }

        @Override // defpackage.n1
        public int a() {
            t();
            return this.length;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            u();
            t();
            q(this.offset + this.length, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            zq3.h(collection, "elements");
            u();
            t();
            int size = collection.size();
            p(this.offset + this.length, collection, size);
            return size > 0;
        }

        @Override // defpackage.n1
        public Object c(int i) {
            u();
            t();
            kotlin.collections.a.a.b(i, this.length);
            return y(this.offset + i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            u();
            t();
            z(this.offset, this.length);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            t();
            return obj == this || ((obj instanceof List) && v((List) obj));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            t();
            kotlin.collections.a.a.b(i, this.length);
            return this.backing[this.offset + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i;
            t();
            i = t54.i(this.backing, this.offset, this.length);
            return i;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            t();
            for (int i = 0; i < this.length; i++) {
                if (zq3.c(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            t();
            return this.length == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            t();
            for (int i = this.length - 1; i >= 0; i--) {
                if (zq3.c(this.backing[this.offset + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            u();
            t();
            int indexOf = indexOf(obj);
            if (indexOf >= 0) {
                remove(indexOf);
            }
            return indexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            zq3.h(collection, "elements");
            u();
            t();
            return A(this.offset, this.length, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            zq3.h(collection, "elements");
            u();
            t();
            return A(this.offset, this.length, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i, Object obj) {
            u();
            t();
            kotlin.collections.a.a.b(i, this.length);
            Object[] objArr = this.backing;
            int i2 = this.offset;
            Object obj2 = objArr[i2 + i];
            objArr[i2 + i] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i, int i2) {
            kotlin.collections.a.a.d(i, i2, this.length);
            return new BuilderSubList(this.backing, this.offset + i, i2 - i, this, this.root);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            zq3.h(objArr, "array");
            t();
            int length = objArr.length;
            int i = this.length;
            if (length >= i) {
                E[] eArr = this.backing;
                int i2 = this.offset;
                d.k(eArr, objArr, 0, i2, i + i2);
                return i.g(this.length, objArr);
            }
            E[] eArr2 = this.backing;
            int i3 = this.offset;
            Object[] copyOfRange = Arrays.copyOfRange(eArr2, i3, i + i3, objArr.getClass());
            zq3.g(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String j;
            t();
            j = t54.j(this.backing, this.offset, this.length, this);
            return j;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i) {
            t();
            kotlin.collections.a.a.c(i, this.length);
            return new a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, Object obj) {
            u();
            t();
            kotlin.collections.a.a.c(i, this.length);
            q(this.offset + i, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection collection) {
            zq3.h(collection, "elements");
            u();
            t();
            kotlin.collections.a.a.c(i, this.length);
            int size = collection.size();
            p(this.offset + i, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            t();
            E[] eArr = this.backing;
            int i = this.offset;
            return d.q(eArr, i, this.length + i);
        }
    }

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private static final class b implements ListIterator, yu3 {
        private final ListBuilder a;
        private int b;
        private int c;
        private int d;

        public b(ListBuilder listBuilder, int i) {
            zq3.h(listBuilder, "list");
            this.a = listBuilder;
            this.b = i;
            this.c = -1;
            this.d = ((AbstractList) listBuilder).modCount;
        }

        private final void c() {
            if (((AbstractList) this.a).modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            c();
            ListBuilder listBuilder = this.a;
            int i = this.b;
            this.b = i + 1;
            listBuilder.add(i, obj);
            this.c = -1;
            this.d = ((AbstractList) this.a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            c();
            if (this.b >= this.a.length) {
                throw new NoSuchElementException();
            }
            int i = this.b;
            this.b = i + 1;
            this.c = i;
            return this.a.backing[this.c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            c();
            int i = this.b;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.b = i2;
            this.c = i2;
            return this.a.backing[this.c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            int i = this.c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.a.remove(i);
            this.b = this.c;
            this.c = -1;
            this.d = ((AbstractList) this.a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            c();
            int i = this.c;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.a.set(i, obj);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.isReadOnly = true;
        b = listBuilder;
    }

    public ListBuilder(int i) {
        this.backing = (E[]) t54.d(i);
    }

    private final void A(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.backing;
        if (i > eArr.length) {
            this.backing = (E[]) t54.e(this.backing, kotlin.collections.a.a.e(eArr.length, i));
        }
    }

    private final void B(int i) {
        A(this.length + i);
    }

    private final void C(int i, int i2) {
        B(i2);
        E[] eArr = this.backing;
        d.k(eArr, eArr, i + i2, i, this.length);
        this.length += i2;
    }

    private final void D() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E(int i) {
        D();
        E[] eArr = this.backing;
        E e = eArr[i];
        d.k(eArr, eArr, i, i + 1, this.length);
        t54.f(this.backing, this.length - 1);
        this.length--;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int i, int i2) {
        if (i2 > 0) {
            D();
        }
        E[] eArr = this.backing;
        d.k(eArr, eArr, i, i + i2, this.length);
        E[] eArr2 = this.backing;
        int i3 = this.length;
        t54.g(eArr2, i3 - i2, i3);
        this.length -= i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int H(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.backing[i5]) == z) {
                E[] eArr = this.backing;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.backing;
        d.k(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.backing;
        int i7 = this.length;
        t54.g(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            D();
        }
        this.length -= i6;
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i, Collection collection, int i2) {
        D();
        C(i, i2);
        Iterator<E> it2 = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.backing[i + i3] = it2.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i, Object obj) {
        D();
        C(i, 1);
        ((E[]) this.backing)[i] = obj;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void y() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean z(List list) {
        boolean h;
        h = t54.h(this.backing, 0, this.length, list);
        return h;
    }

    @Override // defpackage.n1
    public int a() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        y();
        w(this.length, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zq3.h(collection, "elements");
        y();
        int size = collection.size();
        v(this.length, collection, size);
        return size > 0;
    }

    @Override // defpackage.n1
    public Object c(int i) {
        y();
        kotlin.collections.a.a.b(i, this.length);
        return E(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        y();
        F(0, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && z((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        kotlin.collections.a.a.b(i, this.length);
        return this.backing[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i;
        i = t54.i(this.backing, 0, this.length);
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (zq3.c(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (zq3.c(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        y();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        zq3.h(collection, "elements");
        y();
        return H(0, this.length, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        zq3.h(collection, "elements");
        y();
        return H(0, this.length, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        y();
        kotlin.collections.a.a.b(i, this.length);
        Object[] objArr = this.backing;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        kotlin.collections.a.a.d(i, i2, this.length);
        return new BuilderSubList(this.backing, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        int length = objArr.length;
        int i = this.length;
        if (length >= i) {
            d.k(this.backing, objArr, 0, 0, i);
            return i.g(this.length, objArr);
        }
        Object[] copyOfRange = Arrays.copyOfRange(this.backing, 0, i, objArr.getClass());
        zq3.g(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j;
        j = t54.j(this.backing, 0, this.length, this);
        return j;
    }

    public final List x() {
        y();
        this.isReadOnly = true;
        return this.length > 0 ? this : b;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        kotlin.collections.a.a.c(i, this.length);
        return new b(this, i);
    }

    public /* synthetic */ ListBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        y();
        kotlin.collections.a.a.c(i, this.length);
        w(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        zq3.h(collection, "elements");
        y();
        kotlin.collections.a.a.c(i, this.length);
        int size = collection.size();
        v(i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return d.q(this.backing, 0, this.length);
    }
}
