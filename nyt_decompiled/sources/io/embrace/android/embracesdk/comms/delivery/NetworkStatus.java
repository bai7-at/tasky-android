package io.embrace.android.embracesdk.comms.delivery;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;

/* loaded from: classes5.dex */
public enum NetworkStatus {
    NOT_REACHABLE("none"),
    WIFI("wifi"),
    WAN("wan"),
    UNKNOWN(DatasetUtils.UNKNOWN_IDENTITY_ID);

    private final String value;

    NetworkStatus(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isReachable() {
        return this != NOT_REACHABLE;
    }
}
