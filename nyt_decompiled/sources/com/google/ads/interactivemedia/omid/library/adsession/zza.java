package com.google.ads.interactivemedia.omid.library.adsession;

import android.view.View;
import com.google.ads.interactivemedia.v3.internal.zzbr;

/* loaded from: classes2.dex */
public abstract class zza {
    public static zza zza(zzb zzbVar, zzc zzcVar) {
        if (zzbr.zzb()) {
            return new zze(zzbVar, zzcVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public abstract void zzf();
}
