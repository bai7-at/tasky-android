package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.View;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public final class zzdj implements zzfh {
    private final zzfm zza;
    private final String zzb;
    private final View zzc;
    private zzdi zzd;
    private Activity zze;
    private boolean zzf;
    private final zzhw zzg;

    public zzdj(String str, zzfm zzfmVar, View view) {
        zzhw zzhwVar = new zzhw();
        this.zzb = str;
        this.zza = zzfmVar;
        this.zzc = view;
        this.zzg = zzhwVar;
        this.zze = null;
        this.zzd = null;
        this.zzf = false;
    }

    private final DisplayMetrics zzl() {
        return this.zzc.getContext().getResources().getDisplayMetrics();
    }

    private static com.google.ads.interactivemedia.v3.impl.data.zzau zzm(com.google.ads.interactivemedia.v3.impl.data.zzau zzauVar, float f) {
        com.google.ads.interactivemedia.v3.impl.data.zzat builder = com.google.ads.interactivemedia.v3.impl.data.zzau.builder();
        builder.left((int) Math.ceil(zzauVar.left() / f));
        builder.top((int) Math.ceil(zzauVar.top() / f));
        builder.height((int) Math.ceil(zzauVar.height() / f));
        builder.width((int) Math.ceil(zzauVar.width() / f));
        return builder.build();
    }

    public final com.google.ads.interactivemedia.v3.impl.data.zzb zzc(String str, String str2, String str3) {
        com.google.ads.interactivemedia.v3.impl.data.zzau zzm = zzm(com.google.ads.interactivemedia.v3.impl.data.zzau.builder().locationOnScreenOfView(this.zzc).build(), zzl().density);
        Rect rect = new Rect();
        boolean globalVisibleRect = this.zzc.getGlobalVisibleRect(rect);
        IBinder windowToken = this.zzc.getWindowToken();
        if (!globalVisibleRect || windowToken == null || !this.zzc.isShown()) {
            rect.set(0, 0, 0, 0);
        }
        com.google.ads.interactivemedia.v3.impl.data.zzat builder = com.google.ads.interactivemedia.v3.impl.data.zzau.builder();
        builder.left(rect.left);
        builder.top(rect.top);
        builder.height(rect.height());
        builder.width(rect.width());
        com.google.ads.interactivemedia.v3.impl.data.zzau zzm2 = zzm(builder.build(), zzl().density);
        boolean z = (this.zzc.getGlobalVisibleRect(new Rect()) && this.zzc.isShown()) ? false : true;
        double streamVolume = ((AudioManager) this.zzc.getContext().getSystemService(AssetConstants.AUDIO_TYPE)) != null ? r7.getStreamVolume(3) / r7.getStreamMaxVolume(3) : 0.0d;
        long currentTimeMillis = System.currentTimeMillis();
        com.google.ads.interactivemedia.v3.impl.data.zza builder2 = com.google.ads.interactivemedia.v3.impl.data.zzb.builder();
        builder2.queryId(str);
        builder2.eventId(str2);
        builder2.appState(str3);
        builder2.nativeTime(currentTimeMillis);
        builder2.nativeVolume(streamVolume);
        builder2.nativeViewHidden(z);
        builder2.nativeViewBounds(zzm);
        builder2.nativeViewVisibleBounds(zzm2);
        return builder2.build();
    }

    public final void zzf() {
        this.zza.zzd(this, this.zzb);
    }

    public final void zzg() {
        this.zza.zzn(this.zzb);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfh
    public final void zzh(String str, String str2) {
        this.zza.zzp(new zzff(zzfd.activityMonitor, zzfe.viewability, this.zzb, zzc(str, str2, "")));
    }

    public final void zzi() {
        Application zza;
        if (!this.zzf || (zza = zzgq.zza(this.zzc.getContext())) == null) {
            return;
        }
        zzdi zzdiVar = new zzdi(this);
        this.zzd = zzdiVar;
        zza.registerActivityLifecycleCallbacks(zzdiVar);
    }

    final void zzj(boolean z) {
        this.zzf = z;
    }

    public final void zzk() {
        zzdi zzdiVar;
        Application zza = zzgq.zza(this.zzc.getContext());
        if (zza == null || (zzdiVar = this.zzd) == null) {
            return;
        }
        zza.unregisterActivityLifecycleCallbacks(zzdiVar);
    }
}
