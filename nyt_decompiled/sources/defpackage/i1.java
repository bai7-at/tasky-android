package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class i1 implements ListIterator, yu3 {
    private int a;
    private int b;

    public i1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void d() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    public final int f() {
        return this.a;
    }

    public final int g() {
        return this.b;
    }

    public final void h(int i) {
        this.a = i;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.a > 0;
    }

    public final void i(int i) {
        this.b = i;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
