package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzme extends zzmh {
    private final View zzi;

    public zzme(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, View view) {
        super(zzktVar, "Ej2yGS8iLSerXuRH5SXMZhSv1h5iR+OEGG+Xroye4W9DaMYcNZrsfxI3jn+hN5N5", "FGSCgbeH3B6hvI00LjJ/IoouVDBI0HGtRb22Hc3rgt8=", zzafVar, i, 57);
        this.zzi = view;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi != null) {
            Boolean bool = (Boolean) zznc.zzc().zzb(zznr.zzcY);
            Boolean bool2 = (Boolean) zznc.zzc().zzb(zznr.zzjq);
            zzkx zzkxVar = new zzkx((String) this.zzf.invoke(null, this.zzi, this.zzb.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzba zza = zzbb.zza();
            zza.zzb(zzkxVar.zza.longValue());
            zza.zzd(zzkxVar.zzb.longValue());
            zza.zze(zzkxVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zza.zzc(zzkxVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zza.zza(zzkxVar.zzd.longValue());
            }
            this.zze.zzY((zzbb) zza.zzak());
        }
    }
}
