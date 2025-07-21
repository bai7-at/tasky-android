package io.embrace.android.embracesdk.config.behavior;

import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes5.dex */
public final class BehaviorThresholdCheck {
    private final qs2 deviceIdProvider;

    public BehaviorThresholdCheck(qs2 qs2Var) {
        zq3.h(qs2Var, "deviceIdProvider");
        this.deviceIdProvider = qs2Var;
    }

    public final float getNormalizedDeviceId() {
        return getNormalizedDeviceId(2);
    }

    public final float getNormalizedLargeDeviceId() {
        return getNormalizedDeviceId(6);
    }

    public final Boolean isBehaviorEnabled(Float f) {
        if (f != null) {
            return Boolean.valueOf(isBehaviorEnabled(f.floatValue()));
        }
        return null;
    }

    private final float getNormalizedDeviceId(int i) {
        String str = (String) this.deviceIdProvider.mo865invoke();
        zq3.g(str.substring(str.length() - i), "(this as java.lang.String).substring(startIndex)");
        return (Integer.valueOf(r5, 16).intValue() / ((int) (Math.pow(16, i) - 1))) * 100;
    }

    public final Boolean isBehaviorEnabled(Integer num) {
        return isBehaviorEnabled(num != null ? Float.valueOf(num.intValue()) : null);
    }

    public final boolean isBehaviorEnabled(float f) {
        return f > ((float) 0) && f <= ((float) 100) && f >= getNormalizedLargeDeviceId();
    }
}
