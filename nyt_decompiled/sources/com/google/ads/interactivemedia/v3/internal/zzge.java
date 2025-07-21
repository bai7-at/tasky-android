package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzge implements AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, zzen, zzfl {
    private final zzfm zza;
    private final zzgd zzb;
    private final Context zzc;
    private View zzd;
    private String zze;
    private final Set zzf;
    private boolean zzg;
    private boolean zzh;
    private String zzi;
    private com.google.ads.interactivemedia.omid.library.adsession.zza zzj;

    zzge(zzfm zzfmVar, Context context) {
        zzgd zzgdVar = new zzgd();
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zza = zzfmVar;
        this.zzc = context;
        this.zzb = zzgdVar;
        this.zzf = new HashSet();
    }

    private final void zzj(List list) {
        com.google.ads.interactivemedia.v3.impl.data.zzbn zzbnVar;
        if (list == null) {
            zzbnVar = null;
        } else if (list.isEmpty()) {
            return;
        } else {
            zzbnVar = com.google.ads.interactivemedia.v3.impl.data.zzbn.builder().friendlyObstructions(list).build();
        }
        this.zza.zzp(new zzff(zzfd.omid, zzfe.registerFriendlyObstructions, this.zze, zzbnVar));
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar;
        if (!this.zzg || (zzaVar = this.zzj) == null) {
            return;
        }
        zzaVar.zzc();
        this.zzj = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
    public final void onAdEvent(AdEvent adEvent) {
        if (this.zzg) {
            AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
            int ordinal = adEvent.getType().ordinal();
            if (ordinal == 3 || ordinal == 14) {
                zzi();
                return;
            }
            if (ordinal == 15 && this.zzg && this.zzj == null && this.zzd != null) {
                com.google.ads.interactivemedia.omid.library.adsession.zzf zzfVar = com.google.ads.interactivemedia.omid.library.adsession.zzf.DEFINED_BY_JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zzg zzgVar = com.google.ads.interactivemedia.omid.library.adsession.zzg.DEFINED_BY_JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zzh zzhVar = com.google.ads.interactivemedia.omid.library.adsession.zzh.JAVASCRIPT;
                com.google.ads.interactivemedia.omid.library.adsession.zza zza = com.google.ads.interactivemedia.omid.library.adsession.zza.zza(com.google.ads.interactivemedia.omid.library.adsession.zzb.zza(zzfVar, zzgVar, zzhVar, zzhVar, true), com.google.ads.interactivemedia.omid.library.adsession.zzc.zzb(com.google.ads.interactivemedia.omid.library.adsession.zzi.zza("Google1", "3.30.3"), this.zza.zza(), this.zzi, "{ssai:" + (true != this.zzh ? "false" : "true") + "}"));
                zza.zzd(this.zzd);
                for (FriendlyObstruction friendlyObstruction : this.zzf) {
                    zza.zzb(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
                }
                zzj(new ArrayList(this.zzf));
                zza.zzf();
                this.zzj = zza;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfl
    public final void zza() {
        zzbr.zza(this.zzc);
        this.zzg = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfl
    public final void zzb() {
        this.zzg = false;
    }

    public final void zzc(FriendlyObstruction friendlyObstruction) {
        if (this.zzf.contains(friendlyObstruction)) {
            return;
        }
        this.zzf.add(friendlyObstruction);
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar = this.zzj;
        if (zzaVar == null) {
            return;
        }
        zzaVar.zzb(friendlyObstruction.getView(), friendlyObstruction.getPurpose().getOmidPurpose(), friendlyObstruction.getDetailedReason());
        zzj(Arrays.asList(friendlyObstruction));
    }

    public final void zzd(View view) {
        this.zzd = view;
    }

    public final void zze(String str) {
        this.zzi = str;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final void zzg(String str) {
        this.zze = str;
    }

    public final void zzh() {
        this.zzf.clear();
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar = this.zzj;
        if (zzaVar == null) {
            return;
        }
        zzaVar.zze();
        zzj(null);
    }

    public final boolean zzi() {
        com.google.ads.interactivemedia.omid.library.adsession.zza zzaVar;
        if (!this.zzg || (zzaVar = this.zzj) == null) {
            return false;
        }
        zzaVar.zzc();
        this.zzj = null;
        return true;
    }
}
