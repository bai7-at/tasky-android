package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ri1 {
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    public static final ri1 f = new ri1();
    private static final List a = i.o("0.pool.ntp.org", "1.pool.ntp.org", "2.pool.ntp.org", "3.pool.ntp.org");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = timeUnit.toMillis(1L);
        c = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        d = timeUnit2.toMillis(6L);
        e = timeUnit2.toMillis(5L);
    }

    private ri1() {
    }

    public final long a() {
        return b;
    }

    public final long b() {
        return e;
    }

    public final long c() {
        return c;
    }

    public final List d() {
        return a;
    }

    public final long e() {
        return d;
    }
}
