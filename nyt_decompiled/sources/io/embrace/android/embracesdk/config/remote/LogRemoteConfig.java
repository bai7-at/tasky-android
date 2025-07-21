package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class LogRemoteConfig {
    private final Integer logErrorLimit;
    private final Integer logInfoLimit;
    private final Integer logMessageMaximumAllowedLength;
    private final Integer logWarnLimit;

    public LogRemoteConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ LogRemoteConfig copy$default(LogRemoteConfig logRemoteConfig, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = logRemoteConfig.logMessageMaximumAllowedLength;
        }
        if ((i & 2) != 0) {
            num2 = logRemoteConfig.logInfoLimit;
        }
        if ((i & 4) != 0) {
            num3 = logRemoteConfig.logWarnLimit;
        }
        if ((i & 8) != 0) {
            num4 = logRemoteConfig.logErrorLimit;
        }
        return logRemoteConfig.copy(num, num2, num3, num4);
    }

    public final Integer component1() {
        return this.logMessageMaximumAllowedLength;
    }

    public final Integer component2() {
        return this.logInfoLimit;
    }

    public final Integer component3() {
        return this.logWarnLimit;
    }

    public final Integer component4() {
        return this.logErrorLimit;
    }

    public final LogRemoteConfig copy(@bt3(name = "max_length") Integer num, @bt3(name = "info_limit") Integer num2, @bt3(name = "warn_limit") Integer num3, @bt3(name = "error_limit") Integer num4) {
        return new LogRemoteConfig(num, num2, num3, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogRemoteConfig)) {
            return false;
        }
        LogRemoteConfig logRemoteConfig = (LogRemoteConfig) obj;
        return zq3.c(this.logMessageMaximumAllowedLength, logRemoteConfig.logMessageMaximumAllowedLength) && zq3.c(this.logInfoLimit, logRemoteConfig.logInfoLimit) && zq3.c(this.logWarnLimit, logRemoteConfig.logWarnLimit) && zq3.c(this.logErrorLimit, logRemoteConfig.logErrorLimit);
    }

    public final Integer getLogErrorLimit() {
        return this.logErrorLimit;
    }

    public final Integer getLogInfoLimit() {
        return this.logInfoLimit;
    }

    public final Integer getLogMessageMaximumAllowedLength() {
        return this.logMessageMaximumAllowedLength;
    }

    public final Integer getLogWarnLimit() {
        return this.logWarnLimit;
    }

    public int hashCode() {
        Integer num = this.logMessageMaximumAllowedLength;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.logInfoLimit;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.logWarnLimit;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.logErrorLimit;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "LogRemoteConfig(logMessageMaximumAllowedLength=" + this.logMessageMaximumAllowedLength + ", logInfoLimit=" + this.logInfoLimit + ", logWarnLimit=" + this.logWarnLimit + ", logErrorLimit=" + this.logErrorLimit + ")";
    }

    public LogRemoteConfig(@bt3(name = "max_length") Integer num, @bt3(name = "info_limit") Integer num2, @bt3(name = "warn_limit") Integer num3, @bt3(name = "error_limit") Integer num4) {
        this.logMessageMaximumAllowedLength = num;
        this.logInfoLimit = num2;
        this.logWarnLimit = num3;
        this.logErrorLimit = num4;
    }

    public /* synthetic */ LogRemoteConfig(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }
}
