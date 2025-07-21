package io.embrace.android.embracesdk.config.remote;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class DataRemoteConfig {
    private final Float pctThermalStatusEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public DataRemoteConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DataRemoteConfig copy$default(DataRemoteConfig dataRemoteConfig, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = dataRemoteConfig.pctThermalStatusEnabled;
        }
        return dataRemoteConfig.copy(f);
    }

    public final Float component1() {
        return this.pctThermalStatusEnabled;
    }

    public final DataRemoteConfig copy(@bt3(name = "pct_thermal_status_enabled") Float f) {
        return new DataRemoteConfig(f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DataRemoteConfig) && zq3.c(this.pctThermalStatusEnabled, ((DataRemoteConfig) obj).pctThermalStatusEnabled);
        }
        return true;
    }

    public final Float getPctThermalStatusEnabled() {
        return this.pctThermalStatusEnabled;
    }

    public int hashCode() {
        Float f = this.pctThermalStatusEnabled;
        if (f != null) {
            return f.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "DataRemoteConfig(pctThermalStatusEnabled=" + this.pctThermalStatusEnabled + ")";
    }

    public DataRemoteConfig(@bt3(name = "pct_thermal_status_enabled") Float f) {
        this.pctThermalStatusEnabled = f;
    }

    public /* synthetic */ DataRemoteConfig(Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f);
    }
}
