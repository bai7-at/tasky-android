package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.AppLocalConfig;
import io.embrace.android.embracesdk.config.local.AutomaticDataCaptureLocalConfig;
import io.embrace.android.embracesdk.config.local.ComposeLocalConfig;
import io.embrace.android.embracesdk.config.local.CrashHandlerLocalConfig;
import io.embrace.android.embracesdk.config.local.LocalConfig;
import io.embrace.android.embracesdk.config.local.SdkLocalConfig;
import io.embrace.android.embracesdk.config.remote.DataRemoteConfig;
import io.embrace.android.embracesdk.config.remote.KillSwitchRemoteConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.ApkToolsConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AutoDataCaptureBehavior extends MergedConfigBehavior<LocalConfig, RemoteConfig> {
    public static final boolean ANR_SERVICE_ENABLED_DEFAULT = true;
    public static final boolean CAPTURE_COMPOSE_ONCLICK_DEFAULT = false;
    public static final boolean CRASH_HANDLER_ENABLED_DEFAULT = true;
    public static final Companion Companion = new Companion(null);
    public static final boolean MEMORY_SERVICE_ENABLED_DEFAULT = true;
    public static final boolean NETWORK_CONNECTIVITY_SERVICE_ENABLED_DEFAULT = true;
    public static final boolean POWER_SAVE_MODE_SERVICE_ENABLED_DEFAULT = true;
    public static final boolean REPORT_DISK_USAGE_DEFAULT = true;
    public static final boolean THERMAL_STATUS_ENABLED_DEFAULT = true;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoDataCaptureBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    public final boolean isAnrServiceEnabled() {
        SdkLocalConfig sdkConfig;
        AutomaticDataCaptureLocalConfig automaticDataCaptureConfig;
        Boolean anrServiceEnabled;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (automaticDataCaptureConfig = sdkConfig.getAutomaticDataCaptureConfig()) == null || (anrServiceEnabled = automaticDataCaptureConfig.getAnrServiceEnabled()) == null) {
            return true;
        }
        return anrServiceEnabled.booleanValue();
    }

    public final boolean isComposeOnClickEnabled() {
        SdkLocalConfig sdkConfig;
        ComposeLocalConfig composeConfig;
        Boolean captureComposeOnClick;
        KillSwitchRemoteConfig killSwitchConfig;
        RemoteConfig remote = getRemote();
        Boolean jetpackCompose = (remote == null || (killSwitchConfig = remote.getKillSwitchConfig()) == null) ? null : killSwitchConfig.getJetpackCompose();
        if (jetpackCompose != null && !zq3.c(jetpackCompose, Boolean.TRUE)) {
            if (zq3.c(jetpackCompose, Boolean.FALSE)) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (composeConfig = sdkConfig.getComposeConfig()) == null || (captureComposeOnClick = composeConfig.getCaptureComposeOnClick()) == null) {
            return false;
        }
        return captureComposeOnClick.booleanValue();
    }

    public final boolean isDiskUsageReportingEnabled() {
        SdkLocalConfig sdkConfig;
        AppLocalConfig app;
        Boolean reportDiskUsage;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (app = sdkConfig.getApp()) == null || (reportDiskUsage = app.getReportDiskUsage()) == null) {
            return true;
        }
        return reportDiskUsage.booleanValue();
    }

    public final boolean isMemoryServiceEnabled() {
        SdkLocalConfig sdkConfig;
        AutomaticDataCaptureLocalConfig automaticDataCaptureConfig;
        Boolean memoryServiceEnabled;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (automaticDataCaptureConfig = sdkConfig.getAutomaticDataCaptureConfig()) == null || (memoryServiceEnabled = automaticDataCaptureConfig.getMemoryServiceEnabled()) == null) {
            return true;
        }
        return memoryServiceEnabled.booleanValue();
    }

    public final boolean isNdkEnabled() {
        LocalConfig local = getLocal();
        return (local != null ? local.getNdkEnabled() : false) && !ApkToolsConfig.IS_NDK_DISABLED;
    }

    public final boolean isNetworkConnectivityServiceEnabled() {
        SdkLocalConfig sdkConfig;
        AutomaticDataCaptureLocalConfig automaticDataCaptureConfig;
        Boolean networkConnectivityServiceEnabled;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (automaticDataCaptureConfig = sdkConfig.getAutomaticDataCaptureConfig()) == null || (networkConnectivityServiceEnabled = automaticDataCaptureConfig.getNetworkConnectivityServiceEnabled()) == null) {
            return true;
        }
        return networkConnectivityServiceEnabled.booleanValue();
    }

    public final boolean isPowerSaveModeServiceEnabled() {
        SdkLocalConfig sdkConfig;
        AutomaticDataCaptureLocalConfig automaticDataCaptureConfig;
        Boolean powerSaveModeServiceEnabled;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (automaticDataCaptureConfig = sdkConfig.getAutomaticDataCaptureConfig()) == null || (powerSaveModeServiceEnabled = automaticDataCaptureConfig.getPowerSaveModeServiceEnabled()) == null) {
            return true;
        }
        return powerSaveModeServiceEnabled.booleanValue();
    }

    public final boolean isSigHandlerDetectionEnabled() {
        Boolean sigHandlerDetection;
        SdkLocalConfig sdkConfig;
        KillSwitchRemoteConfig killSwitchConfig;
        RemoteConfig remote = getRemote();
        if (remote == null || (killSwitchConfig = remote.getKillSwitchConfig()) == null || (sigHandlerDetection = killSwitchConfig.getSigHandlerDetection()) == null) {
            LocalConfig local = getLocal();
            sigHandlerDetection = (local == null || (sdkConfig = local.getSdkConfig()) == null) ? null : sdkConfig.getSigHandlerDetection();
        }
        if (sigHandlerDetection != null) {
            return sigHandlerDetection.booleanValue();
        }
        return true;
    }

    public final boolean isThermalStatusCaptureEnabled() {
        DataRemoteConfig dataConfig;
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        RemoteConfig remote = getRemote();
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled((remote == null || (dataConfig = remote.getDataConfig()) == null) ? null : dataConfig.getPctThermalStatusEnabled());
        if (isBehaviorEnabled != null) {
            return isBehaviorEnabled.booleanValue();
        }
        return true;
    }

    public final boolean isUncaughtExceptionHandlerEnabled() {
        SdkLocalConfig sdkConfig;
        CrashHandlerLocalConfig crashHandler;
        Boolean enabled;
        LocalConfig local = getLocal();
        if (local == null || (sdkConfig = local.getSdkConfig()) == null || (crashHandler = sdkConfig.getCrashHandler()) == null || (enabled = crashHandler.getEnabled()) == null) {
            return true;
        }
        return enabled.booleanValue();
    }
}
