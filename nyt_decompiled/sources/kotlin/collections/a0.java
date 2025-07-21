package kotlin.collections;

import defpackage.f1;
import defpackage.uo6;
import defpackage.zq3;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class a0 extends kotlin.collections.a implements RandomAccess {
    private final Object[] b;
    private final int c;
    private int d;
    private int e;

    public static final class a extends f1 {
        private int c;
        private int d;

        a() {
            this.c = a0.this.size();
            this.d = a0.this.d;
        }

        @Override // defpackage.f1
        protected void c() {
            if (this.c == 0) {
                d();
                return;
            }
            f(a0.this.b[this.d]);
            this.d = (this.d + 1) % a0.this.c;
            this.c--;
        }
    }

    public a0(Object[] objArr, int i) {
        zq3.h(objArr, "buffer");
        this.b = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i <= objArr.length) {
            this.c = objArr.length;
            this.e = i;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
    }

    @Override // kotlin.collections.AbstractCollection
    public int a() {
        return this.e;
    }

    @Override // kotlin.collections.a, java.util.List
    public Object get(int i) {
        kotlin.collections.a.a.b(i, size());
        return this.b[(this.d + i) % this.c];
    }

    @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new a();
    }

    public final void j(Object obj) {
        if (o()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.b[(this.d + size()) % this.c] = obj;
        this.e = size() + 1;
    }

    public final a0 n(int i) {
        Object[] array;
        int i2 = this.c;
        int i3 = uo6.i(i2 + (i2 >> 1) + 1, i);
        if (this.d == 0) {
            array = Arrays.copyOf(this.b, i3);
            zq3.g(array, "copyOf(...)");
        } else {
            array = toArray(new Object[i3]);
        }
        return new a0(array, size());
    }

    public final boolean o() {
        return size() == this.c;
    }

    public final void p(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.d;
            int i3 = (i2 + i) % this.c;
            if (i2 > i3) {
                d.t(this.b, null, i2, this.c);
                d.t(this.b, null, 0, i3);
            } else {
                d.t(this.b, null, i2, i3);
            }
            this.d = i3;
            this.e = size() - i;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        zq3.h(objArr, "array");
        if (objArr.length < size()) {
            objArr = Arrays.copyOf(objArr, size());
            zq3.g(objArr, "copyOf(...)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.d; i2 < size && i3 < this.c; i3++) {
            objArr[i2] = this.b[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.b[i];
            i2++;
            i++;
        }
        return i.g(size, objArr);
    }

    public a0(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
