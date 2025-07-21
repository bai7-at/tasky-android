package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class yi3 implements Iterator, yu3 {
    private int a;
    private int b;
    private boolean c;

    public yi3(int i) {
        this.a = i;
    }

    protected abstract Object c(int i);

    protected abstract void d(int i);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object c = c(this.b);
        this.b++;
        this.c = true;
        return c;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        d(i);
        this.a--;
        this.c = false;
    }
}
