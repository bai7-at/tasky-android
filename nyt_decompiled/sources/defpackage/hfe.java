package defpackage;

/* loaded from: classes3.dex */
public abstract class hfe implements Runnable {
    private final qg8 a;

    hfe() {
        this.a = null;
    }

    protected abstract void a();

    final qg8 b() {
        return this.a;
    }

    public final void c(Exception exc) {
        qg8 qg8Var = this.a;
        if (qg8Var != null) {
            qg8Var.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            c(e);
        }
    }

    public hfe(qg8 qg8Var) {
        this.a = qg8Var;
    }
}
