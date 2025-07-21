package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class ThermalState {
    private final int status;
    private final long timestamp;

    public ThermalState(@bt3(name = "t") long j, @bt3(name = "s") int i) {
        this.timestamp = j;
        this.status = i;
    }

    public static /* synthetic */ ThermalState copy$default(ThermalState thermalState, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = thermalState.timestamp;
        }
        if ((i2 & 2) != 0) {
            i = thermalState.status;
        }
        return thermalState.copy(j, i);
    }

    public final long component1$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public final int component2$embrace_android_sdk_release() {
        return this.status;
    }

    public final ThermalState copy(@bt3(name = "t") long j, @bt3(name = "s") int i) {
        return new ThermalState(j, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThermalState)) {
            return false;
        }
        ThermalState thermalState = (ThermalState) obj;
        return this.timestamp == thermalState.timestamp && this.status == thermalState.status;
    }

    public final int getStatus$embrace_android_sdk_release() {
        return this.status;
    }

    public final long getTimestamp$embrace_android_sdk_release() {
        return this.timestamp;
    }

    public int hashCode() {
        return (Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.status);
    }

    public String toString() {
        return "ThermalState(timestamp=" + this.timestamp + ", status=" + this.status + ")";
    }
}
