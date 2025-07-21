package defpackage;

import java.util.function.Supplier;

/* loaded from: classes5.dex */
final class ba4 {
    private final bz6 b;
    private final Supplier c;
    private final u84 d;
    private final yl0 e;
    private final Object a = new Object();
    private volatile gq0 f = null;

    ba4(bz6 bz6Var, Supplier supplier, u84 u84Var, yl0 yl0Var) {
        this.b = bz6Var;
        this.c = supplier;
        this.d = u84Var;
        this.e = yl0Var;
    }

    yl0 a() {
        return this.e;
    }

    k84 b() {
        return (k84) this.c.get();
    }

    u84 c() {
        return this.d;
    }

    bz6 d() {
        return this.b;
    }

    boolean e() {
        return this.f != null;
    }

    gq0 f() {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return this.f;
                }
                this.f = this.d.shutdown();
                return this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
