package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class nr5 implements Iterator, yu3 {
    private final vs8[] a;
    private int b;
    private boolean c = true;

    public nr5(us8 us8Var, vs8[] vs8VarArr) {
        this.a = vs8VarArr;
        vs8VarArr[0].m(us8Var.p(), us8Var.m() * 2);
        this.b = 0;
        f();
    }

    private final void c() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void f() {
        if (this.a[this.b].h()) {
            return;
        }
        for (int i = this.b; -1 < i; i--) {
            int h = h(i);
            if (h == -1 && this.a[i].i()) {
                this.a[i].l();
                h = h(i);
            }
            if (h != -1) {
                this.b = h;
                return;
            }
            if (i > 0) {
                this.a[i - 1].l();
            }
            this.a[i].m(us8.e.a().p(), 0);
        }
        this.c = false;
    }

    private final int h(int i) {
        if (this.a[i].h()) {
            return i;
        }
        if (!this.a[i].i()) {
            return -1;
        }
        us8 d = this.a[i].d();
        if (i == 6) {
            this.a[i + 1].m(d.p(), d.p().length);
        } else {
            this.a[i + 1].m(d.p(), d.m() * 2);
        }
        return h(i + 1);
    }

    protected final Object d() {
        c();
        return this.a[this.b].c();
    }

    protected final vs8[] g() {
        return this.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    protected final void i(int i) {
        this.b = i;
    }

    @Override // java.util.Iterator
    public Object next() {
        c();
        Object next = this.a[this.b].next();
        f();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
