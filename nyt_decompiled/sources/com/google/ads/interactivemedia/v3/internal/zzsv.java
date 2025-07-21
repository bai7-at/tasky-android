package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* loaded from: classes2.dex */
final class zzsv extends zzss {
    final /* synthetic */ zzsw zza;

    zzsv(zzsw zzswVar) {
        this.zza = zzswVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    /* renamed from: zze */
    public final zztw iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzss
    final zzsr zzh() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst
    final zzso zzk() {
        return new zzsu(this);
    }
}
