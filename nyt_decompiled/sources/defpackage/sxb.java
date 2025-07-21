package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class sxb implements vja {
    private final ScheduledExecutorService a;
    private final Clock b;
    private ScheduledFuture c;
    private long d = -1;
    private long e = -1;
    private Runnable f = null;
    private boolean g = false;

    public sxb(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.a = scheduledExecutorService;
        this.b = clock;
        dyf.d().c(this);
    }

    @Override // defpackage.vja
    public final void a(boolean z) {
        if (z) {
            c();
        } else {
            b();
        }
    }

    final synchronized void b() {
        try {
            if (this.g) {
                return;
            }
            ScheduledFuture scheduledFuture = this.c;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.e = -1L;
            } else {
                this.c.cancel(true);
                this.e = this.d - this.b.elapsedRealtime();
            }
            this.g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    final synchronized void c() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.g) {
                if (this.e > 0 && (scheduledFuture = this.c) != null && scheduledFuture.isCancelled()) {
                    this.c = this.a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
                }
                this.g = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(int i, Runnable runnable) {
        this.f = runnable;
        long j = i;
        this.d = this.b.elapsedRealtime() + j;
        this.c = this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
