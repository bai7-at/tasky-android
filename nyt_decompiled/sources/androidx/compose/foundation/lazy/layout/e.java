package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.f;
import androidx.compose.runtime.b0;
import defpackage.cy4;
import defpackage.ow7;
import defpackage.sy4;
import defpackage.ut5;
import defpackage.ww8;

/* loaded from: classes.dex */
final class e implements ut5, ut5.a, f.a {
    private final Object a;
    private final f b;
    private final cy4 c = ow7.a(-1);
    private final cy4 d = ow7.a(0);
    private final sy4 e = b0.e(null, null, 2, null);
    private final sy4 f = b0.e(null, null, 2, null);

    public e(Object obj, f fVar) {
        this.a = obj;
        this.b = fVar;
    }

    private final ut5.a b() {
        return (ut5.a) this.e.getValue();
    }

    private final int d() {
        return this.d.d();
    }

    private final ut5 e() {
        return (ut5) this.f.getValue();
    }

    private final void h(ut5.a aVar) {
        this.e.setValue(aVar);
    }

    private final void j(int i) {
        this.d.f(i);
    }

    private final void k(ut5 ut5Var) {
        this.f.setValue(ut5Var);
    }

    @Override // defpackage.ut5
    public ut5.a a() {
        if (d() == 0) {
            this.b.n(this);
            ut5 c = c();
            h(c != null ? c.a() : null);
        }
        j(d() + 1);
        return this;
    }

    public final ut5 c() {
        return e();
    }

    public final void f() {
        int d = d();
        for (int i = 0; i < d; i++) {
            release();
        }
    }

    public void g(int i) {
        this.c.f(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.f.a
    public int getIndex() {
        return this.c.d();
    }

    @Override // androidx.compose.foundation.lazy.layout.f.a
    public Object getKey() {
        return this.a;
    }

    public final void i(ut5 ut5Var) {
        androidx.compose.runtime.snapshots.e c = androidx.compose.runtime.snapshots.e.e.c();
        try {
            androidx.compose.runtime.snapshots.e l = c.l();
            try {
                if (ut5Var != e()) {
                    k(ut5Var);
                    if (d() > 0) {
                        ut5.a b = b();
                        if (b != null) {
                            b.release();
                        }
                        h(ut5Var != null ? ut5Var.a() : null);
                    }
                }
                ww8 ww8Var = ww8.a;
                c.s(l);
            } catch (Throwable th) {
                c.s(l);
                throw th;
            }
        } finally {
            c.d();
        }
    }

    @Override // ut5.a
    public void release() {
        if (d() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        j(d() - 1);
        if (d() == 0) {
            this.b.o(this);
            ut5.a b = b();
            if (b != null) {
                b.release();
            }
            h(null);
        }
    }
}
