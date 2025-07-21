package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BackgroundActivityRemoteConfig {
    private final Float threshold;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundActivityRemoteConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BackgroundActivityRemoteConfig copy$default(BackgroundActivityRemoteConfig backgroundActivityRemoteConfig, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = backgroundActivityRemoteConfig.threshold;
        }
        return backgroundActivityRemoteConfig.copy(f);
    }

    public final Float component1() {
        return this.threshold;
    }

    public final BackgroundActivityRemoteConfig copy(@bt3(name = "threshold") Float f) {
        return new BackgroundActivityRemoteConfig(f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BackgroundActivityRemoteConfig) && zq3.c(this.threshold, ((BackgroundActivityRemoteConfig) obj).threshold);
        }
        return true;
    }

    public final Float getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        Float f = this.threshold;
        if (f != null) {
            return f.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "BackgroundActivityRemoteConfig(threshold=" + this.threshold + ")";
    }

    public BackgroundActivityRemoteConfig(@bt3(name = "threshold") Float f) {
        this.threshold = f;
    }

    public /* synthetic */ BackgroundActivityRemoteConfig(Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f);
    }
}
