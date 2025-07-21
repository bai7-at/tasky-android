package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class vo implements Collection, Set, zu3, hv3 {
    private int[] a;
    private Object[] b;
    private int c;

    private final class a extends yi3 {
        public a() {
            super(vo.this.j());
        }

        @Override // defpackage.yi3
        protected Object c(int i) {
            return vo.this.u(i);
        }

        @Override // defpackage.yi3
        protected void d(int i) {
            vo.this.o(i);
        }
    }

    public vo() {
        this(0, 1, null);
    }

    public final void a(int i) {
        int j = j();
        if (f().length < i) {
            int[] f = f();
            Object[] c = c();
            xo.a(this, i);
            if (j() > 0) {
                d.n(f, f(), 0, 0, j(), 6, null);
                d.o(c, c(), 0, 0, j(), 6, null);
            }
        }
        if (j() != j) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i;
        int c;
        int j = j();
        if (obj == null) {
            c = xo.d(this);
            i = 0;
        } else {
            int hashCode = obj.hashCode();
            i = hashCode;
            c = xo.c(this, obj, hashCode);
        }
        if (c >= 0) {
            return false;
        }
        int i2 = ~c;
        if (j >= f().length) {
            int i3 = 8;
            if (j >= 8) {
                i3 = (j >> 1) + j;
            } else if (j < 4) {
                i3 = 4;
            }
            int[] f = f();
            Object[] c2 = c();
            xo.a(this, i3);
            if (j != j()) {
                throw new ConcurrentModificationException();
            }
            if (!(f().length == 0)) {
                d.n(f, f(), 0, 0, f.length, 6, null);
                d.o(c2, c(), 0, 0, c2.length, 6, null);
            }
        }
        if (i2 < j) {
            int i4 = i2 + 1;
            d.i(f(), f(), i4, i2, j);
            d.k(c(), c(), i4, i2, j);
        }
        if (j != j() || i2 >= f().length) {
            throw new ConcurrentModificationException();
        }
        f()[i2] = i;
        c()[i2] = obj;
        t(j() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        zq3.h(collection, "elements");
        a(j() + collection.size());
        Iterator it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z |= add(it2.next());
        }
        return z;
    }

    public final Object[] c() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (j() != 0) {
            q(rv0.a);
            p(rv0.c);
            t(0);
        }
        if (j() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        zq3.h(collection, "elements");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int j = j();
                for (int i = 0; i < j; i++) {
                    if (((Set) obj).contains(u(i))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final int[] f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] f = f();
        int j = j();
        int i = 0;
        for (int i2 = 0; i2 < j; i2++) {
            i += f[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        return obj == null ? xo.d(this) : xo.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return j() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final int j() {
        return this.c;
    }

    public final boolean n(vo voVar) {
        zq3.h(voVar, "array");
        int j = voVar.j();
        int j2 = j();
        for (int i = 0; i < j; i++) {
            remove(voVar.u(i));
        }
        return j2 != j();
    }

    public final Object o(int i) {
        int j = j();
        Object obj = c()[i];
        if (j <= 1) {
            clear();
        } else {
            int i2 = j - 1;
            if (f().length <= 8 || j() >= f().length / 3) {
                if (i < i2) {
                    int i3 = i + 1;
                    d.i(f(), f(), i, i3, j);
                    d.k(c(), c(), i, i3, j);
                }
                c()[i2] = null;
            } else {
                int j2 = j() > 8 ? j() + (j() >> 1) : 8;
                int[] f = f();
                Object[] c = c();
                xo.a(this, j2);
                if (i > 0) {
                    d.n(f, f(), 0, 0, i, 6, null);
                    d.o(c, c(), 0, 0, i, 6, null);
                }
                if (i < i2) {
                    int i4 = i + 1;
                    d.i(f, f(), i, i4, j);
                    d.k(c, c(), i, i4, j);
                }
            }
            if (j != j()) {
                throw new ConcurrentModificationException();
            }
            t(i2);
        }
        return obj;
    }

    public final void p(Object[] objArr) {
        zq3.h(objArr, "<set-?>");
        this.b = objArr;
    }

    public final void q(int[] iArr) {
        zq3.h(iArr, "<set-?>");
        this.a = iArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        zq3.h(collection, "elements");
        Iterator it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            z |= remove(it2.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        zq3.h(collection, "elements");
        boolean z = false;
        for (int j = j() - 1; -1 < j; j--) {
            if (!i.c0(collection, c()[j])) {
                o(j);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    public final void t(int i) {
        this.c = i;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return d.q(this.b, 0, this.c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(j() * 14);
        sb.append('{');
        int j = j();
        for (int i = 0; i < j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object u = u(i);
            if (u != this) {
                sb.append(u);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public final Object u(int i) {
        return c()[i];
    }

    public vo(int i) {
        this.a = rv0.a;
        this.b = rv0.c;
        if (i > 0) {
            xo.a(this, i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        Object[] a2 = wo.a(objArr, this.c);
        d.k(this.b, a2, 0, 0, this.c);
        zq3.g(a2, "result");
        return a2;
    }

    public /* synthetic */ vo(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
