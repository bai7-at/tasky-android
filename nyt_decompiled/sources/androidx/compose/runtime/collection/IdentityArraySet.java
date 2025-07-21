package androidx.compose.runtime.collection;

import defpackage.ln0;
import defpackage.ss2;
import defpackage.u5;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.d;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class IdentityArraySet implements Set, yu3 {
    private int a;
    private Object[] b = new Object[16];

    public static final class a implements Iterator, yu3 {
        private int a;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a < IdentityArraySet.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] j = IdentityArraySet.this.j();
            int i = this.a;
            this.a = i + 1;
            Object obj = j[i];
            zq3.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private final int c(Object obj) {
        int size = size() - 1;
        int c = u5.c(obj);
        Object[] objArr = this.b;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = objArr[i2];
            int c2 = u5.c(obj2);
            if (c2 < c) {
                i = i2 + 1;
            } else {
                if (c2 <= c) {
                    return obj2 == obj ? i2 : f(i2, obj, c);
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    private final int f(int i, Object obj, int i2) {
        Object obj2;
        Object[] objArr = this.b;
        int size = size();
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj3 = objArr[i3];
            if (obj3 == obj) {
                return i3;
            }
            if (u5.c(obj3) != i2) {
                break;
            }
        }
        do {
            i++;
            if (i >= size) {
                return -(size + 1);
            }
            obj2 = objArr[i];
            if (obj2 == obj) {
                return i;
            }
        } while (u5.c(obj2) == i2);
        return -(i + 1);
    }

    public final void a(Collection collection) {
        Object[] objArr;
        int i;
        Object obj;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                add(it2.next());
            }
            return;
        }
        Object[] objArr2 = this.b;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.b;
        int size = size();
        int size2 = identityArraySet.size();
        int i2 = size + size2;
        boolean z = this.b.length < i2;
        boolean z2 = size == 0 || u5.c(objArr2[size + (-1)]) < u5.c(objArr3[0]);
        if (!z && z2) {
            d.k(objArr3, objArr2, size, 0, size2);
            this.a = size() + size2;
            return;
        }
        if (z) {
            objArr = new Object[size > size2 ? size * 2 : size2 * 2];
        } else {
            objArr = objArr2;
        }
        int i3 = size - 1;
        int i4 = size2 - 1;
        int i5 = i2 - 1;
        while (true) {
            if (i3 < 0 && i4 < 0) {
                break;
            }
            if (i3 < 0) {
                i = i4 - 1;
                obj = objArr3[i4];
            } else if (i4 < 0) {
                i = i4;
                obj = objArr2[i3];
                i3--;
            } else {
                Object obj2 = objArr2[i3];
                Object obj3 = objArr3[i4];
                int c = u5.c(obj2);
                int c2 = u5.c(obj3);
                if (c > c2) {
                    i3--;
                } else {
                    if (c >= c2) {
                        if (obj2 != obj3) {
                            int i6 = i3 - 1;
                            while (i6 >= 0) {
                                int i7 = i6 - 1;
                                Object obj4 = objArr2[i6];
                                if (u5.c(obj4) != c2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    i4--;
                                    break;
                                }
                                i6 = i7;
                            }
                        } else {
                            i3--;
                            i4--;
                        }
                    }
                    i = i4 - 1;
                    obj = obj3;
                }
                i = i4;
                obj = obj2;
            }
            objArr[i5] = obj;
            i4 = i;
            i5--;
        }
        if (i5 >= 0) {
            d.k(objArr, objArr, 0, i5 + 1, i2);
        }
        int i8 = i2 - (i5 + 1);
        d.t(objArr, null, i8, i2);
        this.b = objArr;
        this.a = i8;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        int size = size();
        Object[] objArr = this.b;
        if (size > 0) {
            i = c(obj);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            d.k(objArr, objArr2, i2 + 1, i2, size);
            d.o(objArr, objArr2, 0, 0, i2, 6, null);
            this.b = objArr2;
        } else {
            d.k(objArr, objArr, i2 + 1, i2, size);
        }
        this.b[i2] = obj;
        this.a = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        d.w(this.b, null, 0, 0, 6, null);
        this.a = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return obj != null && c(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
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

    public int g() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    public final Object[] j() {
        return this.b;
    }

    public final boolean n() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        int c = c(obj);
        Object[] objArr = this.b;
        int size = size();
        if (c < 0) {
            return false;
        }
        int i = size - 1;
        if (c < i) {
            d.k(objArr, objArr, c, c + 1, size);
        }
        objArr[i] = null;
        this.a = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    public String toString() {
        return i.u0(this, null, "[", "]", 0, null, new ss2() { // from class: androidx.compose.runtime.collection.IdentityArraySet$toString$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Object obj) {
                return obj.toString();
            }
        }, 25, null);
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ln0.b(this, objArr);
    }
}
