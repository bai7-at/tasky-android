package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zznj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    /* synthetic */ zznj(int i, String str, Object obj, zzni zzniVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        zznc.zza().zzb(this);
    }

    public static zznj zze(int i, String str, float f) {
        return new zzng(1, str, Float.valueOf(f));
    }

    public static zznj zzf(int i, String str, int i2) {
        return new zzne(1, str, Integer.valueOf(i2));
    }

    public static zznj zzg(int i, String str, long j) {
        return new zznf(1, str, Long.valueOf(j));
    }

    public static zznj zzh(int i, String str, Boolean bool) {
        return new zznd(i, str, bool);
    }

    public static zznj zzi(int i, String str, String str2) {
        return new zznh(1, str, str2);
    }

    public static zznj zzj(int i, String str) {
        zznj zzi = zzi(1, "gads:sdk_core_constants:experiment_id", null);
        zznc.zza().zza(zzi);
        return zzi;
    }

    protected abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    protected abstract Object zzc(SharedPreferences sharedPreferences);

    public final int zzd() {
        return this.zza;
    }

    public final Object zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
