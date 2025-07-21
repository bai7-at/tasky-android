package com.google.android.gms.internal.ads;

import defpackage.tge;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgbl extends zzgaa {
    final /* synthetic */ zzgbm zza;

    zzgbl(zzgbm zzgbmVar) {
        this.zza = zzgbmVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.e;
        tge.a(i, i2, "index");
        objArr = this.zza.d;
        int i3 = i + i;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj);
        objArr2 = this.zza.d;
        Object obj2 = objArr2[i3 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzfzv
    public final boolean j() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.e;
        return i;
    }
}
