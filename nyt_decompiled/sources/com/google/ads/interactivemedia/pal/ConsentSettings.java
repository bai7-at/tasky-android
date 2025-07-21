package com.google.ads.interactivemedia.pal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* loaded from: classes2.dex */
public abstract class ConsentSettings {

    public static abstract class Builder {
        public abstract Builder allowStorage(Boolean bool);

        public abstract ConsentSettings build();

        public abstract Builder directedForChildOrUnknownAge(Boolean bool);

        @KeepForSdk
        public abstract Builder enableCookiesFor3pServerSideAdInsertion(Boolean bool);
    }

    public static Builder builder() {
        zzb zzbVar = new zzb();
        zzbVar.enableCookiesFor3pServerSideAdInsertion(null);
        Boolean bool = Boolean.FALSE;
        zzbVar.allowStorage(bool);
        zzbVar.directedForChildOrUnknownAge(bool);
        return zzbVar;
    }

    public abstract Builder toBuilder();

    abstract Boolean zza();

    abstract Boolean zzb();

    abstract Boolean zzc();
}
