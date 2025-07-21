package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.AppExitInfoLocalConfig;
import io.embrace.android.embracesdk.config.remote.AppExitInfoConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class AppExitInfoBehavior extends MergedConfigBehavior<AppExitInfoLocalConfig, RemoteConfig> {
    public static final boolean AEI_ENABLED_DEFAULT = true;
    public static final int AEI_MAX_NUM_DEFAULT = 0;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_TRACE_SIZE_BYTES = 2097152;

    public static abstract class CollectTracesResult {
        private final String result;

        public static final class Success extends CollectTracesResult {
            public Success(String str) {
                super(str, null);
            }
        }

        public static final class TooLarge extends CollectTracesResult {
            public TooLarge(String str) {
                super(str, null);
            }
        }

        public static final class TraceException extends CollectTracesResult {
            public TraceException(String str) {
                super(str, null);
            }
        }

        private CollectTracesResult(String str) {
            this.result = str;
        }

        public final String getResult() {
            return this.result;
        }

        public /* synthetic */ CollectTracesResult(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppExitInfoBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var, qs2 qs2Var2) {
        super(behaviorThresholdCheck, qs2Var, qs2Var2);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "localSupplier");
        zq3.h(qs2Var2, "remoteSupplier");
    }

    public final int appExitInfoMaxNum() {
        AppExitInfoConfig appExitInfoConfig;
        Integer aeiMaxNum;
        RemoteConfig remote = getRemote();
        if (remote == null || (appExitInfoConfig = remote.getAppExitInfoConfig()) == null || (aeiMaxNum = appExitInfoConfig.getAeiMaxNum()) == null) {
            return 0;
        }
        return aeiMaxNum.intValue();
    }

    public final int getTraceMaxLimit() {
        Integer appExitInfoTracesLimit;
        AppExitInfoConfig appExitInfoConfig;
        RemoteConfig remote = getRemote();
        if (remote == null || (appExitInfoConfig = remote.getAppExitInfoConfig()) == null || (appExitInfoTracesLimit = appExitInfoConfig.getAppExitInfoTracesLimit()) == null) {
            AppExitInfoLocalConfig local = getLocal();
            appExitInfoTracesLimit = local != null ? local.getAppExitInfoTracesLimit() : null;
        }
        return appExitInfoTracesLimit != null ? appExitInfoTracesLimit.intValue() : MAX_TRACE_SIZE_BYTES;
    }

    public final boolean isEnabled() {
        AppExitInfoConfig appExitInfoConfig;
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        RemoteConfig remote = getRemote();
        Boolean bool = null;
        Boolean isBehaviorEnabled = thresholdCheck.isBehaviorEnabled((remote == null || (appExitInfoConfig = remote.getAppExitInfoConfig()) == null) ? null : appExitInfoConfig.getPctAeiCaptureEnabled());
        if (isBehaviorEnabled == null) {
            AppExitInfoLocalConfig local = getLocal();
            if (local != null) {
                bool = local.getAeiCaptureEnabled();
            }
        } else {
            bool = isBehaviorEnabled;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
