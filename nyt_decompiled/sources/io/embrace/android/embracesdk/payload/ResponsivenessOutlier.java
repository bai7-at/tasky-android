package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ResponsivenessOutlier {
    private final long endMs;
    private final long startMs;

    public ResponsivenessOutlier(@bt3(name = "start") long j, @bt3(name = "end") long j2) {
        this.startMs = j;
        this.endMs = j2;
    }

    public static /* synthetic */ ResponsivenessOutlier copy$default(ResponsivenessOutlier responsivenessOutlier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = responsivenessOutlier.startMs;
        }
        if ((i & 2) != 0) {
            j2 = responsivenessOutlier.endMs;
        }
        return responsivenessOutlier.copy(j, j2);
    }

    public final long component1() {
        return this.startMs;
    }

    public final long component2() {
        return this.endMs;
    }

    public final ResponsivenessOutlier copy(@bt3(name = "start") long j, @bt3(name = "end") long j2) {
        return new ResponsivenessOutlier(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponsivenessOutlier)) {
            return false;
        }
        ResponsivenessOutlier responsivenessOutlier = (ResponsivenessOutlier) obj;
        return this.startMs == responsivenessOutlier.startMs && this.endMs == responsivenessOutlier.endMs;
    }

    public final long getEndMs() {
        return this.endMs;
    }

    public final long getStartMs() {
        return this.startMs;
    }

    public int hashCode() {
        return (Long.hashCode(this.startMs) * 31) + Long.hashCode(this.endMs);
    }

    public String toString() {
        return "ResponsivenessOutlier(startMs=" + this.startMs + ", endMs=" + this.endMs + ")";
    }
}
