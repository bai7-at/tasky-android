package com.iteratehq.iterate.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import defpackage.zq3;

@Keep
/* loaded from: classes3.dex */
public final class EmbedContext {
    private final AppContext app;
    private final EventContext event;
    private final TargetingContext targeting;
    private final TrackingContext tracking;

    /* renamed from: type, reason: collision with root package name */
    private final EmbedType f52type;

    @SerializedName("user_traits")
    private final StringToAnyMap userTraits;

    public EmbedContext(AppContext appContext, EventContext eventContext, TargetingContext targetingContext, TrackingContext trackingContext, EmbedType embedType, StringToAnyMap stringToAnyMap) {
        this.app = appContext;
        this.event = eventContext;
        this.targeting = targetingContext;
        this.tracking = trackingContext;
        this.f52type = embedType;
        this.userTraits = stringToAnyMap;
    }

    public static /* synthetic */ EmbedContext copy$default(EmbedContext embedContext, AppContext appContext, EventContext eventContext, TargetingContext targetingContext, TrackingContext trackingContext, EmbedType embedType, StringToAnyMap stringToAnyMap, int i, Object obj) {
        if ((i & 1) != 0) {
            appContext = embedContext.app;
        }
        if ((i & 2) != 0) {
            eventContext = embedContext.event;
        }
        EventContext eventContext2 = eventContext;
        if ((i & 4) != 0) {
            targetingContext = embedContext.targeting;
        }
        TargetingContext targetingContext2 = targetingContext;
        if ((i & 8) != 0) {
            trackingContext = embedContext.tracking;
        }
        TrackingContext trackingContext2 = trackingContext;
        if ((i & 16) != 0) {
            embedType = embedContext.f52type;
        }
        EmbedType embedType2 = embedType;
        if ((i & 32) != 0) {
            stringToAnyMap = embedContext.userTraits;
        }
        return embedContext.copy(appContext, eventContext2, targetingContext2, trackingContext2, embedType2, stringToAnyMap);
    }

    public final AppContext component1() {
        return this.app;
    }

    public final EventContext component2() {
        return this.event;
    }

    public final TargetingContext component3() {
        return this.targeting;
    }

    public final TrackingContext component4() {
        return this.tracking;
    }

    public final EmbedType component5() {
        return this.f52type;
    }

    public final StringToAnyMap component6() {
        return this.userTraits;
    }

    public final EmbedContext copy(AppContext appContext, EventContext eventContext, TargetingContext targetingContext, TrackingContext trackingContext, EmbedType embedType, StringToAnyMap stringToAnyMap) {
        return new EmbedContext(appContext, eventContext, targetingContext, trackingContext, embedType, stringToAnyMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbedContext)) {
            return false;
        }
        EmbedContext embedContext = (EmbedContext) obj;
        return zq3.c(this.app, embedContext.app) && zq3.c(this.event, embedContext.event) && zq3.c(this.targeting, embedContext.targeting) && zq3.c(this.tracking, embedContext.tracking) && this.f52type == embedContext.f52type && zq3.c(this.userTraits, embedContext.userTraits);
    }

    public final AppContext getApp() {
        return this.app;
    }

    public final EventContext getEvent() {
        return this.event;
    }

    public final TargetingContext getTargeting() {
        return this.targeting;
    }

    public final TrackingContext getTracking() {
        return this.tracking;
    }

    public final EmbedType getType() {
        return this.f52type;
    }

    public final StringToAnyMap getUserTraits() {
        return this.userTraits;
    }

    public int hashCode() {
        AppContext appContext = this.app;
        int hashCode = (appContext == null ? 0 : appContext.hashCode()) * 31;
        EventContext eventContext = this.event;
        int hashCode2 = (hashCode + (eventContext == null ? 0 : eventContext.hashCode())) * 31;
        TargetingContext targetingContext = this.targeting;
        int hashCode3 = (hashCode2 + (targetingContext == null ? 0 : targetingContext.hashCode())) * 31;
        TrackingContext trackingContext = this.tracking;
        int hashCode4 = (hashCode3 + (trackingContext == null ? 0 : trackingContext.hashCode())) * 31;
        EmbedType embedType = this.f52type;
        int hashCode5 = (hashCode4 + (embedType == null ? 0 : embedType.hashCode())) * 31;
        StringToAnyMap stringToAnyMap = this.userTraits;
        return hashCode5 + (stringToAnyMap != null ? stringToAnyMap.hashCode() : 0);
    }

    public String toString() {
        return "EmbedContext(app=" + this.app + ", event=" + this.event + ", targeting=" + this.targeting + ", tracking=" + this.tracking + ", type=" + this.f52type + ", userTraits=" + this.userTraits + ')';
    }
}
