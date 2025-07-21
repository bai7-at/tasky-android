package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BackgroundActivityLocalConfig {
    private final Boolean backgroundActivityCaptureEnabled;
    private final Integer manualBackgroundActivityLimit;
    private final Integer maxCachedActivities;
    private final Long minBackgroundActivityDuration;

    public BackgroundActivityLocalConfig() {
        this(null, null, null, null, 15, null);
    }

    public final Boolean getBackgroundActivityCaptureEnabled() {
        return this.backgroundActivityCaptureEnabled;
    }

    public final Integer getManualBackgroundActivityLimit() {
        return this.manualBackgroundActivityLimit;
    }

    public final Integer getMaxCachedActivities() {
        return this.maxCachedActivities;
    }

    public final Long getMinBackgroundActivityDuration() {
        return this.minBackgroundActivityDuration;
    }

    public BackgroundActivityLocalConfig(@bt3(name = "capture_enabled") Boolean bool, @bt3(name = "manual_background_activity_limit") Integer num, @bt3(name = "min_background_activity_duration") Long l, @bt3(name = "max_cached_activities") Integer num2) {
        this.backgroundActivityCaptureEnabled = bool;
        this.manualBackgroundActivityLimit = num;
        this.minBackgroundActivityDuration = l;
        this.maxCachedActivities = num2;
    }

    public /* synthetic */ BackgroundActivityLocalConfig(Boolean bool, Integer num, Long l, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num2);
    }
}
