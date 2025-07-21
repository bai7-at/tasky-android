package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ComposeLocalConfig {
    private final Boolean captureComposeOnClick;

    /* JADX WARN: Multi-variable type inference failed */
    public ComposeLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getCaptureComposeOnClick() {
        return this.captureComposeOnClick;
    }

    public ComposeLocalConfig(@bt3(name = "capture_compose_onclick") Boolean bool) {
        this.captureComposeOnClick = bool;
    }

    public /* synthetic */ ComposeLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
