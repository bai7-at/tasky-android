package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
final class zzagh {
    private static final zzagh zza = new zzagh();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzagt zzb = new zzafr();

    private zzagh() {
    }

    public static zzagh zza() {
        return zza;
    }

    public final zzags zzb(Class cls) {
        zzafa.zzc(cls, "messageType");
        zzags zzagsVar = (zzags) this.zzc.get(cls);
        if (zzagsVar == null) {
            zzagsVar = this.zzb.zza(cls);
            zzafa.zzc(cls, "messageType");
            zzafa.zzc(zzagsVar, "schema");
            zzags zzagsVar2 = (zzags) this.zzc.putIfAbsent(cls, zzagsVar);
            if (zzagsVar2 != null) {
                return zzagsVar2;
            }
        }
        return zzagsVar;
    }
}
