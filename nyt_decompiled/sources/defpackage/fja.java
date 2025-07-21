package defpackage;

/* loaded from: classes2.dex */
public abstract class fja extends o6 {
    private final Object a = new Object();
    private o6 b;

    @Override // defpackage.o6
    public final void E() {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.E();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(o6 o6Var) {
        synchronized (this.a) {
            this.b = o6Var;
        }
    }

    @Override // defpackage.o6
    public final void l() {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o6
    public void n(t64 t64Var) {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.n(t64Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o6
    public final void s() {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o6
    public void t() {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.o6, defpackage.jq9
    public final void v() {
        synchronized (this.a) {
            try {
                o6 o6Var = this.b;
                if (o6Var != null) {
                    o6Var.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
