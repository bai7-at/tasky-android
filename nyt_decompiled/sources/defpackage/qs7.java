package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class qs7 implements v51 {
    private final zx0 a;
    private final tx7 b;
    private final boolean c;
    private final v51 d;
    private final int e;

    public qs7(zx0 zx0Var, tx7 tx7Var, boolean z) {
        this.a = zx0Var;
        this.b = tx7Var;
        this.c = z;
        ThreadLocal threadLocal = zx0.e;
        v51 v51Var = (v51) threadLocal.get();
        this.d = v51Var;
        threadLocal.set(this);
        this.e = v51Var == null ? 0 : v51Var.d0() + 1;
        Iterator it2 = zx0Var.b.iterator();
        while (it2.hasNext()) {
            ((zb7) it2.next()).b();
        }
    }

    @Override // defpackage.v51
    public tx7 b1() {
        return this.b;
    }

    @Override // defpackage.yb7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.c) {
            this.b.a();
        }
        Iterator it2 = this.a.b.iterator();
        while (it2.hasNext()) {
            ((zb7) it2.next()).a();
        }
        ThreadLocal threadLocal = zx0.e;
        if (threadLocal.get() == this) {
            threadLocal.set(this.d);
            if (this.d != null) {
                Iterator it3 = this.a.b.iterator();
                while (it3.hasNext()) {
                    ((zb7) it3.next()).b();
                }
            }
        }
    }

    @Override // defpackage.v51
    public int d0() {
        return this.e;
    }
}
