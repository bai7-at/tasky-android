package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzca {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzca zza = new zzca();
    private Context zzb;

    private zzca() {
    }

    public static zzca zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
