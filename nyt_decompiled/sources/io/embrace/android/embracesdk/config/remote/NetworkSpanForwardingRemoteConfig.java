package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NetworkSpanForwardingRemoteConfig {
    private final Float pctEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkSpanForwardingRemoteConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NetworkSpanForwardingRemoteConfig copy$default(NetworkSpanForwardingRemoteConfig networkSpanForwardingRemoteConfig, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = networkSpanForwardingRemoteConfig.pctEnabled;
        }
        return networkSpanForwardingRemoteConfig.copy(f);
    }

    public final Float component1() {
        return this.pctEnabled;
    }

    public final NetworkSpanForwardingRemoteConfig copy(@bt3(name = "pct_enabled") Float f) {
        return new NetworkSpanForwardingRemoteConfig(f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NetworkSpanForwardingRemoteConfig) && zq3.c(this.pctEnabled, ((NetworkSpanForwardingRemoteConfig) obj).pctEnabled);
        }
        return true;
    }

    public final Float getPctEnabled() {
        return this.pctEnabled;
    }

    public int hashCode() {
        Float f = this.pctEnabled;
        if (f != null) {
            return f.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "NetworkSpanForwardingRemoteConfig(pctEnabled=" + this.pctEnabled + ")";
    }

    public NetworkSpanForwardingRemoteConfig(@bt3(name = "pct_enabled") Float f) {
        this.pctEnabled = f;
    }

    public /* synthetic */ NetworkSpanForwardingRemoteConfig(Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f);
    }
}
