package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class Orientation {
    private final String orientation;
    private final long timestamp;

    public Orientation(@bt3(name = "o") String str, @bt3(name = "ts") long j) {
        zq3.h(str, "orientation");
        this.orientation = str;
        this.timestamp = j;
    }

    public static /* synthetic */ Orientation copy$default(Orientation orientation, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orientation.orientation;
        }
        if ((i & 2) != 0) {
            j = orientation.timestamp;
        }
        return orientation.copy(str, j);
    }

    public final String component1() {
        return this.orientation;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final Orientation copy(@bt3(name = "o") String str, @bt3(name = "ts") long j) {
        zq3.h(str, "orientation");
        return new Orientation(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Orientation)) {
            return false;
        }
        Orientation orientation = (Orientation) obj;
        return zq3.c(this.orientation, orientation.orientation) && this.timestamp == orientation.timestamp;
    }

    public final int getInternalOrientation() {
        return zq3.c(this.orientation, "l") ? 2 : 1;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.orientation;
        return ((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "Orientation(orientation=" + this.orientation + ", timestamp=" + this.timestamp + ")";
    }

    public Orientation(int i, long j) {
        this(i == 2 ? "l" : "p", j);
    }
}
