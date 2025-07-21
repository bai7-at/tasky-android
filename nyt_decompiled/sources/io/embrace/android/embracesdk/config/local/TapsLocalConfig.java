package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class TapsLocalConfig {
    private final Boolean captureCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public TapsLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getCaptureCoordinates() {
        return this.captureCoordinates;
    }

    public TapsLocalConfig(@bt3(name = "capture_coordinates") Boolean bool) {
        this.captureCoordinates = bool;
    }

    public /* synthetic */ TapsLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
