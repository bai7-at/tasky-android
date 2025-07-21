package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class w1g extends og8 {
    private final Object a = new Object();
    private final suf b = new suf();
    private boolean c;
    private volatile boolean d;
    private Object e;
    private Exception f;

    w1g() {
    }

    private final void A() {
        if (this.c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    private final void B() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void y() {
        Preconditions.checkState(this.c, "Task is not yet complete");
    }

    private final void z() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // defpackage.og8
    public final og8 a(Executor executor, le5 le5Var) {
        this.b.a(new v0f(executor, le5Var));
        B();
        return this;
    }

    @Override // defpackage.og8
    public final og8 b(me5 me5Var) {
        this.b.a(new q8f(tg8.a, me5Var));
        B();
        return this;
    }

    @Override // defpackage.og8
    public final og8 c(Executor executor, me5 me5Var) {
        this.b.a(new q8f(executor, me5Var));
        B();
        return this;
    }

    @Override // defpackage.og8
    public final og8 d(ue5 ue5Var) {
        e(tg8.a, ue5Var);
        return this;
    }

    @Override // defpackage.og8
    public final og8 e(Executor executor, ue5 ue5Var) {
        this.b.a(new wcf(executor, ue5Var));
        B();
        return this;
    }

    @Override // defpackage.og8
    public final og8 f(vf5 vf5Var) {
        g(tg8.a, vf5Var);
        return this;
    }

    @Override // defpackage.og8
    public final og8 g(Executor executor, vf5 vf5Var) {
        this.b.a(new qhf(executor, vf5Var));
        B();
        return this;
    }

    @Override // defpackage.og8
    public final og8 h(cy0 cy0Var) {
        return i(tg8.a, cy0Var);
    }

    @Override // defpackage.og8
    public final og8 i(Executor executor, cy0 cy0Var) {
        w1g w1gVar = new w1g();
        this.b.a(new k5c(executor, cy0Var, w1gVar));
        B();
        return w1gVar;
    }

    @Override // defpackage.og8
    public final og8 j(cy0 cy0Var) {
        return k(tg8.a, cy0Var);
    }

    @Override // defpackage.og8
    public final og8 k(Executor executor, cy0 cy0Var) {
        w1g w1gVar = new w1g();
        this.b.a(new ctd(executor, cy0Var, w1gVar));
        B();
        return w1gVar;
    }

    @Override // defpackage.og8
    public final Exception l() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.og8
    public final Object m() {
        Object obj;
        synchronized (this.a) {
            try {
                y();
                z();
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.og8
    public final Object n(Class cls) {
        Object obj;
        synchronized (this.a) {
            try {
                y();
                z();
                if (cls.isInstance(this.f)) {
                    throw ((Throwable) cls.cast(this.f));
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // defpackage.og8
    public final boolean o() {
        return this.d;
    }

    @Override // defpackage.og8
    public final boolean p() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.og8
    public final boolean q() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.og8
    public final og8 r(bc8 bc8Var) {
        Executor executor = tg8.a;
        w1g w1gVar = new w1g();
        this.b.a(new qof(executor, bc8Var, w1gVar));
        B();
        return w1gVar;
    }

    @Override // defpackage.og8
    public final og8 s(Executor executor, bc8 bc8Var) {
        w1g w1gVar = new w1g();
        this.b.a(new qof(executor, bc8Var, w1gVar));
        B();
        return w1gVar;
    }

    public final void t(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            A();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void u(Object obj) {
        synchronized (this.a) {
            A();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }

    public final boolean v() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean w(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean x(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
