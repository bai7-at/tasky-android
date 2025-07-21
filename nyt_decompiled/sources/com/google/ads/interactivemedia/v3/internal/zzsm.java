package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes2.dex */
final class zzsm extends zzso {
    private final transient zzso zza;

    zzsm(zzso zzsoVar) {
        this.zza = zzsoVar;
    }

    private final int zzo(int i) {
        return (this.zza.size() - 1) - i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzrm.zza(i, this.zza.size(), "index");
        return this.zza.get(zzo(i));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.zza.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return zzo(lastIndexOf);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.zza.indexOf(obj);
        if (indexOf >= 0) {
            return zzo(indexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso
    public final zzso zzh() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzso
    /* renamed from: zzi */
    public final zzso subList(int i, int i2) {
        zzrm.zzg(i, i2, this.zza.size());
        zzso zzsoVar = this.zza;
        return zzsoVar.subList(zzsoVar.size() - i2, this.zza.size() - i).zzh();
    }
}
