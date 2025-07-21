package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes2.dex */
final class zztm extends zzso {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    zztm(Object[] objArr, int i, int i2) {
        this.zza = objArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzrm.zza(i, this.zzc, "index");
        Object obj = this.zza[i + i + this.zzb];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return true;
    }
}
