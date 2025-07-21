package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public class mu extends pm8 {
    private static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static mu head;
    private static final ReentrantLock lock;
    private mu next;
    private int state;
    private long timeoutAt;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void f(mu muVar, long j, boolean z) {
            if (mu.head == null) {
                mu.head = new mu();
                new b().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                muVar.timeoutAt = Math.min(j, muVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (j != 0) {
                muVar.timeoutAt = j + nanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                muVar.timeoutAt = muVar.deadlineNanoTime();
            }
            long a = muVar.a(nanoTime);
            mu muVar2 = mu.head;
            zq3.e(muVar2);
            while (muVar2.next != null) {
                mu muVar3 = muVar2.next;
                zq3.e(muVar3);
                if (a < muVar3.a(nanoTime)) {
                    break;
                }
                muVar2 = muVar2.next;
                zq3.e(muVar2);
            }
            muVar.next = muVar2.next;
            muVar2.next = muVar;
            if (muVar2 == mu.head) {
                d().signal();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(mu muVar) {
            for (mu muVar2 = mu.head; muVar2 != null; muVar2 = muVar2.next) {
                if (muVar2.next == muVar) {
                    muVar2.next = muVar.next;
                    muVar.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final mu c() {
            mu muVar = mu.head;
            zq3.e(muVar);
            mu muVar2 = muVar.next;
            if (muVar2 == null) {
                long nanoTime = System.nanoTime();
                d().await(mu.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                mu muVar3 = mu.head;
                zq3.e(muVar3);
                if (muVar3.next != null || System.nanoTime() - nanoTime < mu.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return mu.head;
            }
            long a = muVar2.a(System.nanoTime());
            if (a > 0) {
                d().await(a, TimeUnit.NANOSECONDS);
                return null;
            }
            mu muVar4 = mu.head;
            zq3.e(muVar4);
            muVar4.next = muVar2.next;
            muVar2.next = null;
            muVar2.state = 2;
            return muVar2;
        }

        public final Condition d() {
            return mu.condition;
        }

        public final ReentrantLock e() {
            return mu.lock;
        }

        private a() {
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock e;
            mu c;
            while (true) {
                try {
                    e = mu.Companion.e();
                    e.lock();
                    try {
                        c = mu.Companion.c();
                    } finally {
                        e.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c == mu.head) {
                    a unused2 = mu.Companion;
                    mu.head = null;
                    return;
                } else {
                    ww8 ww8Var = ww8.a;
                    e.unlock();
                    if (c != null) {
                        c.timedOut();
                    }
                }
            }
        }
    }

    public static final class c implements yt7 {
        final /* synthetic */ yt7 b;

        c(yt7 yt7Var) {
            this.b = yt7Var;
        }

        @Override // defpackage.yt7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public mu timeout() {
            return mu.this;
        }

        @Override // defpackage.yt7, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            mu muVar = mu.this;
            yt7 yt7Var = this.b;
            muVar.enter();
            try {
                yt7Var.close();
                ww8 ww8Var = ww8.a;
                if (muVar.exit()) {
                    throw muVar.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!muVar.exit()) {
                    throw e;
                }
                throw muVar.access$newTimeoutException(e);
            } finally {
                muVar.exit();
            }
        }

        @Override // defpackage.yt7, java.io.Flushable
        public void flush() {
            mu muVar = mu.this;
            yt7 yt7Var = this.b;
            muVar.enter();
            try {
                yt7Var.flush();
                ww8 ww8Var = ww8.a;
                if (muVar.exit()) {
                    throw muVar.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!muVar.exit()) {
                    throw e;
                }
                throw muVar.access$newTimeoutException(e);
            } finally {
                muVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.b + ')';
        }

        @Override // defpackage.yt7
        public void write(ad0 ad0Var, long j) {
            zq3.h(ad0Var, "source");
            p.b(ad0Var.h1(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                ji7 ji7Var = ad0Var.a;
                zq3.e(ji7Var);
                while (true) {
                    if (j2 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j2 += ji7Var.c - ji7Var.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        ji7Var = ji7Var.f;
                        zq3.e(ji7Var);
                    }
                }
                mu muVar = mu.this;
                yt7 yt7Var = this.b;
                muVar.enter();
                try {
                    yt7Var.write(ad0Var, j2);
                    ww8 ww8Var = ww8.a;
                    if (muVar.exit()) {
                        throw muVar.access$newTimeoutException(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!muVar.exit()) {
                        throw e;
                    }
                    throw muVar.access$newTimeoutException(e);
                } finally {
                    muVar.exit();
                }
            }
        }
    }

    public static final class d implements px7 {
        final /* synthetic */ px7 b;

        d(px7 px7Var) {
            this.b = px7Var;
        }

        @Override // defpackage.px7, defpackage.yt7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public mu timeout() {
            return mu.this;
        }

        @Override // defpackage.px7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yt7
        public void close() {
            mu muVar = mu.this;
            px7 px7Var = this.b;
            muVar.enter();
            try {
                px7Var.close();
                ww8 ww8Var = ww8.a;
                if (muVar.exit()) {
                    throw muVar.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!muVar.exit()) {
                    throw e;
                }
                throw muVar.access$newTimeoutException(e);
            } finally {
                muVar.exit();
            }
        }

        @Override // defpackage.px7
        public long read(ad0 ad0Var, long j) {
            zq3.h(ad0Var, "sink");
            mu muVar = mu.this;
            px7 px7Var = this.b;
            muVar.enter();
            try {
                long read = px7Var.read(ad0Var, j);
                if (muVar.exit()) {
                    throw muVar.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e) {
                if (muVar.exit()) {
                    throw muVar.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                muVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        zq3.g(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // defpackage.pm8
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                Companion.g(this);
                this.state = 3;
            }
            ww8 ww8Var = ww8.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.f(this, timeoutNanos, hasDeadline);
                ww8 ww8Var = ww8.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            Companion.g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final yt7 sink(yt7 yt7Var) {
        zq3.h(yt7Var, "sink");
        return new c(yt7Var);
    }

    public final px7 source(px7 px7Var) {
        zq3.h(px7Var, "source");
        return new d(px7Var);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        enter();
        try {
            try {
                T t = (T) qs2Var.mo865invoke();
                bk3.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                bk3.a(1);
                return t;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            bk3.b(1);
            exit();
            bk3.a(1);
            throw th;
        }
    }
}
