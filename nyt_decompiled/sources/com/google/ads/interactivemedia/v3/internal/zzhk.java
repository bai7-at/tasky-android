package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import defpackage.og8;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class zzhk {
    private final SecureSignalsAdapter zza;
    private final Context zzb;
    private final String zzc;
    private final qg8 zzd = new qg8();

    zzhk(SecureSignalsAdapter secureSignalsAdapter, String str, Context context) {
        this.zza = secureSignalsAdapter;
        this.zzc = str;
        this.zzb = context;
    }

    final og8 zzb() {
        qg8 qg8Var = new qg8();
        this.zza.collectSignals(this.zzb, new zzhj(this, qg8Var));
        return qg8Var.a();
    }

    final og8 zzc() {
        this.zza.initialize(this.zzb, new zzhi(this));
        return this.zzd.a();
    }

    final String zze() {
        return this.zzc;
    }

    final String zzf() {
        return this.zza.getVersion().toString();
    }
}
