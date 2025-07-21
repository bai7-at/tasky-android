package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
final class zzno implements zznw {
    final /* synthetic */ zznp zza;

    zzno(zznp zznpVar) {
        this.zza = zznpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznw
    public final Boolean zza(String str, boolean z) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        try {
            sharedPreferences2 = this.zza.zze;
            return Boolean.valueOf(sharedPreferences2.getBoolean(str, z));
        } catch (ClassCastException unused) {
            sharedPreferences = this.zza.zze;
            return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(z)));
        }
    }
}
