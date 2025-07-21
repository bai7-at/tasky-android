package com.nytimes.android.messaging.dock;

import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DockUrgencyMessage {
    public static final int $stable = 0;
    private final long endTimeInterval;
    private final long startTimeInterval;
    private final String text;

    public DockUrgencyMessage(long j, long j2, String str) {
        zq3.h(str, "text");
        this.startTimeInterval = j;
        this.endTimeInterval = j2;
        this.text = str;
    }

    public static /* synthetic */ DockUrgencyMessage copy$default(DockUrgencyMessage dockUrgencyMessage, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dockUrgencyMessage.startTimeInterval;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = dockUrgencyMessage.endTimeInterval;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = dockUrgencyMessage.text;
        }
        return dockUrgencyMessage.copy(j3, j4, str);
    }

    public final long component1() {
        return this.startTimeInterval;
    }

    public final long component2() {
        return this.endTimeInterval;
    }

    public final String component3() {
        return this.text;
    }

    public final DockUrgencyMessage copy(long j, long j2, String str) {
        zq3.h(str, "text");
        return new DockUrgencyMessage(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DockUrgencyMessage)) {
            return false;
        }
        DockUrgencyMessage dockUrgencyMessage = (DockUrgencyMessage) obj;
        return this.startTimeInterval == dockUrgencyMessage.startTimeInterval && this.endTimeInterval == dockUrgencyMessage.endTimeInterval && zq3.c(this.text, dockUrgencyMessage.text);
    }

    public final long getEndTimeInterval() {
        return this.endTimeInterval;
    }

    public final long getStartTimeInterval() {
        return this.startTimeInterval;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTimeInterval) * 31) + Long.hashCode(this.endTimeInterval)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "DockUrgencyMessage(startTimeInterval=" + this.startTimeInterval + ", endTimeInterval=" + this.endTimeInterval + ", text=" + this.text + ")";
    }
}
