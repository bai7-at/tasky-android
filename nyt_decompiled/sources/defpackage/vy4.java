package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class vy4 implements RandomAccess {
    public static final int d = 8;
    private Object[] a;
    private List b;
    private int c;

    private static final class a implements List, bv3 {
        private final vy4 a;

        public a(vy4 vy4Var) {
            this.a = vy4Var;
        }

        public int a() {
            return this.a.q();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.a.b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            return this.a.e(i, collection);
        }

        public Object c(int i) {
            wy4.c(this, i);
            return this.a.y(i);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.a.h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.a.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.a.k(collection);
        }

        @Override // java.util.List
        public Object get(int i) {
            wy4.c(this, i);
            return this.a.p()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.a.r(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.a.s();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.a.v(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return c(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.a.x(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.a.A(collection);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            wy4.c(this, i);
            return this.a.B(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            wy4.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ln0.a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.a.a(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.a.f(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.a.w(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ln0.b(this, objArr);
        }
    }

    private static final class b implements List, bv3 {
        private final List a;
        private final int b;
        private int c;

        public b(List list, int i, int i2) {
            this.a = list;
            this.b = i;
            this.c = i2;
        }

        public int a() {
            return this.c - this.b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.a;
            int i = this.c;
            this.c = i + 1;
            list.add(i, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            this.a.addAll(i + this.b, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }

        public Object c(int i) {
            wy4.c(this, i);
            this.c--;
            return this.a.remove(i + this.b);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 <= i) {
                while (true) {
                    this.a.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.c = this.b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (zq3.c(this.a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            wy4.c(this, i);
            return this.a.get(i + this.b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (zq3.c(this.a.get(i2), obj)) {
                    return i2 - this.b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.c == this.b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.c - 1;
            int i2 = this.b;
            if (i2 > i) {
                return -1;
            }
            while (!zq3.c(this.a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return c(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i = this.c;
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                remove(it2.next());
            }
            return i != this.c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.a.get(i2))) {
                        this.a.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.c;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            wy4.c(this, i);
            return this.a.set(i + this.b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            wy4.d(this, i, i2);
            return new b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ln0.a(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.a.add(i + this.b, obj);
            this.c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (zq3.c(this.a.get(i2), obj)) {
                    this.a.remove(i2);
                    this.c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ln0.b(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.a.addAll(this.c, collection);
            this.c += collection.size();
            return collection.size() > 0;
        }
    }

    private static final class c implements ListIterator, yu3 {
        private final List a;
        private int b;

        public c(List list, int i) {
            this.a = list;
            this.b = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.a.add(this.b, obj);
            this.b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.b < this.a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.a;
            int i = this.b;
            this.b = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.b - 1;
            this.b = i;
            return this.a.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.a.set(this.b, obj);
        }
    }

    public vy4(Object[] objArr, int i) {
        this.a = objArr;
        this.c = i;
    }

    public final boolean A(Collection collection) {
        int i = this.c;
        for (int q = q() - 1; -1 < q; q--) {
            if (!collection.contains(p()[q])) {
                y(q);
            }
        }
        return i != this.c;
    }

    public final Object B(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final void C(int i) {
        this.c = i;
    }

    public final void D(Comparator comparator) {
        d.H(this.a, comparator, 0, this.c);
    }

    public final void a(int i, Object obj) {
        n(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            d.k(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.c++;
    }

    public final boolean b(Object obj) {
        n(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.c = i + 1;
        return true;
    }

    public final boolean c(int i, vy4 vy4Var) {
        if (vy4Var.s()) {
            return false;
        }
        n(this.c + vy4Var.c);
        Object[] objArr = this.a;
        int i2 = this.c;
        if (i != i2) {
            d.k(objArr, objArr, vy4Var.c + i, i, i2);
        }
        d.k(vy4Var.a, objArr, i, 0, vy4Var.c);
        this.c += vy4Var.c;
        return true;
    }

    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        n(this.c + collection.size());
        Object[] objArr = this.a;
        if (i != this.c) {
            d.k(objArr, objArr, collection.size() + i, i, this.c);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i.v();
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.c += collection.size();
        return true;
    }

    public final boolean f(Collection collection) {
        return e(this.c, collection);
    }

    public final List g() {
        List list = this.b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.b = aVar;
        return aVar;
    }

    public final void h() {
        Object[] objArr = this.a;
        int q = q();
        while (true) {
            q--;
            if (-1 >= q) {
                this.c = 0;
                return;
            }
            objArr[q] = null;
        }
    }

    public final boolean j(Object obj) {
        int q = q() - 1;
        if (q >= 0) {
            for (int i = 0; !zq3.c(p()[i], obj); i++) {
                if (i != q) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean k(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!j(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final void n(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final Object o() {
        if (s()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return p()[0];
    }

    public final Object[] p() {
        return this.a;
    }

    public final int q() {
        return this.c;
    }

    public final int r(Object obj) {
        int i = this.c;
        if (i <= 0) {
            return -1;
        }
        Object[] objArr = this.a;
        int i2 = 0;
        while (!zq3.c(obj, objArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean s() {
        return this.c == 0;
    }

    public final boolean t() {
        return this.c != 0;
    }

    public final Object u() {
        if (s()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return p()[q() - 1];
    }

    public final int v(Object obj) {
        int i = this.c;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        while (!zq3.c(obj, objArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    public final boolean w(Object obj) {
        int r = r(obj);
        if (r < 0) {
            return false;
        }
        y(r);
        return true;
    }

    public final boolean x(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.c;
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            w(it2.next());
        }
        return i != this.c;
    }

    public final Object y(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != q() - 1) {
            d.k(objArr, objArr, i, i + 1, this.c);
        }
        int i2 = this.c - 1;
        this.c = i2;
        objArr[i2] = null;
        return obj;
    }

    public final void z(int i, int i2) {
        if (i2 > i) {
            int i3 = this.c;
            if (i2 < i3) {
                Object[] objArr = this.a;
                d.k(objArr, objArr, i, i2, i3);
            }
            int i4 = this.c - (i2 - i);
            int q = q() - 1;
            if (i4 <= q) {
                int i5 = i4;
                while (true) {
                    this.a[i5] = null;
                    if (i5 == q) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.c = i4;
        }
    }
}
