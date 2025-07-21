package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.nytimes.android.api.cms.AssetConstants;

/* loaded from: classes2.dex */
public final class zzbv extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzbt zzc;
    private float zzd;
    private final zzcd zze;

    public zzbv(Handler handler, Context context, zzbt zzbtVar, zzcd zzcdVar) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
        this.zzc = zzbtVar;
        this.zze = zzcdVar;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0 && streamVolume > 0) {
            float f2 = streamVolume / streamMaxVolume;
            f = 1.0f;
            if (f2 <= 1.0f) {
                return f2;
            }
        }
        return f;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float zzc = zzc();
        if (zzc != this.zzd) {
            this.zzd = zzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
