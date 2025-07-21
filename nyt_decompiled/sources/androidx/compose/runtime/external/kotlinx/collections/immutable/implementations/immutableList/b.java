package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import defpackage.cd0;
import defpackage.cs5;
import defpackage.mh3;
import defpackage.op0;
import defpackage.ss2;
import defpackage.v54;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class b extends AbstractPersistentList implements mh3 {
    public static final a c = new a(null);
    public static final int d = 8;
    private static final b e = new b(new Object[0]);
    private final Object[] b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            return b.e;
        }

        private a() {
        }
    }

    public b(Object[] objArr) {
        this.b = objArr;
        op0.a(objArr.length <= 32);
    }

    private final Object[] f(int i) {
        return new Object[i];
    }

    @Override // defpackage.cs5
    public cs5 P(int i) {
        v54.a(i, size());
        if (size() == 1) {
            return e;
        }
        Object[] copyOf = Arrays.copyOf(this.b, size() - 1);
        zq3.g(copyOf, "copyOf(this, newSize)");
        d.k(this.b, copyOf, i, i + 1, size());
        return new b(copyOf);
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.b.length;
    }

    @Override // java.util.Collection, java.util.List, defpackage.cs5
    public cs5 add(Object obj) {
        if (size() >= 32) {
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a(this.b, c.c(obj), size() + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(this.b, size() + 1);
        zq3.g(copyOf, "copyOf(this, newSize)");
        copyOf[size()] = obj;
        return new b(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, defpackage.cs5
    public cs5 addAll(Collection collection) {
        if (size() + collection.size() > 32) {
            cs5.a b = b();
            b.addAll(collection);
            return b.build();
        }
        Object[] copyOf = Arrays.copyOf(this.b, size() + collection.size());
        zq3.g(copyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            copyOf[size] = it2.next();
            size++;
        }
        return new b(copyOf);
    }

    @Override // defpackage.cs5
    public cs5.a b() {
        return new PersistentVectorBuilder(this, null, this.b, 0);
    }

    @Override // defpackage.cs5
    public cs5 e1(ss2 ss2Var) {
        Object[] objArr = this.b;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.b[i];
            if (((Boolean) ss2Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.b;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    zq3.g(objArr, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        return size == size() ? this : size == 0 ? e : new b(d.q(objArr, 0, size));
    }

    @Override // kotlin.collections.a, java.util.List
    public Object get(int i) {
        v54.a(i, size());
        return this.b[i];
    }

    @Override // kotlin.collections.a, java.util.List
    public int indexOf(Object obj) {
        return d.k0(this.b, obj);
    }

    @Override // kotlin.collections.a, java.util.List
    public int lastIndexOf(Object obj) {
        return d.t0(this.b, obj);
    }

    @Override // kotlin.collections.a, java.util.List
    public ListIterator listIterator(int i) {
        v54.b(i, size());
        return new cd0(this.b, i, size());
    }

    @Override // kotlin.collections.a, java.util.List, defpackage.cs5
    public cs5 set(int i, Object obj) {
        v54.a(i, size());
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        zq3.g(copyOf, "copyOf(this, size)");
        copyOf[i] = obj;
        return new b(copyOf);
    }

    @Override // java.util.List, defpackage.cs5
    public cs5 add(int i, Object obj) {
        v54.b(i, size());
        if (i == size()) {
            return add(obj);
        }
        if (size() < 32) {
            Object[] f = f(size() + 1);
            d.o(this.b, f, 0, 0, i, 6, null);
            d.k(this.b, f, i + 1, i, size());
            f[i] = obj;
            return new b(f);
        }
        Object[] objArr = this.b;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        zq3.g(copyOf, "copyOf(this, size)");
        d.k(this.b, copyOf, i + 1, i, size() - 1);
        copyOf[i] = obj;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a(copyOf, c.c(this.b[31]), size() + 1, 0);
    }
}
