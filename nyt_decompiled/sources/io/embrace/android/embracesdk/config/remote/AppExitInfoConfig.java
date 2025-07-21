package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AppExitInfoConfig {
    private final Integer aeiMaxNum;
    private final Integer appExitInfoTracesLimit;
    private final Float pctAeiCaptureEnabled;

    public AppExitInfoConfig() {
        this(null, null, null, 7, null);
    }

    public final Integer getAeiMaxNum() {
        return this.aeiMaxNum;
    }

    public final Integer getAppExitInfoTracesLimit() {
        return this.appExitInfoTracesLimit;
    }

    public final Float getPctAeiCaptureEnabled() {
        return this.pctAeiCaptureEnabled;
    }

    public AppExitInfoConfig(@bt3(name = "app_exit_info_traces_limit") Integer num, @bt3(name = "pct_aei_enabled_v2") Float f, @bt3(name = "aei_max_num") Integer num2) {
        this.appExitInfoTracesLimit = num;
        this.pctAeiCaptureEnabled = f;
        this.aeiMaxNum = num2;
    }

    public /* synthetic */ AppExitInfoConfig(Integer num, Float f, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num2);
    }
}
