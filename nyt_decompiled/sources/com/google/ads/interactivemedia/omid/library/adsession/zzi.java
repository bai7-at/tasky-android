package com.google.ads.interactivemedia.omid.library.adsession;

import com.google.ads.interactivemedia.v3.internal.zzcp;

/* loaded from: classes2.dex */
public final class zzi {
    private final String zza = "Google1";
    private final String zzb = "3.30.3";

    private zzi(String str, String str2) {
    }

    public static zzi zza(String str, String str2) {
        zzcp.zza("Google1", "Name is null or empty");
        zzcp.zza("3.30.3", "Version is null or empty");
        return new zzi("Google1", "3.30.3");
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
