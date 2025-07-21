package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class tl0 {
    public static long a() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
