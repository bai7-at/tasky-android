package kotlin.collections;

import defpackage.n1;
import defpackage.uo6;
import defpackage.zq3;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class c extends n1 {
    public static final a d = new a(null);
    private static final Object[] e = new Object[0];
    private int a;
    private Object[] b;
    private int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = e;
        } else {
            if (i <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + i);
            }
            objArr = new Object[i];
        }
        this.b = objArr;
    }

    private final void A(int i, int i2) {
        int v = v(this.a + i2);
        int v2 = v(this.a + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.b;
            i2 = Math.min(size, Math.min(objArr.length - v, objArr.length - v2));
            Object[] objArr2 = this.b;
            int i3 = v + i2;
            d.k(objArr2, objArr2, v2, v, i3);
            v = v(i3);
            v2 = v(v2 + i2);
        }
    }

    private final void f(int i, Collection collection) {
        Iterator it2 = collection.iterator();
        int length = this.b.length;
        while (i < length && it2.hasNext()) {
            this.b[i] = it2.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it2.hasNext(); i3++) {
            this.b[i3] = it2.next();
        }
        this.c = size() + collection.size();
    }

    private final void g(int i) {
        Object[] objArr = new Object[i];
        Object[] objArr2 = this.b;
        d.k(objArr2, objArr, 0, this.a, objArr2.length);
        Object[] objArr3 = this.b;
        int length = objArr3.length;
        int i2 = this.a;
        d.k(objArr3, objArr, length - i2, 0, i2);
        this.a = 0;
        this.b = objArr;
    }

    private final int j(int i) {
        return i == 0 ? d.e0(this.b) : i - 1;
    }

    private final void n(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == e) {
            this.b = new Object[uo6.d(i, 10)];
        } else {
            g(kotlin.collections.a.a.e(objArr.length, i));
        }
    }

    private final int p(int i) {
        if (i == d.e0(this.b)) {
            return 0;
        }
        return i + 1;
    }

    private final int t(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    private final void u(int i, int i2) {
        if (i < i2) {
            d.t(this.b, null, i, i2);
            return;
        }
        Object[] objArr = this.b;
        d.t(objArr, null, i, objArr.length);
        d.t(this.b, null, 0, i2);
    }

    private final int v(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    private final void w() {
        ((AbstractList) this).modCount++;
    }

    private final void z(int i, int i2) {
        int v = v(this.a + (i - 1));
        int v2 = v(this.a + (i2 - 1));
        while (i > 0) {
            int i3 = v + 1;
            int min = Math.min(i, Math.min(i3, v2 + 1));
            Object[] objArr = this.b;
            int i4 = v2 - min;
            int i5 = v - min;
            d.k(objArr, objArr, i4 + 1, i5 + 1, i3);
            v = t(i5);
            v2 = t(i4);
            i -= min;
        }
    }

    @Override // defpackage.n1
    public int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zq3.h(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        w();
        n(size() + collection.size());
        f(v(this.a + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        w();
        n(size() + 1);
        int j = j(this.a);
        this.a = j;
        this.b[j] = obj;
        this.c = size() + 1;
    }

    public final void addLast(Object obj) {
        w();
        n(size() + 1);
        this.b[v(this.a + size())] = obj;
        this.c = size() + 1;
    }

    @Override // defpackage.n1
    public Object c(int i) {
        kotlin.collections.a.a.b(i, size());
        if (i == i.n(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        w();
        int v = v(this.a + i);
        Object obj = this.b[v];
        if (i < (size() >> 1)) {
            int i2 = this.a;
            if (v >= i2) {
                Object[] objArr = this.b;
                d.k(objArr, objArr, i2 + 1, i2, v);
            } else {
                Object[] objArr2 = this.b;
                d.k(objArr2, objArr2, 1, 0, v);
                Object[] objArr3 = this.b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.a;
                d.k(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            Object[] objArr4 = this.b;
            int i4 = this.a;
            objArr4[i4] = null;
            this.a = p(i4);
        } else {
            int v2 = v(this.a + i.n(this));
            if (v <= v2) {
                Object[] objArr5 = this.b;
                d.k(objArr5, objArr5, v, v + 1, v2 + 1);
            } else {
                Object[] objArr6 = this.b;
                d.k(objArr6, objArr6, v, v + 1, objArr6.length);
                Object[] objArr7 = this.b;
                objArr7[objArr7.length - 1] = objArr7[0];
                d.k(objArr7, objArr7, 0, 1, v2 + 1);
            }
            this.b[v2] = null;
        }
        this.c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            w();
            u(this.a, v(this.a + size()));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[this.a];
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        kotlin.collections.a.a.b(i, size());
        return this.b[v(this.a + i)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i;
        int v = v(this.a + size());
        int i2 = this.a;
        if (i2 < v) {
            while (i2 < v) {
                if (zq3.c(obj, this.b[i2])) {
                    i = this.a;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (i2 < v) {
            return -1;
        }
        int length = this.b.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < v; i3++) {
                    if (zq3.c(obj, this.b[i3])) {
                        i2 = i3 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (zq3.c(obj, this.b[i2])) {
                i = this.a;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[v(this.a + i.n(this))];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int e0;
        int i;
        int v = v(this.a + size());
        int i2 = this.a;
        if (i2 < v) {
            e0 = v - 1;
            if (i2 <= e0) {
                while (!zq3.c(obj, this.b[e0])) {
                    if (e0 != i2) {
                        e0--;
                    }
                }
                i = this.a;
                return e0 - i;
            }
            return -1;
        }
        if (i2 > v) {
            int i3 = v - 1;
            while (true) {
                if (-1 >= i3) {
                    e0 = d.e0(this.b);
                    int i4 = this.a;
                    if (i4 <= e0) {
                        while (!zq3.c(obj, this.b[e0])) {
                            if (e0 != i4) {
                                e0--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (zq3.c(obj, this.b[i3])) {
                        e0 = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    public final Object o() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final Object q() {
        if (isEmpty()) {
            return null;
        }
        return this.b[v(this.a + i.n(this))];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int v;
        zq3.h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int v2 = v(this.a + size());
            int i = this.a;
            if (i < v2) {
                v = i;
                while (i < v2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[v] = obj;
                        v++;
                    }
                    i++;
                }
                d.t(this.b, null, v, v2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                v = v(i2);
                for (int i3 = 0; i3 < v2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[v] = obj3;
                        v = p(v);
                    }
                }
                z = z2;
            }
            if (z) {
                w();
                this.c = t(v - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = p(i);
        this.c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        w();
        int v = v(this.a + i.n(this));
        Object[] objArr = this.b;
        Object obj = objArr[v];
        objArr[v] = null;
        this.c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        kotlin.collections.a.a.d(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        w();
        if (i < size() - i2) {
            z(i, i2);
            int v = v(this.a + i3);
            u(this.a, v);
            this.a = v;
        } else {
            A(i, i2);
            int v2 = v(this.a + size());
            u(t(v2 - i3), v2);
        }
        this.c = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int v;
        zq3.h(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int v2 = v(this.a + size());
            int i = this.a;
            if (i < v2) {
                v = i;
                while (i < v2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[v] = obj;
                        v++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                d.t(this.b, null, v, v2);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                v = v(i2);
                for (int i3 = 0; i3 < v2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[v] = obj3;
                        v = p(v);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                w();
                this.c = t(v - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        kotlin.collections.a.a.b(i, size());
        int v = v(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[v];
        objArr[v] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        if (objArr.length < size()) {
            objArr = e.a(objArr, size());
        }
        int v = v(this.a + size());
        int i = this.a;
        if (i < v) {
            d.o(this.b, objArr, 0, i, v, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            d.k(objArr2, objArr, 0, this.a, objArr2.length);
            Object[] objArr3 = this.b;
            d.k(objArr3, objArr, objArr3.length - this.a, 0, v);
        }
        return i.g(size(), objArr);
    }

    public final Object x() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final Object y() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        kotlin.collections.a.a.c(i, size());
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        w();
        n(size() + 1);
        int v = v(this.a + i);
        if (i < ((size() + 1) >> 1)) {
            int j = j(v);
            int j2 = j(this.a);
            int i2 = this.a;
            if (j >= i2) {
                Object[] objArr = this.b;
                objArr[j2] = objArr[i2];
                d.k(objArr, objArr, i2, i2 + 1, j + 1);
            } else {
                Object[] objArr2 = this.b;
                d.k(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                d.k(objArr3, objArr3, 0, 1, j + 1);
            }
            this.b[j] = obj;
            this.a = j2;
        } else {
            int v2 = v(this.a + size());
            if (v < v2) {
                Object[] objArr4 = this.b;
                d.k(objArr4, objArr4, v + 1, v, v2);
            } else {
                Object[] objArr5 = this.b;
                d.k(objArr5, objArr5, 1, 0, v2);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                d.k(objArr6, objArr6, v + 1, v, objArr6.length - 1);
            }
            this.b[v] = obj;
        }
        this.c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        zq3.h(collection, "elements");
        kotlin.collections.a.a.c(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        w();
        n(size() + collection.size());
        int v = v(this.a + size());
        int v2 = v(this.a + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.a;
            int i3 = i2 - size;
            if (v2 < i2) {
                Object[] objArr = this.b;
                d.k(objArr, objArr, i3, i2, objArr.length);
                if (size >= v2) {
                    Object[] objArr2 = this.b;
                    d.k(objArr2, objArr2, objArr2.length - size, 0, v2);
                } else {
                    Object[] objArr3 = this.b;
                    d.k(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.b;
                    d.k(objArr4, objArr4, 0, size, v2);
                }
            } else if (i3 >= 0) {
                Object[] objArr5 = this.b;
                d.k(objArr5, objArr5, i3, i2, v2);
            } else {
                Object[] objArr6 = this.b;
                i3 += objArr6.length;
                int i4 = v2 - i2;
                int length = objArr6.length - i3;
                if (length >= i4) {
                    d.k(objArr6, objArr6, i3, i2, v2);
                } else {
                    d.k(objArr6, objArr6, i3, i2, i2 + length);
                    Object[] objArr7 = this.b;
                    d.k(objArr7, objArr7, 0, this.a + length, v2);
                }
            }
            this.a = i3;
            f(t(v2 - size), collection);
        } else {
            int i5 = v2 + size;
            if (v2 < v) {
                int i6 = size + v;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    d.k(objArr8, objArr8, i5, v2, v);
                } else if (i5 >= objArr8.length) {
                    d.k(objArr8, objArr8, i5 - objArr8.length, v2, v);
                } else {
                    int length2 = v - (i6 - objArr8.length);
                    d.k(objArr8, objArr8, 0, length2, v);
                    Object[] objArr9 = this.b;
                    d.k(objArr9, objArr9, i5, v2, length2);
                }
            } else {
                Object[] objArr10 = this.b;
                d.k(objArr10, objArr10, size, 0, v);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    d.k(objArr11, objArr11, i5 - objArr11.length, v2, objArr11.length);
                } else {
                    d.k(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.b;
                    d.k(objArr12, objArr12, i5, v2, objArr12.length - size);
                }
            }
            f(v2, collection);
        }
        return true;
    }

    public c() {
        this.b = e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
