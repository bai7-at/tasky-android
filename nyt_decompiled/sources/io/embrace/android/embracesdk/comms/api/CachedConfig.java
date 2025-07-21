package io.embrace.android.embracesdk.comms.api;

import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CachedConfig {
    private final String eTag;
    private final RemoteConfig remoteConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public CachedConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final RemoteConfig getRemoteConfig() {
        return this.remoteConfig;
    }

    public final boolean isValid() {
        return (this.remoteConfig == null || this.eTag == null) ? false : true;
    }

    public CachedConfig(RemoteConfig remoteConfig, String str) {
        this.remoteConfig = remoteConfig;
        this.eTag = str;
    }

    public /* synthetic */ CachedConfig(RemoteConfig remoteConfig, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : remoteConfig, (i & 2) != 0 ? null : str);
    }
}
