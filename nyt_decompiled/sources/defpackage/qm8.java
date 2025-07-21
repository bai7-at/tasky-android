package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class qm8 {
    private long a;
    private long b;
    private long c;
    private final ThreadLocal d = new ThreadLocal();

    public qm8(long j) {
        h(j);
    }

    public static long g(long j) {
        return (j * 1000000) / 90000;
    }

    public static long j(long j) {
        return (j * 90000) / 1000000;
    }

    public static long k(long j) {
        return j(j) % 8589934592L;
    }

    public synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!f()) {
                long j2 = this.a;
                if (j2 == 9223372036854775806L) {
                    j2 = ((Long) ur.e((Long) this.d.get())).longValue();
                }
                this.b = j2 - j;
                notifyAll();
            }
            this.c = j;
            return j + this.b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                long j3 = j(j2);
                long j4 = (4294967296L + j3) / 8589934592L;
                long j5 = ((j4 - 1) * 8589934592L) + j;
                j += j4 * 8589934592L;
                if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                    j = j5;
                }
            }
            return a(g(j));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        long j;
        j = this.a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public synchronized long d() {
        long j;
        try {
            j = this.c;
        } catch (Throwable th) {
            throw th;
        }
        return j != -9223372036854775807L ? j + this.b : c();
    }

    public synchronized long e() {
        return this.b;
    }

    public synchronized boolean f() {
        return this.b != -9223372036854775807L;
    }

    public synchronized void h(long j) {
        this.a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public synchronized void i(boolean z, long j, long j2) {
        try {
            ur.g(this.a == 9223372036854775806L);
            if (f()) {
                return;
            }
            if (z) {
                this.d.set(Long.valueOf(j));
            } else {
                long j3 = 0;
                long j4 = j2;
                while (!f()) {
                    if (j2 == 0) {
                        wait();
                    } else {
                        ur.g(j4 > 0);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        wait(j4);
                        j3 += SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (j3 >= j2 && !f()) {
                            throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                        }
                        j4 = j2 - j3;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
