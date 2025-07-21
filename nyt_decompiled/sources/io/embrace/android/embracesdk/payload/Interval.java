package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Interval {
    private final long endTime;
    private final long startTime;
    private final String value;

    public Interval(@bt3(name = "st") long j, @bt3(name = "en") long j2) {
        this(j, j2, null, 4, null);
    }

    public static /* synthetic */ Interval copy$default(Interval interval, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = interval.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = interval.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = interval.value;
        }
        return interval.copy(j3, j4, str);
    }

    public final long component1() {
        return this.startTime;
    }

    public final long component2() {
        return this.endTime;
    }

    public final String component3() {
        return this.value;
    }

    public final Interval copy(@bt3(name = "st") long j, @bt3(name = "en") long j2, @bt3(name = "v") String str) {
        return new Interval(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Interval)) {
            return false;
        }
        Interval interval = (Interval) obj;
        return this.startTime == interval.startTime && this.endTime == interval.endTime && zq3.c(this.value, interval.value);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31;
        String str = this.value;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "Interval(startTime=" + this.startTime + ", endTime=" + this.endTime + ", value=" + this.value + ")";
    }

    public Interval(@bt3(name = "st") long j, @bt3(name = "en") long j2, @bt3(name = "v") String str) {
        this.startTime = j;
        this.endTime = j2;
        this.value = str;
    }

    public /* synthetic */ Interval(long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i & 4) != 0 ? null : str);
    }
}
