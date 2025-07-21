package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zzsn extends zzso {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzso zzc;

    zzsn(zzso zzsoVar, int i, int i2) {
        this.zzc = zzsoVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzrm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso
    /* renamed from: zzi */
    public final zzso subList(int i, int i2) {
        zzrm.zzg(i, i2, this.zzb);
        zzso zzsoVar = this.zzc;
        int i3 = this.zza;
        return zzsoVar.subList(i + i3, i2 + i3);
    }
}
