package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BetaFeatures {
    private final List<ThermalState> thermalStates;

    /* JADX WARN: Multi-variable type inference failed */
    public BetaFeatures() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetaFeatures copy$default(BetaFeatures betaFeatures, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = betaFeatures.thermalStates;
        }
        return betaFeatures.copy(list);
    }

    public final List<ThermalState> component1$embrace_android_sdk_release() {
        return this.thermalStates;
    }

    public final BetaFeatures copy(@bt3(name = "ts") List<ThermalState> list) {
        return new BetaFeatures(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BetaFeatures) && zq3.c(this.thermalStates, ((BetaFeatures) obj).thermalStates);
        }
        return true;
    }

    public final List<ThermalState> getThermalStates$embrace_android_sdk_release() {
        return this.thermalStates;
    }

    public int hashCode() {
        List<ThermalState> list = this.thermalStates;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "BetaFeatures(thermalStates=" + this.thermalStates + ")";
    }

    public BetaFeatures(@bt3(name = "ts") List<ThermalState> list) {
        this.thermalStates = list;
    }

    public /* synthetic */ BetaFeatures(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
