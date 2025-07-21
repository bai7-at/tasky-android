package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zzsp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzsp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + "=" + String.valueOf(this.zzc));
    }
}
