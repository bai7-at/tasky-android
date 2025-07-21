package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AppExitInfoLocalConfig {
    private final Boolean aeiCaptureEnabled;
    private final Integer appExitInfoTracesLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public AppExitInfoLocalConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean getAeiCaptureEnabled() {
        return this.aeiCaptureEnabled;
    }

    public final Integer getAppExitInfoTracesLimit() {
        return this.appExitInfoTracesLimit;
    }

    public AppExitInfoLocalConfig(@bt3(name = "app_exit_info_traces_limit") Integer num, @bt3(name = "aei_enabled") Boolean bool) {
        this.appExitInfoTracesLimit = num;
        this.aeiCaptureEnabled = bool;
    }

    public /* synthetic */ AppExitInfoLocalConfig(Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool);
    }
}
