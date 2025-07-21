package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class pm8 {
    public static final b Companion = new b(null);
    public static final pm8 NONE = new a();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class a extends pm8 {
        a() {
        }

        @Override // defpackage.pm8
        public pm8 deadlineNanoTime(long j) {
            return this;
        }

        @Override // defpackage.pm8
        public void throwIfReached() {
        }

        @Override // defpackage.pm8
        public pm8 timeout(long j, TimeUnit timeUnit) {
            zq3.h(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a(long j, long j2) {
            return (j != 0 && (j2 == 0 || j < j2)) ? j : j2;
        }

        private b() {
        }
    }

    public void awaitSignal(Condition condition) throws InterruptedIOException {
        zq3.h(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj = this.cancelMark;
            if (condition.awaitNanos(timeoutNanos) <= 0 && this.cancelMark == obj) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public pm8 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public pm8 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final pm8 deadline(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "unit");
        if (j > 0) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(pm8 pm8Var, qs2 qs2Var) {
        zq3.h(pm8Var, "other");
        zq3.h(qs2Var, "block");
        long timeoutNanos = timeoutNanos();
        long a2 = Companion.a(pm8Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a2, timeUnit);
        if (!hasDeadline()) {
            if (pm8Var.hasDeadline()) {
                deadlineNanoTime(pm8Var.deadlineNanoTime());
            }
            try {
                T t = (T) qs2Var.mo865invoke();
                bk3.b(1);
                timeout(timeoutNanos, timeUnit);
                if (pm8Var.hasDeadline()) {
                    clearDeadline();
                }
                bk3.a(1);
                return t;
            } catch (Throwable th) {
                bk3.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (pm8Var.hasDeadline()) {
                    clearDeadline();
                }
                bk3.a(1);
                throw th;
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (pm8Var.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), pm8Var.deadlineNanoTime()));
        }
        try {
            T t2 = (T) qs2Var.mo865invoke();
            bk3.b(1);
            timeout(timeoutNanos, timeUnit);
            if (pm8Var.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            bk3.a(1);
            return t2;
        } catch (Throwable th2) {
            bk3.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (pm8Var.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            bk3.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public pm8 timeout(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "unit");
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) throws InterruptedIOException {
        zq3.h(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos <= 0) {
                throw new InterruptedIOException("timeout");
            }
            Object obj2 = this.cancelMark;
            long j = timeoutNanos / 1000000;
            obj.wait(j, (int) (timeoutNanos - (1000000 * j)));
            if (System.nanoTime() - nanoTime >= timeoutNanos && this.cancelMark == obj2) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public pm8 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
