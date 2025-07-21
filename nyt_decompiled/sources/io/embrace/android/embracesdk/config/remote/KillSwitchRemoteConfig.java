package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class KillSwitchRemoteConfig {
    private final Boolean jetpackCompose;
    private final Boolean sigHandlerDetection;

    /* JADX WARN: Multi-variable type inference failed */
    public KillSwitchRemoteConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KillSwitchRemoteConfig copy$default(KillSwitchRemoteConfig killSwitchRemoteConfig, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = killSwitchRemoteConfig.sigHandlerDetection;
        }
        if ((i & 2) != 0) {
            bool2 = killSwitchRemoteConfig.jetpackCompose;
        }
        return killSwitchRemoteConfig.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.sigHandlerDetection;
    }

    public final Boolean component2() {
        return this.jetpackCompose;
    }

    public final KillSwitchRemoteConfig copy(@bt3(name = "sig_handler_detection") Boolean bool, @bt3(name = "jetpack_compose") Boolean bool2) {
        return new KillSwitchRemoteConfig(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KillSwitchRemoteConfig)) {
            return false;
        }
        KillSwitchRemoteConfig killSwitchRemoteConfig = (KillSwitchRemoteConfig) obj;
        return zq3.c(this.sigHandlerDetection, killSwitchRemoteConfig.sigHandlerDetection) && zq3.c(this.jetpackCompose, killSwitchRemoteConfig.jetpackCompose);
    }

    public final Boolean getJetpackCompose() {
        return this.jetpackCompose;
    }

    public final Boolean getSigHandlerDetection() {
        return this.sigHandlerDetection;
    }

    public int hashCode() {
        Boolean bool = this.sigHandlerDetection;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.jetpackCompose;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "KillSwitchRemoteConfig(sigHandlerDetection=" + this.sigHandlerDetection + ", jetpackCompose=" + this.jetpackCompose + ")";
    }

    public KillSwitchRemoteConfig(@bt3(name = "sig_handler_detection") Boolean bool, @bt3(name = "jetpack_compose") Boolean bool2) {
        this.sigHandlerDetection = bool;
        this.jetpackCompose = bool2;
    }

    public /* synthetic */ KillSwitchRemoteConfig(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
