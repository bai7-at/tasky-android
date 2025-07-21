package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
/* loaded from: classes3.dex */
public final class Tracking {

    @SerializedName("last_updated")
    private final long lastUpdated;

    public Tracking(long j) {
        this.lastUpdated = j;
    }

    public static /* synthetic */ Tracking copy$default(Tracking tracking, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tracking.lastUpdated;
        }
        return tracking.copy(j);
    }

    public final long component1() {
        return this.lastUpdated;
    }

    public final Tracking copy(long j) {
        return new Tracking(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Tracking) && this.lastUpdated == ((Tracking) obj).lastUpdated;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated);
    }

    public String toString() {
        return "Tracking(lastUpdated=" + this.lastUpdated + ')';
    }
}
