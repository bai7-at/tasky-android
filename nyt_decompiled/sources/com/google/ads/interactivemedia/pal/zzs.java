package com.google.ads.interactivemedia.pal;

import android.net.Uri;
import com.google.android.gms.internal.pal.a3;
import com.google.android.gms.internal.pal.zzjc;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzs {
    private final String zza;
    private final String zzb;
    private final String zzc;

    zzs(zzq zzqVar) {
        this.zza = zzqVar.zzb();
        this.zzb = zzqVar.zzc();
        this.zzc = zzqVar.zza();
    }

    final void zza(String str, String str2, Map map) {
        a3 a3Var = new a3();
        a3Var.b(map);
        a3Var.a(zzr.SDKV.zza(), this.zzb);
        a3Var.a(zzr.PALV.zza(), this.zza);
        a3Var.a(zzr.CORRELATOR.zza(), this.zzc);
        a3Var.a(zzr.EVENT_ID.zza(), str2);
        a3Var.a(zzr.LOGGER_ID.zza(), str);
        zzjc c = a3Var.c();
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
        for (String str3 : c.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) c.get(str3));
        }
        new zzo(this, buildUpon.build().toString()).start();
    }
}
