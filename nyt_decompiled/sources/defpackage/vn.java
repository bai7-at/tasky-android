package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class vn extends sg8 {
    private static volatile vn c;
    private static final Executor d = new Executor() { // from class: tn
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            vn.i(runnable);
        }
    };
    private static final Executor e = new Executor() { // from class: un
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            vn.j(runnable);
        }
    };
    private sg8 a;
    private final sg8 b;

    private vn() {
        wj1 wj1Var = new wj1();
        this.b = wj1Var;
        this.a = wj1Var;
    }

    public static Executor f() {
        return e;
    }

    public static vn g() {
        if (c != null) {
            return c;
        }
        synchronized (vn.class) {
            try {
                if (c == null) {
                    c = new vn();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    public static Executor h() {
        return d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Runnable runnable) {
        g().c(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Runnable runnable) {
        g().a(runnable);
    }

    @Override // defpackage.sg8
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.sg8
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.sg8
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }
}
