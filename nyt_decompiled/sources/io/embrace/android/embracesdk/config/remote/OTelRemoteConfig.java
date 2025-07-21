package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class OTelRemoteConfig {
    private final Boolean isBetaEnabled;
    private final Boolean isDevEnabled;
    private final Boolean isStableEnabled;

    public OTelRemoteConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OTelRemoteConfig copy$default(OTelRemoteConfig oTelRemoteConfig, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oTelRemoteConfig.isStableEnabled;
        }
        if ((i & 2) != 0) {
            bool2 = oTelRemoteConfig.isBetaEnabled;
        }
        if ((i & 4) != 0) {
            bool3 = oTelRemoteConfig.isDevEnabled;
        }
        return oTelRemoteConfig.copy(bool, bool2, bool3);
    }

    public final Boolean component1() {
        return this.isStableEnabled;
    }

    public final Boolean component2() {
        return this.isBetaEnabled;
    }

    public final Boolean component3() {
        return this.isDevEnabled;
    }

    public final OTelRemoteConfig copy(@bt3(name = "stable") Boolean bool, @bt3(name = "beta") Boolean bool2, @bt3(name = "dev") Boolean bool3) {
        return new OTelRemoteConfig(bool, bool2, bool3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OTelRemoteConfig)) {
            return false;
        }
        OTelRemoteConfig oTelRemoteConfig = (OTelRemoteConfig) obj;
        return zq3.c(this.isStableEnabled, oTelRemoteConfig.isStableEnabled) && zq3.c(this.isBetaEnabled, oTelRemoteConfig.isBetaEnabled) && zq3.c(this.isDevEnabled, oTelRemoteConfig.isDevEnabled);
    }

    public int hashCode() {
        Boolean bool = this.isStableEnabled;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.isBetaEnabled;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.isDevEnabled;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean isBetaEnabled() {
        return this.isBetaEnabled;
    }

    public final Boolean isDevEnabled() {
        return this.isDevEnabled;
    }

    public final Boolean isStableEnabled() {
        return this.isStableEnabled;
    }

    public String toString() {
        return "OTelRemoteConfig(isStableEnabled=" + this.isStableEnabled + ", isBetaEnabled=" + this.isBetaEnabled + ", isDevEnabled=" + this.isDevEnabled + ")";
    }

    public OTelRemoteConfig(@bt3(name = "stable") Boolean bool, @bt3(name = "beta") Boolean bool2, @bt3(name = "dev") Boolean bool3) {
        this.isStableEnabled = bool;
        this.isBetaEnabled = bool2;
        this.isDevEnabled = bool3;
    }

    public /* synthetic */ OTelRemoteConfig(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }
}
