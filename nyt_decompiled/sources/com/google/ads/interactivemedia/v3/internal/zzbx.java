package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzbx {
    private static final zzbx zza = new zzbx();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzbx() {
    }

    public static zzbx zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        this.zzb.add(zzeVar);
    }

    public final void zze(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        boolean zzg = zzg();
        this.zzb.remove(zzeVar);
        this.zzc.remove(zzeVar);
        if (!zzg || zzg()) {
            return;
        }
        zzcd.zzb().zzf();
    }

    public final void zzf(com.google.ads.interactivemedia.omid.library.adsession.zze zzeVar) {
        boolean zzg = zzg();
        this.zzc.add(zzeVar);
        if (zzg) {
            return;
        }
        zzcd.zzb().zze();
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
