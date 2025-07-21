package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ViewLocalConfig {
    private final Boolean enableAutomaticActivityCapture;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getEnableAutomaticActivityCapture() {
        return this.enableAutomaticActivityCapture;
    }

    public ViewLocalConfig(@bt3(name = "enable_automatic_activity_capture") Boolean bool) {
        this.enableAutomaticActivityCapture = bool;
    }

    public /* synthetic */ ViewLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
