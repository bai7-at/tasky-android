package com.google.android.gms.internal.pal;

import defpackage.z7f;
import java.util.AbstractMap;

/* loaded from: classes3.dex */
final class zzjf extends zziz {
    final /* synthetic */ zzjg zza;

    zzjf(zzjg zzjgVar) {
        this.zza = zzjgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.e;
        z7f.a(i, i2, "index");
        zzjg zzjgVar = this.zza;
        int i3 = i + i;
        objArr = zzjgVar.d;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = zzjgVar.d;
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
