package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzhv {
    public static List zza(SecureSignals secureSignals, List list) {
        if (secureSignals != null) {
            list.add(com.google.ads.interactivemedia.v3.impl.data.zzbo.createBy1stPartyData(secureSignals));
        }
        return list;
    }
}
