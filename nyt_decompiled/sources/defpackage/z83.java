package defpackage;

import androidx.compose.ui.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.d;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class z83 implements List, yu3 {
    private Object[] a = new Object[16];
    private long[] b = new long[16];
    private int c = -1;
    private int d;

    private final class b implements List, yu3 {
        private final int a;
        private final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean a(Modifier.c cVar) {
            return indexOf(cVar) != -1;
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ void add(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Modifier.c get(int i) {
            Object obj = z83.this.a[i + this.a];
            zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) obj;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Modifier.c) {
                return a((Modifier.c) obj);
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains((Modifier.c) it2.next())) {
                    return false;
                }
            }
            return true;
        }

        public int f() {
            return this.b - this.a;
        }

        public int g(Modifier.c cVar) {
            int i = this.a;
            int i2 = this.b;
            if (i > i2) {
                return -1;
            }
            while (!zq3.c(z83.this.a[i], cVar)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.a;
        }

        @Override // java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Modifier.c) {
                return g((Modifier.c) obj);
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            z83 z83Var = z83.this;
            int i = this.a;
            return z83Var.new a(i, i, this.b);
        }

        public int j(Modifier.c cVar) {
            int i = this.b;
            int i2 = this.a;
            if (i2 > i) {
                return -1;
            }
            while (!zq3.c(z83.this.a[i], cVar)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.a;
        }

        @Override // java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Modifier.c) {
                return j((Modifier.c) obj);
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            z83 z83Var = z83.this;
            int i = this.a;
            return z83Var.new a(i, i, this.b);
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public void replaceAll(UnaryOperator unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.List
        public void sort(Comparator comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            z83 z83Var = z83.this;
            int i3 = this.a;
            return z83Var.new b(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return ln0.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            z83 z83Var = z83.this;
            int i2 = this.a;
            return z83Var.new a(i + i2, i2, this.b);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return ln0.b(this, objArr);
        }
    }

    private final void n() {
        int i = this.c;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            zq3.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.b, length);
            zq3.g(copyOf2, "copyOf(this, newSize)");
            this.b = copyOf2;
        }
    }

    private final long o() {
        long a2;
        a2 = a93.a(Float.POSITIVE_INFINITY, false);
        int i = this.c + 1;
        int n = i.n(this);
        if (i <= n) {
            while (true) {
                long b2 = rs1.b(this.b[i]);
                if (rs1.a(b2, a2) < 0) {
                    a2 = b2;
                }
                if (rs1.c(a2) < 0.0f && rs1.d(a2)) {
                    return a2;
                }
                if (i == n) {
                    break;
                }
                i++;
            }
        }
        return a2;
    }

    private final void z() {
        int i = this.c + 1;
        int n = i.n(this);
        if (i <= n) {
            while (true) {
                this.a[i] = null;
                if (i == n) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.d = this.c + 1;
    }

    public final void A(Modifier.c cVar, float f, boolean z, qs2 qs2Var) {
        if (this.c == i.n(this)) {
            v(cVar, f, z, qs2Var);
            if (this.c + 1 == i.n(this)) {
                z();
                return;
            }
            return;
        }
        long o = o();
        int i = this.c;
        this.c = i.n(this);
        v(cVar, f, z, qs2Var);
        if (this.c + 1 < i.n(this) && rs1.a(o, o()) > 0) {
            int i2 = this.c + 1;
            int i3 = i + 1;
            Object[] objArr = this.a;
            d.k(objArr, objArr, i3, i2, size());
            long[] jArr = this.b;
            d.j(jArr, jArr, i3, i2, size());
            this.c = ((size() + i) - this.c) - 1;
        }
        z();
        this.c = i;
    }

    public final void a() {
        this.c = size() - 1;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.c = -1;
        z();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Modifier.c) {
            return j((Modifier.c) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains((Modifier.c) it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Modifier.c) {
            return w((Modifier.c) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    public boolean j(Modifier.c cVar) {
        return indexOf(cVar) != -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Modifier.c) {
            return y((Modifier.c) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Modifier.c get(int i) {
        Object obj = this.a[i];
        zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (Modifier.c) obj;
    }

    public int q() {
        return this.d;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return q();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new b(i, i2);
    }

    public final boolean t() {
        long o = o();
        return rs1.c(o) < 0.0f && rs1.d(o);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ln0.a(this);
    }

    public final void u(Modifier.c cVar, boolean z, qs2 qs2Var) {
        v(cVar, -1.0f, z, qs2Var);
    }

    public final void v(Modifier.c cVar, float f, boolean z, qs2 qs2Var) {
        long a2;
        int i = this.c;
        this.c = i + 1;
        n();
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = cVar;
        long[] jArr = this.b;
        a2 = a93.a(f, z);
        jArr[i2] = a2;
        z();
        qs2Var.mo865invoke();
        this.c = i;
    }

    public int w(Modifier.c cVar) {
        int n = i.n(this);
        if (n < 0) {
            return -1;
        }
        int i = 0;
        while (!zq3.c(this.a[i], cVar)) {
            if (i == n) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public final boolean x(float f, boolean z) {
        long a2;
        if (this.c == i.n(this)) {
            return true;
        }
        a2 = a93.a(f, z);
        return rs1.a(o(), a2) > 0;
    }

    public int y(Modifier.c cVar) {
        for (int n = i.n(this); -1 < n; n--) {
            if (zq3.c(this.a[n], cVar)) {
                return n;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new a(this, i, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ln0.b(this, objArr);
    }

    private final class a implements ListIterator, yu3 {
        private int a;
        private final int b;
        private final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Modifier.c next() {
            Object[] objArr = z83.this.a;
            int i = this.a;
            this.a = i + 1;
            Object obj = objArr[i];
            zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) obj;
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Modifier.c previous() {
            Object[] objArr = z83.this.a;
            int i = this.a - 1;
            this.a = i;
            Object obj = objArr[i];
            zq3.f(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (Modifier.c) obj;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a < this.c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.a > this.b;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a - this.b;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return (this.a - this.b) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* synthetic */ a(z83 z83Var, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? z83Var.size() : i3);
        }
    }
}
