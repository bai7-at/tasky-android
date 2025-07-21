package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.LogRemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class LogMessageBehavior extends MergedConfigBehavior<ww8, LogRemoteConfig> {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_LOG_ERROR_LIMIT = 250;
    private static final int DEFAULT_LOG_INFO_LIMIT = 100;
    private static final int DEFAULT_LOG_WARNING_LIMIT = 100;
    public static final int LOG_MESSAGE_MAXIMUM_ALLOWED_LENGTH = 128;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogMessageBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.LogMessageBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                return null;
            }
        }, qs2Var);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "remoteSupplier");
    }

    public final int getErrorLogLimit() {
        Integer logErrorLimit;
        LogRemoteConfig remote = getRemote();
        return (remote == null || (logErrorLimit = remote.getLogErrorLimit()) == null) ? DEFAULT_LOG_ERROR_LIMIT : logErrorLimit.intValue();
    }

    public final int getInfoLogLimit() {
        Integer logInfoLimit;
        LogRemoteConfig remote = getRemote();
        if (remote == null || (logInfoLimit = remote.getLogInfoLimit()) == null) {
            return 100;
        }
        return logInfoLimit.intValue();
    }

    public final int getLogMessageMaximumAllowedLength() {
        Integer logMessageMaximumAllowedLength;
        LogRemoteConfig remote = getRemote();
        if (remote == null || (logMessageMaximumAllowedLength = remote.getLogMessageMaximumAllowedLength()) == null) {
            return 128;
        }
        return logMessageMaximumAllowedLength.intValue();
    }

    public final int getWarnLogLimit() {
        Integer logWarnLimit;
        LogRemoteConfig remote = getRemote();
        if (remote == null || (logWarnLimit = remote.getLogWarnLimit()) == null) {
            return 100;
        }
        return logWarnLimit.intValue();
    }
}
