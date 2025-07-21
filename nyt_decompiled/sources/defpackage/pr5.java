package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class pr5 extends nr5 implements Iterator, yu3 {
    private final or5 d;
    private Object e;
    private boolean f;
    private int g;

    public pr5(or5 or5Var, vs8[] vs8VarArr) {
        super(or5Var.d(), vs8VarArr);
        this.d = or5Var;
        this.g = or5Var.c();
    }

    private final void j() {
        if (this.d.c() != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void l() {
        if (!this.f) {
            throw new IllegalStateException();
        }
    }

    private final void m(int i, us8 us8Var, Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            g()[i2].n(us8Var.p(), us8Var.p().length, 0);
            while (!zq3.c(g()[i2].c(), obj)) {
                g()[i2].j();
            }
            i(i2);
            return;
        }
        int f = 1 << ys8.f(i, i3);
        if (us8Var.q(f)) {
            g()[i2].n(us8Var.p(), us8Var.m() * 2, us8Var.n(f));
            i(i2);
        } else {
            int O = us8Var.O(f);
            us8 N = us8Var.N(O);
            g()[i2].n(us8Var.p(), us8Var.m() * 2, O);
            m(i, N, obj, i2 + 1);
        }
    }

    public final void n(Object obj, Object obj2) {
        if (this.d.containsKey(obj)) {
            if (hasNext()) {
                Object d = d();
                this.d.put(obj, obj2);
                m(d != null ? d.hashCode() : 0, this.d.d(), d, 0);
            } else {
                this.d.put(obj, obj2);
            }
            this.g = this.d.c();
        }
    }

    @Override // defpackage.nr5, java.util.Iterator
    public Object next() {
        j();
        this.e = d();
        this.f = true;
        return super.next();
    }

    @Override // defpackage.nr5, java.util.Iterator
    public void remove() {
        l();
        if (hasNext()) {
            Object d = d();
            ku8.d(this.d).remove(this.e);
            m(d != null ? d.hashCode() : 0, this.d.d(), d, 0);
        } else {
            ku8.d(this.d).remove(this.e);
        }
        this.e = null;
        this.f = false;
        this.g = this.d.c();
    }
}
