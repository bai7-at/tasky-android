package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class b94 {
    private static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        return (b() - j) * a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
