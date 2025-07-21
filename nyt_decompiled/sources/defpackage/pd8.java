package defpackage;

import java.util.List;

/* loaded from: classes.dex */
final class pd8 implements r08 {
    private final r08 b;
    private final Object c;

    public pd8(r08 r08Var) {
        zq3.h(r08Var, "delegate");
        this.b = r08Var;
        this.c = new Object();
    }

    @Override // defpackage.r08
    public q08 c(ej9 ej9Var) {
        q08 c;
        zq3.h(ej9Var, "id");
        synchronized (this.c) {
            c = this.b.c(ej9Var);
        }
        return c;
    }

    @Override // defpackage.r08
    public boolean e(ej9 ej9Var) {
        boolean e;
        zq3.h(ej9Var, "id");
        synchronized (this.c) {
            e = this.b.e(ej9Var);
        }
        return e;
    }

    @Override // defpackage.r08
    public q08 f(ej9 ej9Var) {
        q08 f;
        zq3.h(ej9Var, "id");
        synchronized (this.c) {
            f = this.b.f(ej9Var);
        }
        return f;
    }

    @Override // defpackage.r08
    public List remove(String str) {
        List remove;
        zq3.h(str, "workSpecId");
        synchronized (this.c) {
            remove = this.b.remove(str);
        }
        return remove;
    }
}
