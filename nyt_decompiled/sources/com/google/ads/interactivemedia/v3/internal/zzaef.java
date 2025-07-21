package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzaef {
    static final zzaef zza = new zzaef(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzaef zzd;
    private final Map zze;

    zzaef() {
        this.zze = new HashMap();
    }

    public static zzaef zza() {
        return zza;
    }

    public static zzaef zzb() {
        zzaef zzaefVar = zzd;
        if (zzaefVar != null) {
            return zzaefVar;
        }
        synchronized (zzaef.class) {
            try {
                zzaef zzaefVar2 = zzd;
                if (zzaefVar2 != null) {
                    return zzaefVar2;
                }
                zzaef zzb2 = zzaen.zzb(zzaef.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzaer zzc(zzafz zzafzVar, int i) {
        return (zzaer) this.zze.get(new zzaee(zzafzVar, i));
    }

    zzaef(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
