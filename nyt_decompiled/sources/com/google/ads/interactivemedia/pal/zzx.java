package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.a3;
import com.google.android.gms.internal.pal.zzjc;
import java.util.Random;

/* loaded from: classes2.dex */
public final class zzx {
    static final boolean zza;
    private final zzs zzb;
    private final boolean zzc;

    static {
        zza = new Random().nextInt(100) <= 0;
    }

    zzx(zzs zzsVar, boolean z) {
        this.zzb = zzsVar;
        this.zzc = z;
    }

    public final void zza(int i) {
        if (this.zzc) {
            this.zzb.zza("pal_native", zzt.ERROR_EVENT.zza(), zzjc.f(zzu.ERROR_CODE.zza(), String.valueOf(i)));
        }
    }

    final void zzb(zzw zzwVar) {
        if (this.zzc) {
            a3 a3Var = new a3();
            a3Var.a(zzu.NONCE_LOADER_INIT_TIME.zza(), String.valueOf(zzwVar.zzc().zzd()));
            a3Var.a(zzu.NONCE_REQUESTED_TIME.zza(), String.valueOf(zzwVar.zzd().zzd()));
            a3Var.a(zzu.NONCE_LOADED_TIME.zza(), String.valueOf(zzwVar.zzb().zzd()));
            a3Var.a(zzu.SERVICE_START_TIME.zza(), String.valueOf(zzwVar.zzf().zzd()));
            a3Var.a(zzu.SERVICE_END_TIME.zza(), String.valueOf(zzwVar.zze().zzd()));
            a3Var.a(zzu.NONCE_LENGTH.zza(), String.valueOf(zzwVar.zza()));
            this.zzb.zza("pal_native", zzt.NONCE_LOADED.zza(), a3Var.c());
        }
    }
}
