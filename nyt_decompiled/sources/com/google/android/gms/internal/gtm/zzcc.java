package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import defpackage.xuf;
import java.util.Collections;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzcc extends zzbs {
    private final zzcb zza;
    private final zzcw zzb;
    private final zzfo zzc;
    private zzey zzd;

    protected zzcc(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
        this.zza = new zzcb(this);
        this.zzb = new zzby(this, zzbvVar);
    }

    static /* bridge */ /* synthetic */ void zzb(zzcc zzccVar, ComponentName componentName) {
        xuf.d();
        if (zzccVar.zzd != null) {
            zzccVar.zzd = null;
            zzccVar.zzP("Disconnected from device AnalyticsService", componentName);
            zzccVar.zzs().zzk();
        }
    }

    static /* bridge */ /* synthetic */ void zzi(zzcc zzccVar, zzey zzeyVar) {
        xuf.d();
        zzccVar.zzd = zzeyVar;
        zzccVar.zzj();
        zzccVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcw zzcwVar = this.zzb;
        zzw();
        zzcwVar.zzg(zzeu.zzK.zzb().longValue());
    }

    public final void zzc() {
        xuf.d();
        zzW();
        try {
            ConnectionTracker.getInstance().unbindService(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
    }

    public final boolean zzf() {
        xuf.d();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        zzey zza = this.zza.zza();
        if (zza == null) {
            return false;
        }
        this.zzd = zza;
        zzj();
        return true;
    }

    public final boolean zzg() {
        xuf.d();
        zzW();
        return this.zzd != null;
    }

    public final boolean zzh(zzex zzexVar) {
        String zzk;
        Preconditions.checkNotNull(zzexVar);
        xuf.d();
        zzW();
        zzey zzeyVar = this.zzd;
        if (zzeyVar == null) {
            return false;
        }
        if (zzexVar.zzh()) {
            zzw();
            zzk = zzct.zzi();
        } else {
            zzw();
            zzk = zzct.zzk();
        }
        try {
            zzeyVar.zzf(zzexVar.zzg(), zzexVar.zzd(), zzk, Collections.emptyList());
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
