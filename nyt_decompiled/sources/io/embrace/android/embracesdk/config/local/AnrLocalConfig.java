package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AnrLocalConfig {
    private final Boolean captureGoogle;
    private final Boolean captureUnityThread;

    /* JADX WARN: Multi-variable type inference failed */
    public AnrLocalConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean getCaptureGoogle() {
        return this.captureGoogle;
    }

    public final Boolean getCaptureUnityThread() {
        return this.captureUnityThread;
    }

    public AnrLocalConfig(@bt3(name = "capture_google") Boolean bool, @bt3(name = "capture_unity_thread") Boolean bool2) {
        this.captureGoogle = bool;
        this.captureUnityThread = bool2;
    }

    public /* synthetic */ AnrLocalConfig(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
