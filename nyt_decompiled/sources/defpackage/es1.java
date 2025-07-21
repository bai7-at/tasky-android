package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes.dex */
public final class es1 {
    private boolean b;
    private boolean c;
    private boolean a = true;
    private final Queue d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(es1 es1Var, Runnable runnable) {
        zq3.h(es1Var, "this$0");
        zq3.h(runnable, "$runnable");
        es1Var.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (!this.d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    public final boolean b() {
        return this.b || !this.a;
    }

    public final void c(CoroutineContext coroutineContext, final Runnable runnable) {
        zq3.h(coroutineContext, "context");
        zq3.h(runnable, "runnable");
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        if (immediate.isDispatchNeeded(coroutineContext) || b()) {
            immediate.mo937dispatch(coroutineContext, new Runnable() { // from class: ds1
                @Override // java.lang.Runnable
                public final void run() {
                    es1.d(es1.this, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!this.d.isEmpty() && b()) {
                Runnable runnable = (Runnable) this.d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }

    public final void g() {
        this.b = true;
        e();
    }

    public final void h() {
        this.a = true;
    }

    public final void i() {
        if (this.a) {
            if (this.b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.a = false;
            e();
        }
    }
}
