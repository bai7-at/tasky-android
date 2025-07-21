package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import defpackage.b16;
import defpackage.gx8;
import defpackage.jx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final jx8 b = new b(RegularImmutableList.e, 0);

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableList.u(this.elements);
        }
    }

    class SubList extends ImmutableList<E> {
        final transient int c;
        final transient int d;

        SubList(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public ImmutableList subList(int i, int i2) {
            b16.o(i, i2, this.d);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.c;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableCollection
        Object[] e() {
            return ImmutableList.this.e();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int f() {
            return ImmutableList.this.g() + this.c + this.d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int g() {
            return ImmutableList.this.g() + this.c;
        }

        @Override // java.util.List
        public Object get(int i) {
            b16.i(i, this.d);
            return ImmutableList.this.get(i + this.c);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static final class a extends ImmutableCollection.a {
        public a() {
            this(4);
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            super.e(objArr);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public ImmutableList k() {
            this.c = true;
            return ImmutableList.o(this.a, this.b);
        }

        a(int i) {
            super(i);
        }
    }

    static class b extends com.google.common.collect.a {
        private final ImmutableList c;

        b(ImmutableList immutableList, int i) {
            super(immutableList.size(), i);
            this.c = immutableList;
        }

        @Override // com.google.common.collect.a
        protected Object b(int i) {
            return this.c.get(i);
        }
    }

    ImmutableList() {
    }

    public static ImmutableList A(Object obj, Object obj2, Object obj3) {
        return q(obj, obj2, obj3);
    }

    public static ImmutableList B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return q(obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableList C(Comparator comparator, Iterable iterable) {
        b16.k(comparator);
        Object[] k = j.k(iterable);
        n.b(k);
        Arrays.sort(k, comparator);
        return n(k);
    }

    static ImmutableList n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static ImmutableList o(Object[] objArr, int i) {
        return i == 0 ? x() : new RegularImmutableList(objArr, i);
    }

    public static a p() {
        return new a();
    }

    private static ImmutableList q(Object... objArr) {
        return n(n.b(objArr));
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList t(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return q(collection.toArray());
        }
        ImmutableList a2 = ((ImmutableCollection) collection).a();
        return a2.j() ? n(a2.toArray()) : a2;
    }

    public static ImmutableList u(Object[] objArr) {
        return objArr.length == 0 ? x() : q((Object[]) objArr.clone());
    }

    public static ImmutableList x() {
        return RegularImmutableList.e;
    }

    public static ImmutableList y(Object obj) {
        return q(obj);
    }

    public static ImmutableList z(Object obj, Object obj2) {
        return q(obj, obj2);
    }

    @Override // java.util.List
    /* renamed from: D */
    public ImmutableList subList(int i, int i2) {
        b16.o(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? x() : E(i, i2);
    }

    ImmutableList E(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return k.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return k.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public gx8 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return k.f(this, obj);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public jx8 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public jx8 listIterator(int i) {
        b16.m(i, size());
        return isEmpty() ? b : new b(this, i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
