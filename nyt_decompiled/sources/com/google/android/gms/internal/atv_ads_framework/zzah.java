package com.google.android.gms.internal.atv_ads_framework;

import defpackage.aif;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzah extends zzab {
    final /* synthetic */ zzai zza;

    zzah(zzai zzaiVar) {
        this.zza = zzaiVar;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.zzy
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.e;
        aif.a(i, i2, "index");
        zzai zzaiVar = this.zza;
        objArr = zzaiVar.d;
        int i3 = i + i;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzaiVar.d;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.e;
        return i;
    }
}
