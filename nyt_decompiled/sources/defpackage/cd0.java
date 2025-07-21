package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class cd0 extends i1 {
    private final Object[] c;

    public cd0(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        int f = f();
        h(f + 1);
        return objArr[f];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        h(f() - 1);
        return objArr[f()];
    }
}
