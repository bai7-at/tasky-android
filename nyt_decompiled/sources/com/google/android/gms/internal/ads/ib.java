package com.google.android.gms.internal.ads;

import defpackage.j64;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
abstract class ib extends ub implements Runnable {
    public static final /* synthetic */ int j = 0;
    j64 h;
    Object i;

    ib(j64 j64Var, Object obj) {
        j64Var.getClass();
        this.h = j64Var;
        this.i = obj;
    }

    abstract Object D(Object obj, Object obj2);

    abstract void E(Object obj);

    @Override // com.google.android.gms.internal.ads.eb
    protected final String d() {
        String str;
        j64 j64Var = this.h;
        Object obj = this.i;
        String d = super.d();
        if (j64Var != null) {
            str = "inputFuture=[" + j64Var.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (d != null) {
                return str.concat(d);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.eb
    protected final void e() {
        t(this.h);
        this.h = null;
        this.i = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j64 j64Var = this.h;
        Object obj = this.i;
        if ((isCancelled() | (j64Var == null)) || (obj == null)) {
            return;
        }
        this.h = null;
        if (j64Var.isCancelled()) {
            u(j64Var);
            return;
        }
        try {
            try {
                Object D = D(obj, zb.p(j64Var));
                this.i = null;
                E(D);
            } catch (Throwable th) {
                try {
                    mc.a(th);
                    g(th);
                } finally {
                    this.i = null;
                }
            }
        } catch (Error e) {
            g(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            g(e2.getCause());
        } catch (Exception e3) {
            g(e3);
        }
    }
}
