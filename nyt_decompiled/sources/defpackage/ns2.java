package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ns2 {
    private final Executor a;
    private final qs2 b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List g;
    private final Runnable h;

    public ns2(Executor executor, qs2 qs2Var) {
        zq3.h(executor, "executor");
        zq3.h(qs2Var, "reportFullyDrawn");
        this.a = executor;
        this.b = qs2Var;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: ms2
            @Override // java.lang.Runnable
            public final void run() {
                ns2.d(ns2.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(ns2 ns2Var) {
        zq3.h(ns2Var, "this$0");
        synchronized (ns2Var.c) {
            try {
                ns2Var.e = false;
                if (ns2Var.d == 0 && !ns2Var.f) {
                    ns2Var.b.mo865invoke();
                    ns2Var.b();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator it2 = this.g.iterator();
                while (it2.hasNext()) {
                    ((qs2) it2.next()).mo865invoke();
                }
                this.g.clear();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }
}
