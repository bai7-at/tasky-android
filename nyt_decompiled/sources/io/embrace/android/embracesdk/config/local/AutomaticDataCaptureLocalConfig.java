package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class AutomaticDataCaptureLocalConfig {
    private final Boolean anrServiceEnabled;
    private final Boolean memoryServiceEnabled;
    private final Boolean networkConnectivityServiceEnabled;
    private final Boolean powerSaveModeServiceEnabled;

    public AutomaticDataCaptureLocalConfig() {
        this(null, null, null, null, 15, null);
    }

    public final Boolean getAnrServiceEnabled() {
        return this.anrServiceEnabled;
    }

    public final Boolean getMemoryServiceEnabled() {
        return this.memoryServiceEnabled;
    }

    public final Boolean getNetworkConnectivityServiceEnabled() {
        return this.networkConnectivityServiceEnabled;
    }

    public final Boolean getPowerSaveModeServiceEnabled() {
        return this.powerSaveModeServiceEnabled;
    }

    public AutomaticDataCaptureLocalConfig(@bt3(name = "memory_info") Boolean bool, @bt3(name = "power_save_mode_info") Boolean bool2, @bt3(name = "network_connectivity_info") Boolean bool3, @bt3(name = "anr_info") Boolean bool4) {
        this.memoryServiceEnabled = bool;
        this.powerSaveModeServiceEnabled = bool2;
        this.networkConnectivityServiceEnabled = bool3;
        this.anrServiceEnabled = bool4;
    }

    public /* synthetic */ AutomaticDataCaptureLocalConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }
}
