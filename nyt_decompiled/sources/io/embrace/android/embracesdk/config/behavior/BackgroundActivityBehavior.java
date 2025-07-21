package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.BackgroundActivityLocalConfig;
import io.embrace.android.embracesdk.config.remote.BackgroundActivityRemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BackgroundActivityBehavior extends MergedConfigBehavior<BackgroundActivityLocalConfig, BackgroundActivityRemoteConfig> {
    public static final boolean BACKGROUND_ACTIVITY_CAPTURE_ENABLED_DEFAULT = false;
    public static final Companion Companion = new Companion(null);
    public static final int MANUAL_BACKGROUND_ACTIVITY_LIMIT_DEFAULT = 100;
    public static final int MAX_CACHED_ACTIVITIES_DEFAULT = 30;
    public static final long MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT = 5000;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundActivityBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    public final int getManualBackgroundActivityLimit() {
        Integer manualBackgroundActivityLimit;
        BackgroundActivityLocalConfig local = getLocal();
        if (local == null || (manualBackgroundActivityLimit = local.getManualBackgroundActivityLimit()) == null) {
            return 100;
        }
        return manualBackgroundActivityLimit.intValue();
    }

    public final int getMaxCachedActivities() {
        Integer maxCachedActivities;
        BackgroundActivityLocalConfig local = getLocal();
        if (local == null || (maxCachedActivities = local.getMaxCachedActivities()) == null) {
            return 30;
        }
        return maxCachedActivities.intValue();
    }

    public final long getMinBackgroundActivityDuration() {
        Long minBackgroundActivityDuration;
        BackgroundActivityLocalConfig local = getLocal();
        return (local == null || (minBackgroundActivityDuration = local.getMinBackgroundActivityDuration()) == null) ? MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT : minBackgroundActivityDuration.longValue();
    }

    public final boolean isEnabled() {
        Boolean backgroundActivityCaptureEnabled;
        Float threshold;
        BackgroundActivityRemoteConfig remote = getRemote();
        if (remote == null || (threshold = remote.getThreshold()) == null) {
            BackgroundActivityLocalConfig local = getLocal();
            backgroundActivityCaptureEnabled = local != null ? local.getBackgroundActivityCaptureEnabled() : null;
        } else {
            backgroundActivityCaptureEnabled = Boolean.valueOf(getThresholdCheck().isBehaviorEnabled(threshold.floatValue()));
        }
        if (backgroundActivityCaptureEnabled != null) {
            return backgroundActivityCaptureEnabled.booleanValue();
        }
        return false;
    }
}
