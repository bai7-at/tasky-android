package kotlin.collections;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class a extends AbstractCollection implements List, yu3 {
    public static final C0496a a = new C0496a(null);

    /* renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    public static final class C0496a {
        public /* synthetic */ C0496a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
        }

        public final void b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        public final void d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            }
            if (i <= i2) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }

        public final int e(int i, int i2) {
            int i3 = i + (i >> 1);
            if (i3 - i2 < 0) {
                i3 = i2;
            }
            if (i3 - 2147483639 > 0) {
                return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i3;
        }

        public final boolean f(Collection collection, Collection collection2) {
            zq3.h(collection, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
            zq3.h(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it2 = collection2.iterator();
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                if (!zq3.c(it3.next(), it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(Collection collection) {
            zq3.h(collection, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
            Iterator it2 = collection.iterator();
            int i = 1;
            while (it2.hasNext()) {
                Object next = it2.next();
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        private C0496a() {
        }
    }

    private class b implements Iterator, yu3 {
        private int a;

        public b() {
        }

        protected final int c() {
            return this.a;
        }

        protected final void d(int i) {
            this.a = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < a.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            a aVar = a.this;
            int i = this.a;
            this.a = i + 1;
            return aVar.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private class c extends b implements ListIterator, yu3 {
        public c(int i) {
            super();
            a.a.c(i, a.this.size());
            d(i);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return c() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            a aVar = a.this;
            d(c() - 1);
            return aVar.get(c());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d extends a implements RandomAccess {
        private final a b;
        private final int c;
        private int d;

        public d(a aVar, int i, int i2) {
            zq3.h(aVar, "list");
            this.b = aVar;
            this.c = i;
            a.a.d(i, i2, aVar.size());
            this.d = i2 - i;
        }

        @Override // kotlin.collections.AbstractCollection
        public int a() {
            return this.d;
        }

        @Override // kotlin.collections.a, java.util.List
        public Object get(int i) {
            a.a.b(i, this.d);
            return this.b.get(this.c + i);
        }
    }

    protected a() {
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator it2 = iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (zq3.c(it2.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (zq3.c(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new d(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new c(i);
    }
}
