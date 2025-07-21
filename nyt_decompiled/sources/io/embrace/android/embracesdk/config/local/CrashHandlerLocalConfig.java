package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class CrashHandlerLocalConfig {
    private final Boolean enabled;

    /* JADX WARN: Multi-variable type inference failed */
    public CrashHandlerLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public CrashHandlerLocalConfig(@bt3(name = "enabled") Boolean bool) {
        this.enabled = bool;
    }

    public /* synthetic */ CrashHandlerLocalConfig(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool);
    }
}
