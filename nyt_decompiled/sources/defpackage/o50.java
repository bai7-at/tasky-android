package defpackage;

import java.util.Queue;

/* loaded from: classes2.dex */
abstract class o50 {
    private final Queue a = x19.e(20);

    o50() {
    }

    abstract nz5 a();

    nz5 b() {
        nz5 nz5Var = (nz5) this.a.poll();
        return nz5Var == null ? a() : nz5Var;
    }

    public void c(nz5 nz5Var) {
        if (this.a.size() < 20) {
            this.a.offer(nz5Var);
        }
    }
}
