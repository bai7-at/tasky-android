package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class qff {
    private final off a;
    private final wef b;
    private final acd c;
    private final n1c d;
    private int e;
    private Object f;
    private final Looper g;
    private final int h;
    private boolean i;
    private boolean j;
    private boolean k;

    public qff(wef wefVar, off offVar, n1c n1cVar, int i, acd acdVar, Looper looper) {
        this.b = wefVar;
        this.a = offVar;
        this.d = n1cVar;
        this.g = looper;
        this.c = acdVar;
        this.h = i;
    }

    public final int a() {
        return this.e;
    }

    public final Looper b() {
        return this.g;
    }

    public final off c() {
        return this.a;
    }

    public final qff d() {
        wad.f(!this.i);
        this.i = true;
        this.b.c(this);
        return this;
    }

    public final qff e(Object obj) {
        wad.f(!this.i);
        this.f = obj;
        return this;
    }

    public final qff f(int i) {
        wad.f(!this.i);
        this.e = i;
        return this;
    }

    public final Object g() {
        return this.f;
    }

    public final synchronized void h(boolean z) {
        this.j = z | this.j;
        this.k = true;
        notifyAll();
    }

    public final synchronized boolean i(long j) {
        try {
            wad.f(this.i);
            wad.f(this.g.getThread() != Thread.currentThread());
            long elapsedRealtime = SystemClock.elapsedRealtime() + j;
            while (!this.k) {
                if (j <= 0) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final synchronized boolean j() {
        return false;
    }
}
