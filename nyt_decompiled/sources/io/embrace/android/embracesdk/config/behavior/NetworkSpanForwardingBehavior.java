package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.NetworkSpanForwardingRemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class NetworkSpanForwardingBehavior extends MergedConfigBehavior<ww8, NetworkSpanForwardingRemoteConfig> {
    public static final Companion Companion = new Companion(null);
    private static final float DEFAULT_PCT_ENABLED = 0.0f;
    public static final String TRACEPARENT_HEADER_NAME = "traceparent";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkSpanForwardingBehavior(BehaviorThresholdCheck behaviorThresholdCheck, qs2 qs2Var) {
        super(behaviorThresholdCheck, new qs2() { // from class: io.embrace.android.embracesdk.config.behavior.NetworkSpanForwardingBehavior.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ww8 mo865invoke() {
                return null;
            }
        }, qs2Var);
        zq3.h(behaviorThresholdCheck, "thresholdCheck");
        zq3.h(qs2Var, "remoteSupplier");
    }

    public final boolean isNetworkSpanForwardingEnabled() {
        Float pctEnabled;
        BehaviorThresholdCheck thresholdCheck = getThresholdCheck();
        NetworkSpanForwardingRemoteConfig remote = getRemote();
        return thresholdCheck.isBehaviorEnabled((remote == null || (pctEnabled = remote.getPctEnabled()) == null) ? DEFAULT_PCT_ENABLED : pctEnabled.floatValue());
    }
}
