package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class zzeo implements BaseDisplayContainer {
    private static int zza;
    private ViewGroup zzb;
    private Collection zzc = zzso.zzm();
    private Map zzd = zzsw.zzm();
    private final Set zze = new HashSet();
    private zzen zzf = null;
    private boolean zzg = false;

    public zzeo(ViewGroup viewGroup) {
        this.zzb = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void claim() {
        zzrm.zze(!this.zzg, "A given DisplayContainer may only be used once");
        this.zzg = true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void destroy() {
        ViewGroup viewGroup = this.zzb;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final ViewGroup getAdContainer() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final Collection<CompanionAdSlot> getCompanionSlots() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerFriendlyObstruction(FriendlyObstruction friendlyObstruction) {
        if (friendlyObstruction == null || this.zze.contains(friendlyObstruction)) {
            return;
        }
        this.zze.add(friendlyObstruction);
        zzen zzenVar = this.zzf;
        if (zzenVar != null) {
            ((zzge) zzenVar).zzc(friendlyObstruction);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void registerVideoControlsOverlay(View view) {
        if (view == null) {
            return;
        }
        com.google.ads.interactivemedia.v3.impl.data.zzax builder = com.google.ads.interactivemedia.v3.impl.data.zzay.builder();
        builder.view(view);
        builder.purpose(FriendlyObstructionPurpose.VIDEO_CONTROLS);
        com.google.ads.interactivemedia.v3.impl.data.zzay build = builder.build();
        if (this.zze.contains(build)) {
            return;
        }
        this.zze.add(build);
        zzen zzenVar = this.zzf;
        if (zzenVar != null) {
            ((zzge) zzenVar).zzc(build);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setAdContainer(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.zzb = viewGroup;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void setCompanionSlots(Collection<CompanionAdSlot> collection) {
        if (collection == null) {
            collection = zzso.zzm();
        }
        zzsq zzsqVar = new zzsq();
        for (CompanionAdSlot companionAdSlot : collection) {
            if (companionAdSlot != null) {
                int i = zza;
                zza = i + 1;
                zzsqVar.zza("compSlot_" + i, companionAdSlot);
            }
        }
        this.zzd = zzsqVar.zzc();
        this.zzc = collection;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllFriendlyObstructions() {
        this.zze.clear();
        zzen zzenVar = this.zzf;
        if (zzenVar != null) {
            ((zzge) zzenVar).zzh();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseDisplayContainer
    public final void unregisterAllVideoControlsOverlays() {
        this.zze.clear();
        zzen zzenVar = this.zzf;
        if (zzenVar != null) {
            ((zzge) zzenVar).zzh();
        }
    }

    public final Map zza() {
        return this.zzd;
    }

    public final Set zzb() {
        return new HashSet(this.zze);
    }

    public final void zzc(zzen zzenVar) {
        this.zzf = zzenVar;
    }
}
