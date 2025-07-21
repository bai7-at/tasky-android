package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zztd {
    static Object zza(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap zzb(int i) {
        int ceil;
        if (i < 3) {
            zzrv.zza(i, "expectedSize");
            ceil = i + 1;
        } else {
            ceil = i < 1073741824 ? (int) Math.ceil(i / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashMap(ceil);
    }
}
