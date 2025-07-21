package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.local.SessionLocalConfig;
import io.embrace.android.embracesdk.config.remote.OTelRemoteConfig;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;

/* loaded from: classes5.dex */
public final class OTelBehavior extends MergedConfigBehavior<SessionLocalConfig, RemoteConfig> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTelBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.OTelBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SessionLocalConfig mo865invoke() {
                return null;
            }
        }, qs2Var);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "remoteSupplier");
    }

    public final boolean isBetaEnabled() {
        OTelRemoteConfig oTelConfig;
        Boolean isBetaEnabled;
        RemoteConfig remote = getRemote();
        if (remote == null || (oTelConfig = remote.getOTelConfig()) == null || (isBetaEnabled = oTelConfig.isBetaEnabled()) == null) {
            return true;
        }
        return isBetaEnabled.booleanValue();
    }

    public final boolean isDevEnabled() {
        OTelRemoteConfig oTelConfig;
        Boolean isDevEnabled;
        RemoteConfig remote = getRemote();
        if (remote == null || (oTelConfig = remote.getOTelConfig()) == null || (isDevEnabled = oTelConfig.isDevEnabled()) == null) {
            return false;
        }
        return isDevEnabled.booleanValue();
    }

    public final boolean isStableEnabled() {
        OTelRemoteConfig oTelConfig;
        Boolean isStableEnabled;
        RemoteConfig remote = getRemote();
        if (remote == null || (oTelConfig = remote.getOTelConfig()) == null || (isStableEnabled = oTelConfig.isStableEnabled()) == null) {
            return true;
        }
        return isStableEnabled.booleanValue();
    }
}
