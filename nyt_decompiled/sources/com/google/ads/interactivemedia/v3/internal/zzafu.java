package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzafu {
    zzafu() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        if (zzaftVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzaftVar.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzaft) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        zzaft zzaftVar2 = (zzaft) obj2;
        if (!zzaftVar2.isEmpty()) {
            if (!zzaftVar.zze()) {
                zzaftVar = zzaftVar.zzb();
            }
            zzaftVar.zzd(zzaftVar2);
        }
        return zzaftVar;
    }
}
