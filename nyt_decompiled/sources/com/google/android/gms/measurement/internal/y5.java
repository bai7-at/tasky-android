package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcl;

/* loaded from: classes3.dex */
public final class y5 {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    zzcl g;
    boolean h;
    final Long i;
    String j;

    public y5(Context context, zzcl zzclVar, Long l) {
        this.h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        this.i = l;
        if (zzclVar != null) {
            this.g = zzclVar;
            this.b = zzclVar.zzf;
            this.c = zzclVar.zze;
            this.d = zzclVar.zzd;
            this.h = zzclVar.zzc;
            this.f = zzclVar.zzb;
            this.j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
