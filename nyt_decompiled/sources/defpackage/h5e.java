package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class h5e implements j64 {
    private final Object a;
    private final String b;
    private final j64 c;

    public h5e(Object obj, String str, j64 j64Var) {
        this.a = obj;
        this.b = str;
        this.c = j64Var;
    }

    @Override // defpackage.j64
    public final void a(Runnable runnable, Executor executor) {
        this.c.a(runnable, executor);
    }

    public final Object b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.c.isDone();
    }

    public final String toString() {
        return this.b + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.c.get(j, timeUnit);
    }
}
