package defpackage;

import com.google.android.gms.internal.ads.nc;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ugb implements j64 {
    private final nc a = nc.C();

    private static final boolean b(boolean z) {
        if (!z) {
            dyf.q().v(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // defpackage.j64
    public final void a(Runnable runnable, Executor executor) {
        this.a.a(runnable, executor);
    }

    public final boolean c(Object obj) {
        boolean f = this.a.f(obj);
        b(f);
        return f;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final boolean d(Throwable th) {
        boolean g = this.a.g(th);
        b(g);
        return g;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
