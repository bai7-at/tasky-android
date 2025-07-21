package io.embrace.android.embracesdk.config.behavior;

import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.LocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SdkModeBehavior extends MergedConfigBehavior<LocalConfig, RemoteConfig> {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_BETA_FEATURES_PCT = 1.0f;
    private static final float DEFAULT_DEFER_SERVICE_INIT_PCT = 0.0f;
    private static final int DEFAULT_OFFSET = 0;
    private static final int DEFAULT_THRESHOLD = 100;
    private final c04 appId$delegate;
    private final boolean isDebug;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkModeBehavior(boolean z, BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
        this.isDebug = z;
        this.appId$delegate = c.a(new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.SdkModeBehavior$appId$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final String mo865invoke() {
                String appId;
                LocalConfig local = SdkModeBehavior.this.getLocal();
                if (local == null || (appId = local.getAppId()) == null) {
                    throw new IllegalStateException("App ID not supplied.");
                }
                return appId;
            }
        });
    }

    private final int getOffset() {
        Integer offset;
        RemoteConfig remote = getRemote();
        if (remote == null || (offset = remote.getOffset()) == null) {
            return 0;
        }
        return offset.intValue();
    }

    private final int getThreshold() {
        Integer threshold;
        RemoteConfig remote = getRemote();
        if (remote == null || (threshold = remote.getThreshold()) == null) {
            return 100;
        }
        return threshold.intValue();
    }

    public final String getAppId() {
        return (String) this.appId$delegate.getValue();
    }

    public final boolean isBetaFeaturesEnabled() {
        Float pctBetaFeaturesEnabled;
        SdkLocalConfig sdkConfig;
        LocalConfig local = getLocal();
        if (zq3.c((local == null || (sdkConfig = local.getSdkConfig()) == null) ? null : sdkConfig.getBetaFeaturesEnabled(), Boolean.FALSE)) {
            return false;
        }
        if (this.isDebug) {
            return true;
        }
        RemoteConfig remote = getRemote();
        return getThresholdCheck().isBehaviorEnabled((remote == null || (pctBetaFeaturesEnabled = remote.getPctBetaFeaturesEnabled()) == null) ? DEFAULT_BETA_FEATURES_PCT : pctBetaFeaturesEnabled.floatValue());
    }

    public final boolean isSdkDisabled() {
        float normalizedDeviceId = getThresholdCheck().getNormalizedDeviceId();
        int max = Math.max(0, getOffset());
        int min = Math.min(getOffset() + getThreshold(), 100);
        return max == min || normalizedDeviceId < ((float) max) || normalizedDeviceId > ((float) min);
    }

    public final boolean isServiceInitDeferred() {
        Float pctDeferServiceInitEnabled;
        RemoteConfig remote = getRemote();
        return getThresholdCheck().isBehaviorEnabled((remote == null || (pctDeferServiceInitEnabled = remote.getPctDeferServiceInitEnabled()) == null) ? DEFAULT_DEFER_SERVICE_INIT_PCT : pctDeferServiceInitEnabled.floatValue());
    }
}
