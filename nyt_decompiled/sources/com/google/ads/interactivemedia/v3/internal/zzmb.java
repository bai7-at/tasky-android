package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzmb extends zzmh {
    private final zzla zzi;
    private long zzj;

    public zzmb(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, zzla zzlaVar) {
        super(zzktVar, "lCoSMtrkOMYJWh7dS4CLhg/wqcWGOjemoO3bkIYH9oxmZbfKpryPLU6SBl2LuPWy", "5+3RGFY/3g50LDQYKc9yn9Kppn7/XDOIF0fA47Siqs0=", zzafVar, i, 53);
        this.zzi = zzlaVar;
        if (zzlaVar != null) {
            this.zzj = zzlaVar.zza();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            this.zze.zzP(((Long) this.zzf.invoke(null, Long.valueOf(this.zzj))).longValue());
        }
    }
}
