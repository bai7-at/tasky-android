package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import com.google.ads.interactivemedia.omid.library.adsession.FriendlyObstructionPurpose;

/* loaded from: classes2.dex */
public final class zzbz {
    private final zzdg zza;
    private final String zzb;
    private final FriendlyObstructionPurpose zzc;
    private final String zzd;

    public zzbz(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.zza = new zzdg(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = friendlyObstructionPurpose;
        this.zzd = str;
    }

    public final FriendlyObstructionPurpose zza() {
        return this.zzc;
    }

    public final zzdg zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
