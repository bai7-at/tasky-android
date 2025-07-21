package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import defpackage.h51;

/* loaded from: classes2.dex */
public final class zzhy {
    private final Context zza;
    private AdsRenderingSettings zzb;

    public zzhy(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.zza = context;
        this.zzb = adsRenderingSettings;
    }

    public final void zza(String str) {
        if (this.zzb.getEnableCustomTabs()) {
            new h51.b().a().a(this.zza, Uri.parse(str));
            return;
        }
        Context context = this.zza;
        if (str == null || str.length() <= 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    public final void zzb(AdsRenderingSettings adsRenderingSettings) {
        this.zzb = adsRenderingSettings;
    }
}
