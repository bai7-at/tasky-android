package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzto extends zzst {
    static final zzto zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzto(objArr, 0, objArr, 0, 0);
    }

    zzto(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzb = objArr;
        this.zze = i;
        this.zzc = objArr2;
        this.zzf = i2;
        this.zzg = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzc = zzsi.zzc(obj);
        while (true) {
            int i = zzc & this.zzf;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzc = i + 1;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzb() {
        return this.zzg;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    /* renamed from: zze */
    public final zztw iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    final boolean zzi() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    final zzso zzk() {
        return zzso.zzj(this.zzb, this.zzg);
    }
}
