package kotlin.time;

import defpackage.zq3;

/* loaded from: classes5.dex */
abstract class d {
    public static final double a(double d, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zq3.h(durationUnit, "sourceUnit");
        zq3.h(durationUnit2, "targetUnit");
        long convert = durationUnit2.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit.getTimeUnit$kotlin_stdlib());
        return convert > 0 ? d * convert : d / durationUnit.getTimeUnit$kotlin_stdlib().convert(1L, durationUnit2.getTimeUnit$kotlin_stdlib());
    }

    public static final long b(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zq3.h(durationUnit, "sourceUnit");
        zq3.h(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }

    public static final long c(long j, DurationUnit durationUnit, DurationUnit durationUnit2) {
        zq3.h(durationUnit, "sourceUnit");
        zq3.h(durationUnit2, "targetUnit");
        return durationUnit2.getTimeUnit$kotlin_stdlib().convert(j, durationUnit.getTimeUnit$kotlin_stdlib());
    }
}
