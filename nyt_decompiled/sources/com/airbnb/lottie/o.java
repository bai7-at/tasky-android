package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.o;
import defpackage.j94;
import defpackage.sc4;
import defpackage.xc4;
import defpackage.zc4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class o {
    public static Executor e = Executors.newCachedThreadPool(new zc4());
    private final Set a;
    private final Set b;
    private final Handler c;
    private volatile xc4 d;

    private static class a extends FutureTask {
        private o a;

        a(o oVar, Callable callable) {
            super(callable);
            this.a = oVar;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.a.l((xc4) get());
                } catch (InterruptedException | ExecutionException e) {
                    this.a.l(new xc4(e));
                }
            } finally {
                this.a = null;
            }
        }
    }

    public o(Callable callable) {
        this(callable, false);
    }

    private synchronized void f(Throwable th) {
        ArrayList arrayList = new ArrayList(this.b);
        if (arrayList.isEmpty()) {
            j94.d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((sc4) it2.next()).onResult(th);
        }
    }

    private void g() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            h();
        } else {
            this.c.post(new Runnable() { // from class: yc4
                @Override // java.lang.Runnable
                public final void run() {
                    o.this.h();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        xc4 xc4Var = this.d;
        if (xc4Var == null) {
            return;
        }
        if (xc4Var.b() != null) {
            i(xc4Var.b());
        } else {
            f(xc4Var.a());
        }
    }

    private synchronized void i(Object obj) {
        Iterator it2 = new ArrayList(this.a).iterator();
        while (it2.hasNext()) {
            ((sc4) it2.next()).onResult(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(xc4 xc4Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = xc4Var;
        g();
    }

    public synchronized o c(sc4 sc4Var) {
        try {
            xc4 xc4Var = this.d;
            if (xc4Var != null && xc4Var.a() != null) {
                sc4Var.onResult(xc4Var.a());
            }
            this.b.add(sc4Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized o d(sc4 sc4Var) {
        try {
            xc4 xc4Var = this.d;
            if (xc4Var != null && xc4Var.b() != null) {
                sc4Var.onResult(xc4Var.b());
            }
            this.a.add(sc4Var);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public xc4 e() {
        return this.d;
    }

    public synchronized o j(sc4 sc4Var) {
        this.b.remove(sc4Var);
        return this;
    }

    public synchronized o k(sc4 sc4Var) {
        this.a.remove(sc4Var);
        return this;
    }

    public o(Object obj) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        l(new xc4(obj));
    }

    o(Callable callable, boolean z) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        if (z) {
            try {
                l((xc4) callable.call());
                return;
            } catch (Throwable th) {
                l(new xc4(th));
                return;
            }
        }
        e.execute(new a(this, callable));
    }
}
