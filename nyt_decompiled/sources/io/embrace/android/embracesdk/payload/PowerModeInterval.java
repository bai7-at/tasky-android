package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class PowerModeInterval {
    private final Long endTime;
    private final long startTime;

    public PowerModeInterval(@bt3(name = "st") long j) {
        this(j, null, 2, null);
    }

    public static /* synthetic */ PowerModeInterval copy$default(PowerModeInterval powerModeInterval, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = powerModeInterval.startTime;
        }
        if ((i & 2) != 0) {
            l = powerModeInterval.endTime;
        }
        return powerModeInterval.copy(j, l);
    }

    public final long component1() {
        return this.startTime;
    }

    public final Long component2() {
        return this.endTime;
    }

    public final PowerModeInterval copy(@bt3(name = "st") long j, @bt3(name = "en") Long l) {
        return new PowerModeInterval(j, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PowerModeInterval)) {
            return false;
        }
        PowerModeInterval powerModeInterval = (PowerModeInterval) obj;
        return this.startTime == powerModeInterval.startTime && zq3.c(this.endTime, powerModeInterval.endTime);
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.startTime) * 31;
        Long l = this.endTime;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "PowerModeInterval(startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public PowerModeInterval(@bt3(name = "st") long j, @bt3(name = "en") Long l) {
        this.startTime = j;
        this.endTime = l;
    }

    public /* synthetic */ PowerModeInterval(long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l);
    }
}
