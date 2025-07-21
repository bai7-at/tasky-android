package defpackage;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes3.dex */
public final class t2e {
    private final Deque a = new LinkedBlockingDeque();
    private final Callable b;
    private final kke c;

    public t2e(Callable callable, kke kkeVar) {
        this.b = callable;
        this.c = kkeVar;
    }

    public final synchronized j64 a() {
        c(1);
        return (j64) this.a.poll();
    }

    public final synchronized void b(j64 j64Var) {
        this.a.addFirst(j64Var);
    }

    public final synchronized void c(int i) {
        int size = i - this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.a.add(this.c.j(this.b));
        }
    }
}
