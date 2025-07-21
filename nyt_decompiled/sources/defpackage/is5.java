package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class is5 extends i1 implements ListIterator, yu3 {
    private final PersistentVectorBuilder c;
    private int d;
    private ts8 e;
    private int f;

    public is5(PersistentVectorBuilder persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        this.c = persistentVectorBuilder;
        this.d = persistentVectorBuilder.j();
        this.f = -1;
        n();
    }

    private final void j() {
        if (this.d != this.c.j()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void m() {
        i(this.c.size());
        this.d = this.c.j();
        this.f = -1;
        n();
    }

    private final void n() {
        Object[] n = this.c.n();
        if (n == null) {
            this.e = null;
            return;
        }
        int d = c.d(this.c.size());
        int i = uo6.i(f(), d);
        int o = (this.c.o() / 5) + 1;
        ts8 ts8Var = this.e;
        if (ts8Var == null) {
            this.e = new ts8(n, i, d, o);
        } else {
            zq3.e(ts8Var);
            ts8Var.n(n, i, d, o);
        }
    }

    @Override // defpackage.i1, java.util.ListIterator
    public void add(Object obj) {
        j();
        this.c.add(f(), obj);
        h(f() + 1);
        m();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        j();
        c();
        this.f = f();
        ts8 ts8Var = this.e;
        if (ts8Var == null) {
            Object[] p = this.c.p();
            int f = f();
            h(f + 1);
            return p[f];
        }
        if (ts8Var.hasNext()) {
            h(f() + 1);
            return ts8Var.next();
        }
        Object[] p2 = this.c.p();
        int f2 = f();
        h(f2 + 1);
        return p2[f2 - ts8Var.g()];
    }

    @Override // java.util.ListIterator
    public Object previous() {
        j();
        d();
        this.f = f() - 1;
        ts8 ts8Var = this.e;
        if (ts8Var == null) {
            Object[] p = this.c.p();
            h(f() - 1);
            return p[f()];
        }
        if (f() <= ts8Var.g()) {
            h(f() - 1);
            return ts8Var.previous();
        }
        Object[] p2 = this.c.p();
        h(f() - 1);
        return p2[f() - ts8Var.g()];
    }

    @Override // defpackage.i1, java.util.ListIterator, java.util.Iterator
    public void remove() {
        j();
        l();
        this.c.remove(this.f);
        if (this.f < f()) {
            h(this.f);
        }
        m();
    }

    @Override // defpackage.i1, java.util.ListIterator
    public void set(Object obj) {
        j();
        l();
        this.c.set(this.f, obj);
        this.d = this.c.j();
        n();
    }
}
