package defpackage;

/* loaded from: classes.dex */
public final class k5 {
    private j5 a;

    public final void a(Object obj, c5 c5Var) {
        ww8 ww8Var;
        j5 j5Var = this.a;
        if (j5Var != null) {
            j5Var.b(obj, c5Var);
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(j5 j5Var) {
        this.a = j5Var;
    }

    public final void c() {
        ww8 ww8Var;
        j5 j5Var = this.a;
        if (j5Var != null) {
            j5Var.c();
            ww8Var = ww8.a;
        } else {
            ww8Var = null;
        }
        if (ww8Var == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
