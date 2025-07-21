package com.google.android.gms.common.util;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public final class zza {
    public static int zza(int i) {
        if (i == -1) {
            return -1;
        }
        return i / NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    }
}
