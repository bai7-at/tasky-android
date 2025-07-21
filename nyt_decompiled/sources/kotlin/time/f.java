package kotlin.time;

import defpackage.zq3;
import kotlin.time.b;

/* loaded from: classes5.dex */
public abstract class f {
    private static final long a(long j) {
        return j < 0 ? b.b.c() : b.b.b();
    }

    private static final long b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return c.t(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return b.M(a(j3));
        }
        long b = d.b(1L, durationUnit2, durationUnit);
        long j4 = (j / b) - (j2 / b);
        long j5 = (j % b) - (j2 % b);
        b.a aVar = b.b;
        return b.I(c.t(j4, durationUnit2), c.t(j5, durationUnit));
    }

    public static final long c(long j, long j2, DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? b.b.d() : b.M(a(j2)) : (1 | (j - 1)) == Long.MAX_VALUE ? a(j) : b(j, j2, durationUnit);
    }
}
