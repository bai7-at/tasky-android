package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class TrackingContext {

    @SerializedName("last_updated")
    private final Long lastUpdated;

    public TrackingContext(Long l) {
        this.lastUpdated = l;
    }

    public static /* synthetic */ TrackingContext copy$default(TrackingContext trackingContext, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = trackingContext.lastUpdated;
        }
        return trackingContext.copy(l);
    }

    public final Long component1() {
        return this.lastUpdated;
    }

    public final TrackingContext copy(Long l) {
        return new TrackingContext(l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrackingContext) && zq3.c(this.lastUpdated, ((TrackingContext) obj).lastUpdated);
    }

    public final Long getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        Long l = this.lastUpdated;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "TrackingContext(lastUpdated=" + this.lastUpdated + ')';
    }
}
