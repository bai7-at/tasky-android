package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import defpackage.b16;
import defpackage.gx8;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private transient ImmutableList b;

    private static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        Object readResolve() {
            return ImmutableSet.v(this.elements);
        }
    }

    public static class a extends ImmutableCollection.a {
        Object[] d;
        private int e;

        public a() {
            super(4);
        }

        private void k(Object obj) {
            Objects.requireNonNull(this.d);
            int length = this.d.length - 1;
            int hashCode = obj.hashCode();
            int b = i.b(hashCode);
            while (true) {
                int i = b & length;
                Object[] objArr = this.d;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    objArr[i] = obj;
                    this.e += hashCode;
                    super.d(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    b = i + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            b16.k(obj);
            if (this.d != null && ImmutableSet.q(this.b) <= this.d.length) {
                k(obj);
                return this;
            }
            this.d = null;
            super.d(obj);
            return this;
        }

        public a i(Object... objArr) {
            if (this.d != null) {
                for (Object obj : objArr) {
                    a(obj);
                }
            } else {
                super.e(objArr);
            }
            return this;
        }

        public a j(Iterable iterable) {
            b16.k(iterable);
            if (this.d != null) {
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    a(it2.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public ImmutableSet l() {
            ImmutableSet t;
            int i = this.b;
            if (i == 0) {
                return ImmutableSet.y();
            }
            if (i == 1) {
                Object obj = this.a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.z(obj);
            }
            if (this.d == null || ImmutableSet.q(i) != this.d.length) {
                t = ImmutableSet.t(this.b, this.a);
                this.b = t.size();
            } else {
                Object[] copyOf = ImmutableSet.E(this.b, this.a.length) ? Arrays.copyOf(this.a, this.b) : this.a;
                t = new RegularImmutableSet(copyOf, this.e, this.d, r5.length - 1, this.b);
            }
            this.c = true;
            this.d = null;
            return t;
        }

        a(int i) {
            super(i);
            this.d = new Object[ImmutableSet.q(i)];
        }
    }

    ImmutableSet() {
    }

    public static ImmutableSet A(Object obj, Object obj2) {
        return t(2, obj, obj2);
    }

    public static ImmutableSet B(Object obj, Object obj2, Object obj3) {
        return t(3, obj, obj2, obj3);
    }

    public static ImmutableSet C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return t(5, obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableSet D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        b16.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return t(length, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    public static a p(int i) {
        e.b(i, "expectedSize");
        return new a(i);
    }

    static int q(int i) {
        int max = Math.max(i, 2);
        if (max >= 751619276) {
            b16.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSet t(int i, Object... objArr) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return z(obj);
        }
        int q = q(i);
        Object[] objArr2 = new Object[q];
        int i2 = q - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = n.a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int b = i.b(hashCode);
            while (true) {
                int i6 = b & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(a2)) {
                    break;
                }
                b++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (q(i4) < q / 2) {
            return t(i4, objArr);
        }
        if (E(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(objArr, i3, objArr2, i2, i4);
    }

    public static ImmutableSet u(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.j()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    public static ImmutableSet v(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? t(objArr.length, (Object[]) objArr.clone()) : z(objArr[0]) : y();
    }

    public static ImmutableSet y() {
        return RegularImmutableSet.i;
    }

    public static ImmutableSet z(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList a() {
        ImmutableList immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList w = w();
        this.b = w;
        return w;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && x() && ((ImmutableSet) obj).x() && hashCode() != obj.hashCode()) {
            return false;
        }
        return s.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s.d(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: k */
    public abstract gx8 iterator();

    ImmutableList w() {
        return ImmutableList.n(toArray());
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    boolean x() {
        return false;
    }
}
