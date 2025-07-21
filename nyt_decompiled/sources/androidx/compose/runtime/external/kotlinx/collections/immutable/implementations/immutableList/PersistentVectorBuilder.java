package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.cc5;
import defpackage.cs5;
import defpackage.is5;
import defpackage.lt7;
import defpackage.n1;
import defpackage.no;
import defpackage.op0;
import defpackage.ss2;
import defpackage.ts8;
import defpackage.uo6;
import defpackage.v54;
import defpackage.wx4;
import defpackage.zq3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.d;

/* loaded from: classes.dex */
public final class PersistentVectorBuilder extends n1 implements cs5.a {
    private cs5 a;
    private Object[] b;
    private Object[] c;
    private int d;
    private wx4 e = new wx4();
    private Object[] f;
    private Object[] g;
    private int h;

    public PersistentVectorBuilder(cs5 cs5Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = cs5Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = this.b;
        this.g = this.c;
        this.h = this.a.size();
    }

    private final Object[] A(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    private final Object[] B(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int a = c.a(i, i2);
        Object obj = objArr[a];
        zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object B = B((Object[]) obj, i, i2 - 5);
        if (a < 31) {
            int i3 = a + 1;
            if (objArr[i3] != null) {
                if (v(objArr)) {
                    d.t(objArr, null, i3, 32);
                }
                objArr = d.k(objArr, z(), 0, 0, i3);
            }
        }
        if (B == objArr[a]) {
            return objArr;
        }
        Object[] x = x(objArr);
        x[a] = B;
        return x;
    }

    private final Object[] C(Object[] objArr, int i, int i2, cc5 cc5Var) {
        Object[] C;
        int a = c.a(i2 - 1, i);
        if (i == 5) {
            cc5Var.b(objArr[a]);
            C = null;
        } else {
            Object obj = objArr[a];
            zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            C = C((Object[]) obj, i - 5, i2, cc5Var);
        }
        if (C == null && a == 0) {
            return null;
        }
        Object[] x = x(objArr);
        x[a] = C;
        return x;
    }

    private final void D(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        cc5 cc5Var = new cc5(null);
        zq3.e(objArr);
        Object[] C = C(objArr, i2, i, cc5Var);
        zq3.e(C);
        Object a = cc5Var.a();
        zq3.f(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[]) a;
        this.h = i;
        if (C[1] == null) {
            this.f = (Object[]) C[0];
            this.d = i2 - 5;
        } else {
            this.f = C;
            this.d = i2;
        }
    }

    private final Object[] E(Object[] objArr, int i, int i2, Iterator it2) {
        if (!it2.hasNext()) {
            throw new IllegalArgumentException("invalid buffersIterator");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it2.next();
        }
        Object[] x = x(objArr);
        int a = c.a(i, i2);
        int i3 = i2 - 5;
        x[a] = E((Object[]) x[a], i, i3, it2);
        while (true) {
            a++;
            if (a >= 32 || !it2.hasNext()) {
                break;
            }
            x[a] = E((Object[]) x[a], 0, i3, it2);
        }
        return x;
    }

    private final Object[] F(Object[] objArr, int i, Object[][] objArr2) {
        Iterator a = no.a(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] E = i2 < (1 << i3) ? E(objArr, i, i3, a) : x(objArr);
        while (a.hasNext()) {
            this.d += 5;
            E = A(E);
            int i4 = this.d;
            E(E, 1 << i4, i4, a);
        }
        return E;
    }

    private final void H(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.d;
        if (size > (1 << i)) {
            this.f = I(A(objArr), objArr2, this.d + 5);
            this.g = objArr3;
            this.d += 5;
            this.h = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = size() + 1;
        } else {
            this.f = I(objArr, objArr2, i);
            this.g = objArr3;
            this.h = size() + 1;
        }
    }

    private final Object[] I(Object[] objArr, Object[] objArr2, int i) {
        int a = c.a(size() - 1, i);
        Object[] x = x(objArr);
        if (i == 5) {
            x[a] = objArr2;
        } else {
            x[a] = I((Object[]) x[a], objArr2, i - 5);
        }
        return x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int J(ss2 ss2Var, Object[] objArr, int i, int i2, cc5 cc5Var, List list, List list2) {
        if (v(objArr)) {
            list.add(objArr);
        }
        Object a = cc5Var.a();
        zq3.f(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) a;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) ss2Var.invoke(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !list.isEmpty() ? (Object[]) list.remove(list.size() - 1) : z();
                    i2 = 0;
                }
                objArr3[i2] = obj;
                i2++;
            }
        }
        cc5Var.b(objArr3);
        if (objArr2 != cc5Var.a()) {
            list2.add(objArr2);
        }
        return i2;
    }

    private final int K(ss2 ss2Var, Object[] objArr, int i, cc5 cc5Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) ss2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = x(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        cc5Var.b(objArr2);
        return i2;
    }

    private final boolean L(ss2 ss2Var) {
        Object[] E;
        int W = W();
        cc5 cc5Var = new cc5(null);
        if (this.f == null) {
            return M(ss2Var, W, cc5Var) != W;
        }
        ListIterator w = w(0);
        int i = 32;
        while (i == 32 && w.hasNext()) {
            i = K(ss2Var, (Object[]) w.next(), 32, cc5Var);
        }
        if (i == 32) {
            op0.a(!w.hasNext());
            int M = M(ss2Var, W, cc5Var);
            if (M == 0) {
                D(this.f, size(), this.d);
            }
            return M != W;
        }
        int previousIndex = w.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = i;
        while (w.hasNext()) {
            i2 = J(ss2Var, (Object[]) w.next(), 32, i2, cc5Var, arrayList2, arrayList);
            previousIndex = previousIndex;
        }
        int i3 = previousIndex;
        int J = J(ss2Var, this.g, W, i2, cc5Var, arrayList2, arrayList);
        Object a = cc5Var.a();
        zq3.f(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a;
        d.t(objArr, null, J, 32);
        if (arrayList.isEmpty()) {
            E = this.f;
            zq3.e(E);
        } else {
            E = E(this.f, i3, this.d, arrayList.iterator());
        }
        int size = i3 + (arrayList.size() << 5);
        this.f = R(E, size);
        this.g = objArr;
        this.h = size + J;
        return true;
    }

    private final int M(ss2 ss2Var, int i, cc5 cc5Var) {
        int K = K(ss2Var, this.g, i, cc5Var);
        if (K == i) {
            op0.a(cc5Var.a() == this.g);
            return i;
        }
        Object a = cc5Var.a();
        zq3.f(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) a;
        d.t(objArr, null, K, i);
        this.g = objArr;
        this.h = size() - (i - K);
        return K;
    }

    private final Object[] O(Object[] objArr, int i, int i2, cc5 cc5Var) {
        int a = c.a(i2, i);
        if (i == 0) {
            Object obj = objArr[a];
            Object[] k = d.k(objArr, x(objArr), a, a + 1, 32);
            k[31] = cc5Var.a();
            cc5Var.b(obj);
            return k;
        }
        int a2 = objArr[31] == null ? c.a(S() - 1, i) : 31;
        Object[] x = x(objArr);
        int i3 = i - 5;
        int i4 = a + 1;
        if (i4 <= a2) {
            while (true) {
                Object obj2 = x[a2];
                zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                x[a2] = O((Object[]) obj2, i3, 0, cc5Var);
                if (a2 == i4) {
                    break;
                }
                a2--;
            }
        }
        Object obj3 = x[a];
        zq3.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        x[a] = O((Object[]) obj3, i3, i2, cc5Var);
        return x;
    }

    private final Object Q(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        op0.a(i3 < size);
        if (size == 1) {
            Object obj = this.g[0];
            D(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[i3];
        Object[] k = d.k(objArr2, x(objArr2), i3, i3 + 1, size);
        k[size - 1] = null;
        this.f = objArr;
        this.g = k;
        this.h = (i + size) - 1;
        this.d = i2;
        return obj2;
    }

    private final Object[] R(Object[] objArr, int i) {
        if ((i & 31) != 0) {
            throw new IllegalArgumentException("invalid size");
        }
        if (i == 0) {
            this.d = 0;
            return null;
        }
        int i2 = i - 1;
        while (true) {
            int i3 = this.d;
            if ((i2 >> i3) != 0) {
                return B(objArr, i2, i3);
            }
            this.d = i3 - 5;
            Object[] objArr2 = objArr[0];
            zq3.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    private final int S() {
        if (size() <= 32) {
            return 0;
        }
        return c.d(size());
    }

    private final Object[] T(Object[] objArr, int i, int i2, Object obj, cc5 cc5Var) {
        int a = c.a(i2, i);
        Object[] x = x(objArr);
        if (i != 0) {
            Object obj2 = x[a];
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            x[a] = T((Object[]) obj2, i - 5, i2, obj, cc5Var);
            return x;
        }
        if (x != objArr) {
            ((AbstractList) this).modCount++;
        }
        cc5Var.b(x[a]);
        x[a] = obj;
        return x;
    }

    private final Object[] U(int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator w = w(S() >> 5);
        while (w.previousIndex() != i) {
            Object[] objArr3 = (Object[]) w.previous();
            d.k(objArr3, objArr2, 0, 32 - i2, 32);
            objArr2 = y(objArr3, i2);
            i3--;
            objArr[i3] = objArr2;
        }
        return (Object[]) w.previous();
    }

    private final void V(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] z;
        if (i3 < 1) {
            throw new IllegalArgumentException("requires at least one nullBuffer");
        }
        Object[] x = x(objArr);
        objArr2[0] = x;
        int i4 = i & 31;
        int size = ((i + collection.size()) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            d.k(x, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                z = x;
            } else {
                z = z();
                i3--;
                objArr2[i3] = z;
            }
            int i7 = i2 - i6;
            d.k(x, objArr3, 0, i7, i2);
            d.k(x, z, size + 1, i4, i7);
            objArr3 = z;
        }
        Iterator it2 = collection.iterator();
        g(x, i4, it2);
        for (int i8 = 1; i8 < i3; i8++) {
            objArr2[i8] = g(z(), 0, it2);
        }
        g(objArr3, 0, it2);
    }

    private final int W() {
        return Y(size());
    }

    private final int Y(int i) {
        return i <= 32 ? i : i - c.d(i);
    }

    private final Object[] f(int i) {
        if (S() <= i) {
            return this.g;
        }
        Object[] objArr = this.f;
        zq3.e(objArr);
        for (int i2 = this.d; i2 > 0; i2 -= 5) {
            Object[] objArr2 = objArr[c.a(i, i2)];
            zq3.f(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] g(Object[] objArr, int i, Iterator it2) {
        while (i < 32 && it2.hasNext()) {
            objArr[i] = it2.next();
            i++;
        }
        return objArr;
    }

    private final void q(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        Object[] U = U(i4, i2, objArr, i3, objArr2);
        int S = i3 - (((S() >> 5) - 1) - i4);
        if (S < i3) {
            objArr2 = objArr[S];
            zq3.e(objArr2);
        }
        V(collection, i, U, 32, objArr, S, objArr2);
    }

    private final Object[] t(Object[] objArr, int i, int i2, Object obj, cc5 cc5Var) {
        Object obj2;
        int a = c.a(i2, i);
        if (i == 0) {
            cc5Var.b(objArr[31]);
            Object[] k = d.k(objArr, x(objArr), a + 1, a, 31);
            k[a] = obj;
            return k;
        }
        Object[] x = x(objArr);
        int i3 = i - 5;
        Object obj3 = x[a];
        zq3.f(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        x[a] = t((Object[]) obj3, i3, i2, obj, cc5Var);
        while (true) {
            a++;
            if (a >= 32 || (obj2 = x[a]) == null) {
                break;
            }
            zq3.f(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            x[a] = t((Object[]) obj2, i3, 0, cc5Var.a(), cc5Var);
        }
        return x;
    }

    private final void u(Object[] objArr, int i, Object obj) {
        int W = W();
        Object[] x = x(this.g);
        if (W < 32) {
            d.k(this.g, x, i + 1, i, W);
            x[i] = obj;
            this.f = objArr;
            this.g = x;
            this.h = size() + 1;
            return;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[31];
        d.k(objArr2, x, i + 1, i, 31);
        x[i] = obj;
        H(objArr, x, A(obj2));
    }

    private final boolean v(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    private final ListIterator w(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int S = S() >> 5;
        v54.b(i, S);
        int i2 = this.d;
        return i2 == 0 ? new lt7(objArr, i) : new ts8(objArr, i, S, i2 / 5);
    }

    private final Object[] x(Object[] objArr) {
        return objArr == null ? z() : v(objArr) ? objArr : d.o(objArr, z(), 0, 0, uo6.i(objArr.length, 32), 6, null);
    }

    private final Object[] y(Object[] objArr, int i) {
        return v(objArr) ? d.k(objArr, objArr, i, 0, 32 - i) : d.k(objArr, z(), i, 0, 32 - i);
    }

    private final Object[] z() {
        Object[] objArr = new Object[33];
        objArr[32] = this.e;
        return objArr;
    }

    public final boolean N(ss2 ss2Var) {
        boolean L = L(ss2Var);
        if (L) {
            ((AbstractList) this).modCount++;
        }
        return L;
    }

    @Override // defpackage.n1
    public int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int W = W();
        if (W < 32) {
            Object[] x = x(this.g);
            x[W] = obj;
            this.g = x;
            this.h = size() + 1;
        } else {
            H(this.f, this.g, A(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int W = W();
        Iterator it2 = collection.iterator();
        if (32 - W >= collection.size()) {
            this.g = g(x(this.g), W, it2);
            this.h = size() + collection.size();
        } else {
            int size = ((collection.size() + W) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = g(x(this.g), W, it2);
            for (int i = 1; i < size; i++) {
                objArr[i] = g(z(), 0, it2);
            }
            this.f = F(this.f, S(), objArr);
            this.g = g(z(), 0, it2);
            this.h = size() + collection.size();
        }
        return true;
    }

    @Override // cs5.a
    public cs5 build() {
        cs5 aVar;
        if (this.f == this.b && this.g == this.c) {
            aVar = this.a;
        } else {
            this.e = new wx4();
            Object[] objArr = this.f;
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f;
                zq3.e(objArr3);
                aVar = new a(objArr3, this.g, size(), this.d);
            } else if (objArr2.length == 0) {
                aVar = c.b();
            } else {
                Object[] copyOf = Arrays.copyOf(this.g, size());
                zq3.g(copyOf, "copyOf(this, newSize)");
                aVar = new b(copyOf);
            }
        }
        this.a = aVar;
        return aVar;
    }

    @Override // defpackage.n1
    public Object c(int i) {
        v54.a(i, size());
        ((AbstractList) this).modCount++;
        int S = S();
        if (i >= S) {
            return Q(this.f, S, this.d, i - S);
        }
        cc5 cc5Var = new cc5(this.g[0]);
        Object[] objArr = this.f;
        zq3.e(objArr);
        Q(O(objArr, this.d, i, cc5Var), S, this.d, 0);
        return cc5Var.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        v54.a(i, size());
        return f(i)[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    public final int j() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public final Object[] n() {
        return this.f;
    }

    public final int o() {
        return this.d;
    }

    public final Object[] p() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection collection) {
        return N(new ss2() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder$removeAll$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(collection.contains(obj));
            }
        });
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        v54.a(i, size());
        if (S() > i) {
            cc5 cc5Var = new cc5(null);
            Object[] objArr = this.f;
            zq3.e(objArr);
            this.f = T(objArr, this.d, i, obj, cc5Var);
            return cc5Var.a();
        }
        Object[] x = x(this.g);
        if (x != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = x[i2];
        x[i2] = obj;
        this.g = x;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        v54.b(i, size());
        return new is5(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        v54.b(i, size());
        if (i == size()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int S = S();
        if (i >= S) {
            u(this.f, i - S, obj);
            return;
        }
        cc5 cc5Var = new cc5(null);
        Object[] objArr = this.f;
        zq3.e(objArr);
        u(t(objArr, this.d, i, obj, cc5Var), 0, cc5Var.a());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        Object[] k;
        v54.b(i, size());
        if (i == size()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = (((size() - i2) + collection.size()) - 1) / 32;
        if (size == 0) {
            op0.a(i >= S());
            int i3 = i & 31;
            int size2 = ((i + collection.size()) - 1) & 31;
            Object[] objArr = this.g;
            Object[] k2 = d.k(objArr, x(objArr), size2 + 1, i3, W());
            g(k2, i3, collection.iterator());
            this.g = k2;
            this.h = size() + collection.size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int W = W();
        int Y = Y(size() + collection.size());
        if (i >= S()) {
            k = z();
            V(collection, i, this.g, W, objArr2, size, k);
        } else if (Y > W) {
            int i4 = Y - W;
            k = y(this.g, i4);
            q(collection, i, i4, objArr2, size, k);
        } else {
            int i5 = W - Y;
            k = d.k(this.g, z(), 0, i5, W);
            int i6 = 32 - i5;
            Object[] y = y(this.g, i6);
            int i7 = size - 1;
            objArr2[i7] = y;
            q(collection, i, i6, objArr2, i7, y);
        }
        this.f = F(this.f, i2, objArr2);
        this.g = k;
        this.h = size() + collection.size();
        return true;
    }
}
