package defpackage;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class w9c extends ldc {
    private final ScheduledExecutorService b;
    private final Clock c;
    private long d;
    private long e;
    private boolean f;
    private ScheduledFuture g;

    public w9c(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.d = -1L;
        this.e = -1L;
        this.f = false;
        this.b = scheduledExecutorService;
        this.c = clock;
    }

    private final synchronized void N0(long j) {
        try {
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.g.cancel(true);
            }
            this.d = this.c.elapsedRealtime() + j;
            this.g = this.b.schedule(new v9c(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void M0(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i);
            if (this.f) {
                long j = this.e;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.e = millis;
                return;
            }
            long elapsedRealtime = this.c.elapsedRealtime();
            long j2 = this.d;
            if (elapsedRealtime > j2 || j2 - this.c.elapsedRealtime() > millis) {
                N0(millis);
            }
        }
    }

    public final synchronized void zza() {
        this.f = false;
        N0(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.f) {
                return;
            }
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.e = -1L;
            } else {
                this.g.cancel(true);
                this.e = this.d - this.c.elapsedRealtime();
            }
            this.f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        try {
            if (this.f) {
                if (this.e > 0 && this.g.isCancelled()) {
                    N0(this.e);
                }
                this.f = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
