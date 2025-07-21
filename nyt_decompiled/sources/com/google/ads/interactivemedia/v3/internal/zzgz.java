package com.google.ads.interactivemedia.v3.internal;

import android.graphics.Bitmap;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class zzgz implements zzuz {
    final /* synthetic */ qg8 zza;
    final /* synthetic */ String zzb;

    zzgz(zzha zzhaVar, qg8 qg8Var, String str) {
        this.zza = qg8Var;
        this.zzb = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final void zza(Throwable th) {
        this.zza.b(new Exception("Failed to load image from: ".concat(String.valueOf(this.zzb)), th));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzuz
    public final /* synthetic */ void zzb(Object obj) {
        this.zza.e((Bitmap) obj);
    }
}
