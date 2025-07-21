package defpackage;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class gr3 implements n33 {
    private static AtomicLong d = new AtomicLong(0);
    protected p33 a;
    private final long b;
    private Map c;

    public gr3() {
        this(d.decrementAndGet());
    }

    @Override // defpackage.n33
    public int a() {
        return 1;
    }

    @Override // defpackage.n33
    public void f(p33 p33Var) {
        this.a = p33Var;
    }

    @Override // defpackage.n33
    public gr3 getItem(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i + " but an Item is a Group of size 1");
    }

    @Override // defpackage.n33
    public void i(p33 p33Var) {
        this.a = null;
    }

    public abstract void j(t33 t33Var, int i, List list);

    public void k(t33 t33Var, int i, List list, xe5 xe5Var, ye5 ye5Var) {
        t33Var.Y(this, xe5Var, ye5Var);
        j(t33Var, i, list);
    }

    public abstract t33 l(View view);

    public Object m(gr3 gr3Var) {
        return null;
    }

    public long n() {
        return this.b;
    }

    public abstract int o();

    public int p(int i, int i2) {
        return i;
    }

    public int q() {
        return o();
    }

    public boolean r(gr3 gr3Var) {
        return equals(gr3Var);
    }

    public boolean s() {
        return true;
    }

    public boolean t() {
        return true;
    }

    public boolean u() {
        return true;
    }

    public boolean v(gr3 gr3Var) {
        return q() == gr3Var.q() && n() == gr3Var.n();
    }

    public void w(t33 t33Var) {
    }

    public void x(t33 t33Var) {
    }

    public void y(t33 t33Var) {
        t33Var.a0();
    }

    protected gr3(long j) {
        this.c = new HashMap();
        this.b = j;
    }
}
