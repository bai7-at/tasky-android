package io.embrace.android.embracesdk.internal;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class StartupEventInfo {
    private final Long duration;
    private final Long threshold;

    /* JADX WARN: Multi-variable type inference failed */
    public StartupEventInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StartupEventInfo copy$default(StartupEventInfo startupEventInfo, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = startupEventInfo.duration;
        }
        if ((i & 2) != 0) {
            l2 = startupEventInfo.threshold;
        }
        return startupEventInfo.copy(l, l2);
    }

    public final Long component1() {
        return this.duration;
    }

    public final Long component2() {
        return this.threshold;
    }

    public final StartupEventInfo copy(Long l, Long l2) {
        return new StartupEventInfo(l, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartupEventInfo)) {
            return false;
        }
        StartupEventInfo startupEventInfo = (StartupEventInfo) obj;
        return zq3.c(this.duration, startupEventInfo.duration) && zq3.c(this.threshold, startupEventInfo.threshold);
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        Long l = this.duration;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.threshold;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "StartupEventInfo(duration=" + this.duration + ", threshold=" + this.threshold + ")";
    }

    public StartupEventInfo(Long l, Long l2) {
        this.duration = l;
        this.threshold = l2;
    }

    public /* synthetic */ StartupEventInfo(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
